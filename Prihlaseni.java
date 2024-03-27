/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.doupedraka;

import java.util.Scanner;

/**
 *
 * @author Cid Corso
 */
public class Prihlaseni {
    
    public Prihlaseni() {
    }

    public String prihlas() {
        
        Scanner scaner = new Scanner(System.in, "Windows-1250");
        
        System.out.println("Vítám tě u hry Doupě Draka.\n");
        System.out.println("Nejprve se, prosím, přihlaš nebo si vytvoř účet.\n");
        
        System.out.println("Číslem vyber akci kterou chceš provést a stisknutím enter potvrd´.\n");
        System.out.println("1 - Přihlásit k existujícímu účtu.");
        System.out.println("2 - Vytvorit nový účet.");
        
        int volba = 0;
        
        volba = Integer.parseInt(scaner.nextLine().trim());
        
        switch(volba) {
            case 1:
                
                System.out.println("\nZadejte jméno účtu.");
                String jmenoUctu = scaner.nextLine();
                
                System.out.println("Zadej heslo.");
                int hesloUctu = Integer.parseInt(scaner.nextLine());
                
                // zde bude kód na zavolání porovnání napsaných přihlašovacích údajů s údaji v databázi
                
                System.out.println("\nVítám vás ve vašem účtu.");
                
                break;
                
            case 2:
                
                System.out.println("\nPro vytvoření účtu zadej nejprve název účtu.");
                String nazevUctu = scaner.nextLine();
                
                System.out.println("Zadejte platný mail pro odeslání potvrzení.");
                String mail = scaner.nextLine();
                
                System.out.println("Zadejte heslo.");
                String heslo = scaner.nextLine();
                
                // zde bude kód na vytvoření účtu v databázi ( možná i s tím že to rovnou uživatele přihlásí )
                
                System.out.println("\nVytvoření účtu proběhlo úspěšně.");
                
                break;
                
            default:
                System.out.println("\nNeplatná volba. Zadej znovu.");
            
            
        }
        return null;
        
        
    
    }


}
