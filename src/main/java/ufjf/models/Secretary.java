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
public class Secretary extends Person {
    public Date contractDate;

    public Secretary(Date contractDate, String name, String cpf, String birthday, User user, String neighborhood, String street, City city, int number) {
        super(name, cpf, birthday, user, neighborhood, street, city, number);
        this.contractDate = contractDate;
    }
}
