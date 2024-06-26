/*
* Copyright (c) 2024, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.wso2.carbon.h2.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.wso2.carbon.h2.osgi.console.H2DatabaseManager;

/**
 * This class is used to activate and deactivate the H2 console service.
 */
public class H2ConsoleServiceActivator implements BundleActivator {

    public void start(BundleContext arg0) throws Exception {

        H2DatabaseManager.getInstance().initialize();
    }

    public void stop(BundleContext arg0) {

        H2DatabaseManager.getInstance().terminate();
    }
}
