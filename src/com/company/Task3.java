package com.company;

public class Task3 {
    public static void main(String[] args) {
        for(int i = 5; i <51; i+=2){
            System.out.println(i);
        }

        System.out.println();

        for (int i = 5; i<51; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
