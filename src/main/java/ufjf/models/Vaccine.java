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
public class Vaccine {
    private String name;
    private Date validity;
    private String manufacturerName;

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vaccine(String name, Date validity, String manufacturerName) {
        this.name = name;
        this.validity = validity;
        this.manufacturerName = manufacturerName;
    }
}
