package lan.zold;


import java.lang.Math;

public class Rombusz {
    public static double szamolKerulet(double aOldal) {
        return 4 * aOldal;
    }

    public static double szamolTerulet(double aOldal, double alfaSzog) {
        double alfaRad = Math.toRadians(alfaSzog);
        return aOldal * aOldal * Math.sin(alfaRad);
    }
}