package com.krahman.oca.practice;
public class ThrowingNull
{
    public static void main(String...s)
    {
        try
        {
            throw null; //this results in null pointer exception in run time
        }
        catch(Exception e)
        {
            System.out.println(e); //this prints null pointer exception not null
        }
    }
}