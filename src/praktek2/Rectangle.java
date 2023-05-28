/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek2;

/**
 *
 * @author ASUS
 */
public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
        panjang=5;
        lebar=2;        
    }

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    
    void cetakInfo (){
        System.out.println("========================");
        System.out.println("Panjang     : "+panjang);
        System.out.println("Lebar       : "+lebar);
        System.out.println("========================");
    }
    
    double hitungLuas() {
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    void cetakLuas(){
        System.out.println("Luasnya adalah  : "+hitungLuas());
    }
}
