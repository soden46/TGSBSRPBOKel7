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
    Scanner input=new Scanner(System.in);    
    Scanner milih=new Scanner(System.in);
    pel = new Pelanggan();
    kar = new Karyawan();
        System.out.println("Pilih Menu");
        System.out.println("1. Masukan Data Pelanggan");
        System.out.println("2. Kelur Dari Program");
        System.out.println("");
        System.out.println("Masukkan Pilihan Menu = ");
        int Pilihan=milih.nextInt();
      do{
          if(Pilihan==1){
        System.out.println("====Masukkan Data Pelanggan====");
        System.out.println("");
        System.out.println("Masukkan Id Peanggan");
        pel.setIdPel(input.nextInt());
        System.out.println("Masukkan Nama Pelanggan");
        pel.setNama(input.next());
        System.out.println("Masukkan Alamat Pelanggan");
        pel.setAlamat(input.next());
        System.out.println("Masukkan Angka 1");
        kar.SetTotalBayar(input.nextInt());
            System.out.println("Terima kasih selamat tinggal :( ");
            System.exit(0);
        }
    }while(Pilihan!=2);
            kar.tampildata();   
    }    
}   
        

