//INHERITANCE INTRODUCTION

import java.util.*;
class Base
{
    int x;
    public int getx()
    {
      return x;
    }
    public void setx(int x)
    {
        this.x=x;
    }

}
class Derived extends Base
{
    int y;
    public int gety()
    {
        return y;
    }
    public void sety(int y)
    {
        this.y=y;
    }
}
public class four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Derived b=new Derived();
         b.setx(x);
         b.sety(y);
        System.out.println(b.getx());
        System.out.println(b.gety());
    }
}
