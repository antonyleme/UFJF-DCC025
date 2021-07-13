/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.aplicacao;

import java.util.ArrayList;
import ufjf.models.Clinic;

/**
 *
 * @author Antony Leme Novais Ferreira - 202065009A
 */
public class App {
    
    public static Router router = new Router();
    public static ArrayList<Clinic> clinics = new ArrayList<>();
    
    public static void main(String[] args){
        router.navigate("login");
    }
}
