package com.krahman.oca.calendar;
import java.time.*;
import java.time.temporal.*;
public class LocalDateTest{
    
    public static void main(String...s)
    {
        //CREATING a LOCALDATE
        LocalDate date = LocalDate.of(2018,8,1);
        LocalDate date1 = LocalDate.of(2018, Month.DECEMBER, 1);
        LocalDate date2 = LocalDate.now();
        //LocalDate date3 = LocalDate.parse("2018-8-1");//RUNTIME exception as the string should follow 9999-99-99 format
        LocalDate date3 = LocalDate.parse("2018-08-01");
        
        //QUERYING LOCALDATE
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonthValue());
        
        System.out.println(date.isAfter(date1));
        System.out.println(date.isBefore(date1));
        System.out.println(date.isBefore(date));//EQUALS results in false
        
        //MANIPULATING DATE - considers leap year during manipulation
        System.out.println(date.minusDays(5));
        System.out.println(date);//Immutable as string
        System.out.println(date.minusYears(5));
        
        //there is no plus(int, int, int)
       // System.out.println(date.plus(1,1,2));
        System.out.println(date.plusDays(5));
        System.out.println(date);//Immutable as string***********
        System.out.println(date.plusYears(5));
        
        //plus method can take either Period or respective chronouit
        System.out.println(date.plus(5, ChronoUnit.DAYS));
        
        System.out.println(date.withDayOfMonth(10));
        System.out.println(date);//Immutable as string
        System.out.println(date.withYear(2078));
        
        //CONVERTING 
        //Combining with time
        System.out.println(date.atTime(10, 5, 10, 900));
        System.out.println(date.atTime(10,0));
        //toepoch
        System.out.println(date.toEpochDay());
        System.out.println(LocalDate.of(1970,1,1).toEpochDay());
        
        
        
    }
}