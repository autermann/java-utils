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

import java.util.Arrays;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * Utility functions for {@link Optional}s.
 *
 * @author Christian Autermann
 */
public class Optionals {

    private Optionals() {
    }

    /**
     * A {@link Predicate} to check if a {@link Optional} is present.
     *
     * @param <T> the type of the {@link Optional}
     *
     * @return the predicate
     */
    public static <T> Predicate<Optional<? extends T>> isPresent() {
        return IsPresent.instance().withNarrowedType();
    }

    /**
     * A {@link Predicate} to check if any of the supplied {@link Optional}s
     * is present.
     *
     * @param <T> the type of the {@link Optional}
     *
     * @return the predicate
     */
    public static <T> boolean any(Optional<? extends T>... optionals) {
        return Iterables.any(Arrays.asList(optionals), isPresent());
    }

    /**
     * A {@link Predicate} to check if all of the supplied {@link Optional}s are
     * present.
     *
     * @param <T> the type of the {@link Optional}
     *
     * @return the predicate
     */
    public static <T> boolean all(Optional<? extends T>... optionals) {
        return Iterables.all(Arrays.asList(optionals), isPresent());
    }

    private static class IsPresent implements Predicate<Optional<?>> {
        private static final IsPresent INSTANCE = new IsPresent();

        private IsPresent() {
        }

        @Override
        public boolean apply(Optional<?> input) {
            return input.isPresent();
        }

        /**
         * Casts this predicate to a specific type.
         *
         * @param <T> the type
         *
         * @return {@code this}
         */
        @SuppressWarnings(value = "unchecked")
        public <T> Predicate<Optional<? extends T>> withNarrowedType() {
            Object that = this;
            return (Predicate<Optional<? extends T>>) that;
        }

        /**
         * @return the singleton instance
         */
        public static IsPresent instance() {
            return INSTANCE;
        }
    }

}
