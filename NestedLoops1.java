package com.syntax.class08;

public class NestedLoops1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println("i ="+j+" j "+j);
            }
            System.out.println("***********");
        }
    }
}
