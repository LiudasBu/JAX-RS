/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import lt.viko.eif.lbucys.treciasdarbas.data.Client;
import lt.viko.eif.lbucys.treciasdarbas.data.Trip;

/**
 * An implementation of the TripRepository interface using data from a static
 * block.
 *
 * @author Admin
 */
public class TripRepositoryImpl implements TripRepository {

    private static List<Trip> trips = new ArrayList();

    static {
        ClientRepository repo = new ClientRepositoryImpl();
        List<Client> clients = repo.fetchAllClients();

        List<String> cities = new ArrayList();
        cities.add("Atėnai");
        cities.add("Salonikai");
        Trip trip1 = new Trip();
        trip1.setCountry("Graikija");
        trip1.setCities(cities);
        trip1.setClients(clients);
        trip1.setDurationDays(8);
        trip1.setRating('A');
        trip1.setID(1);
        trip1.setName("Savaitės kelionė po Graikiją");
        trip1.setPrice(800.00);

        trips.add(trip1);

        List<String> cities2 = new ArrayList();
        cities2.add("Talinas");
        cities2.add("Ryga");
        Trip trip2 = new Trip();
        trip2.setCountry("Latvija, Estija");
        trip2.setCities(cities2);
        trip2.setClients(clients);
        trip2.setDurationDays(4);
        trip2.setRating('B');
        trip2.setID(2);
        trip2.setName("Keturių dienų kelionė po Baltijos šalis");
        trip2.setPrice(500.00);

        trips.add(trip2);

    }

    /**
     * A function to fetch trips from an initialized static block.
     * 
     * @return      Returns trips that were initialized. 
     */
    @Override
    public List<Trip> fetchAllTrips() {
        return trips;
    }
    
    @Override
    public void deleteTrip(int i) {
        if(i<trips.size()) trips.remove(i);
    }
    
    @Override
    public void addTrip(Trip trip)
    {
        trips.add(trip);
    }
}
