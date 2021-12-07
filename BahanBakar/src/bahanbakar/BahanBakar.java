/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bahanbakar;

/**
 *
 * @author Lenovo
 */
public class BahanBakar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // MOBIL SEDAN
        Sedan sedan1 = new Sedan();
        sedan1.jarak = 107;
        sedan1.kecepatan = 60;
        sedan1.hitungbahanBakar();
        sedan1.hitungwaktu();
        System.out.println("-- Mobil A --");
        sedan1.tampilHasil();
        System.out.println("");
        
        Sedan sedan2 = new Sedan();
        sedan2.jarak = 538;
        sedan2.kecepatan = 65;
        sedan2.hitungbahanBakar();
        sedan2.hitungwaktu();
        System.out.println("-- Mobil B --");
        sedan2.tampilHasil();
        System.out.println("");
        
        //MOBIL SUV
        SUV suv1 = new SUV();
        suv1.jarak = 662;
        suv1.kecepatan = 57;
        suv1.hitungbahanBakar();
        suv1.hitungwaktu();
        System.out.println("-- Mobil C --");
        suv1.tampilHasil();
        System.out.println("");
        
        SUV suv2 = new SUV();
        suv2.jarak = 471;
        suv2.kecepatan = 62;
        suv2.hitungbahanBakar();
        suv2.hitungwaktu();
        System.out.println("-- Mobil D --");
        suv2.tampilHasil();
        System.out.println("");
        
        // MOBIL MPV
        MPV mpv1 = new MPV();
        mpv1.jarak = 541;
        mpv1.kecepatan = 64;
        mpv1.hitungbahanBakar();
        mpv1.hitungwaktu();
        System.out.println("-- Mobil E --");
        mpv1.tampilHasil();
        System.out.println("");
        
        MPV mpv2 = new MPV();
        mpv2.jarak = 433;
        mpv2.kecepatan = 53;
        mpv2.hitungbahanBakar();
        mpv2.hitungwaktu();
        System.out.println("-- Mobil F --");
        mpv2.tampilHasil();
        System.out.println("");
        
   
    }
}
