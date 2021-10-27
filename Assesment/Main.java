package Assesment;

public class Main {
    public static void main(String[] args){
    //Asuransi dan Dropship
    MarketPlace info1 = new MarketPlace(1, "N0001", "JNE", 21000, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", true, true, 40000);
        
	//Asuransi
	MarketPlace info2 = new MarketPlace(2, "N0003", "J&T", 21000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);
        
	//Normal
	MarketPlace info3 = new MarketPlace(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang","DayeuhKolot");
        
	//Dropship
	MarketPlace info4 = new MarketPlace(4, "N0002", "Si Cepat", 24000, "Dropship2", "Pontianak", "Joko","DayeuhKolot", true);
    }
}