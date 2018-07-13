class Car implements Drivable
{
   @Override
   public void demo()
   {
      start();
      drive(20);
      stop();
   }

   @Override
   public void drive(int numUnits)
   {
      System.out.printf("Driving car %d kilometers%n", numUnits);
   }

   @Override
   public void start()
   {
      System.out.println("Starting car");
   }

   @Override
   public void stop()
   {
      System.out.println("Stopping car");
   }

   @Override
   public void turnLeft()
   {
      System.out.println("Turning car left");
   }

   @Override
   public void turnRight()
   {
      System.out.println("Turning car right");
   }
}

public class DMDemo
{
   public static void main(String[] args)
   {
      Car car = new Car();
      car.demo();
   }
}