package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        String[] s = {"Hello", "Class"};

        List<String> f = new ArrayList<String>();

        f.add("Hello");
        f.add("Class");
        f.add(" ");

        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(f.get(0));
        System.out.println(f.get(1));
        System.out.println(f.get(2));
 //       System.out.println(f.length);
//       System.out.println(f.size);


    }
}
