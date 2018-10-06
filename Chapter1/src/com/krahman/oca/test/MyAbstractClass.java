package com.krahman.oca.test;

public abstract class MyAbstractClass{
    
    public String name;
    public abstract void absMethod();
    
    public static String staticMethod()
    {
        return "I am a static method in Abstract class";
    }
    public void nonAbsMethod(){
        
    }
    
    static public void main(String...s)
    {
        System.out.println("Hello");
        System.out.println(staticMethod());
        
    }
    
}