/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.models;

import java.util.Date;

/**
 *
 * @author Antony Leme Novais Ferreira - 202065009A
 */
public class Dose {
    private Vaccine vaccine;
    private Date date;
    private boolean applyed;

    public Dose(Vaccine vaccine, Date date, boolean applyed) {
        this.vaccine = vaccine;
        this.date = date;
        this.applyed = applyed;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isApplyed() {
        return applyed;
    }

    public void setApplyed(boolean applyed) {
        this.applyed = applyed;
    }
    
    
}
