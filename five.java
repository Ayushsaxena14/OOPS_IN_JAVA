//CONSTRUCTORS IN INHERITANCE

class Mother
{
    Mother()
    {

        System.out.println("Hi,I am learning Constructors in inheritance");
    }
    public static void print()
    {
        System.out.println("Ayush");
    }
}
class Sister extends Mother
{
    Sister()
    {

        System.out.println("Hi there,I am learning Constructors in inheritance");
    }
    public static void print()
    {
        System.out.println("Saxena");
    }


}
public class five
{
  public static void main(String args[])
  {
    //Mother m=new Mother();
    Sister s=new Sister();
    s.print();
  }
}

                        // KEY LEARNINGS


//1. If no access modifier is specified, Java uses package-private (default) access.
//    => Accessible only within the same package.

// 2. When a subclass object is created, constructor chaining occurs:
//    => Parent constructor runs first, then child constructor.

// 3. Static methods are resolved at compile-time using the reference type (not the object type).
//    => This is called method hiding, NOT overriding.

// 4. Static methods do not support runtime polymorphism.
//    => s.print() will call the method in the class of the reference type if it's static.

// 5. If a child class does NOT define a static method, the inherited static method from the parent is used.

// 6. Non-static (instance) methods support runtime polymorphism (true overriding).
//    => Java decides which method to call at runtime based on the actual object type.

// 7. Even if the reference type is the parent class, the overridden method in the child class is called.
//    => Mother s = new Sister(); s.print(); will call Sister.print() if it's non-static.

// 8. Constructors are NOT inherited but are automatically called in the inheritance chain.
//    => Always called in order: Parent ➝ Child.

// 9. You can call the parent class's version of an overridden method using `super.methodName()` inside the child class.

// 10. Static methods belong to the class, not to instances. Instance methods belong to objects.


