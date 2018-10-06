package com.krahman.oca.commonexceptions;

interface I1{}
class Base{}
class Sub1 extends Base{}
class Sub2 extends Base{}
class Sub3 extends Base implements I1{}
class Sub4 {}

public class ClassCast
{
    /*
    upcasting works implicitly - look at the array assigment below
    downcasting is allowed only with explict cast
    downcasting for classes partially checked during compile time - if there is possiblity of conversion
        like Object ref to any specific type object conversion
        A super class ref to one of its subclasses
    Beyond which only run time catches the issues
    In case of Interfaces - no compile time check. Any unrelated interface reference will be allowd to compile with an explict cast to any object
    */
    public static void main(String...sArg)
    {
        Base b[] = new Base[]{
            new Sub1(),
            new Sub2()
        };
       // Sub2 s = b[0];//compile time error
        // Sub2 s = (Sub2)b[0];//runtime exception - compiles as there is a possibility
        Object O = new Sub1();
        //Sub2 S2 = (Sub2)O; //this compiles as there is a possiblity of object could be Sub2 
        
        Sub1 sub1 = new Sub1();
        //Sub2 sub2 = (Sub2)sub1; //compiler knows that this reference cant happen so compiler time
        
        //I1 i1 = new Sub1();//not possible - compile time
        I1 i1 = new Sub3();
        Sub1 a = (Sub1)i1; //this compiles!! Any unrelated interface reference compiles
        Sub4 s4 = (Sub4)i1;//this compiles!! Any unrelated interface reference compiles
        Base b1 = new Sub1();
        //Sub4 s4 = (Sub4)b1;//Thsi donest compile
        
        
        //BEST PRACTICE - use instance of before cast
        //note the spelling of key word instanceof not instanceOf
        if(b1 instanceof Sub1)
        {
            System.out.println("isnatnceof not instnaceOf");
        }
        
       
    }
}