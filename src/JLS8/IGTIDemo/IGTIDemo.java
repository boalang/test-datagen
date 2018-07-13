import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Planet
{
   private String name;
   private List<String> moons;

   Planet(String name, List<String> moons)
   {
      this.name = name;
      this.moons = moons;
   }

   @Override
   public String toString()
   {
      return name + " " + moons;
   }
}

public class IGTIDemo
{
   public static void main(String[] args)
   {
      Planet mercury = new Planet("Mercury", Collections.<String>emptyList());
//      Planet mercury = new Planet("Mercury", Collections.emptyList());
      System.out.println(mercury);
      List<String> moons = new ArrayList<>();
      moons.add("Luna");
      Planet earth = new Planet("Earth", moons);
      System.out.println(earth);
   }
}