package Data;

import Interface.PLN;
import java.util.Scanner;

public abstract class Pelanggan implements PLN{
    public String Nama;
    public String IdPel;
    public String Alamat;
    public abstract void tampilData();
    
}
