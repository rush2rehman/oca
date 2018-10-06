package com.krahman.oca.conditionalflow;
import java.util.*;
public class ForLoopTests
{
    public static void main(String...s)
    {
        //********FOR LOOP ******
        //Initialization block
        for (int i=0, j=10;;)  //variables of a single type
        {
            break; //breaking infinite loop
        }
        //Any thing can be declared and initialized
        //Any number of statements comma seperated !!
        for(Object d=100;;System.out.println(""),System.out.println(""),d.toString())
        {
            break;
        }
        
        long l = 0;
        long l1= 30;
         for (l=20,l1=30;;) //you can use the variables outside teh loop, but should have an initiation statement, otherwise no point in including and its a compile time error to simply have (l,l1;;;)
        {
            break; //breaking infinite loop
        }
        //Termination Condition - an evaluation executed everytime before the for loop code block
        for(;l>20;)
        {
            
        }
        //Update Clause
        //It has to be a valid statement, not a declaration of a variable
        //this part is executed after all the lines of the for loop block is executed
        for(int i=0, h=1; i!=2; i++,System.out.println("happy"),System.out.println(new Integer(10)), h=30 )
        {
            System.out.println("Loop Variabe"+i);
        }
        //A method can also be invoked
         for(int i=0; i!=2; i++, test() )
        {
            System.out.println("Loop Variabe"+i);
        }
        //Optional nature of if loop constructs
        //cant miss a semicolon
        for(;;)
            break;
        for(;;test())
            break;
        for(;l<0;)
            break;
        
        //Nested For loops
        //typically for multi dimentional array initialization or manipulation
        int multiArr[][] = new int[3][4];
        for(int i=0; i<multiArr.length ; i++)
        {
            for(int j =0; j<multiArr[i].length; j++)
            {
                System.out.println("i="+i+" "+"j="+j);
                multiArr[i][j]=1;
            }
        }
        
        //***ENHANCED FOR LOOP or FOR EACH LOOP
        /*
        * passses the ref value, hides the iterator. So while the object can be accessed and modified via * * teh reference, removing the object is not possible
        * Incase of primitives, since the copy of the value if passed - cant event modify
        * Good candidate for iterating over collections and arrays. 
        * Limitations : 
        * 1. cant have multiple collections or arrays in a single loop like how for loop can do with 
        * multiple  variables declared and used. However this can be done using nested loops
        * 2. Cant delete or remove an item as you dont have the iterator handle
        * 3. Cant use it for initializing or modifying an array of primitive type
        */
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("1");
        aList.add("2");
        System.out.println(aList.size());
        for(Iterator i = aList.iterator(); i.hasNext();)
        {
            System.out.println(i.next());
            i.remove();
        }
        System.out.println(aList.size());
         aList.add("3");
        aList.add("4");
        //in the enhanced for loop there is no handle to iterator
        for(String s1: aList)
            System.out.println(s1);
        //We can define a variable outside the loop and try directly invoking list methods. But it dfeats the purpose of teh enhanced for loop
        //Nested array list
        ArrayList<String> innerList = new ArrayList<>();
        innerList.add("A");
        innerList.add("B");
        ArrayList<ArrayList<String>> outerList = new ArrayList<>();
        outerList.add(aList);
        outerList.add(innerList);
        
        for(ArrayList<String> arrList: outerList) //note teh ArrayList generic declaration here
            for(String b: arrList)
                System.out.println(b);
        
        //Modifying a primitive inside enhanced loop
        int[] iArray = {0,1,2,3,4,5};
        for(int i:iArray)
        {
            i++; //just updates the copy
            System.out.println(i);
        }
        for(int i:iArray) System.out.print("-->"+i);
        
        //Nullifying the reference doesnt impact the original array, collection
        for(String inner:innerList)
            inner = null; 
        System.out.println(innerList);
    
        //Modifying works as the underlying object is updated for the same refrence
        ArrayList<StringBuilder> sb = new ArrayList<>();
        sb.add(new StringBuilder("1"));
        sb.add(new StringBuilder("2"));
        for(StringBuilder sb1:sb)
            sb1.append("test");
        System.out.println(sb);
        
        //Nested enhanced for loop
        for(int[] iArr:multiArr)
            for(int i: iArr) //using the handle from the outer loop i optionally, we can choose any other   
                                    //collection or array to loop here
            System.out.print("-->"+i);
    
        
        
    }
    
    private static void test()
    {
        System.out.println("I am a static method");
    }
}