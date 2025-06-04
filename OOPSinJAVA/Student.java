package OOPSinJAVA;

public class Student
{

       public  String name;
        private int age;
        public int roll;
        final public String schoolName="De Paul School";
        private static int noofstudents;

        public static int getNoofstudents()
        {
            return noofstudents;
        }

        // Default Constructor
       public Student()
       {

       }
       //Paramaterized Constructor
       public Student(String name,int age,int roll)
        {
            this.name=name;
            this.age=age;
            this.roll=roll;
            noofstudents++;
        }
        //getters
        public int getAge()
        {
            return age;
        }
        //setters
       public void setAge(int age)
       {
           this.age=age;
       }

}
