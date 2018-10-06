package com.krahman.oca.test;

public class MyClass extends MyAbstractClass{


static public void main(String...s1)
{
    System.out.println("Hello World");
    new MyClass().absMethod();
    (new MyStaticExperimentClass()).testStaticAccess();
}
    
    public void absMethod()
    {
        System.out.println("I am a overridden method");
    }
    
   

}