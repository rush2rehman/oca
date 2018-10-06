package com.krahman.oca.varscope;
public class OverLoadingTest
{
    public static void main(String...s)
    {
        System.out.println("Hello");
        OverLoadingTest ot = new OverLoadingTest();
        ot.test(2,3d);
    }
    
    public void test(int i, double d)
    {
        
    }
    
     public void test(double d, int i)
    {
        
    }
    
    private void test(double d, int i, Integer...i2)
    {
        return ;
    }
    
     public final void  test(int i, double d)
    {
        
    }
    
    public static void test1(int i, double d)
    {
        
    }
    
    public static void test1(double d, int i )
    {
        
    }
}