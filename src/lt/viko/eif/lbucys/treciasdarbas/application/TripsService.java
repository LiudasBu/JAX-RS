/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.application;

import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import lt.viko.eif.lbucys.treciasdarbas.data.Trip;
import lt.viko.eif.lbucys.treciasdarbas.repository.TripRepositoryImpl;

/**
 * The implementation of the RESTful service that is used for CRUD operations
 * on the class Trip
 * 
 * @author Admin
 *
 * http://localhost:9999/application.wadl
 */
@Path("trips")
public class TripsService {

    TripRepositoryImpl repo = new TripRepositoryImpl();

    /**
     * Returns the default message
     * 
     * @return   the default message
     */
    @GET
    @Path("message")
    @Produces("text/plain")
    public String getMessage() {
        return "This is a Trips REST service";
    }

    /**
     * The function that returns a Trip object as a JSON object
     * 
     * @param i    defines the index of the trip being selected
     * @return  `  the selected Trip object in JSON format
     */
    @GET
    @Path("single")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTripSingle(@DefaultValue("0") @QueryParam("i") int i) {
        if (i < repo.fetchAllTrips().size()) {
            List<Trip> trips = repo.fetchAllTrips();
            Trip trip = trips.get(i);
            return Response.ok(trip).build();
        } else return Response.status(404).build();
    }
    
    /**
     * The function to delete a Trip object from the repository
     * 
     * @param del   defines the index of the trip to delete
     * @return      the HTTP status code either ok (200) or error (404)
     */
    @DELETE
    @Path("single")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteTripSingle(@QueryParam("del") int del) {
        if (del < repo.fetchAllTrips().size()) {
            repo.deleteTrip(del);
            return Response.status(200).build();
        } else return Response.status(404).build();
    }
    
    
    /**
     * The function to add a new Trip object to the repository
     * 
     * @param t   The Trip object
     * @return    Status message
     */
    @POST
    @Path("single")
    @Produces(MediaType.APPLICATION_JSON)
    public Response postTripSingle(@QueryParam("t")  String t) {
        Gson g = new Gson();
        Trip trip = g.fromJson(t, Trip.class);
        repo.addTrip(trip);
        return Response.status(200).build();

    }
}
