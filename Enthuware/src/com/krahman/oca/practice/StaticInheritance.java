package com.krahman.oca.practice;
public class StaticInheritance
{
    public static void main(String...s)
    {
        System.out.println(B.i+" "+B.x+" "+B.m()+" "+I.m1());//B.m1 is not possible
        B b = new B();
        System.out.println(b.i+" "+b.x+" "+b.m()+" "+I.m1()); //b.m1 is not possible
    }
}

class A
{
    static int i =0;
    static int m(){
        System.out.println("In A");
        return 1;
    }
    
}

interface I{
    int x = 11;
    static int m1(){
        System.out.println("In A");
        return 1;
    }
}

class B extends A implements I
{
        
}