/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.repository;

import java.util.List;
import lt.viko.eif.lbucys.treciasdarbas.data.Trip;

/**
 * An interface for the repository of trips.
 *
 * @author Admin
 */
public interface TripRepository {

    List<Trip> fetchAllTrips();
    void deleteTrip(int i);
    void addTrip(Trip trip);

}
