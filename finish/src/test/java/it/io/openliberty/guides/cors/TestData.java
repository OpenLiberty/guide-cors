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

    public final String REQUEST_HEADER_ORIGIN;
    public final String REQUEST_HEADER_ACCESS_CONTROL_REQUEST_METHOD;
    public final String REQUEST_HEADER_ACCESS_CONTROL_REQUEST_HEADERS;
    public final String RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN;
    public final String RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_CREDENTIALS;
    public final String RESPONSE_HEADER_ACCESS_CONTROL_EXPOSE_HEADERS;
    public final String RESPONSE_HEADER_ACCESS_CONTROL_MAX_AGE;
    public final String RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_METHODS;
    public final String RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_HEADERS;
    public final Map<String, String> simpleRequestHeaders;
    public final Map<String, String> simpleResponseHeaders;
    public final Map<String, String> preflightRequestHeaders;
    public final Map<String, String> preflightResponseHeaders;

    public final String prefix;

    public TestData() {

        prefix = "Access-Control-";

        REQUEST_HEADER_ORIGIN = "Origin";
        REQUEST_HEADER_ACCESS_CONTROL_REQUEST_METHOD = prefix + "Request-Method";
        REQUEST_HEADER_ACCESS_CONTROL_REQUEST_HEADERS = prefix + "Request-Headers";

        RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN = prefix + "Allow-Origin";
        RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_CREDENTIALS = prefix + "Allow-Credentials";
        RESPONSE_HEADER_ACCESS_CONTROL_EXPOSE_HEADERS = prefix + "Expose-Headers";
        RESPONSE_HEADER_ACCESS_CONTROL_MAX_AGE = prefix + "Max-Age";
        RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_METHODS = prefix + "Allow-Methods";
        RESPONSE_HEADER_ACCESS_CONTROL_ALLOW_HEADERS = prefix + "Allow-Headers";

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
