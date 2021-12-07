/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class Tabung extends BangunRuang{
    public double jejari, tinggi;
    
    public double hitungVolume(){
        double volume = this.jejari * this.jejari * this.tinggi * 22 / 7;
        return volume;
    }
    
    public double hitungLuas(){
        double luas = (2 * this.jejari * this.tinggi * 22 / 7) + (2 * this.jejari * this.jejari * 22 / 7);
        return luas;
    }
}

