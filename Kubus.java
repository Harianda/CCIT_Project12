package controller;

/**
 *
 * @author Harianda
 */
public class Kubus {

    public double volume(double sisi) {
        double volume;
        volume = sisi * sisi * sisi;
        return volume;
    }

    public double luasPermukaan(double sisi) {
        double luasPermukaan;
        luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
}
