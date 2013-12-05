/*
 * Copyright 2013 Christian Autermann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.autermann.utils;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.common.base.Preconditions;

/**
 * Thread factory that creates named and grouped threads.
 *
 * @author Christian Autermann
 */
public class NamedAndGroupedThreadFactory implements ThreadFactory {
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final String nameFormat;
    private final boolean daemon;
    private final int priority;
    private final int stackSize;
    private final UncaughtExceptionHandler eh;

    private NamedAndGroupedThreadFactory(ThreadGroup group, String nameFormat,
                                         boolean daemon, int priority,
                                         int stackSize,
                                         UncaughtExceptionHandler eh) {
        this.daemon = daemon;
        this.group = Preconditions.checkNotNull(group);
        this.nameFormat = Preconditions.checkNotNull(nameFormat);
        Preconditions.checkArgument(priority >= Thread.MIN_PRIORITY ||
                                    priority <= Thread.MAX_PRIORITY,
                                    "invalid priority: %d", priority);
        this.priority = priority;
        Preconditions.checkArgument(stackSize >= 0,
                                    "invalid stacksize: %d", stackSize);
        this.stackSize = stackSize;
        this.eh = eh;
    }

    @Override
    public Thread newThread(Runnable r) {
        final String name = String.format(nameFormat,
                                          threadNumber.getAndIncrement());
        final Thread t = new Thread(group, r, name, stackSize);
        t.setDaemon(daemon);
        t.setPriority(priority);
        if (eh != null) {
            t.setUncaughtExceptionHandler(eh);
        }
        return t;
    }

    /**
     * Creates a new builder.
     *
     * @return the builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for thread factories.
     */
    public static class Builder {
        private static final AtomicInteger poolNumber = new AtomicInteger(1);
        private String name;
        private boolean daemon = false;
        private int priority = Thread.NORM_PRIORITY;
        private int stackSize = 0;
        private UncaughtExceptionHandler exceptionHandler = null;

        private Builder() {
        }

        /**
         * Names the thread groups.
         *
         * @param name the name
         *
         * @return {@code this}
         */
        public Builder name(String name) {
            this.name = Preconditions.checkNotNull(name);
            return this;
        }

        /**
         * New threads are created with the specified priority.
         *
         * @param priority the priority
         *
         * @return {@code this}
         */
        public Builder priority(int priority) {
            Preconditions.checkArgument(priority >= Thread.MIN_PRIORITY ||
                                        priority <= Thread.MAX_PRIORITY);
            this.priority = priority;
            return this;
        }

        /**
         * New threads are daemonized.
         *
         * @param daemon if new threads should be daemonized
         *
         * @return {@code this}
         */
        public Builder daemon(boolean daemon) {
            this.daemon = daemon;
            return this;
        }

        /**
         * The stack size of newly created threads.
         *
         * @param stackSize the stack size
         *
         * @return {@code this}
         */
        public Builder stackSize(int stackSize) {
            Preconditions
                    .checkArgument(stackSize >= 0, "invalid stacksize: %d", stackSize);
            this.stackSize = stackSize;
            return this;
        }

        /**
         * The exception handler of new threads.
         *
         * @param eh the exception handler
         *
         * @return {@code this}
         */
        public Builder exceptionHandler(UncaughtExceptionHandler eh) {
            this.exceptionHandler = Preconditions.checkNotNull(eh);
            return this;
        }

        /**
         * Creates the thread factory.
         *
         * @return the thread factory
         */
        public ThreadFactory build() {
            if (name == null) {
                name = "pool-" + poolNumber.getAndIncrement();
            }
            final ThreadGroup group = new ThreadGroup(name);
            final String nameFormat = name + "-%d";
            return new NamedAndGroupedThreadFactory(group, nameFormat, daemon, priority, stackSize, exceptionHandler);
        }
    }
}
