package com.krahman.oca.autoboxing;
import com.krahman.oca.primitive.*;
import java.util.*;
public class AutoBoxingTest
{
    /*
    1. parseXXX methods always return primitive
    2. String arguments always look for can insensitive true - if present - true. any otehr string false
    3. ValueOf and autoBoxing retruns precreated objects(static classes inside wrapper classes in case of Boolean)
    AutoBoxing RULES
    ================
    1. Only the exact primitive type is allowed for auto boxing, except for assignments where narrowing allowed for constant values(and final var ). No widening is supported in any autoboxing.
    
    Unboxing Rules
    ==============
    1. int, short, byte, long, double , float : Any of this six value can be to any value 
    2. Boolean can be unboxed only to boolean
    3. Character can be unboxed to char, int, long, double and float
    */
    byte bb =0;
    //Integer ii =  bb;//cant widen
    //Integer bb = (byte)0;
    Integer ii = 0;
    //Integer ii1 = 0l;//cant narrow
    Byte bb1 = 10;//narrowing with compile time value
    //Long ll = 0;//cant widen
    Short ss1 = 1;
    Character cc2 = 100;
    
    int ii1 = bb1;
    //boolean b = bb1;//not allowed in compile time
    float ff1 = bb1;
    double dd1 = bb1;
    double dd3 = ss1;
    int ii5 = cc2;
    //short ss4 = cc2;
    double ss4 = cc2;
    long ll5 = cc2;
    Boolean bb9 = true;
   
    
    
    
    
    
    
    
    Boolean b = true;
    Boolean b1 = new Boolean(true);
    Boolean b2 = new Boolean("TRue");
    Boolean b3 = Boolean.valueOf(true);
    Boolean b4 = Boolean.valueOf("TRUE");
    boolean b5 = b;
    
    Character c = 'a';
    Character c1 = new Character('a');
    //Character c2 = new Character("a");
    Character c3 = Character.valueOf('a');
    //Character c4 = Character.valueOf("a");
    Character c5 = c;
    
    Integer i = 10000;
    Integer i1 = new Integer(20);
    
    public static void main(String s[])
    {
        
        
        AutoBoxingTest abTest = new AutoBoxingTest();
        MyPrimitiveClass mp = new MyPrimitiveClass();
        System.out.println(abTest.ii5);
        System.out.println(abTest.b+""+abTest.b1+""+abTest.b2+""+abTest.b3+""+abTest.b4);
        System.out.println(abTest.c+""+abTest.c1+""+abTest.c3);
         System.out.println(abTest.i.byteValue()+abTest.i1.intValue()+20);
        System.out.println(Boolean.parseBoolean("TRue"));//this always returns a primitive
        System.out.println(Double.parseDouble("100F"));
        double d = 100L;
        System.out.println(abTest.b==abTest.b1);
        System.out.println(mp.equals(abTest));
        
        Double d1 = 10.0;
        System.out.println(d1.compareTo(10.1));
        
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(90D);
        list.add(100.0);
        Double total = 5.0;
        //The following must compile!!!!
        Number total1 = 5.0;
        Object total2 = 10l;
        //double total1 = 5;
        double a5 = 10;
        float f = 10;
        for(Double d5 : list)
        {
            total += d5;
        }
        System.out.println(total++);
        
        
        Double dle = Double.valueOf(10);
        
        //COMPARISONS
        Integer iObj = new Integer(10);
        System.out.println("Unboxing for comparison-->"+(iObj == 10)); //this will return true as Integer can be unboxed to int value
        Character cObj = new Character((char)10);
        System.out.println(iObj == 'c');//compile time error
        //There is a empty constructor for implicit empty string
        //length is a property for array
        //length is a method for String
        //Size is for collection
        //reverse is not in string only in stringbuilder
        String s1 = new String();
        System.out.println(s1.concat("test"));
        System.out.println(s1.length());
        ArrayList<String> s2 = new ArrayList<>();
        System.out.println(s2.size());
        String[] s3 = new String[1];
        System.out.println(s3.length);
        
        
    }
}