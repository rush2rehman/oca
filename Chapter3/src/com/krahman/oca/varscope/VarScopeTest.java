package com.krahman.oca.varscope;
interface I1
{
    int i1 = 10;
}


public class VarScopeTest implements I1
{
    //static int i1;
    int i1 = 123;
    void test(int i1)
    {
        int i3 ;
        i1 = 321;
        if(true)
        {
            int i2;
        }
        else
        {
            int i2;
        }
        System.gc();
        Runtime.getRuntime().gc(); 
    }
    static public void main(String...s)
    {
        VarScopeTest v = new VarScopeTest();
        v.test(10);
        System.out.println(v.i1);
        String s1 = new String("qwer");
        String s2 = new String("qwer");
        System.out.println(s1==s2);
        System.gc();
        Runtime.getRuntime().gc(); 
    }
}