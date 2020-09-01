package com.lseg.teme.Homework3;

import com.lseg.teme.Homework2.Tema2;

public class Tema3 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        exsuplimentar();
    }

    public static void ex1() {
        System.out.println("The converted value of 10 miles/h is " + convertToKilometersPerHour(10) + " km/h");
    }

    public static double convertToKilometersPerHour(double milesPerHour) {
        double kmInAMile = 1.609344;

        return kmInAMile * milesPerHour;
    }

    public static void ex2() {
        System.out.println("shouldWakeUp(true, 26)=" + shouldWakeUp(true, 26));
        System.out.println("shouldWakeUp(true, 23)=" + shouldWakeUp(true, 23));
        System.out.println("shouldWakeUp(false, 23)=" + shouldWakeUp(false, 23));
    }

    public static boolean shouldWakeUp(boolean barking, int hour) {
        if (hour > 24 || hour < 0) {
            System.out.println("Formatul orei este gresit");
            return false;
        }

        if (hour < 8 || hour > 22) {
            return barking == true;
        } else return false;

    }

    public static void ex3() {
        int year = 1896;
        System.out.println("Anul " + year + " este bisect? " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void ex4() {
        System.out.println("Se joaca pisica? " + isCatPlaying(true, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25) {
            if (summer == true && temperature <= 45) {
                return true;
            } else {
                if (temperature <= 35) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void exsuplimentar() {
        System.out.println("Ai luat bacul?" + aiLuatBacul(6.50, 5.60, 3));
    }

    public static boolean aiLuatBacul(double NotaMate, double NotaRomana, double NotaIstorie) {
        double medie = (NotaIstorie + NotaMate + NotaRomana) / 3;
        if (NotaMate < 5 || NotaRomana < 5 || NotaIstorie < 5) {
            return false;
        } else if (NotaMate >= 5 && NotaRomana >= 5 && NotaIstorie >= 5) {
            if (medie >= 6) {
                return true;
            }
        }
        return false;
    }
}


