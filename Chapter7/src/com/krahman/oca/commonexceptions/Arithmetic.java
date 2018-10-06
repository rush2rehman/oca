package  com.krahman.oca.commonexceptions;
public class Arithmetic
{
    public static void main(String[] s)
    {
        /*Rules:
            - integer division by 0 will result in arithmetic exception
            - floating point devision by 0 will result in +/- infinity
            - 0/0 will result in Arithmetic exception
            - 0.0/0 or 0.0/0.0 will result in Nan
            - integer division by 0.0 will result in +/- infinity
        */
        //System.out.println(10/0);//Arithmetic exception
        System.out.println(10/0.0);//+ INF
        System.out.println(-10/0.0);//- INF
        System.out.println(-10.0/0.0);//- INF
        System.out.println(10.0/0.0);//+ INF
        System.out.println(-10.0/0);//- INF
        System.out.println(10.0/0);//-+ INF
        System.out.println(0.0/0.0);//- Nan
        //System.out.println(0/0);//Arithmetic exception
        System.out.println(10.0/0.0 - 10.0/0);// INF - INF = Nan
        System.out.println(-10.0/0.0 - 10.0/0);// -INF - INF = -INF
        
        /*NUMBERFORMATEXCEPTION - subclass of arithmetic exception
        - string parsing of numeric values results in such exception
        - doesnt allow underscore
        - parse metods of wrappers take number format as additional param
        */
        
        //System.out.println(Integer.parseInt("10_00"));
        // System.out.println(Integer.parseInt("10_00A"));
        System.out.println(Integer.parseInt("1000A",16));
        
    }
    
    
}