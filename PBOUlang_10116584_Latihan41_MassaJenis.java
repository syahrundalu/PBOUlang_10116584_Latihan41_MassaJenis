/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan41_massajenis;

import java.util.Scanner;

/**
 *
 * @author syhar
 */
public class PBOUlang_10116584_Latihan41_MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Kubus kubus = new Kubus();
        
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.print("Sisi = ");
        kubus.sisi = scan.nextInt();
        System.out.print("Massa = ");
        kubus.massa = scan.nextInt();
        System.out.println("");
        
        kubus.hasilPerhitungan();
       
        
    
    
}
}