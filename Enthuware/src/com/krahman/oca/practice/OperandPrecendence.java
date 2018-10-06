package com.krahman.oca.practice;
public class OperandPrecendence
{
    public static void main(String...s1)
    {
        int s =5;
        s += ++s + m(s)+ ++s;
        System.out.println("s=="+s);
    }
    static int m(int z)
    {
        System.out.println("z=="+z);
        z =8;
        
        return z;
    }
}