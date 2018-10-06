package com.krahman.oca.arraylist;
import java.util.*;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;
public class ArrayListExamples
{
    static public void main(String[] s) 
    {
        //****ARRAYLIST CREATION****
        ArrayList<String> stringList = new ArrayList<>();//Default capacity 10
        ArrayList<String> strList = new ArrayList<String>(11);//String in the right hand side is redundant but works, initial capacity can be passed
        //ArrayList<String> strList1 = new ArrayList<String>(-11);//Throws a run time error
        
        //****ARRAYLIST - ADDING ELEMENTS - array is recreated with new size and copied internally ***
        ArrayList<Integer> iList = new ArrayList<>(20);
        iList.add(10);//Boxing as this method expects Integer
        //iList.add((byte)10);//Boxing will restrict you from exactly changing the primitive type
        iList.add(new Integer((byte)11));//method param ivocation with widening
        iList.add(new Integer(13));
        iList.add(2,12);//Adds at position 2
        System.out.println(iList.toString());
        
        //****ACCESSING ELEMENTS***
        //Enhanced for loop - cant remove an element
        for(Integer i: iList)
        {
            System.out.println(i);
        }
        //Iterator or List Iterator can be used.
        Iterator iterator = iList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
        ListIterator listIterator = iList.listIterator();
        System.out.println(iList.size());
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
            //Once next or previous is called, we have a handle to remove or set or add. 
            listIterator.remove();
        }
        System.out.println(iList.size());
        
        
        //***MODIFYING ELEMENTS***
        ArrayList<String> sList = new ArrayList<>(15);
        //sList.set(1,"1");//throws run time error as there was no element at 1 before
        sList.add(new String("zero"));
        sList.add("one");
        sList.add("two");
        sList.add(2,"one.five");//adds while shifting the existing element to next position
        System.out.println(sList);
        sList.set(2,"1.5");//removes the current element and sets the new value
        System.out.println(sList);
        
        //*** DELETING ELEMENTS***
        sList.remove(1);
        System.out.println(sList);
        sList.remove("1.5");//removes the first occurent, since it is a pooled string, reference matched
        System.out.println(sList);
        sList.remove(new String("zero"));//String has the equals method implemented
        System.out.println(sList);
        
        ArrayList<StringBuilder> sbList = new ArrayList<>();
        sbList.add(new StringBuilder("zero"));
        sbList.add(new StringBuilder("one"));
        sbList.add(new StringBuilder("two"));
        System.out.println(sbList);
        sbList.remove(new StringBuilder("zero"));//String builder hasnt got the equals method implemented, just inherits the Object classes equals method which is ref check only
        System.out.println(sbList);
        
        
        //******Adding multiple elements****
        
        ArrayList<StringBuilder> sbList1 = new ArrayList<>();
        sbList1.add(new StringBuilder("three"));
        sbList.addAll(sbList1);
        System.out.println(sbList);
        sbList.addAll(1,sbList1); //adds all elements starting from 1
        System.out.println(sbList);
        
        //***CLEARING AN ARRAYLIST***
        sbList1.clear();
        System.out.println(sbList1);
        
        //** Acceessing individual array list****
        //get and length
        System.out.println(sbList.get(1));
        System.out.println(sbList.size());
        //contains, indexOf, lastIndexOf - depends upon the equal method implementation
        System.out.println(sbList.indexOf(new StringBuilder("three")));
        StringBuilder sbTest = new StringBuilder("test");
        sbList.add(sbTest);
        System.out.println(sbList);
        System.out.println(sbList.contains(sbTest));
        System.out.println(sbList.indexOf(sbTest));
        
        //**CLONING ARRAYLIST - Shallow copy - object references are copied , no cloning of objects
        ArrayList<StringBuilder> anotherRef;
        anotherRef = sbList;
        ArrayList<StringBuilder> clonedList = (ArrayList<StringBuilder>)sbList.clone();//Explict cast
        StringBuilder val1 = sbList.get(0);
        StringBuilder val2 = anotherRef.get(0);
        StringBuilder val3 = clonedList.get(0);//all three refer to the same obj
        System.out.println(val1==val2);
        System.out.println(val2==val3);
        
        //***Creating an Array from Array List - Only a copy is given, but references are still teh same
        StringBuilder[] sbArray = new StringBuilder[sbList.size()];
        sbList.toArray(sbArray);
        for(StringBuilder s1: sbArray)
        {
            System.out.println(s1);
        }
        
        StringBuilder[] sbArray1 = new StringBuilder[2];
        
        List<StringBuilder> arrayBackedList = Arrays.asList(sbArray1);       
        
        
    }
}