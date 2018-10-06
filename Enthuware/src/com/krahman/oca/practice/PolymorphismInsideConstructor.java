package com.krahman.oca.practice;
public class PolymorphismInsideConstructor
{
    public static void main(String[] args){
      A a = new B(); 
        /*when constructor is recursively called
        Step 1: Super - Static initialization and block in the order they appear
        Step 2: Base - Static initialization and block in the order they appear
        Step3 : Super -Instance var initialization and instance blocks execution in teh order of appearance
        Step4 : Base -Instance var initialization and instance blocks execution in teh order of appearance
        Step5 : Super constructor
        Step6 : Base constructor
        Now: in Step3, there is a non private method invocation which will go through run time polymorphism
        So the Class Bs print will be invoked. Further, var i's initialization hasnt happened yet as Step4 is yet to happen. So it will have 0 value now.
        */
      a.print();
   }
}
class B extends A{
   int i =   4;
   void print() { System.out.println(i); }
}


class A{
   A() {  print();   }
   void print() { System.out.println("A"); }
}
