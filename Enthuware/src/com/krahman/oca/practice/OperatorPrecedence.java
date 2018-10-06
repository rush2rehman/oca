package com.krahman.oca.practice;
public class OperatorPrecedence
{
    /*
    A . () [] {This () doesnt cover cast} 
    B ++ -- post increment
    C ++ -- + - ! ~ {Unary pre operators : Right to left }
    D cast new {Right to left}
    E * / % 
    F + - 
    E >= <= > < instanceof
    F == !=
    G &&
    H ||
    I ?:
    J = += -+ *= /= %= right to left
    
    
    
    - Assignment Operators
    */
    public static void main(String...s)
    {
        X x = new Y();
        Y y = new Y();
        System.out.println(x.x);//prints 10
        //System.out.println((Y)x.x); //Doesnt compile
        System.out.println(((Y)x).x);//prints null
        
        System.out.println(y.x);//prints null
        System.out.println((X)y.x);//prints null
        
        
    }
    
   
}

 class X{int x = 10;}
    class Y extends X{Y x = null;}