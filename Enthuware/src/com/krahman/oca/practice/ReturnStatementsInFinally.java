package com.krahman.oca.practice;
class ReturnStatementsInFinally
{
    public static void main(String s[])
    {
        System.out.println(test(2));//returns 3
        System.out.println(test(1));//returns 3
        
         System.out.println(test1(2));//returns 10
        System.out.println(test1(1));//returns 5
       
        System.out.println(test2(2));//returns 10
        System.out.println(test2(1));//returns 5
        
        System.out.println(test3(2));//returns 10
        System.out.println(test3(1));//returns 5
    }
    
    private static int test(int x)
    {
        try
        {
            if(x != 1)
            {
                throw new Exception();
            }
            else
            {
                return x;
            }
        }
        catch(Exception e)
        {
            return 2;
        }
        finally
        {
            return 3;
        }
    }
    
     private static int test1(int x)
    {
        try
        {
            if(x != 1)
            {
                throw new Exception();
            }
            else
            {
                return x;
            }
        }
        catch(Exception e)
        {
            return x*2;
        }
        finally
        {
            return x*5; //if return statement is present - thats the final return
        }
    }
    
     private static int test2(int x)
    {
        try
        {
            if(x != 1)
            {
                throw new Exception();
            }
            else
            {
                System.out.println("in the try , x==>"+x);
                return x;
            }
        }
        catch(Exception e)
        {
            System.out.println("in the exception , x==>"+x);
            return x*2;
        }
        finally
        {
            x++; //this doesnt have any effect
            System.out.println("in the finally , x==>"+x);
        }
    }
    
     private static Integer test3(Integer x)
    {
        try
        {
            if(x != 1)
            {
                throw new Exception();
            }
            else
            {
                System.out.println("in the try , x==>"+x);
                return x;
            }
        }
        catch(Exception e)
        {
            System.out.println("in the exception , x==>"+x);
            return x*2;
        }
        finally
        {
            x++; //doesnt make a difference as the wrapper classes are immutable . Had it been a mutable one, it will reflect
            System.out.println("in the finally , x==>"+x);
        }
    }
}