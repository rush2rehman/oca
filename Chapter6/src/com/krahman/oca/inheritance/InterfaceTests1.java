package com.krahman.oca.inheritance;

//Implementing multiple Interfaces
//With same constant names
//So the rule of thumb for static member inheritance is that - it is not inherited. But you can redefine it. Once you redefine, with teh reference of the parent class object, or with parent class ie=tself you can access the original static member. When you access the subclass reference - then subclass specific implementation/value will be provided. In case of Interfaces, static methods are only going to be accessible via interface reference - not by any object reference.
//Just see this as static members are closely tied to the class or interface its defined - not inherited. when extended/implemented static members are visible without prefix unless there is any ambiguity. But doesnt mean those are inherited.
//But a instance member - once overridden or hidden, not going to be available via parent obj reference also
interface I1{
    String name = "I1";
    String i = "";
    String test = "I1 static member";
}
interface I2{
    String name = "I2";
    double i = 0.0;
}

class C1 implements I1,I2
{
    public static final String name = "in sub class";
    String test;
    //public static final String i = "";
    static void test()
    {
        //Variable is not used - no compilation error. but once used, if not clear ambiguous
        //System.out.println(name);//Ambiguous - compilation error-this is prior to declaring variable that hides teh interface variable
        System.out.println(I1.name);//cant use super here - not only because its static context, because interface static variables simply not available thorugh super
        System.out.println(I2.name);
        System.out.println(name); //prints its own value
        //System.out.println(i); //even when the data type is different ambiguous
        //System.out.println(test); instance variable test hides the static variable, so compilation error that instnace variable being referred in teh static context
        System.out.println(I1.test);
        
    }
}


//Implementing two interfaces with same abstract method name
//If the signatures are same - go ahead and override
//If the signatures are overloadable - go ahead and implement teh same
//else you cant inherit
interface I3{
    void test();
    //int test1();
    int test1(int i);
}
interface I4{
    void test();
    //double test1();
    double test1();
}
class C2 implements  I3, I4
{
    public void test(){}; //Imlements methods from all the interface - methods are identicals
    //public int test1(){    }//It cant be implemented in overloaded fashion
    //public double test1(){}//
    public int test1(int i){ return 0;   }//works as this fits in overloading
    public double test1(){ return 0.0;   }
}

//Implementing two interfaces with same name default methods
//If the signatures are same - problem - you cant inherit two implementations of same problem
//You can choose to implement your own method to override. Thsi will solve the problem
//If teh signatures are overloadable - no issues. You can optionally override one or both methods
//If teh signatures are different but not overloadable - wont compile
interface I5{
    default int test(){return 0;}
   // default Object test1(){return null;}// not overloadable
}
interface I6{
    default int test(){return 0;}
    //default String test1(){return null;}
}

//class C3 implements I5, I6{}//compilation issue
class C3 implements I5, I6{ //works as we have overridden
    public int test(){return 1;}
}

//Implementing two interfaces with same static methods
//No issues of any sort as teh static methods are not inherited
interface I7{
    static int test(){return 0;}
   // default Object test1(){return null;}// not overloadable
}
interface I8{
    static int test(){return 0;}
    //default String test1(){return null;}
}

//class C3 implements I5, I6{}//compilation issue
class C4 implements I7, I8{ //works as we have overridden
    static int test(){return 0;} //not overridded, just a new definition-class compiles without this also
}
   
public class InterfaceTests1{
    
    public static void main(String...s)
    {
        System.out.println(I1.name);
        C1.test();
        
    }
   
}