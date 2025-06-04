public class seventeen
{
    public static class Vehicle
    {
        int make;
        int model;
        int year;
        public static void starting()
        {
            System.out.println("Vehicle started");
        }
        public static void stopping()
        {
            System.out.println("Vehicle stopped");
        }
    }
    public static void main(String args[])
    {
        Vehicle v=new Vehicle();
        v.starting();
        v.stopping();
    }


}
