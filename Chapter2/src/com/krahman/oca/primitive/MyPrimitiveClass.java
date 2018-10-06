package com.krahman.oca.primitive;

public class MyPrimitiveClass
{
    
    int $_test11111_$$$$$_____;
    
    static public void main(String[] s)
    {
        boolean b = true;
        int i = 0x1_____0;
        double d = Double.MAX_VALUE;
        System.out.println("Hello...."+"i="+i+"  d=="+d);
        int i1 = Integer.parseInt("123"); //Run time error
        
        float f = 0.0______01f;
        char c = (char)300000000000.0d;
        System.out.println("c==>"+c);
        
        
        int a1 = 7, b1=10, c1 = 11;
        a1 = b1 = c1--;
        System.out.println("a1==>"+a1+" b1==>"+b1+" c1==>"+c1);
        a1 %= b1;
         System.out.println("a1==>"+a1+" b1==>"+b1+" c1==>"+c1);
        
        //% can be used on floating point
        double d1 = 3.3%2;
        System.out.println("% used on floating point-->"+d1);
        
        
        char c2 = 'a';
        
        System.out.println(++c2);
        
        final byte A = 10;
        final byte B = 20;
        final long D = 0;
        float F = 0.0F;
        double C = A+B+D+F;
        
        int var1 = 10;
        int var2 = 20;
        
        System.out.println(++var1 + var1++ + var1++); 
       
        
    }
}