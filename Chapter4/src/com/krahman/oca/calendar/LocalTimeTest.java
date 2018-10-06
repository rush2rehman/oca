package com.krahman.oca.calendar;
import java.time.*;
public class LocalTimeTest
{
    public static void main(String...s)
    {
        //Creation of localtime
        LocalTime time = LocalTime.of(10,10);
        System.out.println(time);
        //LocalTime time1 = LocalTime.of(10);//cant use just hours
        LocalTime time1 = LocalTime.of(10,10,10);
        //LocalTime time2 = LocalTime.of(10,10,10,9000000000);//compile time error as the last one is not int
        //LocalTime time2 = LocalTime.of(120,10,10,90000000);//Run time error as the value 120 is invalid
        
        
        LocalTime time3 = LocalTime.now();
        System.out.println(time3);
        
        LocalTime time4 = LocalTime.parse("20:20:20");//Cant pass the nano second
        
        //CONSTANTS
        System.out.println(LocalTime.MIN+" "+LocalTime.MAX+" "+LocalTime.MIDNIGHT+" "+LocalTime.NOON+" ");//Mid night and noon are same
        
        //QUERYING
        System.out.println(time4.getMinute());
        System.out.println(time4.getHour());
        System.out.println(time4.getSecond());
        System.out.println(time4.getNano());
        
        System.out.println(time4.isBefore(LocalTime.of(18,20)));
        System.out.println(time4.isAfter(LocalTime.of(18,20)));
        
        
        //MANIPULATING
        System.out.println(time4.plusHours(2));
        System.out.println(time4.plusMinutes(20000));
        System.out.println(time4.minusSeconds(20000));
        
        System.out.println(time4.withHour(2));
        //System.out.println(time4.withMinute(20000));//run time error
        System.out.println(time4.withMinute(59));
        
        //COMBINING
        System.out.println(time4.atDate(LocalDate.now()));
        
        
        
        
    }
}