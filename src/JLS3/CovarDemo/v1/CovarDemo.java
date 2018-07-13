class Paper
{
   @Override
   public String toString()
   {
      return "paper instance";
   }
}

class PaperFactory
{
   Paper newInstance()
   {
      return new Paper();
   }   
}

class Cardboard extends Paper
{
   @Override
   public String toString()
   {
      return "cardboard instance";
   }
}

class CardboardFactory extends PaperFactory
{
   @Override
   Cardboard newInstance()
   {
      return new Cardboard();
   }
}

public class CovarDemo
{
   public static void main(String[] args)
   {
      PaperFactory pf = new PaperFactory();
      Paper paper = pf.newInstance();
      System.out.println(paper);
      CardboardFactory cf = new CardboardFactory();
      Cardboard cardboard = cf.newInstance(); 
      System.out.println(cardboard);
   }
}