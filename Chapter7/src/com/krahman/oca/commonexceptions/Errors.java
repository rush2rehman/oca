package com.krahman.oca.commonexceptions;
public class Errors
{
    
    
    //ExceptionInitializerError
    //This will be thrown when you run a class with issues with the static block
    //Output gives this error and then prints the runtime excpetion that caused this
    //Only runtime exception can cause this error, checked exceptions will be caught by the compiler
    //throwable --> error --> linkage error --> ExceptionInitializerError
    static
    {
        //System.out.println(77/0);
        String s = null; //thsi is like local var, wont be initialized
        //System.out.println(s.length());
        test();//you can call a method which throws run time exception - will compile but result in error
        //test1();//cant call a method which throws a checked exception
        //throw new RuntimeException();doesnt compile
        
    }
    static void test()
    {
        throw new RuntimeException();
    }
    static void test1() throws Exception
    {}
        
        
    public static void main(String...s)
    {
        System.out.println("test");
    }
    
    
    //Stackoverflow error
    //throwable --> error --> VirtualMachineError --> StackOverflowError
    //Can be simulated with recursive call
    
    //NoClassDefFoundError
    //thrown when .class is missing
    //different from classnotfound error thrown by Class.forname()
    //throwable --> error --> linkage error --> NoClassDefFoundError
    
    //OutOfMemoryError
    //throwable --> error --> VirtualMachineError --> OutOfMemoryError
    
}