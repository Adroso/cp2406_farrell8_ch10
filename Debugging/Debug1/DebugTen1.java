package Debug1;// A Play has a title and author
// A Musical is a Play that also has a composer

public class DebugTen1
{
   public static void main(String args[])
   {
      FixDebugPlay performance1 =
        FixDebugPlay.DebugPlay("Death of a Salesman", "Arthur Miller");
      FixDebugMusical performance2 =
        FixDebugMusical("Guys and Dolls", "Jo Swerling", "Frank Loesser");
      performance1.display();
      performance2.display();
   }
}
