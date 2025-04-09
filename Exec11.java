package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exec11 {

    public static void main(String[] args) {

        Map<Integer, String> produto = new HashMap<>();

        produto.put(001, "Parafuso");
        produto.put(002, "Porca");
        produto.put(003, "Prego");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = sc.nextInt();

        String resultado = produto.get(codigo);

        if(resultado == null){
            System.out.println("Nenhum produto econtrado");
        }else {
            System.out.println("Produto encontrado: " + resultado);
        }

    }

}
