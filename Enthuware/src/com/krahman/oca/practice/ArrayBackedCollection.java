package com.krahman.oca.practice;
import java.util.*;
public class ArrayBackedCollection
{
    public static void main(String...s)
    {
        Integer[] iArr = new Integer[]{1,2,3,4};//auto-boxing
        List<Integer> iList = Arrays.asList(iArr);
        //iList.add(1); //Unsupported operation run time expression
        
        Integer y = 0;
        List<Integer> iListRegular = new ArrayList<>();
        iListRegular.add(1);
        iListRegular.add(2);
        iListRegular.add(3);
        //iListRegular.removeIf(y->y.intValue()==2);//Lambda doesnt have a scope on its own like methods. Shares teh scope with method. You cant reuse a existing variable. 
        iListRegular.removeIf(x->x.intValue()==2); //No loop needed automatically removes anything matches teh condition. You cant do this with ArrayBacked Collections
        System.out.println(iListRegular);
        //System.out.println(x);//Lambda variable is only available within labda expression
        
        
        
        
    }
}