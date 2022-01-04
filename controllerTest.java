/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harianda
 */
public class controllerTest {

    public controllerTest() {
    }

    @Test
    public void testBalok() {
        System.out.println("TEST BALOK------------------------------");
        Balok balok = new Balok();
float expectVolume = 120;
float expectArea = 148;
int panjang = 4;
int tinggi = 5;
int lebar = 6;

        System.out.print("test volume : ");
        if (true) {
            assertEquals(expectVolume, balok.volume(panjang, tinggi, lebar), 0.0);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }

        System.out.print("test luas permukaan : ");
        if (true) {
            assertEquals(expectArea, balok.luasPermukaan(panjang, tinggi, lebar), 0.0);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }
        System.out.println("\n");
    }

    @Test
    public void testKerucut() {
        System.out.println("TEST KERUCUT--------------------------------");
        Kerucut kerucut = new Kerucut();
        float expectVolume = 154;
        float expectArea = 264;
        int jarijari = 7;
        int tinggi = 3;
        int miring = 5;

        System.out.print("test volume : ");
        if (true) {
            assertEquals(expectVolume, kerucut.volume(jarijari, tinggi), 0.4);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }

        System.out.print("test luas permukaan : ");
        if (true) {
            assertEquals(expectArea, kerucut.luasPermukaan(jarijari, tinggi, miring), 0.4);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }
        System.out.println("\n");
    }

    @Test
    public void testKubus() {
        System.out.println("TEST KUBUS--------------------------------");
        Kubus kubus = new Kubus();
float expectVolume = 1000;
float expectArea = 600;
int sisi = 10;

        System.out.print("test volume : ");
        if (true) {
            assertEquals(expectVolume, kubus.volume(sisi), 0.0);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }
        System.out.print("test luas permukaan : ");
        if (true) {
            assertEquals(expectArea, kubus.luasPermukaan(sisi), 0.0);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }
        System.out.println("\n");
    }

    @Test
    public void testBola() {
        System.out.println("TEST LINGKARAN-----------------------------");
        Bola bola = new Bola();
        float expectVolume = 268;
        float expectArea = 192;
        int jarijari = 4;

        System.out.print("test volume : ");
        if (true) {
            assertEquals(expectVolume, bola.volume(jarijari), 0.4);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }

        System.out.print("test luas permukaan : ");
        if (true) {
            assertEquals(expectArea, bola.luasPermukaan(jarijari), 0.4);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }
        System.out.println("\n");
    }

    @Test
    public void testTabung() {
        System.out.println("TEST TABUNG--------------------------------");
        Tabung tabung = new Tabung();
        float expectVolume = 308;
        float expectArea = 396;
        int jarijari = 7;
        int tinggi = 2;

        System.out.print("test volume : ");
        if (true) {
            assertEquals(expectVolume, tabung.volume(jarijari, tinggi), 0.4);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }

        System.out.print("test luas permukaan : ");
        if (true) {
            assertEquals(expectArea, tabung.luasPermukaan(jarijari, tinggi), 0.4);
            System.out.println("sukses");
        } else {
            System.out.println("gagal");
        }
        System.out.println("\n");

    }
}
