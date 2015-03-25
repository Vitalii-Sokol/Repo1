package com.company;

public class While {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        while (a < 15) {   //до того как не будет равно значению
            System.out.println("a = " + a);
            a = ((a) +1);
        }
        System.out.println("While is over" );
    }
}
