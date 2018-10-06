package com.krahman.oca.practice;
public class FloatParsing
{
    public static void main(String...s)
    {
        System.out.println("1.0-->"+floatParser("1.0"));
        //System.out.println("0x1.0-->"+floatParser("0x1.0"));
        float f = 0x1.0p2f;
        System.out.println("0x1.0p2f-->"+floatParser("0x1.0p2f"));
        System.out.println("1.0-->"+floatParser("1.0"));
        System.out.println("1.0-->"+floatParser("1.0"));
    }
    public static float floatParser(String s)
    {
        float f = 0.0f;
        try
        {
            f = Float.valueOf(s).floatValue();
            return f;
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Invalid input");
            f = Float.NaN;
            return f;
        }
        finally{
            System.out.println("Finally");
            return f; //resturn is redundant but reachable
        }
        //return f;//unreachable
    }
}