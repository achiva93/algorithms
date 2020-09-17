package com.lseg.classes;

public class Main {

    public static void main(String[] args) {

        Table gabiDesk = new Table(); //Created a custom data type
        //classes are developer defined data type
        //Table() --> constructor invocation, can be invoked only with `new` keyword

        System.out.println("Gabi's desk color before setting explicit values: " + gabiDesk.color + ", legs: " + gabiDesk.getLegNumber() + ", height:" + gabiDesk.height);


        gabiDesk.color = "black"; //attributes are called only with name, without parentheses
        gabiDesk.setLegNumber(4);
        gabiDesk.height = 70;
        gabiDesk.lentgh = 120; //cm
        gabiDesk.width = 60; //cm

        Table gabiTableKitchen = new Table();
        gabiTableKitchen.color = "white";
        gabiTableKitchen.setLegNumber(4);
        gabiTableKitchen.height = 80;
        gabiTableKitchen.lentgh = 200; //cm
        gabiTableKitchen.width = 70; //cm

        System.out.println("Gabi's desk color: " + gabiDesk.color + ", legs: " + gabiDesk.getLegNumber() + ", height:" + gabiDesk.height);
        System.out.println(
                "Gabi's kitchen table color: " + gabiTableKitchen.color + ", legs: " + gabiTableKitchen.getLegNumber() + ", height:" + gabiTableKitchen.height);

//        boolean hasLegNumberBeenSet = gabiDesk.setLegNumber(100);
//        if(hasLegNumberBeenSet){
//            //do what it takes
//        }

//        System.out.println(gabiDesk.getLegNumber()); //returneze valoarea lui legNumber specifica obiectului gabiDesk

//        float oVariabila; //locala
//        System.out.println("oVariabila = " + oVariabila);
    }
}
