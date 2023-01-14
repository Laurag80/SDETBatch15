package com.syntax.class08;

public class NestedLoops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("*");

                if (j == 1 || j == 2) {
                    continue;
                }
                System.out.println();
            }
        }
    }
}