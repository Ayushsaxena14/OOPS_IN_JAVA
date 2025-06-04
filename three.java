
// rating of movie using the constructor


import java.util.*;
class movie {
    int y;
    float r;
    String t;

    public movie() {
        y = 0;
        r = 0.0f;
        t = "";
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year,rating,title of the movie");
        y = sc.nextInt();
        r = sc.nextFloat();
        t = sc.nextLine();


    }

    public void display() {
        if (r >= 0 && r <= 2)
            System.out.println(t+ ": flop");
        else if (r > 2 && r <= 3.4)
            System.out.println(t+ ": semi hit");
        else
            System.out.println(t+ ": hit");
    }
}
  public class three
  {
      public static void main(String args[])
      {
          movie ob=new movie();
          ob.accept();
          ob.display();
      }
  }




