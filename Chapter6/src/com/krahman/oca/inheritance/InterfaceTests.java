package com.krahman.oca.inheritance;


//Interface Definition
//Top level Interface cant be protected or private
//Interface methods are "implicitly" public abstract unless preceded with default key word or follwed by {}
//Interface variables are "implicitly" public static final - constants. Needs to be instialized in //interface
interface Ibase1{}
interface Ibase2{}

//could have added public in front instead of default scope
strictfp abstract interface Isub1 extends Ibase1, Ibase2
{

}

//ACCESS MODIFIERS for the interface and its members
//Top level interface - public and default
//Interface members - variable, methods, inner interfaces, inner classes - only public
interface I1
{
     //private int i = 0;//will not compile
      int i = 0; //works but imlicitly public not default scope
     //private void method1();
      void method1();
     //private interface Interface{};
    interface Interface{} //no need of ; at the end - not a variable declaration
     static interface Interface1{}
     class innerClass{     }
     static class innerClass1{}
}

//NON ACCESS modifiers
//only abstract and strictfp are allowed for top level interface
//members might take other non access modifers depending upon what type of member it is.
 abstract strictfp interface Isub2{}


//Types of Interface methods
//abstract methods - plain old. 
//default - if we have to introduce default implementations without bothering all the classes that have //implemented this interface
//static - if we want to avoid having to have utility classes just to host utility methods. Include them in //respective interfaces
interface Isub3
{
    int i = 0;
    abstract void aMethod(); //abstract key word is optional
    default void dMethod()
    {
        System.out.println("---->"+i);
    }
    static void sMethod(){} //this static method can only be accessed usin the interface class. Not using any implemnting instance/class refernece . This is very different from abstract class static methods and variables. Abstract class static members can be accessed using abstract class , subclass instance, abstract reference var pointing to a concrent implementation class instance
    
}
abstract class aClass1{
     static void aMethod1(){}
}

class Class3 extends aClass1 implements Isub3 //extends and implements cant change the order
{
    int i = 100;
    public static void main(String s[])
    {
        Isub3.sMethod();
        Class3 c = new Class3();
        //c.sMethod(); //cant be accessed via object references
        Isub3 i = new Class3();
        //i.sMethod(); ////cant be accessed via object references
        aClass1.aMethod1();
        //i.aMethod1(); //Interface reference is not aware of base or inheritance details
        c.aMethod1();
        aClass1 a = new Class3();
        a.aMethod1();
        
        c.dMethod();
    }
    public void aMethod(){}
    static void aMethod1(){}
    public void dMethod()
    {
        System.out.println(i+10+"---");
    }
}

//Implementing a single interface
//Rule 1: Any over ride of interface cannot be anything other than public. Thats is because Interface cant have any member other than the public one
//Variable hiding works based on the context of reference: Interface reference, direct interface acccess - from interface, subclass reference - from subclass
//Implement Abstract methods
//Explict public needed, same rules as over riding 1) exact method name and arg list. return type can be a subclass of the original - but not unrelated. access privilage cant be lowered.
//Implement default methods - same overrriding rules. Overriding is optional. Once overridden, default implementation is not available even through the Interface reference
//Static members are overridden. You can define the same statci method in the subclass. But its not overriding. 
interface I4{
    public static final int i = 10;
    Object method();//public abstract is implicit
    default int dMethod()
    {
        return 255;
    }
    static Integer sMethod(){
        return new Integer(1);
    }
}

class Class5
{
    static String test12(){return "I am in Class5";}
}

class Class4 extends Class5 implements I4
{
    public static final int i = 20;
    //public int method(){}//return type not compatible
    public String method(){return null;}
    public int dMethod(){ return 10; } //no keyword default here
    //public char dMethod(){ return 10; } //no primitve value narrowing/wideinig in overriding
    static Integer sMethod()
    {
        return new Integer(12);
    }
    static String test12(){return "I am in class4";}
}



public class InterfaceTests
{
    //abstract void test(); cant dfine an abstract method in concrete class
    public static void main(String s[])
    {
        Class5 c5 = new Class4();
        Class4 c4 = new Class4();
        I4 i4 = new Class4();
        System.out.println(I4.i + " "+ c4.i +" "+i4.i);//
        System.out.println(c4.dMethod()+" "+i4.dMethod());//Once overriden default behaviour will not be available
        System.out.println(I4.sMethod() + " "+c4.sMethod());
        //System.out.println(i4.sMethod());//compiler error as the interface static method can't be accessed this way
        System.out.println(Class5.test12() + " "+c5.test12()+" "+c4.test12());
        
        Class3 c3 = new Class3();
        c3.dMethod();
    }
}






