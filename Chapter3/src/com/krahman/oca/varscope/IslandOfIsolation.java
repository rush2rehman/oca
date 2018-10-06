package com.krahman.oca.varscope;
class Exam
{
    private Exam examVar;
    public void setExamVar(Exam e)
    {
        examVar = e;
    }
}

public class IslandOfIsolation{
    static public void main(String[] s)
    {
        Exam one = new Exam();
        Exam two = new Exam();
        one.setExamVar(two);
        two.setExamVar(one);
        one = null;
        two = null;
    }
}
