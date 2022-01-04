/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Harianda
 */
public class Balok {
        
    public double volume(double panjang, double tinggi, double lebar) {
        double volume;
        volume = panjang * tinggi * lebar;
        return volume;
    }

    public double luasPermukaan(double panjang, double tinggi, double lebar) {
        double luasPermukaan;
        luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luasPermukaan;
    }
}
