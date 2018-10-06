package com.krahman.oca.practice;
public class BreakAndFinally
{
    public static void main(String...s)
    {
        TEST:
        try
        {
            System.out.println("Try");
            if(true)break TEST;
            System.out.println("Try1");
        }
        catch(Exception e){
            
        }
        finally
        {
            System.out.println("Finally");
        }
    }
}