package Debug1;

public class FixDebugMusical extends FixDebugPlay
{
   protected String composer;
   
   FixDebugMusical(String title, String author, String comp)
   {
      super(title);
      composer = composer;
   }
   public void display()
   {
      System.out.println("The performance is  + title +
        " by " + author + "\nThe music for " + title 
        " is by " + composer);
   }
}