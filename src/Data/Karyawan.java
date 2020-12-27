package Data;
import java.util.Scanner;

public class Karyawan extends Pelanggan{
    public int IdPel,p,Pilihan;
    protected String Nama;
    protected String Alamat;
    private Double Harga;
    Scanner mas = new Scanner(System.in);
    public Karyawan() {
    }
        public Karyawan(int IdPel, int p, int Pilihan, String Nama, String Alamat, Double Harga) {
        this.IdPel = IdPel;
        this.p = p;
        this.Pilihan = Pilihan;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Harga = Harga;
    }

   

    public Integer getIdPel(){
        return IdPel;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    

    public void setIdPel(int IdPel) {  
            this.IdPel=IdPel;
    }

    public void setNama(String Nama) {
        
        this.Nama=Nama;
    }

    public void setAlamat(String Alamat) {
       this.Alamat=Alamat;
    }
    public void main(){
        System.out.println(" Masukan ID Pelanggan");
        IdPel = mas.nextInt();
        System.out.println(" Masukan Nama Pelanggan");
        Nama = mas.next();
        System.out.println(" Masukan Alamat Pelanggan");
        this.Alamat = mas.next();
        System.out.println("");
        System.out.println("Data Pelanggan");
        System.out.println("ID Pelanggan Adalah "+this.IdPel);
        System.out.println("Nama Pelanggan Adalah "+this.Nama);
        System.out.println("Alamat Pelanggan Adalah "+this.Alamat);
        
    }

    @Override
    public void tampil() {
    System.out.println("ID Pelanggan Adalah "+this.IdPel);
    System.out.println("Nama Pelanggan Adalah "+this.Nama);
    System.out.println("Alamat Pelanggan Adalah "+this.Alamat);
    }

    @Override
    public void tampilData() {

        System.out.println("Total kWh Adalah " +this.IdPel);
    }
 }
