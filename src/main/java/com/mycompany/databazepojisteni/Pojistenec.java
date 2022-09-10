/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.databazepojisteni;

/**
 *
 * @author Marek Vu
 */
    public class Pojistenec {
    public String jmeno;
    public String prijmeni;
    public int vek;
    public Long telefon;
    
    public Pojistenec(String jmeno,String prijmeni, int vek, Long telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }
   
    @Override
    public String toString(){
        return new String("Pojistenec: " + jmeno + " | " + prijmeni + " | " + vek + " | " + telefon);
    }
    
}
