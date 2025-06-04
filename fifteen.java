
//STATIC KEYWORD

public class fifteen
{
    public static void main(String args[])
    {
        Chatra s=new Chatra();
        s.setName("Ayush Saxena");
        System.out.println(s.getName());
        s.schoolname="BDS";
        System.out.println(s.getSchoolname());
        Chatra s2=new Chatra();
        s2.setSchoolname("De Paul School");
        System.out.println(s2.getSchoolname());
        System.out.println(s.getSchoolname());

    }
}
class Chatra
{
    String name;
    int roll;
    static String schoolname;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public static void setSchoolname(String schoolname)
    {
        Chatra.schoolname = schoolname;
    }

    public static String getSchoolname()
    {
        return schoolname;
    }
}
