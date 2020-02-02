package com.lambton;

import java.util.Arrays;

public class StringsExamples
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "World";

        String s3 = "Hello";
        String s4 = s1;

        String s5 = new String(s2);
        String s6 = new String();
        s6 = "World";
        String s7 = new String ( "Hello");

        System.out.println("s1 = " + s1 ); //Hello
        System.out.println("s2 = " + s2 ); //World
        System.out.println("s3 = " + s3 ); //Hello
        System.out.println("s4 = " + s4 ); //Hello
        System.out.println("s5 = " + s5 ); //World
        System.out.println("s6 = " + s6 ); //World
        System.out.println("s7 = " + s7 ); //Hello

        //String.
        //String Comparison
        if (s1 == s7) {
            System.out.println("s2(" + s2 + ") = s6(" + s6 + ")");
        }else{
            System.out.println("s2(" + s2 + ") <> s6(" + s6 + ")");
        }

        //String comparison
        if(s1.equals(s7)) {
            System.out.println("s2(" + s2 + ") equals s6(" + s6 + ")");
        }else {
            System.out.println("s2(" + s2 + ") NOT equals s6(" + s6 + ")");
        }




        //Class Assignment : Try all String Handling functions
        s1.concat("World");
        System.out.println(s1);

        s1 = s1.concat("World");
        System.out.println(s1);

        s1.length();

        int a = 100;
        int b = 200;
        int c = a + b;
        String str = String.format("%d + %d = %d", a, b, c);
        System.out.println(str);

       String happyString = String.join(" ", "Welcome","to","Lambton","Canada");
       System.out.println(happyString);

        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', 'w','o','r','l','d' };
        String helloString = new String(helloArray);
        System.out.println( helloString );
        //System.out.println(Arrays.toString(helloArray));

        


    }
}
