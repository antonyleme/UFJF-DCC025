/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.models;

import java.util.ArrayList;

/**
 *
 * @author Antony Leme Novais Ferreira - 202065009A
 */
public class Clinic {

    private String name;
    private String neighborhood;
    private String street;
    private City city;
    private int number;

    public Clinic(String name, String neighborhood, String street, int number, City city, Manager manager) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.city = city;
        this.manager = manager;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    private Manager manager;
    private ArrayList<Nurse> nurses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ArrayList<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(ArrayList<Nurse> nurses) {
        this.nurses = nurses;
    }
    
    
    
}
