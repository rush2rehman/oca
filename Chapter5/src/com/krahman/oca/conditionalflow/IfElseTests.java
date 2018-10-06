package com.krahman.oca.conditionalflow;
public class IfElseTests
{
    public static void main(String...s)
    {
        //**IFELSE** Tricky scenarios
        //if with no lines of code
        if(false) //This doesnt complain of unreachable statement 
        {
            System.out.println("");
        }
        
        if(true){}
        else
            System.out.println("test");
        
        if(true);
        else
            System.out.println("test");
        
        //Compilation error for below - skips the if code block
        /*if(true)
        else
            System.out.println("test");*/
        
        //What out for Assignments in the if conditional expressions
        boolean b;
        if(b=true)
        System.out.println(b);
        
        if(b==false)
        System.out.println(b);
        
        //Nested If constructs - first indent from inside out to decide which else belongs to which if. Also check for else without correcponding if
        int score = 100;
        if(score>200)
            if(score<400)
                if(score>300)
                    System.out.println(1);
                else
                    System.out.println(2);    
        else
            System.out.println(3);//when we do inside out this belongs to second if
        
        
        //****TERNARY***
        /*
        *Should alwways have a variable to assign back the result
        *Condition, reponse for true, response for false - all are mandatory
        *first part has to evaluate to boolean
        *responses can only be an expressions cant be code block
        */
        //Simple example
        int discount = 0;
        int bill = 100;
        discount = (bill>100)? 10: 5;
        System.out.println(discount);
        
        //Bracket is opetional
        discount = bill>100? 10: 5;
        System.out.println(discount);
        
        //results can be expressions
        discount = bill>100? bill/10: bill/20;
        System.out.println(discount);
        
        //results can be method which return an appropriate value
        discount = bill>100? getSpecialDiscount(): getRegDiscount();
        System.out.println(discount);
        
        //Cant have a non boolean in the condition part
        //discount = bill>100? getSpecialDiscount(): getRegDiscount();
        //System.out.println(discount);
        
        //Cant leave else part
        //discount = bill>100? getSpecialDiscount();
        
        //Cant leave unassigned
        //bill>100? getSpecialDiscount(): getRegDiscount();
        
        //Cant have code blocks 
        //discount = bill>100? {bill/10}: {bill/20};
        
        //Cant have a methid which returns nothing
        //discount = bill>100? bill/10: getDiscount();
        
        //Cant have incomatible return types
        long disc=10;
        disc = bill>100? 10: 5; //This works because its wodenning
        //discount = bill>100?disc:5;//this wont
        //discount = bill>100?10L:5;
        //int d = 10l;narrowing doesnt work anything other than char, short and byte
        discount = bill>100?(byte)disc:5;//widening
        
        //Similiarly reference compatibility with widening is checked
        //Long discountL = bill>100?new Integer(10):new Integer(1);
        
        //Nested Ternery
        discount = bill>90?(disc>10)?25:15:5;
        System.out.println(discount);
        
        //Effective indenting for nested ternery
        discount = bill > 90 ?
                        disc > 10 ?
                             25
                             :15
                        :5;
                         
            
    }
    
    
    private static int getRegDiscount()
    {
        return 10;
    }
    private static int getSpecialDiscount()
    {
        return 20;
    }
    private static void getDiscount()
    {
        return;
    }
    
    
    
}