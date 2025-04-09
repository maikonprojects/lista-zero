package org.example;

public class Exec13 {
    public static void main(String[] args) {
        int ax = 0;
        for (int i = 1; i <= 6 ; i++) {
            for (int j = 1; j <= 6; j++) {
                if(i + j == 7){
                    ax++;
                }
            }
        }
        System.out.println("A possibilidades da soma dos dois dados serem 7 é "+ax);
    }
}
