package Assesment.Soal2;

import java.util.ArrayList;

public class Showroom {

    static ArrayList<Mobil> carMobil = new ArrayList<>();

    public static void main(String[] args) {

        Mobil mobil = new Mobil("Avanza", "2018",  150000000.0, 5);

        tambahMobil(mobil);
        System.out.println("Informasi Mobil");
        lihatStok();

        beliMobil("Avanza","2018",2);

    }

    static void tambahMobil(Mobil mobil){
        carMobil.add(mobil);
    }

    static void beliMobil(String merk, String tahun, int jumlahBeli){

        System.out.println("Merk : " + merk);
        System.out.println("Tahun Keluaran : " + tahun);
        System.out.println("Jumlah : " + jumlahBeli + "\n");

        for (Mobil mobil : carMobil) {
            if(merk.equalsIgnoreCase(mobil.getMerk())
                && tahun.equalsIgnoreCase(mobil.getTahunKeluaran())
                && jumlahBeli < mobil.getStok())
            {
                mobil.setStok(mobil.getStok()-jumlahBeli);
                double diskon = 0.0;
                double hargaDiskon = 0.0;

                System.out.println("Merk : " + mobil.getMerk());
                System.out.println("Harga Satuan : " + mobil.getHarga());
                System.out.println("Tahun Keluaran : " + mobil.getTahunKeluaran());
                System.out.println("Jumlah Beli : " + jumlahBeli);
                System.out.println("Total Harga : " + mobil.getHarga() * jumlahBeli);

                double bayar = mobil.getHarga() * jumlahBeli;

                if (jumlahBeli == 1){
                    diskon = 0.0;
                    hargaDiskon = mobil.getHarga();
                }
                if (jumlahBeli == 2){
                    diskon = 10.0;
                    hargaDiskon = (mobil.getHarga()*jumlahBeli) * 0.1;
                    mobil.setHarga(hargaDiskon);
                }
                if (jumlahBeli > 2){
                    diskon = 20.0;
                    hargaDiskon = (mobil.getHarga()*jumlahBeli) * 0.2;
                    mobil.setHarga(hargaDiskon);
                }

                System.out.println("Diskon : " + diskon + " persen");
                System.out.println("Total Diskon : " + hargaDiskon);
                System.out.println("Total Bayar : " + (bayar - hargaDiskon) + "\n");
            }else {
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi\n");
            }
        }

    }

    static void lihatStok(){
        for ( Mobil mobil : carMobil){
            mobil.display();
        }
    }

}
