/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.repository;

import java.util.List;
import lt.viko.eif.lbucys.treciasdarbas.data.Trip;
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
public class TripRepositoryImplTest {
    
    public TripRepositoryImplTest() {
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
     * Test of fetchAllTrips method, of class TripRepositoryImpl.
     */
    @Test
    public void testFetchAllTrips() {
        System.out.println("fetchAllTrips");
        TripRepositoryImpl instance = new TripRepositoryImpl();
        int expResult = 1;
        List<Trip> result = instance.fetchAllTrips();
        assertEquals(expResult, result.get(0).getID());
    }
    

    /**
     * Test of deleteTrip method, of class TripRepositoryImpl.
     */
    @Test
    public void testDeleteTrip() {
        System.out.println("deleteTrip");
        int i = 0;
        TripRepositoryImpl instance = new TripRepositoryImpl();
        instance.deleteTrip(i);
        Trip trip = instance.fetchAllTrips().get(0);
        int expResult = 2;
        assertEquals(expResult, trip.getID());
    }

    /**
     * Test of addTrip method, of class TripRepositoryImpl.
     */
    @Test
    public void testAddTrip() {
        System.out.println("addTrip");
        Trip trip = new Trip();
        trip.setID(3);
        TripRepositoryImpl instance = new TripRepositoryImpl();
        instance.addTrip(trip);
        int expResult = 3;
        assertEquals(expResult, instance.fetchAllTrips().get(2).getID());
    }
    
}
