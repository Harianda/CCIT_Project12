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
public class Bola {

    public double volume(double jarijari) {
        double volume;
        volume = (3.14 * Math.pow(jarijari, 3) * 4) / 3;
        return volume;
    }

    public double luasPermukaan(double jarijari) {
        double luasPermukaan;
        luasPermukaan = 4 * 22 / 7 * jarijari * jarijari;
        return luasPermukaan;
    }
}
