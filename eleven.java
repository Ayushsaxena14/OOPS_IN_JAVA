//COPY CONSTRUCTORS

public class eleven
{
    public static void main(String args[])
    {
        //int marks[]={100,90,80};
      Student s1=new Student("Ayush",90,1234,21);
      System.out.println("Name of first object: "+s1.showname());
      System.out.println("Roll no. of first object: "+s1.showroll());
      System.out.println("Password of first object: "+s1.showpassword());
      System.out.println("age of first object: "+s1.showage());
      Student s2=new Student(s1,5678);
      System.out.println("Name of second object: "+s2.showname());
      System.out.println("Roll no. of second object: "+s2.showroll());
      System.out.println("Password of second object: "+s2.showpassword());
      System.out.println("age of second object: "+s2.showage());
    }
}
class Student
{
    String name;
    int roll;
    int password;
    //int marks[]=new int[3];
    int age;
    Student(String name,int roll,int password,int age)
    {
        this.name=name;
        this.roll=roll;
        this.password=password;
        this.age=age;
    }
    Student(Student s1, int password)
    {
        this.name=s1.name;
        this.roll=s1.roll;
        this.password=password;
        this.age=s1.age;
    }

    public String showname()
       {
           return name;
       }
       public int showroll()
       {
           return roll;
       }
    public int showpassword()
    {
        return password;
    }
    public int showage()
    {
        return age;
    }

}

