/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2013 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.maven.m2settings;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/**
 * Prompting helper.
 *
 * @since 1.4
 */
public interface Prompter
{
    /**
     * Prompt user for a string, optionally masking the input.
     */
    String prompt(String message, @Nullable Character mask) throws IOException;

    /**
     * Prompt user for a string.
     */
    String prompt(String message) throws IOException;

    /**
     * Prompt user for a string; if user response is blank use a default value.
     */
    String promptWithDefaultValue(String message, String defaultValue) throws IOException;

    /**
     * Prompt user for a string out of a set of available choices.
     *
     * Choices must not have entries with leading/trailing whitespace.
     * At least 2 choices are required.
     */
    String promptChoice(String header, String message, List<String> choices) throws IOException;

    /**
     * Prompt user for an integer.
     */
    Integer promptInteger(String message, @Nullable Integer min, @Nullable Integer max) throws IOException;
}
