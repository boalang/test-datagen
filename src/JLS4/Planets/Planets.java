import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Planets
{
   private List<String> planets;

   Planets()
   {
      planets = Collections.emptyList();
   }

   public void setPlanets(List<String> planets)
   {
      this.planets = planets;
   }

   @Override
   public String toString()
   {
      return planets.toString();
   }

   public static void main(String[] args)
   {
      Planets p = new Planets();
      System.out.println(p);
      p.setPlanets(Arrays.asList("Mercury", "Venus", "Earth", "Mars"));
      System.out.println(p);
      p.setPlanets(Collections.emptyList());
//      p.setPlanets(Collections.<String>emptyList());
      System.out.println(p);
   }
}