package com.krahman.oca.practice;
import static java.lang.System.out;
import static java.lang.Integer.*; //Allways full path

public class Import{
    
    public Import()
    {   
        out.println(MAX_VALUE);   
        com.krahman.oca.pac.A.i = 1; //This has to be alwats fully qualified package structure not relative
    } 
    
    public static void main(String...s)
    {
        
    }
}

             