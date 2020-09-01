package com.lseg.teme.Homework2;

import java.util.Scanner;

public class Tema2 {

    public static void main(String[] args) {
        ex1();

        ex2();

        ex3();

        ex4();

        ex5();

        ex6();

        ex7();

        ex8();

        ex3while();

        ex7while();

        ex1switch();

    }

    public static void ex1() {
        System.out.println("Exercitiul 1");
        int n = 10;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ex2() {
        System.out.println("Exercitiul 2");
        int n = 10;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void ex3() {
        System.out.println("Exercitiul 3");
        int n = 10;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (j == i + 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void ex4() {
        System.out.println("Exercitiul 4");
        int n = 15;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i + j == n - 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void ex5() {
        System.out.println("Exercitiul 5");
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ex6() {
        System.out.println("Exercitiul 6");
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ex7() {
        System.out.println("Exercitiul 7");
        int n = 30;
        int[] SirNumerePrime = new int[n];
        int CateNumerePrimeAmGasit = 0;

        for (int i = 1; i <= n; i++) {

            boolean numarulEPrim = true;

            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    numarulEPrim = false;
                    break;
                }
            }

            if (numarulEPrim == true) {
                SirNumerePrime[CateNumerePrimeAmGasit] = i;
                CateNumerePrimeAmGasit++;
            }


        }
        for (int i = 0; i <= CateNumerePrimeAmGasit - 1; i++) {
            System.out.print(SirNumerePrime[i] + " ");
        }
        System.out.println();
        System.out.println();

    }

    public static void ex8() {
        System.out.println("Exercitiul 8");
        int[] sirulMeu = {76, 3, 56, 23, 11, 25};
        int andreea;

        for (int i = 0; i <= sirulMeu.length - 1; i++) {
            for (int j = 0; j <= sirulMeu.length - 2; j++) {
                if (sirulMeu[i] <= sirulMeu[j]) {
                    andreea = sirulMeu[i];
                    sirulMeu[i] = sirulMeu[j];
                    sirulMeu[j] = andreea;
                }
            }
        }

        for(int i = 0; i <= sirulMeu.length - 1;i++){
            System.out.println(sirulMeu[i]);
        }
    }

    public static void ex3while() {
        System.out.println("Exercitiul 3 - While");
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Introduceti numarul");
            int numarCitit = scanner.nextInt();
            if (numarCitit == 0) {
                System.out.println("Ati introdus 0 --> exit program");
                break;
            }

            sum = sum + numarCitit;
            System.out.println("Suma este " + sum);
        }
    }
    public static void ex7while() {
        System.out.println("Exercitiul 7 - While");
        int pin = 1234;
        int attempt = 0;
        int incercarimaxime = 3;
        Scanner scanner = new Scanner(System.in);
        while (attempt < incercarimaxime) {
            System.out.println("Introduceti PIN-ul");
            int numarCitit = scanner.nextInt();
            if (numarCitit == pin) {
                System.out.println("PIN corect");
                break;
            } else {
                attempt++;
                System.out.println("PIN gresit - mai aveti " + (incercarimaxime - attempt) + " incercari");
            }
        }
    }

    public static void ex1switch() {
        System.out.println("Exercitiul 1 - Switch");
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Introduceti o cifra");
        switch(scanner.nextInt()){
            case 0:
                System.out.println("Ziua este duminica");
                break;
            case 1:
                System.out.println("Ziua este luni");
                break;
            case 2:
                System.out.println("Ziua este marti");
                break;
            case 3:
                System.out.println("Ziua este miercuri");
                break;
            case 4:
                System.out.println("Ziua este joi");
                break;
            case 5:
                System.out.println("Ziua este vineri");
                break;
            case 6:
                System.out.println("Ziua este sambata");
                break;
            default: System.out.println ("Out of range");
        }
    }

}




