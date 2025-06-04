
//CONSTRUCTORS OVERLOADING IN INHERITANCE


class Father
{
    Father()
    {
        System.out.println("It is the parent class");
    }
    Father(int x)
    {
        System.out.println(x);
    }

}
class son extends Father
{
    son()
    {

        System.out.println("it is the child class");
    }
    son(int x,int y)
    {
        super(0);
        System.out.println(x+" "+y);
        //System.out.println(y);
    }
}
class Son2 extends son
{
    Son2()
    {

        System.out.println("it is the grandchild class");
    }
    Son2(int x,int y,int z)
    {
        super(5,4);
        System.out.println(x+" "+y+" "+z);
        //System.out.println(y);
        //System.out.println(z);
    }
}
public class six
{
    public static void main(String args[])
    {
       //Father m=new Father();
        son s=new son();
        //Son2 Son2 = new Son2(2,3,9);
    }
}




