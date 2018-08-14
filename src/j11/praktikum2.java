/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11;
import java.util.Scanner;
/**
 *
 * @author ZEVA
 */
public class praktikum2 {
      private static void tampiljudul(String identitas){
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal ke Angka)\n");
        
    }
    
    public static void main(String[] args) {
        String identitas = "Zara Zeva Az Zurra / X RPL 3 / 40";
        tampiljudul(identitas);
        String kalimat = tampilInput();
        String convert = vocal2Angka(kalimat);
        tampilPerKata(kalimat, convert);
        tampilHasil(convert);
    }
}
