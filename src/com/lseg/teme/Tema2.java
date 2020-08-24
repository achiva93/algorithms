package com.lseg.teme;

public class Tema2 {

    public static void main(String[] args) {
        ex1();

        ex2();

        ex3();

        ex4();

        ex5();

        ex6();

        ex7();

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
        for (int i = 0;i<=CateNumerePrimeAmGasit - 1;i++){
            System.out.print (SirNumerePrime[i] + " ");
        }

    }
}


