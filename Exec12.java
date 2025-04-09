package org.example;

public class Exec12 {
    public static void main(String[] args) {

        // Criado apenas para atender a nececidade de ter uma variável em Double
        Double resultado;
        for (Integer i = 1; i <= 100; i++){
            if(i % 3 == 0){
                resultado = (double) (i/2);
                System.out.println(i + " dividido por 2 o resultado é: " + resultado);
            }
        }
    }
}
