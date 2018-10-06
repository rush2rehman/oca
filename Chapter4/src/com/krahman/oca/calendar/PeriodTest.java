package com.krahman.oca.calendar;
import java.time.*;
public class PeriodTest
{
    public static void main(String...s)
    {
        //CREATION - only for date month and year
        Period p = Period.of(1,2,400);
        Period p1 = Period.ofYears(3);
        Period p2 = Period.ofMonths(23);//doesnt get converted to 1 year and 11 months
        Period p3 = Period.ofDays(-10);//negative period possible
        System.out.println(p+" "+p1+" "+p2+" "+p3);
        
        //case of the alphabet doesnt matter
        Period p4 = Period.parse("P-2Y+15D");
        //Period p5 = Period.parse("P-2D-15Y");//cant alter the seq
        Period p5 = Period.parse("P9m");
        Period p6 = Period.parse("-P9m10D");//- applies to all 
        Period p7 = Period.between(LocalDate.now(), LocalDate.now().plusDays(3));//start date in included but the end date is not ; endDate - lastDate is the number of Days
        
        System.out.println(p4+" "+p5+" "+p6+" "+p7);
        
        //MANIPULATING LOCALDATE and LOCALTIME with PERIOD
        System.out.println(LocalDate.now().plus(Period.parse("P-5D")));//plus is actually doing minus as teh period is negative
        System.out.println(LocalDate.now().minus(Period.ofDays(4)));
        System.out.println(LocalDate.now().minus(Period.ofDays(-4)));
        
        //QUERYING PERIOD
         System.out.println(p.getMonths());
        System.out.println(p.getYears());
        System.out.println(p.getDays());
        System.out.println(p.isNegative());
        System.out.println(Period.parse("P10Y-2M").isNegative());//Atleast one is negative then negative
        
        //MANIPULATING
        System.out.println(Period.parse("P10Y-2M").minusMonths(20));//Just updates teh respective section
        System.out.println(Period.parse("-P10Y5D").minusMonths(20));//adds -20 in the middle
        System.out.println(Period.of(1,4,3).plusMonths(20));
        System.out.println(Period.ofYears(1).plusMonths(20));
        System.out.println(Period.ofYears(1).multipliedBy(2));//no divided by
        
        //Conversion
        System.out.println(Period.ofYears(1).toTotalMonths());
        
    }
}