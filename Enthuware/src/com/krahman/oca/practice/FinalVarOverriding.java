package com.krahman.oca.practice;
import java.util.*;
/*
Final var can be hidden by final or non final and vice versa 
*/
public class FinalVarOverriding 
{
    public static void main(String...s)
    {
        A a = new B();
        System.out.println(a.i+" "+((B)a).i);
        I i = new C();
        ArrayList x = (ArrayList)i;
    }
    
}

class A{final int i =10;}
class B extends A{int i = 20;}
interface I{}
class C implements I{}
