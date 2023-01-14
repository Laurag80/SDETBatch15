package com.syntax.class08;

import java.util.Scanner;

public class Repil63 {
    public static void main(String[] args) {

        Scanner fetch=new Scanner(System.in);
        System.out.println("Please enter the number");
        int x=fetch.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(i+" ");

        }
        fetch.close();
    }
}
