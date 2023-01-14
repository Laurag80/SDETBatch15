package com.syntax.class08;

public class NestedLoops8 {
    public static void main(String[] args) {

        for (int i = 1; i < 4 ; i++) {
            for (int j = 0; j <= i * 5; j = j + i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
