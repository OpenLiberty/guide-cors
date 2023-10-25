// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2017, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
// end::copyright[]
package it.io.openliberty.guides.cors;

import java.util.HashMap;
import java.util.Map;

public class TestData {

    public static final String ORIGIN = "Origin";
    public static final String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";
    public static final String ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";

    public static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
    public static final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
    public static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
    public static final String ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age";
    public static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
    public static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";

    public static Map<String, String> simpleRequestHeaders = new HashMap<String, String>();
    public static Map<String, String> simpleResponseHeaders = new HashMap<String, String>();

    public static Map<String, String> preflightRequestHeaders = new HashMap<String, String>();
    public static Map<String, String> preflightResponseHeaders = new HashMap<String, String>();

    static {
        simpleRequestHeaders.put(ORIGIN, "openliberty.io");

        simpleResponseHeaders.put(ACCESS_CONTROL_ALLOW_ORIGIN, "http://openliberty.io");
        simpleResponseHeaders.put(ACCESS_CONTROL_ALLOW_CREDENTIALS, "true");
        simpleResponseHeaders.put(ACCESS_CONTROL_EXPOSE_HEADERS, "MyHeader");

        preflightRequestHeaders.put(ORIGIN, "anywebsiteyoulike.com");
        preflightRequestHeaders.put(ACCESS_CONTROL_REQUEST_METHOD, "DELETE");
        preflightRequestHeaders.put(ACCESS_CONTROL_REQUEST_HEADERS, "MyOwnHeader2");

        preflightResponseHeaders.put(ACCESS_CONTROL_ALLOW_ORIGIN, "anywebsiteyoulike.com");
        preflightResponseHeaders.put(ACCESS_CONTROL_ALLOW_CREDENTIALS, "true");
        preflightResponseHeaders.put(ACCESS_CONTROL_MAX_AGE, "10");
        preflightResponseHeaders.put(ACCESS_CONTROL_ALLOW_METHODS, "OPTIONS, DELETE");
        preflightResponseHeaders.put(ACCESS_CONTROL_ALLOW_HEADERS, "MyOwnHeader1, MyOwnHeader2");
    }

}
