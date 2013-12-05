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

/**
 * Static variables to check the Java VM version.
 *
 * @author Christian Autermann
 */
public interface Java {
    /**
     * Indicates if this VM is running Java 1.6.
     */
    boolean v6 = StandardSystemProperties.JAVA_VERSION.startsWith("1.6");
    /**
     * Indicates if this VM is running Java 1.7.
     */
    boolean v7 = StandardSystemProperties.JAVA_VERSION.startsWith("1.7");
}
