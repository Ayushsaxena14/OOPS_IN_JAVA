//PROGRAM OF METHOD OVERRIDING

class A
{
    public void meth1()
    {
        System.out.println("I am the first method of class A");
    }

    public void meth2()
    {
        System.out.println("I am the second method of class A");
    }
}

    class B extends A
    {
        B()
        {
            super.meth2();
        }
        @Override
        public void meth2()
        {
            System.out.println("I am the first method of class B");
        }

        public void meth3()
        {
            System.out.println("I am the second method of class B");
        }
    }

public class eight
{
    public static void main(String args[])
    {
       // A a =new A();
        B b =new B();
        //b.meth1();
        //b.meth2();
        //b.meth2();
        //b.meth3();
    }
}
