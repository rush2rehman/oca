package com.krahman.oca.exceptionhandling;
public class RuntimeExceptionHandling
{
    //Runtime exceptions need not to be declared
    //You can let the raw exception propogate back to the caller
    //Or you can catch and handle
    //best practice is to write preventive code
    static void test()
    {
        int[] iArray = new int[]{1,2,3};
        System.out.println(iArray[3]);
        System.out.println("all seems well");
    }
    
     static void test1()
    {
        int[] iArray = new int[]{1,2,3};
        try
        {
            System.out.println(iArray[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("runtime exception handled");
            System.out.println("all seems well");
        }
    }
    
     static void test3()
    {
        int[] iArray = new int[]{1,2,3};
        int pos = 0;
        if(pos < iArray.length && pos >= 0)
        {
            System.out.println(iArray[pos]);
        }
    }
    
    public static void main(String s[])
    {
        //test();
        test1();
        test3();
    }
}