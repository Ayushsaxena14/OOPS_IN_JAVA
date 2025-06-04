//SUPER KEYWORD

public class sixteen
{
    public static void main(String args[])
    {
      College c=new College();
      System.out.println(c.name);
    }
}
class University
{
    String name;
    University()
    {
        System.out.println("University constructor is being called");
    }
}
class College extends University
{
    College()
    {
        super.name="AKTU";
        System.out.println("College constructor is being called");
    }
}
