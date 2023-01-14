package com.syntax.class08;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        while (scanner.next().equalsIgnoreCase("Sha")){
            System.out.println("Great student who always wanted an example an example with String in loop");
        }
        scanner.close();
    }
}
