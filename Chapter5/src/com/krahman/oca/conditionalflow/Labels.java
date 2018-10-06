package com.krahman.oca.conditionalflow;
public class Labels
{
    public static void main(String...s)
    {
        /*
        Labels can be added to
        block of code defined by {}
        loops - for, while , do while
        conditional flows - if, if-else, switch
        Expressions
        Assignments
        Return statements
        try blocks
        throws statements
        
        Labels cant be added to
        -Declarations out side curly braces
        */
        lebel1:
        {
            System.out.println("test");
            continue label1;
        }
        
        
        Label:
        for(;;) break;
        
        //test: //this label will not work
        int i =0;
        
        test: //thsi works
        {
            int j = 0;
        }
        
        //Breaking from outer loop
        outer:
        for(int k =0; k < 2; k++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println(k+" "+j);
                break outer; //breaks teh outer loop
            }
        }
        
        //Continue outer loop
        
        outer:
        for(int k =0; k < 2; k++)
        {
            for(int j=0; j<3; j++)
            {
                if(j==1)
                    continue outer;
                System.out.println(j);
            }
        }
        
    }
}