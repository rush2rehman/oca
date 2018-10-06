package com.krahman.oca.practice;
public class ChangeTest {

    private int myValue = 0;
    
    public void showOne(int myValue){
        myValue = myValue; //myValue shadows instance variable. myvalue is assigned to myValue itself
    }
    
    public void showTwo(int myValue){
        this.myValue = myValue;
    }    
    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
    }
}