/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.data;

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
public class ClientTest {
    
    public ClientTest() {
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
     * Test of getID method, of class Client.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Client instance = new Client();
        instance.setID(5);
        int expResult = 5;
        int result = instance.getID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getName method, of class Client.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Client instance = new Client();
        instance.setName("Jonas");
        String expResult = "Jonas";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSurname method, of class Client.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Client instance = new Client();
        instance.setSurname("Joanitis");
        String expResult = "Joanitis";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStreetAddress method, of class Client.
     */
    @Test
    public void testGetStreetAddress() {
        System.out.println("getStreetAddress");
        Client instance = new Client();
        String expResult = "Lapu gatve 6-2";
        instance.setStreetAddress("Lapu gatve 6-2");
        String result = instance.getStreetAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCity method, of class Client.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Client instance = new Client();
        String expResult = "Vilnius";
        instance.setCity("Vilnius");
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getZipCode method, of class Client.
     */
    @Test
    public void testGetZipCode() {
        System.out.println("getZipCode");
        Client instance = new Client();
        int expResult = 02101;
        instance.setZipCode(02101);
        int result = instance.getZipCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhoneNumber method, of class Client.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Client instance = new Client();
        String expResult = "+37065280792";
        instance.setPhoneNumber("+37065280792");
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAccountBalance method, of class Client.
     */
    @Test
    public void testGetAccountBalance() {
        System.out.println("getAccountBalance");
        Client instance = new Client();
        double expResult = 1000.0;
        instance.setAccountBalance(1000.0);
        double result = instance.getAccountBalance();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of isIsBanned method, of class Client.
     */
    @Test
    public void testIsIsBanned() {
        System.out.println("isIsBanned");
        Client instance = new Client();
        boolean expResult = false;
        instance.setIsBanned(expResult);
        boolean result = instance.isIsBanned();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDOB method, of class Client.
     */
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        Client instance = new Client();
        String expResult = "1994-12-29";
        instance.setDOB(expResult);
        String result = instance.getDOB();
        assertEquals(expResult, result);

    }

    /**
     * Test of setID method, of class Client.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Client instance = new Client();
        instance.setID(ID);
        assertEquals(ID, instance.getID());
    }

    /**
     * Test of setName method, of class Client.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Jonas";
        Client instance = new Client();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of setSurname method, of class Client.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "Jonaitis";
        Client instance = new Client();
        instance.setSurname(surname);
        assertEquals(surname, instance.getSurname());
    }

    /**
     * Test of setStreetAddress method, of class Client.
     */
    @Test
    public void testSetStreetAddress() {
        System.out.println("setStreetAddress");
        String streetAddress = "Aguonu g. 6";
        Client instance = new Client();
        instance.setStreetAddress(streetAddress);
        assertEquals(streetAddress, instance.getStreetAddress());
    }

    /**
     * Test of setCity method, of class Client.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "Vilnius";
        Client instance = new Client();
        instance.setCity(city);
        assertEquals(city, instance.getCity());
    }

    /**
     * Test of setZipCode method, of class Client.
     */
    @Test
    public void testSetZipCode() {
        System.out.println("setZipCode");
        int zipCode = 02101;
        Client instance = new Client();
        instance.setZipCode(zipCode);
        assertEquals(zipCode, instance.getZipCode());
    }

    /**
     * Test of setPhoneNumber method, of class Client.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "865280792";
        Client instance = new Client();
        instance.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber, instance.getPhoneNumber());
    }

    /**
     * Test of setAccountBalance method, of class Client.
     */
    @Test
    public void testSetAccountBalance() {
        System.out.println("setAccountBalance");
        double accountBalance = 100.0;
        Client instance = new Client();
        instance.setAccountBalance(accountBalance);
        assertEquals(accountBalance, instance.getAccountBalance(), 0.0);
    }

    /**
     * Test of setIsBanned method, of class Client.
     */
    @Test
    public void testSetIsBanned() {
        System.out.println("setIsBanned");
        boolean isBanned = false;
        Client instance = new Client();
        instance.setIsBanned(isBanned);
        assertEquals(isBanned, instance.isIsBanned());
    }

    /**
     * Test of setDOB method, of class Client.
     */
    @Test
    public void testSetDOB() {
        System.out.println("setDOB");
        String DOB = "1994-12-22";
        Client instance = new Client();
        instance.setDOB(DOB);
        assertEquals(DOB, instance.getDOB());
    }
    
     /**
     * Test of toString method, of class Client.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Client instance = new Client();
        String expResult = "1. Jonas Jonaitis\nAguonu g. 6, Vilnius-12130\n";
        instance.setID(1);
        instance.setName("Jonas");
        instance.setSurname("Jonaitis");
        instance.setStreetAddress("Aguonu g. 6");
        instance.setCity("Vilnius");
        instance.setZipCode(12130);
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
