package com.krahman.oca.inheritance;
public class InheritanceWithClasses
{
    /*
    *Benefits:
    *1. Smaller derived class definition
    *2. Ease of modification to common properties and behavior
    *3. Extendability
    *4. Use tried and tested class from a base class
    *5. Concentrate on the specialized behaviour of your class
    *6. Logical structures and grouping
    */
    /*
    *1. Derived class doesnt inherit the constructor, but it can call teh constructor which is visible 
    *   through super key word inside the constructor as a first statement.
    *2. When to go for abstract class : when the base class doesnt represent a real (world) entity but it 
    *   provides the necessary abstraction for the sub classes to inherit - go for abstract class. It will 
    *   never be instantiated but it can have concrete methods.
    *3. Subclass creating a same variable - hiding. Same method - overriding
    *4. All abstract methods need to be overridden in the subclass
    *5. If all the abstract methods are not overridden, then the subclass also need to be abstract
    */
    //What are the rules for overloading, overiridng, and implementing??????
    
}