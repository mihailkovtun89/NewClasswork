package com.company;

import java.util.Arrays;

public class Classwork0302 {
    public static void main(String[] args) {
        Girl vasilisa = new Girl("Vasilisa", 18, 170);
        System.out.println(vasilisa);
        Girl matrena = new Girl("Matrena", 25, 168);
        System.out.println(matrena);
        matrena.goToTheCinema ();
        vasilisa.goToTheCinema();
        Girl stepanida = new Girl("Stepanida", 21, 180);
        System.out.println(stepanida);
        stepanida.goToRest("Mac");
        Girl stella = new Girl("Stella", 30, 155);
        System.out.println(stella);
        stella.goToTheCinema();
        stella.goToRest("Bufet");
    }
}
