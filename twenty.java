//POLYMORPHISM IN INTERFACES

import java.util.*;

interface camera
{
    void snap();
}
interface gps
{
    void path();
}
class cellphone
{
    public void calling(long no)
    {
        System.out.println("Calling...");
    }
}
class MySmartphone extends cellphone implements camera,gps
{
    public void snap()
    {
        System.out.println("Taking a snap");
    }
    public void path()
    {
        System.out.println("This is the given path..");
    }
}
public class twenty
{
    public static void main(String[] args)
    {
        camera cam=new MySmartphone();  //IT IS A SMARTPHONE BUT AT THIS MOMENT,IT WILL BEHAVE AS CAMERA ONLY
        cam.snap();
        MySmartphone phone=new MySmartphone(); //NOW IT IS A SMARTPHONE AND IT CAN ALSO BEHAVE AS OTHERS SUCH AS CELLPHONE,GPS,CAMERA
        phone.calling(157841346);
    }
}
