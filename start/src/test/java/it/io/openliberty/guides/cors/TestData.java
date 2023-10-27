// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2017, 2023 IBM Corporation and others.
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

  static final String ORIGIN = "Origin";
  static final String AC_REQUEST_METHOD = "Access-Control-Request-Method";
  static final String AC_REQUEST_HEADERS = "Access-Control-Request-Headers";

  static final String AC_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
  static final String AC_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
  static final String AC_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
  static final String AC_MAX_AGE = "Access-Control-Max-Age";
  static final String AC_ALLOW_METHODS = "Access-Control-Allow-Methods";
  static final String AC_ALLOW_HEADERS = "Access-Control-Allow-Headers";

  static Map<String, String> simpleRequestHeaders = new HashMap<String, String>();
  static Map<String, String> simpleResponseHeaders = new HashMap<String, String>();

  static Map<String, String> preflightRequestHeaders = new HashMap<String, String>();
  static Map<String, String> preflightResponseHeaders = new HashMap<String, String>();

  static {
      simpleRequestHeaders.put(ORIGIN, "openliberty.io");

      simpleResponseHeaders.put(AC_ALLOW_ORIGIN, "openliberty.io");
      simpleResponseHeaders.put(AC_ALLOW_CREDENTIALS, "true");
      simpleResponseHeaders.put(AC_EXPOSE_HEADERS, "MyHeader");
      preflightRequestHeaders.put(ORIGIN, "anywebsiteyoulike.com");
      preflightRequestHeaders.put(AC_REQUEST_METHOD, "DELETE");
      preflightRequestHeaders.put(AC_REQUEST_HEADERS, "MyOwnHeader2");

      preflightResponseHeaders.put(AC_ALLOW_ORIGIN, "anywebsiteyoulike.com");
      preflightResponseHeaders.put(AC_ALLOW_CREDENTIALS, "true");
      preflightResponseHeaders.put(AC_MAX_AGE, "10");
      preflightResponseHeaders.put(AC_ALLOW_METHODS, "OPTIONS, DELETE");
      preflightResponseHeaders.put(AC_ALLOW_HEADERS, "MyOwnHeader1, MyOwnHeader2");
  }

}
