package com.krahman.oca.commonexceptions;
public class IndexOutofBound
{
    // Non compatible type or value in the index - complation error
    //compatibe type but out of bound - run time. -ve number is also runtime
    // Array - ArrayIndexOutOfBoundException
    // list (collections) - Index out of bound exception
    public static void main(String...s)
    {
        int i[] = new int[]{1,2,3,4};
       // System.out.println(i['c']);//runtime error since its a valid int
        //System.out.println(i[(byte)10]); //runtime
        //System.out.println(i[10l]);//compile time
        System.out.println(i[-10]);//runtime
        
        //same applied for collections
        
        //BEST PRACTICE - check the position for range before accessing the value
        int pos = 0;
        if(pos >=0 && pos < i.length)
        {
            System.out.println(i[pos]);
        }
    }
    
}