package com.krahman.oca.practice;

/*
Arraycase is allowed and it follows the object relationship based on teh array object type
*/
public class ArrayCast
{
    public static void main(String args[]){   
        A[] a, a1;       
        B[] b;       
        a = new A[10]; 
        a1  = a;       
        b =  new B[20];       
        a = b;  // 1       
        b = (B[]) a;  // 2       
        //b = (B[]) a1; // 3    //Since a1 has parent chile relationship with b, this is allowed in comile time
        
        //test
        System.out.println(0%3); //this is zero
    }
    
}
class A { } 
class B extends A { } 