package com.krahman.oca.calendar;
import java.time.format.*;
import java.time.*;
public class DateTimeFormatterTest
{
    public static void main(String...s)
    {
        //INSTANTIATE or ACCESS
        DateTimeFormatter df1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter df3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter df4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM);//Time can only take medium and short
        DateTimeFormatter df5 = DateTimeFormatter.ISO_DATE;//CONSTANTs - static fields
        DateTimeFormatter df6 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter df7 = DateTimeFormatter.ISO_TIME;
        
        DateTimeFormatter df8 = DateTimeFormatter.ofPattern("yyyy MM dd");//"y M d" is also the same
        
        System.out.println(df1+" "+df2+" "+df3+" "+df4+" "+df5+" "+df6+" "+df7);
        
        //Formatting Date, time 
        System.out.println(df1.format(LocalDate.now()));
        System.out.println(df4.format(LocalDateTime.now()));
        
        DateTimeFormatter df9 = DateTimeFormatter.ofPattern("'Time now:'H m s a");
        System.out.println(df9.format(LocalTime.now()));
        System.out.println(LocalTime.now().format(df9));//the reverse
        
        
        //Parsing date using formatter
        System.out.println(LocalTime.parse("10:10:00"));//default ISO_LOCAL_TIME/ISO_TIME is used
        
        System.out.println(LocalDate.parse("2017 10 10",df8));
        System.out.println(LocalTime.parse("Time now:10 10 10 AM",df9));
        
        
    }
}