package com.krahman.oca.practice;
class ArrayEvaluation
{
    /*
    52. In an array access, the expression to the left of the brackets appears to be fully evaluated before any part of the expression within the brackets is evaluated.
	In the expression a[(a=b)[3]], the expression a is fully evaluated before the expression (a=b)[3]; this means that the original value of a is fetched and remembered while 		the expression (a=b)[3] is evaluated. 
    */
    public static void main(String...s)
    {
        int a[] = {1,2,3,4};
        int b[] = {0,9,8,1};
        int x = a[(a=b)[3]];
        System.out.println(x);
    }
    
}