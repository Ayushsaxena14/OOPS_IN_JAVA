
//surface area and volume using constructor


import java.util.*;
class Cylinder
{
    public Cylinder(float h, float r) {
        double sa, v;
        sa = (2 * Math.PI * r * h) + (2 * Math.PI * r * r);
        v = Math.PI * r * r * h;
        System.out.println(sa);
        System.out.println(v);
    }
}
    public class two
    {
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius,height");
        float r=sc.nextFloat();
        float h=sc.nextFloat();
        Cylinder ob=new Cylinder(h,r);
      }
    }

