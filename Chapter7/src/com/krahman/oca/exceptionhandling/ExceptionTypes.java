package com.krahman.oca.exceptionhandling;
import java.io.*;
import java.net.*;
public class ExceptionTypes
{
    /*
    * Why Handle Exception
        - separates regular code from exception handling code
      Types of exceptions
        - Checked Exception: 
            1.Predictable but unpreventable. When an exception is foreseen but the it cant be prevented, and the caller can possibly handle or do something about it - then it is checked exception
            2.Checked exceptions need to be declared in the method signature
            3.Caller of the method need to either handle or declare - or do both
        - Unchecked exception : Run time exception, errors
            1. Reasonable to recover from: programming issues, bugs can result in unchecked exception. 
            2. Errors are something generated by JVM - beyond the control of the code - OOM, NoClassDefFound..
            3. It is optional to declare the unchecked exceptions
            4. It is not recommended to handle Erros although it is possible to catch the same.
            
        Object
            |
        Throwable
    _______|_______________
    Error                 Exception(All checked exceptions are under this)
                          |
                          RunTimeExceptions(this is under Exception and all the run time exceptions are under this)
            
    */
    //Throwing a checked exception; should be declared; socketException did not need a throw in method body as the findFile method throws it
    //Optional to include nullPointerException in the declaration
    //
    void readFile(String file) throws FileNotFoundException , SocketException, NullPointerException, IncorrectInputException
    {
        if(file == null)
        {
           // throw new NullPointerException(); //need not to be declared
           // throw new IncorrectInputException(); //now this need to be declared
            throw new myRunTimeException(); //need not be declared
        }
        else if(findFile(file))
        {
            
        }
        else
        {
            throw new FileNotFoundException("Missing file");
        }
        
    }
    //Declaration can be done without the need of throwing
    boolean findFile(String file) throws SocketException
    {
        return false;
    }
    
    public static void main(String s[])
    {
        System.out.println("test");
        TestExceptionDeclaration t = new TestExceptionDeclaration();
    }
}

//Custom Exceptions
//As a developer If I think input file being null need to be handled by the called, you can create a checked exception and throw the same
class IncorrectInputException extends Exception{}
//As a delveloper If I think the condition is a bug withing the current method and it should be a runtime exception - need not to declare. You can create a custom run time exceptin if make sense
class myRunTimeException extends RuntimeException{}


class TestExceptionDeclaration
{
    //Declaration can be independent of whether the exception is being thrown in the method or not
    void test() throws Error{} //errors need not to be thrown 
    void test1() throws Exception{}
    void test2() throws RuntimeException{} //need not be thrown
    void test3() throws Throwable{}
    void test4() throws FileNotFoundException{}
    
    
    //Cant have a throw without catch inside the static block - wont compile. Static block should complete without any exception
    static
    {
        System.out.println("Static");
        //throw new NullPointerException();
    }
    
    //you cant catch a checked exception which is not thrown in the try clause. - Exception is an Exception!! Errors and RuntimeExceptions can violate this
    void test6()
    {
        try{}
        catch(Exception e){}
        
       // try{}
        //catch(FileNotFoundException e){} //wont compile
        
        try{}
        catch(Throwable e){}
        
        try{}
        catch(RuntimeException e){}
        
        try{}
        catch(Error e){}
    }
    
    //Exceptions can be thrown irrespective of the body
    void m1() throws FileNotFoundException, NullPointerException, Exception
    {
        
    }
    
    void m2() throws FileNotFoundException, NullPointerException, Exception
    {
        try{
            
        }
        catch(NullPointerException w) //you can catch runtimeexcetpion, errors irrespective of whether it is being thrown or not. Among checked exception only Exception is allowed to be caught without being thrown
        {
            
        }
        //catch(FileNotFoundException e){}//Doesnt compile
        catch(Exception|StackOverflowError e){}//works, multiple exceptions/errors can be lined up
    }
    
    
}

