//INTERFACES FOR TOTAL ABSTRACTION

public class thirteen
{
   public static void main(String args[])
   {
      King k=new King();
      k.moves();


   }

}
interface chessplayer
{
   void moves();
}
class Queen implements chessplayer
{
    public void moves()
    {
       System.out.println("up,down,right,left,diagonal(in all 4 directions)");
    }
}
class Rook implements chessplayer
{
    public void moves()
    {
        System.out.println("up,down,right,left");
    }
}
class King implements chessplayer
{
    public void moves()
    {
        System.out.println("up,down,right,left,diagonal");
    }
}

