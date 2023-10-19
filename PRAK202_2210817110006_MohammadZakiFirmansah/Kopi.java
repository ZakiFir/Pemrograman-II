package PRAK202_2210817110006_MohammadZakiFirmansah;

import java.text.DecimalFormat;

public class Kopi {
    String namaKopi;
    String ukuran;
    int harga;
    String pembeli;

    DecimalFormat dfharga = new DecimalFormat("#.0");
    DecimalFormat dfpajak = new DecimalFormat("#.0");

    void info(){
        System.out.println("Nama Kopi: "+ this.namaKopi);
        System.out.println("Ukuran: "+ this.ukuran);
        System.out.println("Harga: Rp. "+ dfharga.format(this.harga));
    }
    void setPembeli(String pembeli){
        this.pembeli = pembeli;
    }
    String getPembeli(){
        return this.pembeli;
    }
    String getPajak(){
        int pajak = harga * 11 / 100;
        return dfpajak.format(pajak);
    }
}