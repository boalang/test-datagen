class Car implements Drivable
{
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
      car.start();
      car.drive(20);
      car.turnLeft();
      car.drive(10);
      car.turnRight();
      car.drive(8);
      car.stop();
   }
}