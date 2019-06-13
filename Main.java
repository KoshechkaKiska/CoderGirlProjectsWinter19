package com.company;
import static java.lang.System.out;

public class Main
{
    public static int add(int a, int b)
    {

        return a + b;
    }
    public static int subtract(int a, int b)
    {

        return a - b;
    }
    public static int multiply(int a, int b)
    {

        return a * b;
    }

    public static float divide (int a, int b)
    {

        return a / b;
    }

    public static void main(String[] args)
    {
	// First we call the add function. it takes 2 input parameters which are 5 and 7 here. the
        //return value of add() , which is 12, gets saved in variable x.
         int x = add (5,7);
        // then we print out the value of x in our print statement
         System.out.println("5 plus 7 equals " + x);
        //Now we do the same kind of call, but in a single line, without needing "x" as a temporary variable in between
        System.out.println("3 plus 5 equals " + add(3, 5));
        System.out.println("1 plus 2 equals " + add(1, 2));



        System.out.println("9 minus 4 equals " + subtract (9,4));
        System.out.println("9 minus 3 equals " + subtract (9,3));


        System.out.println("3 times 3 equals " + multiply (3,3));
        System.out.println("2 times 4 equals " + multiply (2,4));


        System.out.println("4 divided by 2 equals " + divide (4,2));
        System.out.println("8 divided by 4 equals " + divide (8,4));





















    }
}
