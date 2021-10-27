package Assesment;

public class MarketPlace {

    private int noTransaksi;
    private String namaPengirim;
    private String alamatPengirim;
    private String namaPenerima;
    private String alamatPenerima;
    private double Ongkir;
    private String namaEkspedisi;
    private String noResi;
    private boolean statusAsuransi;
    private boolean statusDropshiper;
    private double nominalAsuransi;

    //Asuransi dan Dropship
    MarketPlace(int noTransaksi, String noResi, String namaEkspedisi, double Ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima, boolean statusDropshiper, boolean statusAsuransi, int nominalAsuransi){
        
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.Ongkir = Ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.statusDropshiper = statusDropshiper;
        this.statusAsuransi = statusAsuransi;
        this.nominalAsuransi = nominalAsuransi;
        print(this.statusAsuransi, this.statusDropshiper);
    }

    //Asuransi
    MarketPlace(int noTransaksi, String noResi, String namaEkspedisi, double Ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima, boolean statusAsuransi, int nominalAsuransi){
        
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        if(Ongkir>20000){
            Ongkir = Ongkir - 5000;
        }

        this.Ongkir = Ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.statusAsuransi = statusAsuransi;
        this.nominalAsuransi = nominalAsuransi;
        print(this.statusAsuransi, this.statusDropshiper);
    }

    //Normal
    MarketPlace(int noTransaksi, String noResi, String namaEkspedisi, double Ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima){
        
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.Ongkir = Ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        print(this.statusAsuransi, this.statusDropshiper);
    }

    //Dropship
    MarketPlace(int noTransaksi, String noResi, String namaEkspedisi, double Ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima, boolean statusDropshiper){
        
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.Ongkir = Ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.statusDropshiper = statusDropshiper;
        print(this.statusAsuransi, this.statusDropshiper);
    }

    //method
    public void print(boolean statusAsuransi, boolean statusDropshiper){
       
        if (statusAsuransi==true && statusDropshiper==true){
            System.out.println("\nAsuransi dan Dropship");
            System.out.println("\nNo Transaksi :"+this.noTransaksi+"\nNo Resi : "+this.noResi+"\nNama Ekspedisi : "+this.namaEkspedisi+"\nOngkos Kirim : "+this.Ongkir+"\nNama Pengirim : "+this.namaPengirim+"\nAlamat Pengirim : "+this.alamatPengirim+"\nNama Penerima : "+this.namaPenerima+"\nAlamat Penerima : "+this.alamatPenerima+"\nNominal Asuransi : "+this.nominalAsuransi);
        
        }else if (statusAsuransi==true){
            System.out.println("\nAsuransi");
            System.out.println("\nNo Transaksi : "+this.noTransaksi+"\nNo Resi : "+this.noResi+"\nNama Ekspedisi : "+this.namaEkspedisi+"\nOngkos Kirim : "+this.Ongkir+"\nNama Pengirim : "+this.namaPengirim+"\nAlamat Pengirim : "+this.alamatPengirim+"\nNama Penerima : "+this.namaPenerima+"\nAlamat Penerima : "+this.alamatPenerima+"\nNominal Asuransi : "+this.nominalAsuransi);
        
        }else if (statusDropshiper==true){
            System.out.println("\nDropship");
            System.out.println("\nNo Transaksi : "+this.noTransaksi+"\nNo Resi : "+this.noResi+"\nNama Ekspedisi : "+this.namaEkspedisi+"\nOngkos Kirim : "+this.Ongkir+"\nNama Pengirim : "+this.namaPengirim+"\nAlamat Pengirim : "+this.alamatPengirim+"\nNama Penerima : "+this.namaPenerima+"\nAlamat Penerima : "+this.alamatPenerima);
        
        }else {
            System.out.println("\nNormal");
            System.out.println("\nNo Transaksi : "+this.noTransaksi+"\nNo Resi : "+this.noResi+"\nNama Ekspedisi : "+this.namaEkspedisi+"\nOngkos Kirim : "+this.Ongkir+"\nNama Pengirim : "+this.namaPengirim+"\nAlamat Pengirim : "+this.alamatPengirim+"\nNama Penerima : "+this.namaPenerima+"\nAlamat Penerima : "+this.alamatPenerima);
        
        }
    }
}
