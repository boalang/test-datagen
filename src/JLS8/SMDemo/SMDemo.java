class Circle implements Drawable
{
   private int x, y, r;

   Circle(int x, int y, int r)
   {
      this.x = x;
      this.y = y;
      this.r = r;
   }

   @Override
   public void draw(int color)
   {
      System.out.printf("Drawing circle(%d, %d, %d) in color %x%n", x, y, r, 
                        color);
   }
}

public class SMDemo
{
   public static void main(String[] args)
   {
      Circle circle = new Circle(10, 20, 5);
      circle.draw(Drawable.rgb(0x80, 0x60, 0x40));
   }
}