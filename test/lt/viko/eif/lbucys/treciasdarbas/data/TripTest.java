/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class TripTest {
    
    public TripTest() {
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
     * Test of getRatingMap method, of class Trip.
     */
    @Test
    public void testGetRatingMap() {
        System.out.println("getRatingMap");
        Trip instance = new Trip();
        Map<Character, String> expResult = new HashMap();
        expResult.put('B', "Blogas");
        instance.setRatingMap(expResult);
        Map<Character, String> result = instance.getRatingMap();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class Trip.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Trip instance = new Trip();
        int expResult = 0;
        instance.setID(expResult);
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Trip.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Trip instance = new Trip();
        String expResult = "Kelionė po Rodo salą";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRating method, of class Trip.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Trip instance = new Trip();
        char expResult = 'A';
        instance.setRating(expResult);
        char result = instance.getRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCountry method, of class Trip.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Trip instance = new Trip();
        String expResult = "Graikija";
        instance.setCountry(expResult);
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCities method, of class Trip.
     */
    @Test
    public void testGetCities() {
        System.out.println("getCities");
        Trip instance = new Trip();
        List<String> expResult = new ArrayList<String>();
        expResult.add("Roma");
        expResult.add("Milanas");
        instance.setCities(expResult);
        List<String> result = instance.getCities();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClients method, of class Trip.
     */
    @Test
    public void testGetClients() {
        System.out.println("getClients");
        Trip instance = new Trip();
        List<Client> expResult = new ArrayList<Client>();
        Client klientas = new Client();
        klientas.setName("Jonas");
        expResult.add(klientas);
        klientas.setName("Petras");
        expResult.add(klientas);
        instance.setClients(expResult);
        List<Client> result = instance.getClients();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Trip.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Trip instance = new Trip();
        double expResult = 250.9;
        instance.setPrice(expResult);
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDurationDays method, of class Trip.
     */
    @Test
    public void testGetDurationDays() {
        System.out.println("getDurationDays");
        Trip instance = new Trip();
        int expResult = 7;
        instance.setDurationDays(expResult);
        int result = instance.getDurationDays();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRatingMap method, of class Trip.
     */
    @Test
    public void testSetRatingMap() {
        System.out.println("setRatingMap");
        Map<Character, String> ratingMap = new HashMap();
        Trip instance = new Trip();
        ratingMap.put('B', "Blogas");
        instance.setRatingMap(ratingMap);
        assertEquals(ratingMap, instance.getRatingMap());
    }

    /**
     * Test of setID method, of class Trip.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Trip instance = new Trip();
        instance.setID(ID);
        assertEquals(ID, instance.getID());
    }

    /**
     * Test of setName method, of class Trip.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Kelionė po Rodo salą";
        Trip instance = new Trip();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of setRating method, of class Trip.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        char rating = 'A';
        Trip instance = new Trip();
        instance.setRating(rating);
        assertEquals(rating, instance.getRating());
    }

    /**
     * Test of setCountry method, of class Trip.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "Graikija";
        Trip instance = new Trip();
        instance.setCountry(country);
        assertEquals(country, instance.getCountry());
    }

    /**
     * Test of setCities method, of class Trip.
     */
    @Test
    public void testSetCities() {
        System.out.println("setCities");
        List<String> cities = new ArrayList<String>();
        cities.add("Vilnius");
        cities.add("Kaunas");
        Trip instance = new Trip();
        instance.setCities(cities);
        assertEquals(cities, instance.getCities());
    }

    /**
     * Test of setClients method, of class Trip.
     */
    @Test
    public void testSetClients() {
        System.out.println("setClients");
        List<Client> clients = new ArrayList<Client>();
        Trip instance = new Trip();
        Client klientas = new Client();
        klientas.setName("Jonas");
        clients.add(klientas);
        klientas.setName("Petras");
        clients.add(klientas);
        instance.setClients(clients);
        assertEquals(clients, instance.getClients());
    }

    /**
     * Test of setPrice method, of class Trip.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 250.0;
        Trip instance = new Trip();
        instance.setPrice(price);
        assertEquals(price, instance.getPrice(), 0.0);
    }

    /**
     * Test of setDurationDays method, of class Trip.
     */
    @Test
    public void testSetDurationDays() {
        System.out.println("setDurationDays");
        int durationDays = 7;
        Trip instance = new Trip();
        instance.setDurationDays(durationDays);
        assertEquals(durationDays, instance.getDurationDays());
    }

    /**
     * Test of toString method, of class Trip.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trip instance = new Trip();
        String expResult = "1. Kelionė po Rodo salą, Graikija\nRating - Budget"
                + "\n[1. Jonas Jonaitis\nAguonu g. 6, Vilnius-12130\n]";
        instance.setID(1);
        instance.setName("Kelionė po Rodo salą");
        instance.setCountry("Graikija");
        instance.setRating('C');
        Client klientas = new Client();
        klientas.setID(1);
        klientas.setName("Jonas");
        klientas.setSurname("Jonaitis");
        klientas.setStreetAddress("Aguonu g. 6");
        klientas.setCity("Vilnius");
        klientas.setZipCode(12130);
        List<Client> clients = new ArrayList<Client>();
        clients.add(klientas);
        instance.setClients(clients);
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
