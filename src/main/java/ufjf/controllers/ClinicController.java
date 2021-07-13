/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.controllers;

import java.util.ArrayList;
import ufjf.aplicacao.App;
import ufjf.models.City;
import ufjf.models.Clinic;
import ufjf.models.Manager;

/**
 *
 * @author Antony Leme Novais Ferreira - 202065009A
 */
public class ClinicController {

    public Clinic create(String name, String neighborhood, String street, City city, int number, Manager manager){
        Clinic clinic = new Clinic(name, neighborhood, street, number, city, manager);
        
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
