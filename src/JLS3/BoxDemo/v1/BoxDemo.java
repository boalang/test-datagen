import java.io.IOException;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class BoxDemo
{
   public static void main(String[] args) throws IOException
   {
      int ch;
      Map<String, Integer> m = new TreeMap<String, Integer>();

      // Read each character from standard input until a letter
      // is read. This letter indicates the start of a word.

      while ((ch = System.in.read()) != -1)
      {
         // If character is a letter then start of word detected.

         if (Character.isLetter((char) ch))
         {
             // Create StringBuilder object to hold word letters.

             StringBuilder sb = new StringBuilder();

             // Place first letter character into StringBuilder object.

             sb.append((char) ch);

             // Place all subsequent letter characters into StringBuilder
             // object.

             do
             {
                ch = System.in.read();
                if (Character.isLetter((char) ch))
                    sb.append((char) ch);
                else
                    break;
             }
             while (true);

             // Insert word into map.

             String word = sb.toString();
             if (m.get(word) == null)
                 m.put(word, 1);
             else
                 m.put(word, m.get(word)+1);
         }
      }

      // Output map in ascending order.

      Iterator i = m.entrySet().iterator();
      while (i.hasNext())
         System.out.println(i.next());
   }
}