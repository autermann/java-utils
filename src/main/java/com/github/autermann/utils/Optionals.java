/*
 * Copyright (C) 2013 by it's authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
