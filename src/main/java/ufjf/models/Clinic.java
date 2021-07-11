/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.models;

import java.util.ArrayList;

/**
 *
 * @author anton
 */
public class Clinic {

    private String name;
    private String neighborhood;
    private String street;
    private String number;
    private Manager manager;
    private ArrayList<Nurse> nurses = new ArrayList<>();

    public Clinic(String name, String neighborhood, String street, String number, Manager manager) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.manager = manager;
    }

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
