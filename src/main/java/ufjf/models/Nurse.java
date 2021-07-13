/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.models;

/**
 *
 * @author Antony Leme Novais Ferreira - 202065009A
 */
public class Nurse extends Person {
    private Clinic clinic;
    private String coren;

    public Nurse(Clinic clinic, String coren, String name, String cpf, String birthday, User user, String neighborhood, String street, City city, int number) {
        super(name, cpf, birthday, user, neighborhood, street, city, number);
        this.clinic = clinic;
        this.coren = coren;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
}
