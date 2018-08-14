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
public class praktikum1 {
     public static void main(String[] args){
        String identitas = "Zara Zeva Az zurra / XRPL3 / 40 ";
        System.out.println("identitas" + identitas);
        
         String x = "Operasi";
        System.out.println("isi variabel x : " + x);
        System.out.println("\"" + x + "\" panjang karakter = " + x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
         System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "operasi";
        System.out.println("isi variabel z : " + z);
        System.out.println("isi x sama dengan z (Case Sensitive) : "
                + x.equals(z));
        
        String r = "Operasi";
        System.out.println("isi variabel r : " + r);
        System.out.println("isi x sama dengan r (Case Sensitive) : "
                + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive) : "
                + x.equalsIgnoreCase(r));
}
}