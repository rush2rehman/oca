package com.krahman.oca.practice;
class FinalStaticMethods
{
    public static void test(){   }
    public static final void test1(){   }//cant redefine
    public static final void main(String...s) //cant redefine in subclass
    {
        
    }
}

class sub extends FinalStaticMethods
{
   public static void test(){   }
  // public static final void test1(){   }
   // public static void main(String...s){}
}