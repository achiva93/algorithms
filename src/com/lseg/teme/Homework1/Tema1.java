package com.lseg.teme.Homework1;

public class Tema1 {

    public static void main(String[] args) {


        int[] sirDeShiftat = new int[5];
        sirDeShiftat[0] = 1;
        sirDeShiftat[1] = 2;
        sirDeShiftat[2] = 3;
        sirDeShiftat[3] = 4;
        sirDeShiftat[4] = 5;

        int shiftCount = 2;

        int[] rezultat = shiftLeft(sirDeShiftat, shiftCount);

        for (int k = 0; k <= sirDeShiftat.length - 1; k++) {
            System.out.print(sirDeShiftat[k] + " ");
        }
        System.out.println();

        for (int k = 0; k <= rezultat.length - 1; k++) {
            System.out.print(rezultat[k] + " ");
        }

    }

    public static int[] shiftLeft(int[] array, int shiftCount){
        int[] shiftedArray = new int[array.length];

        for (int k = 0; k <= array.length - 1; k++) {
            int pozitienoua = k - shiftCount;
            if (pozitienoua < 0) {
                pozitienoua = pozitienoua + array.length;
            }
            shiftedArray[pozitienoua] = array[k];
        }
        return shiftedArray;
    }

}
