package com.lambton;

public class FirstExample
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java Programming");
        for (int i = 0; i < 10; i++)

            System.out.println("PhilipJhasonDeLeon");

        //Day - 2 Code Starts here

        int a = 100;
        int b;

        b = 200;

        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Sum = " + a + b);
        System.out.println(a + b +  "Sum");

        short x = 32767;
        System.out.println("Short MAX = " + Short.MAX_VALUE);
        System.out.println("Short MIN = " + Short.MIN_VALUE);

        long y = 2147483647;
        System.out.println(y);


        float r1 = 1000.50F;
        double r2 =1000.40D;
        float r3 = (float)10/3;
        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);

        int z = 10 / 3;
        float z1 = 10.0f / 3;
        System.out.println("z = " + z);
        System.out.println("z = " + z1);

        double x1 = 1_00___00.5_0;
    }
}
