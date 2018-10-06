package com.krahman.oca.practice;
public class ArithmeticOpsPromotions
{
    /*
    5. Although not important for this question, you should remember that the type of the result will be int even if both the operands are of a type that is smaller than an int. Thus, the following will not compile -
        byte b1 = 1;
        byte b2 = 2;
        byte b = b1 + b2; //result is of type int, which cannot be assigned directly to a byte 
    
    Compound operations have a implicit cast, its not a problem there
    
    */
    public static void main(String s[])
    {
        byte b1 = 1;
        byte b2 = 2;
        //byte b3 = b1+b2; //fails to compile as any integral ops is atleast promited to int.
        //byte b3 = (byte)b1+b2;//Still a problem - why? remember the cast ops precence
        byte b3 = (byte) (b1+b2);
        b3 += b1; //implicit cast
        System.out.println(b3);
    }
}