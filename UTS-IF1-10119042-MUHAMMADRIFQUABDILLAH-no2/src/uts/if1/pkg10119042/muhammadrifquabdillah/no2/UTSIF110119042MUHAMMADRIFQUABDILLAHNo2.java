/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119042.muhammadrifquabdillah.no2;
import java.util.Scanner;

/**
 *
 * @author Muhammad Rifqu Abdillah
 * IF-1
 * 10119042
 */
public class UTSIF110119042MUHAMMADRIFQUABDILLAHNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("======Program Penarikan Uang======");
        System.out.println("Masukan Saldo Awal: ");
        int saldo = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Jumlah Uang yang Diambil: ");
        int jumlah = scanner.nextInt();
        
        System.out.println("Saldo Anda Sekarang: " + tabungan.ambilUang(jumlah));
        
    }
    
}
