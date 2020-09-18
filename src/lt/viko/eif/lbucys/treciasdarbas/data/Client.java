/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Client is a class for holding the data of the clients. It holds the data for
 * name, surname, address, phone number, date of birth, account balance and 
 * whether the Client in question is banned.
 *
 * @author Admin
 */
@XmlRootElement
@XmlType(propOrder = {"name", "surname", "DOB", "streetAddress",
    "city", "zipCode", "phoneNumber", "accountBalance", "isBanned"})
public class Client {

    /**
     *
     */
    public static final boolean BANNED = true;

    /**
     *
     */
    public static final boolean NOT_BANNED = false;

    private int ID;
    private String name;
    private String surname;
    private String streetAddress;
    private String city;
    private int zipCode;
    private String phoneNumber;
    private double accountBalance;
    private boolean isBanned;
    private String DOB;

    /**
     *
     */
    public Client() {
    }

    /**
     *
     * @return
     */
    @XmlAttribute
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
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     *
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public int getZipCode() {
        return zipCode;
    }

    /**
     *
     * @param zipCode
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param accountBalance
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public boolean isIsBanned() {
        return isBanned;
    }

    /**
     *
     * @param isBanned
     */
    public void setIsBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }

    /**
     *
     * @return
     */
    @XmlElement
    public String getDOB() {
        return DOB;
    }

    /**
     *
     * @param DOB
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return ID + ". " + name + " " + surname
                + "\n" + streetAddress + ", " + city + "-" + zipCode + "\n";
    }

}
