/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.application;

import com.google.gson.Gson;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class TripsServiceTest {
    
    public TripsServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMessage method, of class TripsService.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        TripsService instance = new TripsService();
        String expResult = "This is a Trips REST service";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }


    /**
     * Test of getTripSingle method, of class TripsService.
     */
    @Test
    public void testGetTripSingle() {
        System.out.println("getTripSingle");
        int i = 0;
        TripsService instance = new TripsService();
        Gson g = new Gson();
      //  String tripJson = g.toJson(instance.repo.fetchAllTrips().get(i));
        Response expResult = Response.ok(instance.repo.fetchAllTrips().get(i)).build();
        Response result = instance.getTripSingle(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteTripSingle method, of class TripsService.
     */
    @Test
    public void testDeleteTripSingle() {
        System.out.println("deleteTripSingle");
        int del = 0;
        TripsService instance = new TripsService();
        Response expResult = Response.status(200).build();
        Response result = instance.deleteTripSingle(del);
        assertEquals(expResult, result);

    }

    /**
     * Test of postTripSingle method, of class TripsService.
     */
    @Test
    public void testPostTripSingle() {
        System.out.println("postTripSingle");
        String t = "";
        TripsService instance = new TripsService();
        Response expResult = null;
        Response result = instance.postTripSingle(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
