package Data;
import Data.Karyawan;
import Interface.PLN;
import java.util.Scanner;

public class Tagihan extends Pelanggan implements PLN{
    static Karyawan kar;
    protected Double kWh, Harga;
    private Integer pilih;
    public int Pilihan;
    
    Karyawan Karya = new Karyawan();
    Scanner input4=new Scanner(System.in);

    public Tagihan(Double kWh, Double Harga, Integer pilih, int Pilihan) {
        this.kWh = kWh;
        this.Harga = Harga;
        this.pilih = pilih;
        this.Pilihan = Pilihan;
    }
    
    public Tagihan(){
        
    }
    
    
    public Double getHarga(){
        return kWh;
    }
    
    public Double TotalBayar(){
        return this.Harga;
    }
    
    public void setkWh() {
       if(85.25 != kWh){
            this.kWh=kWh;
        }else if(90.12 != kWh){
            this.kWh=kWh;
    }else{
            System.out.println("Pilihan Tidak Ada");
             }
    }

    public void SetTotalBayar(int Pilihan) {
       if(Pilihan==1){
            System.out.println("Masukkan kWh Meter = ");
            kWh=input4.nextDouble();
        if(kWh.equals(85.25)){
            System.out.println("");
            System.out.println("Data Pembayaran");
            Karya.main();
            System.out.println("Total kWh Adalah " +this.kWh);
            System.out.println("Total Bayar Adalah= Rp 30.123");
            System.exit(0);
    }
        else if(kWh.equals(90.12)){
            System.out.println("");
            System.out.println("Data Pembayaran");
           Karya.main();
            System.out.println("Total kWh Adalah " +this.kWh);
            System.out.println("Total Bayar Adalah = Rp 90.123");
            System.exit(0);
    }else{
            System.out.println("Pilihan Tidak Ada");
            System.exit(0);
             }
        }
        this.Harga=Harga;
        this.Pilihan=Pilihan; }

    @Override
    public void tampilData() {
        System.out.println("Total kWh Adalah " +this.kWh);
        System.out.println("Total kWh Adalah " +super.IdPel);
        
    }

    @Override
    public void tampil() {
    System.out.println("ID Pelanggan Adalah "+this.IdPel);
    System.out.println("Nama Pelanggan Adalah "+this.Nama);
    System.out.println("Alamat Pelanggan Adalah "+this.Alamat);

}
