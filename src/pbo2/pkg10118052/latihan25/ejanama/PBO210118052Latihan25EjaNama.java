/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan25.ejanama;

import java.util.Scanner;
/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk Mengeja nama 
 * 
 * 
 */
public class PBO210118052Latihan25EjaNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Variabel objek dari class scanner
        String nama;
        int no = 1;
        System.out.print("Masukan nama depan anda untuk di eja : ");
        nama = input.next();
        
        System.out.println();
        
        System.out.println("Ejaan untuk \"" + nama + "\" adalah : ");
        for(int i = 0; i <= nama.length()-1; i++) {
            System.out.println("Huruf ke-" + no + " : " + nama.charAt(i));
            no++;
        }
    }
    
}