package com.krahman.oca.practice;
import java.util.*;
public class EnhancedForLoop
{
    public static void main(String...s)
    {
        ArrayList<String> sArr = new ArrayList<>();
        for(String s1: sArr)
        {
            
        }
        //cant use a predefined variable
        String s2 = "";
        //for(s2:sArr) {    } //doesnt work as you cant resue
        for(s2="1";s2.equals("");) //but this will work 
        {
            s2="";
        }
        
         for(final String s1: sArr) //this can take final variable
        {
            //s1 = "";//but you cant modidy
        }

    }
}