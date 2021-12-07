/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBangun;

import bangundatar.*;
import bangunruang.*;

/**
 *
 * @author Lenovo
 */
public class MainClass {
        public static void main(String[] args) {
        // TODO code application logic here
        Persegi p1 = new Persegi();
        p1.sisi = 20;
        p1.hitungLuas();
        p1.hitungKeliling();        
        p1.tampilHasil();
        
        Lingkaran L1 = new Lingkaran();
        L1.jejari = 7;
        L1.hitungLuas();
        L1.hitungKeliling();        
        L1.tampilHasil();
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 10;
        pp1.lebar = 8;
        pp1.hitungLuas();
        pp1.hitungKeliling();
        pp1.tampilHasil();
        
        Tabung t1 = new Tabung();
        t1.jejari = 7;
        t1.tinggi = 10;
        t1.hitungVolume();
        t1.hitungLuas();
        t1.tampilHasil();
        
        Balok b1 = new Balok();
        b1.panjang = 7;
        b1.tinggi = 10;
        b1.lebar = 12;
        b1.hitungVolume();
        b1.hitungLuas();
        b1.tampilHasil();
        
        Bola bola = new Bola();
        bola.jejari = 7;
        bola.hitungVolume();
        bola.hitungLuas();
        bola.tampilHasil();
    }   
}
