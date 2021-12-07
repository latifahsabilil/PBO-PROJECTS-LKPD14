/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahanbakar;

/**
 *
 * @author Lenovo
 */
public class SUV extends BBM{
    public double jarak, kecepatan;
    
    public double hitungbahanBakar(){
        double bbm = this.jarak / 12;
        return bbm;
    }
    
    public double hitungwaktu(){
        double waktu = this.jarak / this.kecepatan;
        return waktu;
    }
}
