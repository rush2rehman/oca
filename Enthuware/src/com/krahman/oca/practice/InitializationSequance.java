package com.krahman.oca.practice;

class base{
    base()
    {
        System.out.println("base Constructor");
    }
    static String s1 = print("base Static var initializer 1");
    static{
        System.out.println("base Static block 1");
    }
    static String s2 = print("base Static var initializer 2");
    static{
        System.out.println("base Static block 2");
    }
    
    String s3 = printInstance("base Inatnce var initilizer 1");
    {
        System.out.println("base Instance block 1");
    }
    
    String s4 = printInstance("base Inatnce var initilizer 2");
    {
        System.out.println("base Instance block 2");
    }
    
    
    static String print(String s)
    {
        System.out.println(s); return s;
    }
    
    String printInstance(String s)
    {
        System.out.println(s); return s;
    }
}

public class InitializationSequance extends base
{
    //Static initializatiion 1
    static String s1 = print("Static var initializer 1");
    static{
        System.out.println("Static block 1");
    }
    static String s2 = print("Static var initializer 2");
    static{
        System.out.println("Static block 2");
    }
    
    InitializationSequance()
    {
        System.out.println("Constructor");
    }
    
    String s3 = printInstance("Inatnce var initilizer 1");
    {
        System.out.println("Instance block 1");
    }
    
    String s4 = printInstance("Inatnce var initilizer 2");
    {
        System.out.println("Instance block 2");
    }
    
    
    static String print(String s)
    {
        System.out.println(s); return s;
    }
    
    String printInstance(String s)
    {
        System.out.println(s); return s;
    }
    
    
    
    
    
    /*
    Step 1: First, static statements/blocks are called IN THE ORDER they are defined. 
    Step 2: Next, instance initializer statements/blocks are called IN THE ORDER they are defined. 
    Step 3: Finally, the constructor is called. So, it prints a b c 2 3 4 1.
    */
    public static void main(String...s)
    {
        InitializationSequance is = new InitializationSequance();
    }
}