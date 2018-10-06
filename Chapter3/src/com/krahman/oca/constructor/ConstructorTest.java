package com.krahman.oca.constructor;
public class ConstructorTest
{
    
    public int testMethod()
    {
        System.out.println(name);
        byte i = 10;
        return (int)10.0;
    }
    
    {
        System.out.println("I am in the Initializer block 1");
        if(true)
        {
            System.out.println("If statement works");
        }
    }
    
    
    protected ConstructorTest()
   {
       this("Hi");
       System.out.println("No args");
   }
    
     ConstructorTest(String s)
   {
       //this(); This is another way of introcuing recursion - caught by compiler again
       System.out.println("String args");
   }
    
     ConstructorTest(int i)
    {
        this();
        //this("Hi");
        System.out.println("POST..");
        System.out.println("i=="+testMethod());

    }
    
    {
        System.out.println("I am in the Initializer block 2");
    }
    
    static public void main(String...s)
    {
        System.out.println("Hello");
        ConstructorTest ct = new ConstructorTest(2);
        
        test t1 = new test();
        t1.test1();
    }
    
    {
        System.out.println("I am in the Initializer block 3");
    }
    
    public String name = "hi";
}


class test{
    float f1;
    test()
    {
        //test t = new test(); //runtime error - StackOverFlowError - not explicit
       // this();//Compile time error - explicit recursion in constructor
    }
    
    Object test1()
    {
         float f = 0;
    System.out.println(f1);
        return null;
        //return new StackOverflowError();
    }
   
    
}