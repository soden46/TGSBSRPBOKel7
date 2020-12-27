package tugasbesar;
import Data.Tagihan;
import Data.Karyawan;
import Data.Pelanggan;
import java.util.Scanner;

public class Main {
    static Tagihan tagih,hehe;
    static Karyawan kar,karya;
    static Pelanggan pel;
    public int pil;

    public static void main(String[] args) {
        
        
    Scanner input=new Scanner(System.in);    
    Scanner milih=new Scanner(System.in);
    Tagihan tagih =new Tagihan();
    Karyawan kar = new Karyawan();
        System.out.println("Pilih Menu");
        System.out.println("1. Masukan Data Pelanggan");
        System.out.println("2. Kelur Dari Program");
        System.out.println("");
        System.out.println("Masukkan Pilihan Menu = ");
        int Pilihan=milih.nextInt();
      do{
          if(Pilihan==1){
        System.out.println("");
        tagih.SetTotalBayar(Pilihan);
        kar.tampil();
        kar.tampilData();
        
        }else{System.out.println("Anda Sudah Keluar Dari Program");
        System.exit(0);
          }
    }while(Pilihan!=2);
    }   
}   
