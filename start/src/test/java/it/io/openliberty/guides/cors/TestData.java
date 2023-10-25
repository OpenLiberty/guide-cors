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

    public static final String REQUEST_HEADER_ORIGIN;
    public static final String REQUEST_HEADER_ACCESS_CONTROL_REQUEST_METHOD;
    public static final String REQUEST_HEADER_ACCESS_CONTROL_REQUEST_HEADERS;
    public static final String RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN;
    public static final String RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_CREDENTIALS;
    public static final String RESPONSE_HEADER_ACCESS_CONTROL_EXPOSE_HEADERS;
    public static final String RESPONSE_HEADER_ACCESS_CONTROL_MAX_AGE;
    public static final String RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_METHODS;
    public static final String RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_HEADERS;
    public static Map<String, String> simpleRequestHeaders;
    public static Map<String, String> simpleResponseHeaders;
    public static Map<String, String> preflightRequestHeaders;
    public static Map<String, String> preflightResponseHeaders;

    public static final String PREFIX;

    public TestData() {

        PREFIX = "Access-Control-";

        REQUEST_HEADER_ORIGIN = "Origin";
        REQUEST_HEADER_ACCESS_CONTROL_REQUEST_METHOD = PREFIX + "Request-Method";
        REQUEST_HEADER_ACCESS_CONTROL_REQUEST_HEADERS = PREFIX + "Request-Headers";

        RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN = PREFIX + "Allow-Origin";
        RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_CREDENTIALS = PREFIX + "Allow-Credentials";
        RESPONSE_HEADER_ACCESS_CONTROL_EXPOSE_HEADERS = PREFIX + "Expose-Headers";
        RESPONSE_HEADER_ACCESS_CONTROL_MAX_AGE = PREFIX + "Max-Age";
        RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_METHODS = PREFIX + "Allow-Methods";
        RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_HEADERS = PREFIX + "Allow-Headers";

        simpleRequestHeaders = new HashMap<String, String>();
        simpleResponseHeaders = new HashMap<String, String>();

        preflightRequestHeaders = new HashMap<String, String>();
        preflightResponseHeaders = new HashMap<String, String>();


        simpleRequestHeaders.put(REQUEST_HEADER_ORIGIN, "http://openliberty.io");

        simpleResponseHeaders.put(RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN,
                "http://openliberty.io");
        simpleResponseHeaders.put(RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_CREDENTIALS,
                "true");
        simpleResponseHeaders.put(RESPONSE_HEADER_ACCESS_CONTROL_EXPOSE_HEADERS,
                "MyHeader");

        preflightRequestHeaders.put(REQUEST_HEADER_ORIGIN, "anywebsiteyoulike.com");
        preflightRequestHeaders.put(REQUEST_HEADER_ACCESS_CONTROL_REQUEST_METHOD,
                "DELETE");
        preflightRequestHeaders.put(REQUEST_HEADER_ACCESS_CONTROL_REQUEST_HEADERS,
                "MyOwnHeader2");

        preflightResponseHeaders.put(RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN,
                "anywebsiteyoulike.com");
        preflightResponseHeaders.put(RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_CREDENTIALS,
                "true");
        preflightResponseHeaders.put(RESPONSE_HEADER_ACCESS_CONTROL_MAX_AGE, "10");
        preflightResponseHeaders.put(RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_METHODS,
                "OPTIONS, DELETE");
        preflightResponseHeaders.put(RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_HEADERS,
                "MyOwnHeader1, MyOwnHeader2");
    }

}
