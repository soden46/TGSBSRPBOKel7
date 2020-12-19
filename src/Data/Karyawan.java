/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author SYARIF
 */
public class Karyawan{
    private Double kWh;

    public void setHarga(Double kWh) {
        if(kWh == 85.25 ){
            System.out.println("Harga = 30.123 ");
            this.kWh=kWh;
        }else if(kWh == 90.12){
            System.out.println("Harga = Rp 70.123");
            this.kWh=kWh;
        }else{
            System.out.println("Error Harga Harus Lebih Dari Rp.30.123");
        }
    }
    
    public Double getHarga(){
        return kWh;
    }
    
    public Double TotalBayar(){
        Double TotalBayar=kWh;
        return TotalBayar;
    }

    public void tampildata() {
        System.out.println("Memeriksa Tagihan");
    }
    
}
