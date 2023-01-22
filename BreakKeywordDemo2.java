package com.syntax.class08;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {
        // create below program without break

        int temp=75;

        while (temp<=105){
            if(temp<=100){
                System.out.println("I love summer "+ temp);
            }else{
                System.out.println("It's very hot "+temp);
            }
            temp+=5;
        }
    }
}

