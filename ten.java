
//DYNAMIC METHOD DISPATCH

class Phone
{
    void meth1()
    {
       System.out.println("Apka swagat h");
    }
    static void meth2()
    {
        System.out.println("Anshu apko call kar rahe h");
    }

}
class Smartphone extends Phone
{

    static void meth2()
    {
        System.out.println("Anshu is calling you");
    }
    void meth3()
    {
        System.out.println("This is a smartphone");

    }
}



public class ten
{
   public static void main(String args[])
   {
       Phone obj=new Smartphone();
       obj.meth2();
       obj.meth1();
   }
}
