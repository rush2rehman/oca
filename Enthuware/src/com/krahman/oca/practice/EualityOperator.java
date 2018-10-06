package com.krahman.oca.practice;
class EualityOperator
{
    //When primitive types are compared - all combinations are allowed
    //4. Remember that == operator can only compare two references of same or similar kind. That means, there should be at least an ancestor-child relationship between the two classes. If the two classes of objects that are being compared have no such relation to each other, == operation will not compile because the compiler knows that the two references can never point to the same object. Here, a reference of class String can never be point to an object of class StringBuilder. Thus, it will not compile.
    public static void main(String...s)
    {
        int i = 0;
        byte b = 0;
        long l = 10;
        double d = 1;
        char c = 'c';
        Integer iObj = 1;
        Byte bObj = 1;
        
        System.out.println((i==b) +""+(i==l)+""+(d==i)+(c==d));
        //System.out.println((iObj==bObj) ); //cant compare unrelated objects
        System.out.println(((Number)iObj==bObj) );//This works as these objects have a hierarchy
        
    }
}