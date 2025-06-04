
//SURFACE AREA AND VOLUME USING GETTER AND SETTER

import java.util.*;
 class cylinder {
     private float h;
     private float r;

     public void setheight(float he)
     {

        this.h = he;
     }

     public float getheight()
     {
         return h;
     }

     public void setradius(float ra)
     {
         r = ra;
     }

     public float getradius()
     {
         return r;
     }
 }
    public class one
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the radius and height");
            float ra=sc.nextInt();
            float he=sc.nextInt();
            double sa;
            double v;
            cylinder c=new cylinder();
            c.setheight(he);
            c.setradius(ra);
            float x=c.getheight();
            float y= c.getradius();
             sa=(2*Math.PI*x*y)+(2*Math.PI*x*x);
            v=Math.PI*x*x*y;
            System.out.println("Surface area is : "+sa);
            System.out.println("Volume is : "+v);
        }
    }



