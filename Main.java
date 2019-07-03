package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int a,b,c,d;

        System.out.println("Welcome to Multiplication tables");
        System.out.println("How large would you like to see them?");
        System.out.println("Please enter range of numbers to print their multiplication table");
        Scanner in = new Scanner (System.in);

        a= in.nextInt();
        b= in.nextInt();

        for (c=a; c<=b; c++)
        {
            System.out.println ("Multiplication table of " + c);
            for ( d=1; d<=20; d++)
            {
                System.out.println (c+ "*" +d+"="+(c*d));
            }
        }
    }
}