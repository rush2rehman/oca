package com.krahman.oca.exceptionhandling;
public class ExceptionHandling
{
    /*
    - Try, catch, finally is the order
    - All three cannot exist on their own, finally is optional
    - catch block is also optional if 
        - try doesnt throw any exception or there is a declaration
        - finally is present
    - Multiple catch possible - if related exceptions - need appear in the derivation order
    - finally always executes irrespective exception being thrown
    - Code after try catch finally segment executes if the code flow hasnt been broken by a return or throw
    */
    
    void test() throws MyCheckedException2//just to demonstrate declare and handle
    {
        try{
            System.out.println("In Test3()");
            test1(11);
            test2(11);
        }
        //finally{            System.out.println("Finally..");        }//cant define finally ahead of catch
        catch(MyCheckedException2 e)
        {
            System.out.println("MyCheckedException2 caught");
        }
         catch(MyCheckedException1 e)
        {
            System.out.println("MyCheckedException1 caught");
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        finally{
            System.out.println("Finally..");
        }
        System.out.println("Outside Exception handling");
        
    }
    
    class MyCheckedException1 extends Exception{}
    class MyCheckedException2 extends Exception{}
    void test1(int i) throws MyCheckedException1
    {
        System.out.println("In Test1()");
        if(i>10)
        throw new MyCheckedException1();
    }
    void test2(int i) throws MyCheckedException2
    {
        System.out.println("In Test2()");
        if(i>10)
        throw new MyCheckedException2();
    }
    
    
    public static void main(String...s)
    {
        try
        {
            new ExceptionHandling().test();
        }
        catch(MyCheckedException2 e)
        {
            System.out.println("just to demonstrate that even though this exception is not thrown, as its declared - need to be handled");
        }
    }
}