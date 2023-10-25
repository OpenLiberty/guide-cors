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
    public static  String request_header_access_control_request_method;
    public static  String request_header_access_control_request_headers;
    public static  String response_header_access_control_allow_origin;
    public static  String response_header_access_control_allow_credentials;
    public static  String response_header_access_control_expose_headers;
    public static  String response_header_access_control_max_age;
    public static  String response_header_access_control_allow_methods;
    public static  String response_header_access_control_allow_headers;
    public static Map<String, String> simpleRequestHeaders;
    public static Map<String, String> simpleResponseHeaders;
    public static Map<String, String> preflightRequestHeaders;
    public static Map<String, String> preflightResponseHeaders;

    public static String prefix;

    public TestData() {

        prefix = "Access-Control-";

        requestHeaderOrigin = "Origin";
        request_header_access_control_request_method = prefix + "Request-Method";
        request_header_access_control_request_headers = prefix + "Request-Headers";

        response_header_access_control_allow_origin = prefix + "Allow-Origin";
        response_header_access_control_allow_credentials = prefix + "Allow-Credentials";
        response_header_access_control_expose_headers = prefix + "Expose-Headers";
        response_header_access_control_max_age = prefix + "Max-Age";
        response_header_access_control_allow_methods = prefix + "Allow-Methods";
        response_header_access_control_allow_headers = prefix + "Allow-Headers";

        simpleRequestHeaders = new HashMap<String, String>();
        simpleResponseHeaders = new HashMap<String, String>();

        preflightRequestHeaders = new HashMap<String, String>();
        preflightResponseHeaders = new HashMap<String, String>();


        simpleRequestHeaders.put(requestHeaderOrigin, "http://openliberty.io");

        simpleResponseHeaders.put(response_header_access_control_allow_origin,
                "http://openliberty.io");
        simpleResponseHeaders.put(response_header_access_control_allow_credentials,
                "true");
        simpleResponseHeaders.put(response_header_access_control_expose_headers,
                "MyHeader");

        preflightRequestHeaders.put(requestHeaderOrigin, "anywebsiteyoulike.com");
        preflightRequestHeaders.put(request_header_access_control_request_method,
                "DELETE");
        preflightRequestHeaders.put(request_header_access_control_request_headers,
                "MyOwnHeader2");

        preflightResponseHeaders.put(response_header_access_control_allow_origin,
                "anywebsiteyoulike.com");
        preflightResponseHeaders.put(response_header_access_control_allow_credentials,
                "true");
        preflightResponseHeaders.put(response_header_access_control_max_age, "10");
        preflightResponseHeaders.put(response_header_access_control_allow_methods,
                "OPTIONS, DELETE");
        preflightResponseHeaders.put(response_header_access_control_allow_headers,
                "MyOwnHeader1, MyOwnHeader2");
    }

}
