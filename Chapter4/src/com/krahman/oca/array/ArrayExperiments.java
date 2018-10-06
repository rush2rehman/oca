package com.krahman.oca.array;
public class ArrayExperiments
{
    
    static public void main(String...s)
    {
        
        System.out.println("test");
        //Array Declaration
        int[] i;
        int i1[];
        int[] i2[];
        int[][] i3;
        int i4[][];
        //int i5[4]; //Size not allowed here
        
        //Array Allocation
        i = new int[2];
        i2 = new int[1][3];
        i3 = new int[2][];
        //i4 = new int[][3];//wont compile
        //System.out.println(i3[1][0]);//null pointer exception
        System.out.println(i3[1]);// null response
        
        int x=1,y=2;
        i4 = new int[3*4][];
         i4 = new int[x*y][];
         i4 = new int[Math.max(2,3)][];//Any expressition that can result in integer
        
        //Array Initialization
        i[0] = 0;
        i[1] = 1;
        //i[-10]=1;//only run time exception
        //i[1.5]=1;//compile time error
        //i[1L] = 1;//only an integer is accepedted
        i[(byte)1] = 1;
        
        //Declation, allocation and initialization together
        int i5[][] = {  {1,2}, {2,3},   null  };
        int i6[][] = new int[][] {  {1,2}, {2,3},   null  };
        //int i7[][] = new int[3][] {  {1,2}, {2,3},   null  };//Compile time error because of size
        
       // i6 = {  {1,2}, {2,3},   null  };//compiler error as this cant ve done without new keyword
        i6 = new int[][]{  {1,2}, {2,3},   null  };
        
        //Asymmetric multi dimentional arrays
        int i7[][] = {{1,2,3},null, {1,2}};
        System.out.println(i7[0]+" "+i7[1]+" "+i7[2]);//obje ref are printed
        //System.out.println(i7[0][0]+" "+i7[1][0]+" "+i7[2][0]);//middle one produces null pointer exception
        
        System.out.println(i7[0][0]+" "+i7[2][0]);
        
        //length is a public variable - immutable
        System.out.println(i7.length+" "+i7[0].length);
        int i8[][] = i7.clone();
        
        
    }
}