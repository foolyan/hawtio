/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hawt.web.plugin.karaf.terminal;

import java.io.PipedInputStream;
import java.io.PrintStream;

import org.apache.felix.service.command.CommandSession;
import org.osgi.framework.BundleContext;

/**
 * Karaf is incompatible between any of its versions,
 * So we need a factory to support more of them.
 * <p/>
 * However it keeps being annoying so we only support Karaf 4.0 onwards.
 */
public interface KarafConsoleFactory {

    CommandSession getSession(Object console);

    void close(Object console, boolean param);

    Object createConsole(PipedInputStream in,
                         PrintStream pipedOut,
                         BundleContext bundleContext) throws Exception;

}