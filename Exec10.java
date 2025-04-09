package org.example;

public class Exec10 {
    public static void main(String[] args) {
        Integer p1 = 6;
        Integer p2 = 4;
        Integer p3 = p1/p2;

        System.out.println("Exibindo 3°variável: " + p3);

        // Mesmo o resultado da divisão sendo 1.5, a terceira variável está imprimindo o valor 1,
        // já que uma variável do tipo inteiro não armazena os decimais, apenas números inteiros

    }
}
