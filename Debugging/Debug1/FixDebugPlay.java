package Debug1;

public class FixDebugPlay
{
   private String title;
   private String author;

   public static String DebugPlay(String title, String author)
   {
      title = title;
      author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}