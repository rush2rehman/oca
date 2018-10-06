package com.krahman.oca.practice;
public class PassByReference
{     
    public static void testInts(Integer obj, int var)
    {     
        System.out.println(obj);
        obj = var++;
        obj++;   
    }  
    public static void main(String[] args) 
    {        
        Integer val1 = new Integer(5);   
        int val2 = 9;        
        testInts(val1++, ++val2);       //NOte - what is passed to the method?
        /*
            val1++ : being a post incrementer, current value of val1 is copied before increment operations. And the current value is a reference to immutable Integer object of value 5. after increment, val1 holds a new reference for a new Integer object of value 6. 
        
        */
        
        System.out.println(val1+" "+val2);     
    } 
}            