/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.databazepojisteni;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Marek Vu
 */
public class Databaze {
   public ArrayList<Pojistenec> databaze;
   
   public Databaze(){
       databaze = new ArrayList<Pojistenec>();
       System.out.println("vytvareni prazdne databaze");
   }
   
   public void add(String jmeno, String prijmeni, int vek, Long telefon){
       System.out.println("vytvareni noveho pojistence");
       databaze.add(new Pojistenec(jmeno, prijmeni, vek, telefon));
   }
   
   public void listUsers(){
       if (databaze.isEmpty()){
           System.out.println("Databaze je prazdna");
           return;
       }
       
       Iterator<Pojistenec> iterator = databaze.iterator();
       
       while (iterator.hasNext()){
           Pojistenec pojistenec = iterator.next();
           System.out.println(pojistenec.toString());
       }
   }
   
   public void findUser(String jmeno, String prijmeni){
       Iterator<Pojistenec> iterator = databaze.iterator();
       
       while (iterator.hasNext()){
           Pojistenec pojistenec = iterator.next();
           
           if (jmeno.equals(pojistenec.jmeno) && prijmeni.equals(pojistenec.prijmeni)){
               System.out.println(pojistenec.toString());
               return;
           }
       }
       
       System.out.println("Uzivatel neexistuje");
   }
}
