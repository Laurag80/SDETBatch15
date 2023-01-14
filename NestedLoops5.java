package com.syntax.class08;

public class NestedLoops5 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++)

                if (j == 1 || j == 2) {
                    System.out.println(" ");
                }else{
                System.out.println("*");
            }
        }
        System.out.println();
    }
}
