/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deaa;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC 27 - LAB R1
 */
public class Deaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Halo Dunia");
//        System.out.println("Halo"+"Dunia");
//        System.out.println(2+" "+5);
//        System.out.println(2+5);
//        System.out.println("Angka "+" "+5);
//        System.out.println("2 + 5"+" = "+2+5);
//        System.out.println("2 + 5"+" = "+(2+5));
//        System.out.println("Halo" + "Inces");
//
//String namaDepan = "";
//String namaBelakang = "";
//Scanner input = new Scanner(System.in);
//System.out.println("Nama Depan : ");
////membaca inputan user
//namaDepan = input.next();
//System.out.println("Nama Belakang : ");
////membaca inputan user
//namaBelakang = input.next();
//System.out.println("Nama Saya adalah :");
//System.out.println(namaDepan + " " + namaBelakang);
String nama = JOptionPane.showInputDialog("Masukan Nama:");
System.out.println("Nama : "+nama);
    }
    
}
