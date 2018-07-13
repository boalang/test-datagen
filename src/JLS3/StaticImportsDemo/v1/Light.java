public class Light implements Switchable
{
   private boolean state = OFF;

   public void printState()
   {
      System.out.printf("state = %s%n", (state == OFF) ? "OFF" : "ON");
   }

   public void toggle()
   {
      state = (state == OFF) ? ON : OFF;
   }
}