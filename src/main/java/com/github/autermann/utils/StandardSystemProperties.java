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
 * TODO JavaDoc
 * @author Christian Autermann <c.autermann@52north.org>
 */
public interface StandardSystemProperties {
    String JAVA_VERSION = StandardSystemProperty.JAVA_VERSION.value();
    String JAVA_VENDOR = StandardSystemProperty.JAVA_VENDOR.value();
    String JAVA_VENDOR_URL = StandardSystemProperty.JAVA_VENDOR_URL.value();
    String JAVA_HOME = StandardSystemProperty.JAVA_HOME.value();
    String JAVA_VM_SPECIFICATION_VERSION = StandardSystemProperty.JAVA_VM_SPECIFICATION_VERSION.value();
    String JAVA_VM_SPECIFICATION_VENDOR = StandardSystemProperty.JAVA_VM_SPECIFICATION_VENDOR.value();
    String JAVA_VM_SPECIFICATION_NAME = StandardSystemProperty.JAVA_VM_SPECIFICATION_NAME.value();
    String JAVA_VM_VERSION = StandardSystemProperty.JAVA_VM_VERSION.value();
    String JAVA_VM_VENDOR = StandardSystemProperty.JAVA_VM_VENDOR.value();
    String JAVA_VM_NAME = StandardSystemProperty.JAVA_VM_NAME.value();
    String JAVA_SPECIFICATION_VERSION = StandardSystemProperty.JAVA_SPECIFICATION_VERSION.value();
    String JAVA_SPECIFICATION_VENDOR = StandardSystemProperty.JAVA_SPECIFICATION_VENDOR.value();
    String JAVA_SPECIFICATION_NAME = StandardSystemProperty.JAVA_SPECIFICATION_NAME.value();
    String JAVA_CLASS_VERSION = StandardSystemProperty.JAVA_CLASS_VERSION.value();
    String JAVA_CLASS_PATH = StandardSystemProperty.JAVA_CLASS_PATH.value();
    String JAVA_LIBRARY_PATH = StandardSystemProperty.JAVA_LIBRARY_PATH.value();
    String JAVA_IO_TMPDIR = StandardSystemProperty.JAVA_IO_TMPDIR.value();
    String JAVA_COMPILER = StandardSystemProperty.JAVA_COMPILER.value();
    String JAVA_EXT_DIRS = StandardSystemProperty.JAVA_EXT_DIRS.value();
    String OS_NAME = StandardSystemProperty.OS_NAME.value();
    String OS_ARCH = StandardSystemProperty.OS_ARCH.value();
    String OS_VERSION = StandardSystemProperty.OS_VERSION.value();
    String FILE_SEPARATOR = StandardSystemProperty.FILE_SEPARATOR.value();
    String PATH_SEPARATOR = StandardSystemProperty.PATH_SEPARATOR.value();
    String LINE_SEPARATOR = StandardSystemProperty.LINE_SEPARATOR.value();
    String USER_NAME = StandardSystemProperty.USER_NAME.value();
    String USER_HOME = StandardSystemProperty.USER_HOME.value();
    String USER_DIR = StandardSystemProperty.USER_DIR.value();
}
