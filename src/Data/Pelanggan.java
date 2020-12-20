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
public class Pelanggan{
  
    Integer IdPel;
    protected String Nama;
    protected String Alamat;
    Double Harga;

//    public Pelanggan() {
//    }

    public Integer getIdPel(){
        return IdPel;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }

    public void setIdPel(Integer IdPel){
        this.IdPel=IdPel;
    }
    public void setNama(String Nama){
        this.Nama=Nama;
    }
    public void setAlamat(String Alamat){
        this.Alamat=Alamat;
    }
    
    public void tampildata(){
        System.out.println("Memeriksa Tagihan");
        

    }



}
