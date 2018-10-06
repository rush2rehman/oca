package com.krahman.oca.exceptionhandling;
public class HandlingError
{
    static void test()
    {
        try
        {
            MyMethod();
        }
        catch(StackOverflowError e) //this may not woek for JVM crash
        {
            System.out.println("hello.....");
            for(int i = 0; i<100; i++)
            {
                System.out.println(i);
            }
            System.out.println(e);
        }
    }
    static void MyMethod()
    {
        MyMethod();
    }
    public static void main(String s[])
    {
        test();
    }
}