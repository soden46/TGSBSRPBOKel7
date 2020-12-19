/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;
import Data.Karyawan;
import Data.Pelanggan;
import java.util.Scanner;

/**
 *
 * @author SYARIF
 */
public class PLN {
static Karyawan kar;
static Pelanggan pel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        pel = new Pelanggan();
        System.out.println("Isikan Data Pelanggan");
        System.out.println("Masukkan Nama Pelanggan = " );
        pel.setNama(input.next());
        System.out.println("Masukkan ID Pelanggan = " );
        pel.setIdPel(input.nextInt());
        System.out.println("Masukkan Alamat Pelanggan = " );
        pel.setAlamat(input.next());
        System.out.println("Masukkan kWh Meter = " );
        pel.setHarga(input.nextDouble());
        
        pel.tampildata();
        
        

    }
}

