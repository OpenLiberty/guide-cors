// tag::comment[]
/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::comment[]
package it.io.openliberty.guides.cors;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

public class TestCors {

    String pathToHost = "http://localhost:9080/";

    @Before
    public void setUp() {
        // JVM does not allow restricted headers by default
        // Set to true for CORS testing
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
    }

    // tag::simpleTest[]
    @Test
    public void testSimpleCorsRequest() throws IOException  {
        HttpURLConnection connection = HttpUtils.sendRequest(
            pathToHost + "configurations/simple",
            "GET",
            TestData.simpleRequestHeaders);
        checkCorsResponse(connection, TestData.simpleResponseHeaders);

        printResponseHeaders(connection, "Simple CORS Request");
    }
    // end::simpleTest[]

    // tag::preflightTest[]
    @Test
    public void testPreflightCorsRequest() throws IOException {
        HttpURLConnection connection = HttpUtils.sendRequest(
            pathToHost + "configurations/preflight",
            "OPTIONS",
            TestData.preflightRequestHeaders);
        checkCorsResponse(connection, TestData.preflightResponseHeaders);

        printResponseHeaders(connection, "Preflight CORS Request");
    }
    // end::preflightTest[]

    public void checkCorsResponse(HttpURLConnection connection, Map<String, String> expectedHeaders) throws IOException {
        assertEquals("Invalid HTTP response code", 200, connection.getResponseCode());
        expectedHeaders.forEach((responseHeader, value) -> {
            assertEquals("Unexpected value for " + responseHeader + " header", value, connection.getHeaderField(responseHeader));
        });
    }

    public static void printResponseHeaders(HttpURLConnection connection, String label) {
        System.out.println("--- " + label + " ---");
        Map<String, java.util.List<String>> map = connection.getHeaderFields();
        for (Entry<String, java.util.List<String>> entry : map.entrySet()) {
            System.out.println("Header " + entry.getKey() + " = " + entry.getValue());
        }
        System.out.println();
    }

}
