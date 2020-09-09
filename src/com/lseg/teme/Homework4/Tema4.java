package com.lseg.teme.Homework4;


import java.util.Scanner;

public class Tema4 {
    public static void main(String[] args) {
        ex1();
        ex2();
        //ex3();
        ex4();
    }

    public static void ex1() {
        int start = 2;
        int end = 12;
        int divisor = 2;

        System.out.println("Suma numerelor divizibile cu " + divisor + " din intervalul [" + start + "," + end + "]  este " + rangeSum(start, end, divisor));

    }

    public static int rangeSum(int start, int end, int divisor) {
        if (end < start || end <= 0 || start <= 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isDivisible(i, divisor)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static boolean isDivisible(int number, int divisor) {
        if (number <= 0) {
            return false;
        }
        if (number % divisor == 0) {
            return true;
        }
        return false;
    }

    public static void ex2() {

        int[] array = {40, 35, 15, 7, 55, 1, 22};
        int divisor = 2;
        int sum = 0;

        for (int elementArray : array) {
            if (isDivisible(elementArray, divisor)) {
                sum = sum + elementArray;
            }
        }
        System.out.println("Suma numerelor divizibile cu " + divisor + " din Array este " + sum);
    }

    public static void ex3() {
        System.out.println("Introduceti numarul de secunde");
        Scanner scanner = new Scanner(System.in);
        int numberOfSeconds = scanner.nextInt();
        System.out.println(convertFromSeconds(numberOfSeconds));

    }

    public static String convertFromSeconds(int numberOfSeconds) {
        int H = 3600;
        int M = 60;

        int numarDeOre, numarDeMinute, numarDeSecunde;

        numarDeOre = numberOfSeconds / H;
        numarDeMinute = (numberOfSeconds % H) / M;
        numarDeSecunde = (numberOfSeconds % H % M);
        return "H" + numarDeOre + "-M" + numarDeMinute + "-S" + numarDeSecunde;
    }

    public static void ex4() {
        System.out.println(canPack(-3,2,11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = bigCount * 5 + smallCount;
        if (sum < goal || bigCount < 0 || smallCount < 0) {
            return false;
        }

        goal = goal - (goal / 5) * 5;

        return goal <= smallCount;
    }

}