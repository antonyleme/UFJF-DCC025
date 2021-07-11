/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.controllers;

import java.util.ArrayList;
import ufjf.aplicacao.App;
import ufjf.models.Clinic;
import ufjf.models.Manager;

/**
 *
 * @author anton
 */
public class ClinicController {

    public Clinic create(String name, String neighborhood, String street, String number, Manager manager){
        Clinic clinic = new Clinic(name, neighborhood, street, number, manager);
        
        return clinic; 
    }
    
    public Clinic update(Clinic clinic){
        return clinic;
    }
    
    public ArrayList list(){
        return App.clinics;
    }
    
    public Clinic read(){
        return App.clinics.get(0);
    }
}
