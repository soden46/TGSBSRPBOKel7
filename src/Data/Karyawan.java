/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.Scanner;
/**
 *
 * @author SYARIF
 */
public class Karyawan extends Pelanggan{
    private Double kWh, Harga;
    private Integer pilih;
    public int Pilihan;
    
    Scanner input4=new Scanner(System.in);
    public void setkWh(Double kWh) {
        if(85.25 != kWh){
            this.kWh=kWh;
        }else if(90.12 != kWh){
            this.kWh=kWh;
    }else{
            System.out.println("Pilihan Tidak Ada");
             }
        }
    
    public Double getHarga(){
        return kWh;
    }
    

    @Override
    public void tampildata() {
        System.out.println("Memeriksa Data");
        System.out.println("Id Pelanggan = " +super.getIdPel() + "Nama Pelanggan"
                            + super.getNama()+"Alamat" +super.getAlamat()
                            + "Tagihan" + this.TotalBayar());
    }
    
    public void SetTotalBayar(int Pilihan){
        if(Pilihan==1){
            System.out.println("Masukkan kWh Meter = ");
            kWh=input4.nextDouble();
        if(kWh.equals(85.25)){
            System.out.println("Total Bayar = Rp 30.123");
            System.exit(0);
    }
        else if(kWh.equals(90.12)){
            System.out.println("Total Bayar = Rp 90.123");
            System.exit(0);
    }else{
            System.out.println("Pilihan Tidak Ada");
            System.exit(0);
             }
        }
        this.Harga=Harga;
        this.Pilihan=Pilihan;
    }
    
    public Double TotalBayar(){
        return this.Harga;
    }
    
}
