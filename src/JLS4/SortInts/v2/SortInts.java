import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortInts
{
   public static void main(String[] args)
   {
      Integer[] ints = new Integer[10000];
      Random r = new Random();
      for (int i = 0; i < ints.length; i++)
         ints[i] = r.nextInt(30000);
      Arrays.sort(ints, new Comparator<Integer>()
                        {
                            @Override
                            public int compare(Integer i1, Integer i2)
                            {
                               return i2.intValue()-i1.intValue();
                            }
                        });
      for (int i = 0; i < ints.length; i++)
         System.out.println(ints[i]);
   }
}