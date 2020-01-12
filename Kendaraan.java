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
public class Kendaraan {

    /**
     * @param args the command line arguments
     */

        int jumlahRoda =0;
        String namaKendaraan ="";
        
        public Kendaraan(String nama, int roda){
            this.jumlahRoda =roda;
            this.namaKendaraan = nama;
        }
        public void info(){
            System.out.println("Nama Kendaraan : "+this.namaKendaraan+",roda:"+this.jumlahRoda);
        }
        // TODO code application logic here
    }
    
