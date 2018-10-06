package com.krahman.oca.string;
public class StringExperiments
{
    static public void main(String...s)
    {
        //JVM String pool
        String s1 = new String("java"); //Not pooled
        System.out.println("Hello"); // pooled
        String s2 = s1.substring(2); //not pooled
        System.out.println(s2);
        String s6 = "va";
         System.out.println(s2==s6);
        String s3 = "Hello"; //Resused from Pool
        String s4 = "java";//created for the first time and pooled
        String s5 = new String("java");
        System.out.println(s1==s5);
        System.out.println(s1==s4);
         System.out.println("Hello"==s3);
        
        //Different ways of creation Strings
        String s7 = "java";
        String s8 = new String("java");
        char[] cArr = new char[]{'j','a','v','a'};
        String s9 = new String(cArr);
        StringBuilder sb = new StringBuilder("java");
        String s10 = new String(sb);
        String s11 = new String(new StringBuffer("java"));
        
        //String Methods
        //CHARAT
        System.out.println(s7.charAt(1));
        //System.out.println(s7.charAt(4));//Run time error
        System.out.println("test21".charAt(1));
        char c1 = "test21".charAt(1);//Always returns a char, not string
        
        //INDEXOF - takes a char, String of any length. Can take the starting postition index
        System.out.println(s7.indexOf("va"));
        System.out.println(s7.indexOf('v'));
        System.out.println(s7.indexOf("x")); //-1 if not found
        System.out.println(s7.indexOf("a",2));
        
        //SUBSTRING
        System.out.println(s7.substring(2));
        System.out.println(s7.substring(1,2));//length 2-1 =1 (last char not included)
        System.out.println(s7.substring(2,4));//Even though 4 is out of range, doesnt give error but 5 will give
        
        //TRIM
        System.out.println(":"+"    y   u    ".trim()+":");//Doesnt remove the space in the middle
        
        //REPLACE - replaces all occurences
        System.out.println(s7.replace('j','k'));
        System.out.println(s7.replace("j","k"));
        System.out.println(s7.replace("ja","ku"));
       // System.out.println(s7.replace("ja",'v'));//cant mix string and char
         System.out.println(s7.replace("fa","ku"));//Cant replace - original value returned
        
        //LENGTH
        System.out.println(s7.length());//Actual length, not the index
        
        //STARTSWITH AND ENDSWITH - only takes string as input; optionally starting position can be given for only STARTSWITH
        System.out.println(s7.startsWith("j"));
        System.out.println(s7.startsWith("s"));
       // System.out.println(s7.startsWith('j'));//Compiler Error
        System.out.println(s7.startsWith("ja"));
        System.out.println("test--"+s7.startsWith("av",1));
        System.out.println("test--"+s7.startsWith("av",10));//doesnt throw error, gives false
        System.out.println(s7.endsWith("av"));
        
        //STRING concatenation
        System.out.println("java"+"cert"+null);
        System.out.println(""+3+5+"java"+"cert"+null);
        
        //STRING Equality != compares the reference
        String s18 = "java";
        System.out.println(s7==s18);
        System.out.println(s7!=s18);
        
        
    }
}