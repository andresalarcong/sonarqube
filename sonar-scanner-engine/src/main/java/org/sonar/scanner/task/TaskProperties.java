/*
 * SonarQube
 * Copyright (C) 2009-2018 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.scanner.task;

import java.util.Map;
import javax.annotation.Nullable;
import org.sonar.scanner.bootstrap.UserProperties;

/**
 * Batch properties that are specific to a task (for example
 * coming from sonar-project.properties).
 */
public class TaskProperties extends UserProperties {

  public TaskProperties(Map<String, String> properties, @Nullable String pathToSecretKey) {
    super(properties, pathToSecretKey);
  }

}
