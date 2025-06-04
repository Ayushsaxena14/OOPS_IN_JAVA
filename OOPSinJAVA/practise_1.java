package OOPSinJAVA;



public class practise_1
{
    public static void main(String args[])
    {
        Student s1=new Student("Ayush",21,90);
       /* s1.name="Ayush";
        //s1.age=21;
        s1.roll=90;*/
       // System.out.println(s1.getAge());
        //System.out.println(s1.noofstudents);
        Student s3=new Student("Saxena",22,10);
        //System.out.println(s3.schoolName);
       // System.out.println(s1.schoolName);
        //System.out.println(s3.noofstudents);
       /* s3.schoolName="xyz";
        System.out.println(s3.schoolName);*/
       /* System.out.println(Student.noofstudents);
        Student.noofstudents=100;
        System.out.println(Student.noofstudents);*/
        System.out.println(s3.getNoofstudents());
        System.out.println(Student.getNoofstudents());
    }
}
