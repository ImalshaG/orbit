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
package org.wso2.carbon.h2.osgi.utils;

/**
 * Holds the carbon related constants.
 */
public class CarbonConstants {

    public static final String CARBON_HOME = "carbon.home";
    public static final String CARBON_HOME_ENV = "CARBON_HOME";
    public static final String CARBON_HOME_PARAMETER = "${carbon.home}";
    public static final String CARBON_XML_FILE = "carbon.xml";
    public static final String CONF_FOLDER = "conf";
    public static final String TAG_DB_CONFIGURATION = "H2DatabaseConfiguration";
    public static final String TAG_PROPERTY = "property";
    public static final String ATTRIBUTE_NAME = "name";
}
