package com.krahman.oca.varscope;
import com.krahman.oca.constructor.*;
public class MethodSignature extends ConstructorTest
{
  
    
    static public void main(String...s)
    {
        ConstructorTest ct = new MethodSignature();
        System.out.println(test("1","2","3"));
        System.out.println(test("1", new String[]{"3","4"}));
        
      //  System.out.println(test1("1","2","3"));
        System.out.println(test1("1", new String[]{"3","4"}));
    }
    
    private static String test( String s1, String...s)
    {
        return "I am test";
    }
    
    private static String test1(String s1, String[] s)
    {
        return "I am test1";
    }
}