/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.databazepojisteni;

import java.util.Scanner;

/**
 *
 * @author Marek Vu
 */
public class Databazepojisteni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Databaze databaze = new Databaze();
        
        int volba = 0;

        while (volba != 4) {
            System.out.println("1 - Pridat noveho pojisteneho");
            System.out.println("2 - vypsat vsechny pojistene");
            System.out.println("3 - vyhledat pojisteneho");
            System.out.println("4 - konec");
            
            volba = Integer.parseInt(sc.nextLine());
            
            switch (volba) {

                case 1: {

                    System.out.println("Zadejte jmeno pojisteneho");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadejte prijmeni pojisteneho");
                    String prijmeni = sc.nextLine();
                    System.out.println("Zadejte telefon pojisteneho");
                    Long telefon = Long.parseLong(sc.nextLine());
                    System.out.println("Zadejte vek pojisteneho");
                    int vek = Integer.parseInt(sc.nextLine());

                    databaze.add(jmeno, prijmeni, vek, telefon);

                    break;

                } case 2:
                    databaze.listUsers();
                    break;
                case 3: {
                    System.out.println("Zadejte jmeno pojisteneho");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadejte prijmeni pojisteneho");
                    String prijmeni = sc.nextLine();
                    
                    databaze.findUser(jmeno, prijmeni);
                    
                    break;
                } default:

                    break;
            }

        }

        System.out.println("Konec programu");
        
    }
}
