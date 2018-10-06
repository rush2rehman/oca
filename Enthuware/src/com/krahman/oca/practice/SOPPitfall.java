package com.krahman.oca.practice;
class Baap
{
    public int h = 4;     
    public int getH()
    {         
        System.out.println("Baap "+h); 
        return h;     
    
    } 
}   
public class SOPPitfall extends Baap
{     
    public int h = 44;     
    public int getH()
    {         
        System.out.println("Beta "+h); return h;     
    }         
    public static void main(String[] args) 
    {         
        Baap b = new SOPPitfall();         
        System.out.println(b.h+" "+b.getH());  //NOte, all the expressions are evaluated first before printing. So the getH() is invoked and excuted(printed) before printint b.h       
        SOPPitfall bb = (SOPPitfall) b;         
        System.out.println(bb.h+" "+bb.getH());     
    } 
}