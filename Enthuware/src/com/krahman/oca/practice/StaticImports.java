package com.krahman.oca.practice;
import static com.krahman.oca.pac.A.*;//when static import is done class name is not visible. You can directly access the static member. But not with the class name prefix.
public class StaticImports
{
    public static void main(String...s)
    {
        System.out.println(A.i);
    }
}



 
