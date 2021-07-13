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
public class Person {

    private String name;
    private String cpf;
    private String birthday;
    private User user;
    private String neighborhood;
    private String street;
    private City city;
    private int number;

    public Person(String name, String cpf, String birthday, User user, String neighborhood, String street, City city, int number) {
        this.name = name;
        this.cpf = cpf;
        this.birthday = birthday;
        this.user = user;
        this.neighborhood = neighborhood;
        this.street = street;
        this.city = city;
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
