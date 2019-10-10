/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBOIF210118062Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Program Mengganti Kata======");
        System.out.println("");
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata    : ");
        String kata1 = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata2 = scanner.nextLine();
        
        String klmt = kalimat.replace(kata1, kata2) ;
        
        System.out.println("");
        
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + klmt);
      
        
    }
    
}
