package com.krahman.oca.conversions;
public class Conversions
{
    
    public static void main(String...s)
    {
        System.out.println("Lets test conversions");
        //Assignments - Boxing(widening ref), Unboxing(widening primitive), 
        //Widening, specific narrowing
        
        
        //***Widening*************
        double d = (byte)1; //any type will fit in for double
        Double d1 = 1.0; //Except for a double nothing compiles here, this is true for every boxing in assignment
        d = 'c'; //char can be assigned to double float, long, int
        float f = (byte)1; //except for float all accepted
        //Float f = (byte)1; fails because of boxing issue
        long l = (short)1.0; //except for float and double 
        //int, short, byte widening goes on in the above given fashion
        
        //****Narrowing*****
        //Condition 1: Narrowing is possible only if the expression is constant - not a variable
        //Condition 2: the constant expression results in a value that can fit into teh target type
        //Condition 3: The target type can be byte, short or char and the source value should be a non floating type value
        int i =1;
        //char c = i; //not possible - not a constant expression
        char c1 = 1; //works
        //char c2 = 70000; //out side char range
       // byte b = 200; //outside byte range
        byte b2 = 'a';
        //byte b2 = '\uffff';//out of range
        
        //****Boxing*****Only allows widening reference conversion, not primitive widening
         Double d4 = 1.0; //Except for a double nothing compiles here, this is true for every boxing in assignment
         //Integer intObj = (byte)1;//error as there is no widening for primitive
        
        
        //****Unboxing****only offers widening primitive conversion - no narrowing even though .xxxValue method is available
        Double doubleObj = Double.valueOf(10);
        Float floatObj = new Float((byte)10);
        double d3 = doubleObj;
        d3 = floatObj; //widening applied
        long s3 = new Integer(1);
        
        
        //===============
        //Method parameter conversions
        //widening
        test(1, (byte)1, 1, 'c',  (byte)1, (byte)1, 'c');
        //test(1, (byte)1, 1, 'c',  (byte)1, (byte)1, 1); //will fail as 1 to c will fail - no narrowing for char. Remember all assignments to char are narrowing as its unsigned
        test(1.0f, 1L, 'f', 'c',  (byte)1, (byte)1, 'c');
        
        //***Unboxing***
        test(new Double(1), new Byte((byte)1), new Character('c'), 'c',  new Integer(1).shortValue(), (byte)1, 'c');
        //boxing****
        test1(new Double(1), new Float(1), 1, (byte)1, (char)100 );
        
        
        //============Arithmetic operations
        int i11 = 10;
        float f11 = 1;
        double d11 = 10;
        byte b11 = 10;
        char c11 = 10;
        
        Float d22 = b11 + c11 + f11  + new Float(1); 
        
    }
    
    private static void test(double d, float f, long l, int i, short s, byte b, char c)
    {
        
    }
    
      private static void test1(Double d, Float f,  Integer i,  Byte b, Character c)
    {
        
    }
    
    
    
    
    
    
    
    
}