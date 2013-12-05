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

import com.google.common.base.StandardSystemProperty;

/**
 * {@linkplain System#getProperties() Standard system properties}.
 *
 * @author Christian Autermann
 */
public interface StandardSystemProperties {

    /**
     * Java Runtime Environment version.
     */
    String JAVA_VERSION = StandardSystemProperty.JAVA_VERSION.value();
    /**
     * Java Runtime Environment vendor.
     */

    String JAVA_VENDOR = StandardSystemProperty.JAVA_VENDOR.value();
    /**
     * Java vendor URL.
     */
    String JAVA_VENDOR_URL = StandardSystemProperty.JAVA_VENDOR_URL.value();
    /**
     * Java installation directory.
     */
    String JAVA_HOME = StandardSystemProperty.JAVA_HOME.value();
    /**
     * Java Virtual Machine specification version.
     */
    String JAVA_VM_SPECIFICATION_VERSION
            = StandardSystemProperty.JAVA_VM_SPECIFICATION_VERSION.value();
    /**
     * Java Virtual Machine specification vendor.
     */
    String JAVA_VM_SPECIFICATION_VENDOR
            = StandardSystemProperty.JAVA_VM_SPECIFICATION_VENDOR.value();
    /**
     * Java Virtual Machine specification name.
     */
    String JAVA_VM_SPECIFICATION_NAME
            = StandardSystemProperty.JAVA_VM_SPECIFICATION_NAME.value();
    /**
     * Java Virtual Machine implementation version.
     */

    String JAVA_VM_VERSION = StandardSystemProperty.JAVA_VM_VERSION.value();
    /**
     * Java Virtual Machine implementation vendor.
     */
    String JAVA_VM_VENDOR = StandardSystemProperty.JAVA_VM_VENDOR.value();
    /**
     * Java Virtual Machine implementation name.
     */
    String JAVA_VM_NAME = StandardSystemProperty.JAVA_VM_NAME.value();
    /**
     * Java Runtime Environment specification version.
     */
    String JAVA_SPECIFICATION_VERSION
            = StandardSystemProperty.JAVA_SPECIFICATION_VERSION.value();
    /**
     * Java Runtime Environment specification vendor.
     */
    String JAVA_SPECIFICATION_VENDOR
            = StandardSystemProperty.JAVA_SPECIFICATION_VENDOR.value();
    /**
     * Java Runtime Environment specification name.
     */
    String JAVA_SPECIFICATION_NAME
            = StandardSystemProperty.JAVA_SPECIFICATION_NAME.value();
    /**
     * Java class format version number.
     */
    String JAVA_CLASS_VERSION = StandardSystemProperty.JAVA_CLASS_VERSION
            .value();
    /**
     * Java class path.
     */
    String JAVA_CLASS_PATH = StandardSystemProperty.JAVA_CLASS_PATH.value();
    /**
     * List of paths to search when loading libraries.
     */
    String JAVA_LIBRARY_PATH = StandardSystemProperty.JAVA_LIBRARY_PATH.value();
    /**
     * Default temp file path.
     */
    String JAVA_IO_TMPDIR = StandardSystemProperty.JAVA_IO_TMPDIR.value();
    /**
     * Name of JIT compiler to use.
     */
    String JAVA_COMPILER = StandardSystemProperty.JAVA_COMPILER.value();
    /**
     * Path of extension directory or directories.
     */
    String JAVA_EXT_DIRS = StandardSystemProperty.JAVA_EXT_DIRS.value();
    /**
     * Operating system name.
     */
    String OS_NAME = StandardSystemProperty.OS_NAME.value();
    /**
     * Operating system architecture.
     */
    String OS_ARCH = StandardSystemProperty.OS_ARCH.value();
    /**
     * Operating system version.
     */

    String OS_VERSION = StandardSystemProperty.OS_VERSION.value();
    /**
     * File separator ("/" on UNIX).
     */
    String FILE_SEPARATOR = StandardSystemProperty.FILE_SEPARATOR.value();
    /**
     * Path separator (":" on UNIX).
     */
    String PATH_SEPARATOR = StandardSystemProperty.PATH_SEPARATOR.value();
    /**
     * Line separator ("\n" on UNIX).
     */
    String LINE_SEPARATOR = StandardSystemProperty.LINE_SEPARATOR.value();
    /**
     * User's account name.
     */
    String USER_NAME = StandardSystemProperty.USER_NAME.value();
    /**
     * User's home directory.
     */
    String USER_HOME = StandardSystemProperty.USER_HOME.value();
    /**
     * User's current working directory.
     */
    String USER_DIR = StandardSystemProperty.USER_DIR.value();
}
