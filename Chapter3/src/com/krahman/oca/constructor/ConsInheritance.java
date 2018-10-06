package com.krahman.oca.constructor;
import com.krahman.oca.conversions.Parent;
public class ConsInheritance extends Parent
{
    public ConsInheritance()
    {
        System.out.println("I am a the sub class constructr");
        
    }
    
    public static void main(String...s)
    {
        ConsInheritance CI = new ConsInheritance();
    }
}