package com.krahman.oca.practice;

 class tricky {  
    public static void main(String[] args) { 
        int x = 10, y = 20;        
        int dx, dy;      
        Short k = 9;
        //Double d = 10;
        byte b = 9;
        Byte b1 = 9;
        //Long l = 9;
        Integer i1 = 9;
        System.out.println(i1==b);//unboxing works for all types
        
        try{            
            dx = x % 5;            
            dy =  y/dx;         
        }
        catch(ArithmeticException ae)
        {            
            System.out.println("Caught AE");             
            dx = 2;             //if uncommented this will compile
            dy = y/dx;         //
        }         
        x = x/dx;         
        y = y/dy;         
        System.out.println(dx+" "+dy);         
        System.out.println(x+" "+y);              
    } 
} 