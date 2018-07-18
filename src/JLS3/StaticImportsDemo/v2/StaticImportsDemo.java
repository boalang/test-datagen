import foo.Light;

public class StaticImportsDemo
{
   public static void main(String[] args)
   {
      Light light = new Light();
      light.printState();
      light.toggle();
      light.printState();
   }
}