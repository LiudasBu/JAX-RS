/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.repository;

import java.util.List;
import lt.viko.eif.lbucys.treciasdarbas.data.Client;
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
public class ClientRepositoryImplTest {
    
    public ClientRepositoryImplTest() {
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
     * Test of fetchAllClients method, of class ClientRepositoryImpl.
     */
    @Test
    public void testFetchAllClients() {
        System.out.println("fetchAllClients");
        ClientRepositoryImpl instance = new ClientRepositoryImpl();
        String expResult = "Jonas";
        List<Client> result = instance.fetchAllClients();
        assertEquals(expResult, result.get(0).getName());
    }
    
}