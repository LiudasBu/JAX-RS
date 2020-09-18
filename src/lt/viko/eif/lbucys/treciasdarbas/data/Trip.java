/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A class for holding the data of Trips. It includes a List of Client class 
 * objects, a rating Map based on character constants, the ID of the trip, name
 * rating, country, a list of cities, price and duration days.
 *
 * @author Admin
 */
@XmlRootElement
@XmlType(propOrder = {"ID", "name", "rating", "country", "cities", "price",
    "durationDays", "clients", "ratingMap"})
public class Trip {

    /**
     *
     */
    public static final char GOOD_RATING = 'A';

    /**
     *
     */
    public static final char AVERAGE_RATING = 'B';

    /**
     *
     */
    public static final char LOW_RATING = 'C';

    private Map<Character, String> ratingMap = new HashMap();

    private int ID;
    private String name;
    private char rating;
    private String country;
    private List<String> cities;
    private List<Client> clients;
    private double price;
    private int durationDays;

    /**
     *
     */
    public Trip() {
        ratingMap.put(GOOD_RATING, "Luxury");
        ratingMap.put(AVERAGE_RATING, "Ordinary");
        ratingMap.put(LOW_RATING, "Budget");
    }

    /**
     *
     * @return
     */
    public Map<Character, String> getRatingMap() {
        return ratingMap;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public int getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public char getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     */
    public void setRating(char rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public List<String> getCities() {
        return cities;
    }

    /**
     *
     * @param cities
     */
    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public List<Client> getClients() {
        return clients;
    }

    /**
     *
     * @param clients
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public int getDurationDays() {
        return durationDays;
    }

    /**
     *
     * @param durationDays
     */
    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    /**
     *
     * @param ratingMap
     */
    public void setRatingMap(Map<Character, String> ratingMap) {
        this.ratingMap = ratingMap;
    }

    @Override
    public String toString() {
        return ID + ". " + name + ", " + country
                + "\nRating - " + ratingMap.get(rating) + "\n" + clients;
    }

}
