/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author user
 */
public class Mainn {
    public Mainn(){
        Kendaraan becak =new Kendaraan("Becak",3);
        becak.info();
    }
    public static void main(String[]args){
        new Mainn();
    }
    
}
