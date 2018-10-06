package com.krahman.oca.practice;
class LocalVarScope
{
    /*
    1. There is no shadowing inside method
    2. An inner construst like for or {} or while can not shadow another var in the scope
    3. Lambdas also fall into the above rule . Only difference is lambda cannot reuse an existing variable. It has to define a new variable
    4. You cant refer to a var before its declaration
    
    1. Instance var can be shadowed
    2. Forward reference of variable not alowed
    3. But forward reference through a method is allowed
    */
    String x = m();
    String s;
    
    public static final void main(String...s)
    {
        int i =0;
        //System.out.println(j);
        {
            //int i =0; //already defined
            int j=0;
            {
                //int j =0; //Already defined
                int k =0;
            }
            int k =0; //not a problem as k's scope is already over
        }
        int j =0; //not a problem as j has exited its life cycle
    }
    
    String m()
    {
        return s;
    }
}