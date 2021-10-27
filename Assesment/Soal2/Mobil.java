package Assesment.Soal2;

import java.util.ArrayList;

public class Mobil {
    String merk;
    String tahunKeluaran;
    double harga;
    int stok;


    Mobil(String merk, String tahunKeluaran, double harga, int stok){
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    //method get
    String getMerk(){
        return merk;

    }

    String getTahunKeluaran(){
        return tahunKeluaran;

    }

    double getHarga() {
        return harga;

    }

    int getStok() {
        return stok;

    }
    
    //method set
    void setStok(int stok) {
        this.stok = stok;

    }

    void setHarga(double harga) {
        this.harga = harga;

    }
    
    void display(){

        System.out.println("Merk \t\t\t: " + getMerk());
        System.out.println("Harga \t\t\t: " + getHarga());
        System.out.println("Tahun Keluaran \t: " + getTahunKeluaran());
        System.out.println("Sisa Stok \t\t: " + getStok() + "\n");
    }
}
