package com.krahman.oca.practice;
public class UnreachableStatement
{
    public static void main(String...s)
    {
        if(false)
        {
            System.out.println("Although I am not unreachable, compiler doesnt complain- used for conditional compiling");
        }
        
       /* for(;false;)
        {
            System.out.println("I am unreachable");
        }
        while(false)
        {
            System.out.println("I am unreachable");
        }*/
    }
    
    
}