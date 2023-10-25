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

    public static  String requestHeaderOrigin;
    public static  String requestHeaderAccessControlRequestMethod;
    public static  String requestHeaderAccessControlRequestHeaders;
    public static  String responseHeaderAccessControlAllowOrigin;
    public static  String responseHeaderAccessControlAllowCredentials;
    public static  String responseHeaderAccessControlExposeHeaders;
    public static  String responseHeaderAccessControlMaxAge;
    public static  String responseHeaderAccessControlAllowMethods;
    public static  String responseHeaderAccessControlAllowHeaders;
    public static Map<String, String> simpleRequestHeaders;
    public static Map<String, String> simpleResponseHeaders;
    public static Map<String, String> preflightRequestHeaders;
    public static Map<String, String> preflightResponseHeaders;

    public static String prefix;

    public TestData() {

        prefix = "Access-Control-";

        requestHeaderOrigin = "Origin";
        requestHeaderAccessControlRequestMethod = prefix + "Request-Method";
        requestHeaderAccessControlRequestHeaders = prefix + "Request-Headers";

        responseHeaderAccessControlAllowOrigin = prefix + "Allow-Origin";
        responseHeaderAccessControlAllowCredentials = prefix + "Allow-Credentials";
        responseHeaderAccessControlExposeHeaders = prefix + "Expose-Headers";
        responseHeaderAccessControlMaxAge = prefix + "Max-Age";
        responseHeaderAccessControlAllowMethods = prefix + "Allow-Methods";
        responseHeaderAccessControlAllowHeaders = prefix + "Allow-Headers";

        simpleRequestHeaders = new HashMap<String, String>();
        simpleResponseHeaders = new HashMap<String, String>();

        preflightRequestHeaders = new HashMap<String, String>();
        preflightResponseHeaders = new HashMap<String, String>();


        simpleRequestHeaders.put(requestHeaderOrigin, "http://openliberty.io");

        simpleResponseHeaders.put(responseHeaderAccessControlAllowOrigin,
                "http://openliberty.io");
        simpleResponseHeaders.put(responseHeaderAccessControlAllowCredentials,
                "true");
        simpleResponseHeaders.put(responseHeaderAccessControlExposeHeaders,
                "MyHeader");

        preflightRequestHeaders.put(requestHeaderOrigin, "anywebsiteyoulike.com");
        preflightRequestHeaders.put(requestHeaderAccessControlRequestMethod,
                "DELETE");
        preflightRequestHeaders.put(requestHeaderAccessControlRequestHeaders,
                "MyOwnHeader2");

        preflightResponseHeaders.put(responseHeaderAccessControlAllowOrigin,
                "anywebsiteyoulike.com");
        preflightResponseHeaders.put(responseHeaderAccessControlAllowCredentials,
                "true");
        preflightResponseHeaders.put(responseHeaderAccessControlMaxAge, "10");
        preflightResponseHeaders.put(responseHeaderAccessControlAllowMethods,
                "OPTIONS, DELETE");
        preflightResponseHeaders.put(responseHeaderAccessControlAllowHeaders,
                "MyOwnHeader1, MyOwnHeader2");
    }

}
