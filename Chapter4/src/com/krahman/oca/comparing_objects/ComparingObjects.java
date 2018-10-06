package com.krahman.oca.comparing_objects;
public class ComparingObjects
{
    public static void main(String s[])
    {
        Employee e1 = new Employee("Rahman",30);
        Employee e2 = new Employee("Rahman",30);
        Employee e3 = new Employee("Rahman",30);
        System.out.println(e1.equals(null));//Null shoudl return false
        System.out.println(e1.equals(e1));//reflecive
        System.out.println(e1.equals(e2));//symmetric
        System.out.println(e2.equals(e1));//symmetric
        System.out.println(e1.equals(e3));
        System.out.println(e2.equals(e3));//Transitive
    }
    
    
    
}

class Employee{
    private String name;
    private int age;
    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    //Exactly over ride this method else this is just a overridden method wont be used by impicit comparisions
    //Nothing should be modified inside the method
    //Should not depend upon an variable which will impact teh consistency of teh result
    //If you override equals, override hash code as well
    public boolean equals(Object o){
        //Null check is must
        if(o == null)
        {
            return false;
        }
        if(o instanceof Employee)
        {
            Employee e = (Employee)o;
            return (e.name.equals(this.name) && e.age == this.age);
        }
        else
        {
            return false;
        }
    }
}