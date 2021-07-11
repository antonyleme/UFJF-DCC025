/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.aplicacao;

import ufjf.views.Vaccine;
import ufjf.views.Login;
import ufjf.views.Manager.ManagerHome;
import ufjf.views.Manager.Nurses;
import ufjf.views.Manager.PeopleVaccined;
import ufjf.views.Nurse.NurseHome;
import ufjf.views.Register;
import ufjf.views.Secretary.Clinics;
import ufjf.views.Secretary.Managers;
import ufjf.views.Secretary.SecretaryHome;
import ufjf.views.Secretary.Vaccines;

/**
 *
 * @author anton
 */
public class Router {
    private final Login login;
    private final Register register;
    private final Vaccine vaccine;
    private final ManagerHome managerHome;
    private final Nurses nurses;
    private final PeopleVaccined peopleVaccined;
    private final NurseHome nurseHome;
    private final Clinics clinics;
    private final Managers managers;
    private final SecretaryHome secretaryHome;
    private final Vaccines vaccines;
    
    public Router(){
        login = new Login();
        register = new Register();
        vaccine = new Vaccine();
        managerHome = new ManagerHome();
        nurses = new Nurses();
        peopleVaccined = new PeopleVaccined();
        nurseHome = new NurseHome();
        clinics = new Clinics();
        managers = new Managers();
        secretaryHome = new SecretaryHome();
        vaccines = new Vaccines();
    }
    
    public void closeAll(){
        login.setVisible(false);
        register.setVisible(false);
        vaccine.setVisible(false);
        managerHome.setVisible(false);
        nurses.setVisible(false);
        peopleVaccined.setVisible(false);
        nurseHome.setVisible(false);
        clinics.setVisible(false);
        managers.setVisible(false);
        secretaryHome.setVisible(false);
        vaccines.setVisible(false);
    }
    
    public void navigate(String view){
        this.closeAll();
        
        switch(view){
            case "login": 
                login.setVisible(true);
                break;
            case "register": 
                register.setVisible(true);
                break;
            case "vaccine": 
                vaccine.setVisible(true);
                break;
            case "managerHome": 
                managerHome.setVisible(true);
                break;
            case "nurses": 
                nurses.setVisible(true);
                break;
            case "peopleVaccined": 
                peopleVaccined.setVisible(true);
                break;
            case "nurseHome": 
                nurseHome.setVisible(true);
                break;
            case "clinics": 
                clinics.setVisible(true);
                break;
            case "managers": 
                managers.setVisible(true);
                break;
            case "secretaryHome": 
                secretaryHome.setVisible(true);
                break;
            case "vaccines": 
                vaccines.setVisible(true);
                break;
            default:
                System.out.println("Invalid view");
        }
    }
}
