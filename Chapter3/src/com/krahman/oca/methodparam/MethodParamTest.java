package com.krahman.oca.methodparam;
public class MethodParamTest
{
    public static void myMethod(int i, String s, float d, byte b)
    {
        
    }
    
    public static void main(String...s)
    {
        byte b = 1;
        myMethod(1,"",1L,b);
    }
    
}