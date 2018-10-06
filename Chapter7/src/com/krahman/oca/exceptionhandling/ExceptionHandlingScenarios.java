package com.krahman.oca.exceptionhandling;
import java.io.*;
public class ExceptionHandlingScenarios
{
    //Finally block executes even after return statement in catch block or try block
    //if you call System.exit - finally will not execute. Also JVM crashes - no finally
    static void test(int i)
    {
        try{
            System.out.println("try..");
            if(i==0)
            {
                throw new Exception();
            }
            if(i==2)
            {
               System.exit(0); //no finally executed
            }
            return;
        }
        catch(Exception e)
        {
            System.out.println("catch..");
            return;
        }
        finally{
            System.out.println("finally..");
        }
    }
    
    /* Multiple Return statement behaviour
        - if finally has a return ststement, thats the one will get executed at the end
    */
    
    static int test2()
    {
        try{throw new Exception();}
        catch(Exception e){return 10;}
        finally{return 20;}//not a var or method so value is returned as it is
    }
     static int test1()
    {
        int j = 10;
        int k = 9;
        try{throw new Exception();}
        catch(Exception e){return j;}
        finally{return k;}//Finally return is the one to be used
    }
    
    /* Return value being modified in finally - not multiple returns just teh modification
     - for primitive - value doesnt refelect as it is just a copy
     - For objects - it refelects as its reference
    */
    
   
    
      int test3()
    {
        int j = 10;
        try{throw new Exception();}
        catch(Exception e){
            System.out.println("In catch j =="+j);
            return j;
        }
        finally{
            j = j+10;    
            System.out.println("In finally j =="+j);
        }
        
    }
    
      StringBuilder test4()
    {
        StringBuilder sb = new StringBuilder("");
        try{throw new Exception();}
        catch(Exception e){
            sb.append("1");
            System.out.println("In catch sb =="+sb);
            return sb;
        }
        finally{
            sb.append("2");   
            System.out.println("In catch sb =="+sb);
        }
        
    }
    /*
     - catch block is also optional if 
        - try doesnt throw any exception nor there is a declaration
        - finally is present
    */
    void test5() //works fine
    {
        try{}
        finally{}
    }
    
    /* void test6() //doesnt work
    {
        try{}
    }
    void test6() //doesnt work
    {
        try{throw new Exception();}
        finally{}
    }*/
    
    void test6() throws Exception//works fine
    {
        try{throw new Exception();}
        finally{}
    }
    
    //Hierarchy of exception classes need to be follwed
    void test7(int i) 
    {
        try{
            if(i==0)
                throw new Exception();
            else
                throw new FileNotFoundException();
        }
        catch(Exception e){}
        //catch(FileNotFoundException e){} //has already been cought exception
        finally{}
    }
    
    //exception can get propogated to outer try catch if matching catch is not found
    static Integer iObj;
    static void test8(int i) 
    {
        
        try
        {
            System.out.println("outer try");
            try{
                    System.out.println("inner try");
                   // iObj.intValue();
                    throw new IOException();
                }
            
            finally{
                System.out.println("inner finally");
            }
        }
        catch(IOException e){
                System.out.println("outer catch for checked exception");
            }
        catch(NullPointerException e){
            System.out.println("outer catch for runtime exception");
        } 
        finally{
            System.out.println("outer finally");
        }
    }
    
    public static void main(String[] s)
    {
        test(1); //try and finally prints
        test(0); //try catch finally
        //test(2);
        System.out.println(test1());
        System.out.println(test2());
         System.out.println(new ExceptionHandlingScenarios().test3());
         System.out.println(new ExceptionHandlingScenarios().test4());
        test8(0);
    }
}