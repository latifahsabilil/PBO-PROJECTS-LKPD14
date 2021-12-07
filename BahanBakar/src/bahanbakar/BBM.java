/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahanbakar;

/**
 *
 * @author Lenovo
 */
public abstract class BBM {
    public abstract double hitungbahanBakar();
    public abstract double hitungwaktu();
    
    public void tampilHasil(){
        System.out.println("Bahan Bakar yang dibutuhkan sebanyak : " + this.hitungbahanBakar() + " liter");
        System.out.println("Lama waktu yang dibutuhkan adalah selama " + this.hitungwaktu() + " jam");
    }
}
