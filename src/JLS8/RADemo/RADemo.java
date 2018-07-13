public class RADemo
{
   public static void main(String[] args) throws ClassNotFoundException
   {
      ToDo[] annotations = 
         Class.forName("Account").getAnnotationsByType(ToDo.class);
      for (ToDo annotation: annotations)
         System.out.println(annotation.value());
   }
}