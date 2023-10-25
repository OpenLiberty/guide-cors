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
    public static  String RequestHeaderAccessControlRequestMethod;
    public static  String RequestHeaderAccessControlRequestHeaders;
    public static  String ResponseHeaderAccessControlAllowOrigin;
    public static  String ResponseHeaderAccessControlAllowCredentials;
    public static  String ResponseHeaderAccessControlExposeHeaders;
    public static  String ResponseHeaderAccessControlMaxAge;
    public static  String ResponseHeaderAccessControlAllowMethods;
    public static  String ResponseHeaderAccessControlAllowHeaders;
    public static Map<String, String> simpleRequestHeaders;
    public static Map<String, String> simpleResponseHeaders;
    public static Map<String, String> preflightRequestHeaders;
    public static Map<String, String> preflightResponseHeaders;

    public static String prefix;

    public TestData() {

        prefix = "Access-Control-";

        requestHeaderOrigin = "Origin";
        RequestHeaderAccessControlRequestMethod = prefix + "Request-Method";
        RequestHeaderAccessControlRequestHeaders = prefix + "Request-Headers";

        ResponseHeaderAccessControlAllowOrigin = prefix + "Allow-Origin";
        ResponseHeaderAccessControlAllowCredentials = prefix + "Allow-Credentials";
        ResponseHeaderAccessControlExposeHeaders = prefix + "Expose-Headers";
        ResponseHeaderAccessControlMaxAge = prefix + "Max-Age";
        ResponseHeaderAccessControlAllowMethods = prefix + "Allow-Methods";
        ResponseHeaderAccessControlAllowHeaders = prefix + "Allow-Headers";

        simpleRequestHeaders = new HashMap<String, String>();
        simpleResponseHeaders = new HashMap<String, String>();

        preflightRequestHeaders = new HashMap<String, String>();
        preflightResponseHeaders = new HashMap<String, String>();


        simpleRequestHeaders.put(requestHeaderOrigin, "http://openliberty.io");

        simpleResponseHeaders.put(ResponseHeaderAccessControlAllowOrigin,
                "http://openliberty.io");
        simpleResponseHeaders.put(ResponseHeaderAccessControlAllowCredentials,
                "true");
        simpleResponseHeaders.put(ResponseHeaderAccessControlExposeHeaders,
                "MyHeader");

        preflightRequestHeaders.put(requestHeaderOrigin, "anywebsiteyoulike.com");
        preflightRequestHeaders.put(RequestHeaderAccessControlRequestMethod,
                "DELETE");
        preflightRequestHeaders.put(RequestHeaderAccessControlRequestHeaders,
                "MyOwnHeader2");

        preflightResponseHeaders.put(ResponseHeaderAccessControlAllowOrigin,
                "anywebsiteyoulike.com");
        preflightResponseHeaders.put(ResponseHeaderAccessControlAllowCredentials,
                "true");
        preflightResponseHeaders.put(ResponseHeaderAccessControlMaxAge, "10");
        preflightResponseHeaders.put(ResponseHeaderAccessControlAllowMethods,
                "OPTIONS, DELETE");
        preflightResponseHeaders.put(ResponseHeaderAccessControlAllowHeaders,
                "MyOwnHeader1, MyOwnHeader2");
    }

}
