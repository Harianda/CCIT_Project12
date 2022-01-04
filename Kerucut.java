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
public class Kerucut {

    public double volume(double jarijari, double tinggi) {
        double volume;
        volume = (3.14 * jarijari * jarijari * tinggi) / 3;
        return volume;
    }

    public double luasPermukaan(double jarijari, double tinggi, double miring) {
        double luasPermukaan;
        luasPermukaan = (3.14 * jarijari * miring) + (3.14 * jarijari * jarijari);
        return luasPermukaan;
    }
}
