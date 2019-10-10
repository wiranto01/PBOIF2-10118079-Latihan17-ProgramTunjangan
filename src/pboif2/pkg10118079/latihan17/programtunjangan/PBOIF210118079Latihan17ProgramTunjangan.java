/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118079.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBOIF210118079Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("    =============Program Tunjangan=============   ");
        System.out.print ("Berapa Gaji Pokok Anda Perbulan? :Rp.");
        
        Scanner scanner = new Scanner (System.in);
        
        int gaji= scanner.nextInt();
        System.out.println("Status Anda? (Menikah/Belom)   :  ");
        String Status = scanner.next();
        
        double tunjangan = 0.0;
        
        if(Status.equalsIgnoreCase("Menikah")){
            tunjangan = (double) (0.35*gaji);
            
      } else {tunjangan=0;}
        
        System.out.println("======== Hasil Perhitungan Gaji Anda ========");
        System.out.println("Gaji Pokok         : Rp." + gaji);
        System.out.println("Tunjangan          : Rp." + tunjangan);
        System.out.println("Total Gaji         : Rp." +(gaji+tunjangan));
    } 
        
    
    
}
