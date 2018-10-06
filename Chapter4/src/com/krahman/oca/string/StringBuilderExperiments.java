package com.krahman.oca.string;
public class StringBuilderExperiments
{
    public static void main(String[] s)
    {
        System.out.println("String Builder Experiments");
        
        //Instantiation
        StringBuilder sb = new StringBuilder();//16 char length
        StringBuilder sb1 = new StringBuilder("123");//3+16 is the length
        StringBuilder sb2 = new StringBuilder(2); //initial length is  2 - not 16 +2
        System.out.println(sb.capacity()+""+sb1.capacity()+""+sb2.capacity());
        sb2.append( true); //adds 4 char if teh capacity is not enough
        System.out.println(sb.capacity()+""+sb1.capacity()+""+sb2.capacity());
        StringBuilder sb3 = new StringBuilder(sb2);
        
        //APPEND
        sb.append(10);
        sb.append('a');
        sb.append(10L);
        sb.append(new Object());
        sb.append("   ");
        sb.append(sb1,1,3);//for charactersequence its start and end index
        sb.append(new char[]{'1','2','3'},1,2);//for char array its start position and number of char
        sb.append("123",1,3);//this is again a char sequence
        System.out.println(sb);
        
        //INSERT
        sb1.insert(1,'a');
        sb1.insert(4,"a");
        sb1.insert(5,new char[]{'a','b','c','d'},1,2);
        sb1.insert(5,"abcd",1,2);//same rules for char sequence and char array
        System.out.println(sb1);
        
        //DELETE and DELETECHARAT
        StringBuilder sb4 = new StringBuilder("JAVA");
        sb4.delete(3,8); //if the end position is out of bound, no issues - More importatntly this is start and end position
        System.out.println("After Deletion:"+sb4);
        sb4.deleteCharAt(1);
        System.out.println(sb4);
        
        //TRIM - no trim
        //REVERSE - cant be used to reverse a substring of stringbuilder as a chain. Bceause the substring returns a new String. String doesnt have a reverse
        StringBuilder sb5 = new StringBuilder("JAVA");
        System.out.println(sb5.reverse());
        System.out.println(sb5.substring(2,3));//never changes the original string builder
        System.out.println(sb5);
        
        //REPLACE
        StringBuilder sb6 = new StringBuilder("JAVACERT");
        sb6.replace(3,5,"jkhg");//Remove 2 char and add 4 char
        System.out.println(sb6);
        
        //SUBSEQUENCE - as opposed to substring - this return char sequence
        System.out.println(sb6.subSequence(2,4));
        
    }
}