//ABSTRACTION,ABSTRACT CLASS

public class twelve
{
   public static void main(String args[])
   {
       Horse h=new Horse();
       h.eats();
       h.walk();

   }

}
  abstract class Animal
  {
      Animal()
      {
          String color="Brown";
          System.out.println("Animal constructor is being called");
      }
      void eats()
      {
        System.out.println("Animal is eating.");
      }
      abstract void walk();
  }
  class Lion extends Animal
  {
      Lion()
      {
          System.out.println("Lion constructor is being called");
      }
      void walk()
      {
          System.out.println("Lion is walking.");
      }
  }
  class Horse extends Animal
  {
      Horse()
      {
          System.out.println("Horse constructor is being called");
      }
      void walk()
      {
          System.out.println("Horse is walking.");
      }
  }
