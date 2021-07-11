/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.models;

import java.util.Date;

/**
 *
 * @author anton
 */
public class Dose {
    private String vaccineName;
    private Date date;
    private boolean applyed;

    public Dose(String vaccineName, Date date, boolean applyed) {
        this.vaccineName = vaccineName;
        this.date = date;
        this.applyed = applyed;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public Date getDate() {
        return date;
    }
    
    
}
