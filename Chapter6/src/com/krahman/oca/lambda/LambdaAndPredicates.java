package com.krahman.oca.lambda;
import java.util.function.*;
import java.util.*;
/*
* Lambda was intriduced to bring in the functional style of programming in Java
* Bit of readability is gone but code is very concise - focus on what to than how to do
* ***Lambda is passing the inline implementation of a functional interface****
* Lambda is about passing the behavior as param
* syntax 
    (<Type> <varName>) -> { return <expression>};
    - Type is optional
    - bracket is mandatory if you use type
    - varName is mandatory
    - -> is mandatory
    - {} and return are optional. If you have curly braces than return statement is must. If you use return statement then curly braces are must
    - <Expression> is must
*/
interface Validator
{
    boolean check(Employee e);
}

interface Print
{
    void printString();
}

interface Greeting
{
    String getGreeting();
}

class Employee
{
    int age;
    String name;
    Employee(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
}
//Instead of creating following validator implementation verbose way , lambdas can be used
class ageValidator implements Validator
{
    public boolean check(Employee e)
    {
        return e.age > 25;
    }
}

class nameValidator implements Validator
{
    public boolean check(Employee e)
    {
        return e.name.length() > 0;
    }
}
public class LambdaAndPredicates
{
    public static void main(String[] s)
    {
        Employee e1 = new Employee(18,"test1");
        Employee e2 = new Employee(27,"test2");
        Validator val1 =  new ageValidator();
        Validator val2 =  new nameValidator();
        System.out.println(val1.check(e1)+" "+ val2.check(e1));
        System.out.println(val1.check(e2)+" "+ val2.check(e2));
        
        Validator lambda1 =  e -> e.age > 25;
        Validator lambda2 =  e -> e.name.length() > 0;
        System.out.println(lambda1.check(e1) + " "+ lambda2.check(e1));
        System.out.println(lambda1.check(e2) + " "+ lambda2.check(e2));
        
        Validator lambdaTest =  (Employee e) -> {return e.age > 25;};
        Validator lambdaTest1 =  (Employee e) -> e.age > 25;
        //Validator lambdaTest2 = (Employee e) -> return e.age > 25;//error as return statement appear without curly braces
        //Validator lambdaTest1 =  Employee e -> e.age > 25;//missing bracket
        //Validator lambdaTest2 =  (Emp e) -> {e.age > 25}; //error - no return no semi colon at teh end of expression
        System.out.println(test(e1, e-> e.age>10));
        ArrayList<String> sList = new ArrayList<>();
        sList.add("one");
        sList.add("two");
        sList.add("three");
        sList.add("four");
        System.out.println(sList);
        sList.removeIf(s1->s1.equals("two"));
        System.out.println(sList);
        
        //Interface that return nothing
        Print p = () -> System.out.println("GoodMorning"); //No braces doesnt mean we are returning anything. But if the functional interface expects return value, then this will automatically include
        Print p1 = () -> System.out.println("1");System.out.println("2"); //Mutilple statements are incoorrect without braces. Thsi two gets printed on its own order
        Print p2 = () -> {System.out.println("3");System.out.println("4"); };
        //Print p = () -> {return System.out.println("GoodMorning");}; //return value is not expected 
        p.printString();
        p1.printString();
         p1.printString();
        p2.printString();
        
        
      //  Validator v1 =  e -> "test";
        Greeting g = () -> "hello";//valod as return is implicit
        
        
    }
    
    static String test(Employee e, Predicate<Employee> p)
    {
        if (p.test(e))
        {
            return "Test passed";
        }
        return "Test failed";
    }
}