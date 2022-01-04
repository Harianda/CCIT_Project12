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
public class Tabung {

    public double volume(double jarijari, double tinggi) {
        double volume;
        volume = 3.14 * jarijari * jarijari * tinggi;
        return volume;
    }

    public double luasPermukaan(double jarijari, double tinggi) {
        double luasPermukaan;
        luasPermukaan = (2 * 3.14 * jarijari * tinggi) + (2 * 3.14 * jarijari * jarijari);
        return luasPermukaan;
    }
}
