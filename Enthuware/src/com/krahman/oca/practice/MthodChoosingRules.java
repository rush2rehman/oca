package com.krahman.oca.practice;
class MthodChoosingRules
{
    /*
    Priority#1 exact match
    1. Narrowing not supported
    2. Widening is supported
    
    Priority#2 Boxing Unboxing 
    Unboxing
    1. Widening is supported
    2. narrowing is not supported
    Boxing
    2. Narrowing not supported
    3. Widening is also not supported
    
    Priority#3 var arg matching
    1. int can go into var arg of int
    2. int cant map to int array arg though
    3. var arg call does widening
    4. var arg call doesnt do narrowing
    5. Works for object based var args as well
    */
    public static void main(String...s)
    {
        MthodChoosingRules m = new MthodChoosingRules();
        m.test(1);
        //m.test1(1);
        Integer I = 1;
        m.test2(I);
        m.test3(1);
        m.test4(1);
    }
    
    //void test(int...i){System.out.println("in int var args");}
    void test(long...l){System.out.println("in long var args");}
    //void test(byte...b){System.out.println("in byte var args");}
    void test1(int[] i){System.out.println("in int array ");}
    //void test2(Integer...i){System.out.println("in INteger var args");}
    
     //void test2(Integer i){System.out.println("in INteger arg");} //this is the exact match
    
    void test2(Long i){System.out.println("in INteger arg");} //unrelated to Integer
    void test2(long i){System.out.println("in long arg");} //unboxing and widening
    void test2(byte i){System.out.println("in byte arg");} //narrowing not supported
    
    //void test3(Byte b){System.out.println("in Byte...");}
    void test3(Long b){System.out.println("in Long...");}
    void test3(Integer b){System.out.println("in Long...");}
    
    
    void test4(byte b){System.out.println("in byte...");}
    void test4(long b){System.out.println("in long...");}
    
}