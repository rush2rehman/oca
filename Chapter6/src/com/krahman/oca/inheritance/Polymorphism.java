package com.krahman.oca.inheritance;
/*
* Polymorphism with classes
* during the run time, depending upon the underlying concerete class, behaviour can be different.
* This is achicved using overriding
* Overloading is not polymorphism
* Variables are bound to the reference during compile time - so no polymorphism
* Rules for overriding
    1. Access modifier cant be lowered
    2. Return type should be same or a assignable subclass
    3. Method name and params need to be the same
    4. static methods cant eb overridden
*/

class Fruit
{
    String category = "A";
    void test()
    {
        System.out.println("I am a fruit");
    }
}
class Banana extends Fruit
{
    String category = "B";
    void test()
    {
        System.out.println("I am a Banana");
    }
}
class Mango extends Fruit
{
String category = "C";
    void test()
    {
        System.out.println("I am a Mango");
    }
}



public class Polymorphism
{
    public static void main(String...s)
    {
        Fruit f[] = new Fruit[]{new Fruit(), new Banana(), new Mango()};
        for(Fruit fruit:f)
        {
            fruit.test(); //polymorphism, run time evaluation
            System.out.println(fruit.category); //compile time binding - so no polymorphism
        }
    }
}