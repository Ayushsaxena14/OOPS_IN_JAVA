//INHERITANCE ,GETTER AND SETTER CONCEPT REVISION


import java.util.*;
class Rectangle
{
    int x;
    int y;

    public void setx(int x)
    {
      this.x=x;
    }
    public int getx()
    {
        return x;
    }
    public void sety(int y)
    {
        this.y=y;
    }
    public int gety()
    {
        return y;
    }
    void area()
    {
        int p=x*y;
        System.out.println(p);
    }
}
class cuboid extends Rectangle
{
    int z;
    public void setz(int z)
    {
        this.z=z;
    }
    public int getz()
    {
        return z;
    }
    void area(int x,int y,int z)
    {
        int q=x*y*z;
        System.out.println("Area of cuboid is : "+q);
    }

}
public class nine
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of x,y,z");
       int x=sc.nextInt();
       int y=sc.nextInt();
       int z=sc.nextInt();
       cuboid n=new cuboid();
       n.setx(x);
       n.sety(y);
       n.setz(z);
       System.out.println("Your entered value of x is : "+n.getx());
       System.out.println("Your entered value of y is : "+n.gety());
       System.out.println("Your entered value of z is : "+n.getz());
       n.area(x,y,z);
   }
}
