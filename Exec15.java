package org.example;

import java.util.Random;

public class Exec15 {
    public static void main(String[] args) {

        Random random = new Random();
        int i = 0;
        int somaNumAleatorio = 0;
        int numAleatorio = 0;
        do{
            numAleatorio = random.nextInt(101);
            somaNumAleatorio += numAleatorio;
            i++;
            System.out.println(i+"° : "+numAleatorio);
        }while (i < 50);
    }
}
