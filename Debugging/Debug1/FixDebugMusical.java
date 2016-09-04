package Debug1;

public class FixDebugMusical extends FixDebugPlay
{
   protected String composer;
   
   public FixDebugMusical(String title, String author, String comp)
   {
      super(author, comp);
      composer = comp;

   }
   public void display()
   {
      System.out.println("The performance is"  + title +
        " by " + author + "\nThe music for " + title +
        " is by " + composer);
   }
}