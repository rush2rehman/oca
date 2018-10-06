package com.krahman.oca.practice;
public class AssignmentOperator
{
    /*
    1. Assignment allows widening //for variables
        byte can be widened to [short, int, long, double, float]
        short can be widened to [ int, long, double, float]
        int can be widened [ long, double, float]
        long can be widened [ double, float]
        float can be widened [ double]
        char can be widened [ int, long, float, double]
        
        compile time value widening (and final var)
        all the above and
        byte, short can be wideneded to char
        
    2. Narrowing
        For compile time values and final var 
        char can be narrowed to byte, short
        int can be narrowed to byte, short, char
        short can be narrowed  to byte, char
    */
    public static final void main(String...s)
    {
        int i =0;
        byte b = 1*100; //narrowing with explicit compile time value
        //byte b1 = 1.0; //narrowing doesnt work for anything other than integral values
        //byte b1 = i; //wont work - no narrowing for run time values
        byte b1 = 'a';//narrowing works
        byte b2 = (short)1;
        int i1 = 'a';//works narrowing
        char c = 100; //narrowing
        char c1 = (short)1;
        
        //char c = i;//wont work
        char c2 = (short)0; //works - compile time widening
        double d = b;
        
        double d1 = c2; //widening
        float f = 10L;
        long l = 1.0f;//narrowing not allowed
        
        
        
        
        
    }
}