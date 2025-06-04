//CODECHEF PROBLEM

import java.util.*;
public class seven
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try
        {


            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t!=0)
            {
                int n=sc.nextInt();
                int s=sc.nextInt();
                int d,k=0;
                int a[]=new int[n];
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if((i+j)==s)
                        {
                            if(i>j)
                            {
                                 d=i-j;
                            }
                            else
                            {
                                d=j-i;
                            }
                            a[k]=d;
                            k++;
                        }
                    }
                }
                int max=a[0];
                for(k=0;k<n;k++)
                {
                    if(a[k]>max)
                    {
                        a[k]=max;
                    }
                    System.out.println(a[k]);
                    break;
                }
            }
        }
        catch(Exception e) {
        }
    }
}


