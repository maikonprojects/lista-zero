package org.example;

import java.util.Scanner;

//Immpar ou par
public class Exec8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        Integer dado = sc.nextInt();

        if(dado % 2== 0){
            System.out.println("O número " + dado + " é PAR");
        }else {
            System.out.println("O número " + dado + " é IMPAR");
        }

    }
}
