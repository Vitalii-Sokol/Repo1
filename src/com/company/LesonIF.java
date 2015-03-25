package com.company;


public class LesonIF {
    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1] + " " + args[2]);
        String Arg0 = args[0];
        String Arg1 = args[1];
        String Arg2 = args[2];
        if (Arg0.equals("Hello")&& Arg1.equals("World") && !Arg2.equals("!"))  //!Arg2 = false, не равняеться ставиться перед значением
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
            //    System.out.println(var1.equals(var2));
    }

}
