/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Lenovo
 */
public class Lingkaran extends BangunDatar{
    // atribut jari-jari
    public double jejari;
    
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = 2 * this.jejari * this.jejari * 22 / 7;
        return luas;
    }
    
    // method untuk hitung keliling lingkaran
    public double hitungKeliling(){
        double keliling = 2 * this.jejari * 22 / 7;
        return keliling;
    }
}
