//DEFAULT METHODS IN INTERFACES

import java.util.*;

interface a1
{
    void meth1();
    private void tut1()
    {
        System.out.println("It is used for implementing default method in case of very large default method");
    }
    default void tut()
    {
        tut1();
        System.out.println("This is default method");
    }
}
class sol implements a1
{
    public void meth1()
    {
        System.out.println("This is the abstract method");
    }
}
public class twentyone
{
    public static void main(String[] args)
    {
        sol s=new sol();
        s.meth1();
        s.tut();
    }
}
