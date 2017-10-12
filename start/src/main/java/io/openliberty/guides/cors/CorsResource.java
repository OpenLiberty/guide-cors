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
package io.openliberty.guides.cors;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/configurations")
public class CorsResource {

    @GET
    @Path("/simple")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getSimple() {
        return getResponse();
    }

    @DELETE
    @Path("/preflight")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getPreflight(@Context HttpHeaders headers) {
        return getResponse();
    }

    private Response getResponse() {
        return Response.status(Status.OK).entity("Successfully responded").build();
    }

}
