//INHERITANCE IN INTERFACES


import java.util.*;
interface inter1
{
    void meth1();
}
interface inter2
{
    void meth3();
}
class Solution implements inter2
{
    public void meth1()
    {
        System.out.println("Method 1 is running...");
    }
    public void meth2()
    {
        System.out.println("Method 2 is running...");
    }
    public void meth3()
    {
        System.out.println("Method 3 is running...");
    }
    public void meth4()
    {
        System.out.println("Method 4 is running...");
    }
}


public class nineteen
{
    public static void main(String[] args)
    {
        Solution obj=new Solution();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }
}
