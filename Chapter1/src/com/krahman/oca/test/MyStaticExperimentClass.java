package com.krahman.oca.test;
public class MyStaticExperimentClass{
    
    public static String staticVariable = getName();
    
    static public void main(String[] java)
    {
       (new MyStaticExperimentClass()).testStaticAccess();
    }
    
    
    public static String getName()
    {
        return "stuff";
    }
    
    void testStaticAccess()
    {
        System.out.println(staticVariable);
    }
}