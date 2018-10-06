package com.krahman.oca.commonexceptions;
import java.util.*;
public class NullPointer
{
    Integer iObj;
    String s = null;
    static ArrayList<String> sArray;
    int[] iArr;
    int[] iArr1 = new int[2];
    Integer[] iArrObj;
    Integer[] iArrObj1 = new Integer[2];
    
    public static void main(String...s)
    {
        //Scenario 1 - members/static of reference variable [All member/static variables are initialized to thier default value by default]
        NullPointer np = new NullPointer();
        System.out.println(np.iObj);//prints null
       // System.out.println(np.iObj.intValue());//null pointer exception
        System.out.println(np.s);//prints null
       // System.out.println(np.s.length());//null pointer exception
        System.out.println(sArray);//prints null
        //System.out.println(sArray.add(""));//null pointer exception
         
        //BEST practice - check null before accessing values
        
        //Scenario 2 - accessing method local variables - not initialized. But this is not true for arrays that are declared with size - default values are assigned anyways
        String sLocal;
        //System.out.println(sLocal);//Compile time failure
        
        //Scenario 3 -Accessing Arrays
        int[] iArrLocal;
        int[] iArrLocal1 = new int[2];
        Integer[] iArrObjLocal;
        Integer[] iArrObjLocal1 = new Integer[2];
        
        System.out.println(np.iArr);
       // System.out.println(np.iArr[0]);//null pointer exception
         System.out.println(np.iArr1);
       System.out.println(np.iArr1[0]);
        System.out.println(np.iArrObj);
       //System.out.println(np.iArrObj[0]);//null pointer
        System.out.println(np.iArrObj1);
       System.out.println(np.iArrObj1[0]);//null pointer
        
        //System.out.println(iArrLocal);//Compiler error
        //System.out.println(iArrLocal[0]);//Compiler error
        System.out.println(iArrLocal1); 
       System.out.println(iArrLocal1[0]);//0
       // System.out.println(iArrObjLocal);//Compiler error
       //System.out.println(iArrObjLocal[0]);//Compiler error
        System.out.println(iArrObjLocal1);
       System.out.println(iArrObjLocal1[0]);//even though method local, array is initialized to null
        
        //Scenario 4 - Multi dimetinal array
        //empty array
         int[] iArrayEmpty = new int[0];//valid zero size array 
        //System.out.println(iArrayEmpty[0]);//throws ArrayOutOfBoundException
        
         String[][] sMultiArr = new String[][]{
            {"","",""},
            {}, //0 size array!! This has a valid reference. No elements though 
            null, //null not equal to zero size array.
            new String[10]
        };
        
       
        System.out.println(sMultiArr[1]); //valid object
       // System.out.println(sMultiArr[1][0]); //throws index out of bound exception
        System.out.println(sMultiArr[2]);//prints null
        //System.out.println(sMultiArr[2][0]);//null pointer exception
        
        
        
    }
}