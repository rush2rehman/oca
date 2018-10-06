package com.krahman.oca.inheritance;

//usage of this in interface default context - which is not static
interface I1
{
    int age = 10;
    String test();
    default void printDetails()
    {
        System.out.println(this); //refers to the current object which executes this line of code
        System.out.println(this.age);
        //System.out.println(super.age);//cant use here
        System.out.println(this.test());
    }
}

public class ThisAndSuper implements I1
{
    public static final int age = 20;
    public static void main(String...s)
    {
        ThisAndSuper ts = new ThisAndSuper();
        ts.printDetails();
        System.out.println(age);
        //System.out.println(this.age);//this and super cannot be used in the static context
         //System.out.println(super.age);
         new C2().print();
    }
    public String test()
    {
        System.out.println("I am in the test implementation");
        System.out.println(I1.age); //Super will not work as this is interface static variable and has to be access with <interfaceName>.<varName>
        System.out.println(this.age);
        return "";
    }
}

//Usage of super in class inheritance
class C1
{
    int i = 0;
    String name = "C1";
    void test()
    {
        System.out.println("I am in C1");
    }
}

class C2 extends C1
{
    String name = "c2";
    void test()
    {
        System.out.println("I am in C2");
    }
    void print()
    {
        System.out.println(i);
        System.out.println(this.name+"  "+super.name+"  "+name);
        this.test();
        super.test();
        
    }
}