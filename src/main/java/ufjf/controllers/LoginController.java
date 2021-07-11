/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.controllers;

import ufjf.aplicacao.App;

/**
 *
 * @author anton
 */
public class LoginController {

    public void login() {
        App.router.navigate("nurseHome");
    }
    
    public void logout(){
        App.router.navigate("login");
    }

}
