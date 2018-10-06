package com.krahman.oca.practice;
class Boxing{
    void probe(Object x) { System.out.println("In Object"); } //3 

    void probe(Number x) { System.out.println("In Number"); } //2 //Note : Number is the top most class for everything

    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(Long x) { System.out.println("In Long"); } //4
    
    void probe(Byte x) { System.out.println("In Byte"); } //4
    
    public static void main(String[] args){
        //Learing
        Number total1 = 5;//Boxed into Integer
        Number total2 = 5.0;//Boxed into double
        Object total3 = 10l;//Boxed
        double d = (Integer)total1;//unboxing works this way
        
        double a = 10; 
        new Boxing().probe(a); //double is boxed into Double as there is a viability of sending it to Number or object. So the rule o
        
        System.out.println(total3 instanceof Long);
                System.out.println((Long)total3+(Double)total2);
        System.out.println(((Long)total3).equals((Long)total1));
    }
}
