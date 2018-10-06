package com.krahman.oca.inheritance;

//Extending multiple interfaces
//With same abstract method
//Same signature - no issues, subclasses will have to implement any way
//Overloadable signature - not an issue again
//Non overloadable signature - problem

interface I1
{
    void test();//no issues
    int test1();//no problem
    //int test2();//problem - not overloadable
}
interface I2
{
    void test();
    int test1(int i);
    //double test2();
}
interface I3 extends I1, I2{}

//Extending with same default method
//Same signature - problem as there are two implementation inherited for the same mthod
//If overridden - no issues. You can even access teh super interface default methods with or without super key word depending upon whether there is a ambiguity - this applies to classes implementing these interfaces
//if not overloadable - problem
/*Default method resoution
* If there is a explicit<InterfaceName>.super.<MethodName> - no confusion
* If no prefix - look up the local implementation in the class
* If there is no local implmentation - look up the immediate above hierarchy in inheritance
* If there is ambiguity, prefix with <InterfaceName>.super is a must
*/
interface I4
{
   // default void test(){}; wont compile
    default void test1(){
        System.out.println("I am in I4");
    };
}
interface I5
{
   // default void test(){};
    default void test1(){
        System.out.println("I am in I5");
    };
   
}
interface I6 extends I4, I5{
    default void test1(){
        I4.super.test1();
        I5.super.test1();
        System.out.println("I am in I6");
    };//overriding this will make it work
}

class C1 implements I6{
    public void invoke(){
        
        test1();//I6.super.test1() is optional here if we wanted to implemeny local call
        I6.super.test1();
    };
    public void test1(){//if this method had not been there, invoke will call super
        
    }
}

//Extending with multiple interfaces with same static methods 
//Static methods are not inherited
//So no concern what so ever
//Static methods in Interfaces can only be accessed with interface name prefix

interface I8
{
  static void test(){}
  static void test1(){}
}
interface I7
{
  static void test(){}
  static int test1(){return 1;}
}
interface I9 extends I8, I7{
    static double test1(){return 0;}
}


public class ExtendingInterfaces
{
    public static void main(String s[])
    {
        C1 c1 = new C1();
        c1.invoke();
        
    }
    
}