package pboif2.pkg10116416.latihan61.bangunruang;
/**
 * @author
 * Nama  : Riyan Bahar
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : 
 * Program untuk menampilkan hasil volume dari 3 bangun ruang.
 */

// import class
import BangunRuang.Bola;
import BangunRuang.Tabung;
import BangunRuang.Kerucut;

public class PBOIF210116416Latihan61BangunRuang {
    public static void main(String[] args) {
        // Bola
        Bola b1 = new Bola(7);
        b1.tampilHasil();
        
        // Tabung
        Tabung tb1 = new Tabung(10,21);
        tb1.tampilHasil();
        
        // Kerucut
        Kerucut kr1 = new Kerucut(14,9);
        kr1.tampilHasil();
    }   
}
