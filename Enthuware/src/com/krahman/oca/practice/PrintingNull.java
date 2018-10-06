package com.krahman.oca.practice;
public class PrintingNull
{
    public static void main(String s[])
    {
        //One of the operand needs to be a string, then only string concatenation is done.
        
        //System.out.println(null); //Ambigous as both char[] and String methods match
        System.out.println(""+null); //null + string works as null's string equivalent is concatenanted
        Object o = null;
        //System.out.println(o+true); //none of the operand is string. o.toString() is not implicit
        System.out.println(o+o);//no operator between two objects. Operator overloadingisnt supported in java. String is the only object for which compiler or JVM will try to get the toString of other operand.
        //System.out.println(true+null);
        System.out.println(o.toString()+new Boolean(true));
    }
}