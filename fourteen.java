//INTERFACES FOR MULTIPLE INHERITANCE

public class fourteen
{
   public static void main(String args[])
   {
      Tiger t=new Tiger();
      t.food();
   }

}
interface hervibores
{
    void food();
}
interface carnivore
{
    void food();
}
class Tiger implements hervibores,carnivore
{
    public void food()
    {
        System.out.println("Tiger is having both hervibores and carnivores property");
    }
}
