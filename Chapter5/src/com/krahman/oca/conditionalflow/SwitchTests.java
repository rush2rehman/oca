package com.krahman.oca.conditionalflow;
public class SwitchTests
{
    static public void main(String s[])
    {
        /*Switch statements accepts arguments and expressions of following types
        * int, byte, short, char, String, Integer, Short, Byte, Charecter, enum
        * And it does .equals comparison not reference comparison
        * No float, double , Float and Double - to be clear
        */
        
        /*
        Here are the rules for a switch statement:
        1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. (String is allowed only since Java 7). 
        2. The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
        3. The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535.
        4.  All case labels should be COMPILE TIME CONSTANTS. 
        5. No two of the case constant expressions associated with a switch statement may have the same value.
        6. At most one default label may be associated with the same switch statement.
        
        GOLDEN RULE:
        1. Continue can only happen within a loop. If there is a standalone switch - it cant have a continue. It has to be part of a loop. If the continue has a atrger - even that needs to be a loop.
        2. Break can only happen within a loop or switch statemnt. If dooesnt allow break. Ig break has a target label, then the target need not be a loop. It can be anyof the valid stuff to break out from
            1. Curly brace code block
            2. Loops - do, while, for
            3. If and switch
            4. expression
            5. return statement
            6. try block
            7. Return statement
            8. Assignments
            
            Declarations outside the curly braces cant be labelled
        
        
        */
        int marks = 10;
        //test1:
        for (int k=0; k<5; k++)
        {
            switch (marks){
            case 10: System.out.println(10);
                //break;
                //continue; //this will not compile
                    if(k==2)
                    {
                        continue;
                    }
            case 20: System.out.println(20);
                break;
            default : System.out.println("default");
                break;
        }
        }
        
        //expression
        TEST2 :
        for(int i =0; i<10;i++)
        {
            if(i==5)
                continue TEST2;
        }
       
        System.out.println("test");
        int subjects = 2;
        
      
        switch(marks/subjects){
            case 5:System.out.println(5);
            case 10:System.out.println(10);
            default: System.out.println("default");//break is not mandatory
        }
        
        //invalid input type
        /*double subjectsD = 2;
        switch(marks/subjectsD){
            case 5:System.out.println(5);
            case 10:System.out.println(10);
            default: System.out.println("default");//break is not mandatory
        }*/
        
        //Cant pass a null argument
         /*Integer subjectsI = null;
        switch(subjectsI){//null pointer exception
            case 5:System.out.println(5);
            case 10:System.out.println(10);
            default: System.out.println("default");//break is not mandatory
        }*/
        
        //Unboxing works with widening allowed
        Byte subjectsI = 10;
        switch(subjectsI){
            case 5:System.out.println(5);
            case 10:System.out.println(10);
            default: System.out.println("default");//break is not mandatory
        }
        
        //CASE Value to be compile time constant
        /* 1.Value should be known at the compile time
        *  2.b+c not allowd, 10*7 is allowed
        *  3.b+c is allowed provided b and c are final variables and been initiated as part of teh declaration * itself. Not after teh declaration
        *  4.Case value should match the switch expression type
        * 5. Cant be null
        */
        int a=10, b=20, c=30;
        final int a1=11, a2=20, a3;
        
        a3 = 15;
        
        switch(test())//can accept methods (as like ternery)
        {
            case 10:
                System.out.println(10);
            case 1*3:
                System.out.println(3);
            /*case b:                       //doesnt work
                System.out.println(b);
            case b+c:                       //doesnt work
                System.out.println(b+c);*/
            case a1:                        //if this value was 10, it wasnt compiling as this value is already defined!!!!
                System.out.println(a1);
            case a2+a1:
                System.out.println(a2+a1);
            /*case a3:                        //doesnt compile as the initialization of final var happened afetr declaration
                System.out.println(a3);
            */
            case (byte)22: //workds this is assignable to int - widening
                System.out.println(10);
            /*case 25L: //doenst work as its narrowing, cant be assigned
                System.out.println(25);
            
            case null:                      //null doesnt work
                System.out.println(null);
                */
            case 18: //can have empty instructions for a case
            case 19:
                
        }
        
        //this is not compile time constant
        final Integer iObj11 = new Integer(11);
        Integer iObj = new Integer('c');//method param widening
        //Character aObj = new Character(10);//doesnt work because of method param doesnt allow narrowing
        
        switch(iObj)
        {
                //this doesnt work because 'c' can be boxed into only a Character obj. Or the Integer cant be unboxed to char
            //case 'c':
                //this works as this can be boxed- or the Integer can be unboxed to integer
            case 10:
                //this wont compile again
            //case (byte)10:
        }
        
      switch(Integer.parseInt(s[1]))  //1
       {
          case 0 :
             System.out.println("I am here in 0");
             boolean b1 = false; 
             break;
     
          case 1 :
             System.out.println("I am here in 1");
             b1 = true; //2
             break;
       }
       
       //if(b1) System.out.println(s[2]);
  
            
        
    }
    
    private static int test()
    {
        return 10;
    }
    
    
  }