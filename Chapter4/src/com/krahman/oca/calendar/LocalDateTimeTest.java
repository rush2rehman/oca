package com.krahman.oca.calendar;
import java.time.*;
public class LocalDateTimeTest
{
    public static void main(String...s)
    {
        //CREATION
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt1 = LocalDateTime.of(2017,9,9,10,10,10,900);
        LocalDateTime ldt2 = LocalDateTime.of(2017,9,9,10,10);//anything less wont work
        System.out.println(ldt1+" "+ldt2);
        //LocalDateTime ldt3 = LocalDateTime.parse("2018-09-09T10:9:9");//wont work as 9999-99-99T99:99:99 isnt follwed
        LocalDateTime ldt3 = LocalDateTime.parse("2018-09-09T10:09:09");
        LocalDateTime ldt4 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        
        //QUERYING
        System.out.println(ldt3.getMinute());
        System.out.println(ldt3.isAfter(LocalDateTime.now())); 
        
        //MANIPULATING
        System.out.println(ldt3.plusHours(19));
        System.out.println(ldt3.minusYears(19));
        System.out.println(ldt3.withYear(2089));
        
        
        
        
    }
    
}