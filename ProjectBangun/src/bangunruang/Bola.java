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
public class Bola extends BangunRuang{
    public double jejari;
    
    public double hitungVolume(){
        double volume = this.jejari * this.jejari * this.jejari * 4 * 22 / 21;
        return volume;
    }
    
    public double hitungLuas(){
        double luas = this.jejari * this.jejari * 4 * 22 / 7;
        return luas;
    }
}
