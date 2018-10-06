package com.krahman.oca.commonexceptions;
public class IllegalArgument{
    
    
    static void test(int i, String s, Integer iObg)
    {
        if(i < 0)
        {
            throw new IllegalArgumentException("negative");
        }
        if(s == null)
        {
            throw new IllegalArgumentException("negative");
        }
    }
    
    
    public static void main(String...s)
    {
        test(10, null, null);
    }
}