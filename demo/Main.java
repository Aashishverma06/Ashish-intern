package com.demo;

import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Ashish verma");
        System.out.println("mukul verma");

       //Non-Primitive type
        String name = "ashish";
        String Name = "Mukul";
        System.out.println(name);

        //Primitive type
        Integer Number = 11 ;
        //int Number = 11 ;
        System.out.println(Number);
        Double Decimal = 9.43;
        System.out.println(Decimal);
        Float no = 3.45F;
        System.out.println(no);

        // Adding two string
        String n1 = "ashish";
        String n2 = "verma";
        String n3 = n1 + " " + n2;
        System.out.println(n3);

        //Here we can find the length
        System.out.println(n1.length());

        //Here We can fine the position
        System.out.println(n1.charAt(2));

        //Replace
        String rplc = "abbddbgbrb";
        String rplc1 = rplc.replace('b', 'K');
        System.out.println(rplc1);

        // Substring
        String a = "Ashish kumar verma";
        System.out.println(a.substring(0, 6));
        System.out.println(a.substring(7, 12));

        //Arrays (sbhi type ke arrays bna skte h isme ham like " int,boolean,float,string")
        String[] arrays = new String[100];
        arrays[0] = "ashish";
        arrays[1] = "verma";
        arrays[2] = "mukul";
        arrays[3] = "ashwin";
        System.out.println(arrays[0]);
        System.out.println(arrays[2]);
        // find the length of array
        System.out.println(arrays.length);

        // One dimentonal array

        int[] marks = {12,45,25};
        System.out.println(marks[1]);

        //Two Dimentional Array

        int[][] finalMarks = {{12,34,45},{34,33,31}};
        System.out.println(finalMarks[0][1]);
        System.out.println(finalMarks[1][2]);


        Scanner sc = new Scanner(System.in);
        System.out.println("Entwe your name:");
        String xyz = sc.nextLine();
        System.out.println("Yourname is:" + xyz);

        // conditional statement

        System.out.println("Enter number:");
        boolean num = sc.nextBoolean();
        boolean cond = num;
         if (cond == true)
                System.out.println("Day");
         else
                System.out.println("Night");
         //sc.close();

    }
}
