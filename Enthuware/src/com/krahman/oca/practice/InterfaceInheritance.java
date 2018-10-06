package com.krahman.oca.practice;
interface House{   
    public default String getAddress(){     
        return "101 Main Str";   
    } 
}  
interface Bungalow extends House{  
    public default String getAddress()
    {     
        return "101 Smart Str";   
    } 
}  
class MyHouse implements Bungalow, House{  }  //Implementing house is redundant as bunglow is a house anyway

public class InterfaceInheritance 
{    
    public static void main(String[] args) {     
        House ci = new MyHouse();  //1 
        System.out.println(ci.getAddress()); //2   
    } 
} 