package org.example;

import java.util.Random;

public class Exec14 {
    public static void main(String[] args) {
        Random random = new Random();

        int somaNumAleatorio = 0;
        int numAleatorio = 0;
        int i = 0;
        while (i < 50){
            numAleatorio = random.nextInt(101);
            somaNumAleatorio += numAleatorio;
            i++;
            //System.out.println(i+"° : "+numAleatorio);
        }

        System.out.println("A média aritimética é " + somaNumAleatorio/50);

    }
}
