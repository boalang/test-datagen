public class BoxDemo
{
   public static void main(String[] args)
   {
      Long l1 = 127L;
      Long l2 = 127L;
      System.out.println(l1 == l2);
      System.out.println(l1 < l2);
      System.out.println(l1 > l2);
      System.out.println(l1+l2);
      l1 = 128L;
      l2 = 128L;
      System.out.println(l1 == l2);
      System.out.println(l1 < l2);
      System.out.println(l1 > l2);
      l2 = 129L;
      System.out.println(l1 < l2);
      System.out.println(l1+l2);
   }
}