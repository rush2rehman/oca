package com.krahman.oca.practice;
import java.io.*;
class ExceptionHandlingChain
{
    /*
    The last exception thrown - typically in fianlly block is teh final one thrown
    whithin try catch series, there is no chaining
    but nested one allows outer catch to catch the inner exception  
    */
    public static void main(String s[]) throws Exception
    {
        try
        {

            try
            {
                throw new IOException();
            }
            catch(IOException e){
                throw new ClassCastException(); //this will not be caught in the following catch block
            }
            catch(ClassCastException c)
            {

            }
            finally{
                //throw new NullPointerException();
                System.out.println("inner finally");
            }
        }
        catch(ClassCastException c1)
        {
            System.out.println("outer catch");
        }
        finally{
                //throw new NullPointerException();
                System.out.println("outer finally");
            }
    }
}