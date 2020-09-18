/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.repository;

import java.util.LinkedList;
import java.util.List;
import lt.viko.eif.lbucys.treciasdarbas.data.Client;

/**
 * An implementation of the ClientRepository interface using data from a static
 * block.
 *
 * @author Admin
 */
public class ClientRepositoryImpl implements ClientRepository {

    private static List<Client> clients = new LinkedList<>();

    static {
        Client client1 = new Client();
        client1.setIsBanned(false);
        client1.setName("Jonas");
        client1.setSurname("Jonaitis");
        client1.setAccountBalance(250.0);
        client1.setCity("Vilnius");
        client1.setPhoneNumber("865280792");
        client1.setStreetAddress("Mindaugo g. 11");
        client1.setDOB("1982-12-05");
        client1.setZipCode(13294);
        client1.setID(1);

        clients.add(client1);

        Client client2 = new Client();
        client2.setIsBanned(false);
        client2.setName("Tadas");
        client2.setSurname("Kazlauskas");
        client2.setAccountBalance(1432.15);
        client2.setCity("Kaunas");
        client2.setPhoneNumber("865263522");
        client2.setStreetAddress("Sąvanorių prospektas 5");
        client2.setDOB("1994-05-06");
        client2.setZipCode(25682);
        client2.setID(2);

        clients.add(client2);
    }

    /**
     * A function to fetch clients from an initialized static block.
     * 
     * @return     Returns clients that were initialized
     */
    @Override
    public List<Client> fetchAllClients() {
        return clients;
    }

}
