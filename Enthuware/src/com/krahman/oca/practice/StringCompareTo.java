package com.krahman.oca.practice;
class StringCompareTo
{
    /*
    compareTo() does a lexicographical (like a dictionary) comparison. It stops at the first place where the strings have different letters.
If left hand side is bigger, it returns a positive number otherwise it returns a negative number. The value is equal to the difference of their unicode values.
If there is no difference then it returns zero
    */
    public static void main(String...s)
    {
        String s1 = "hello";
        String s2 =  "hello";
        String s3 = "Hello";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//32 (stops at H and does a unicode subtraction)
        System.out.println(s3.compareTo(s1));///-32
        
    }
}