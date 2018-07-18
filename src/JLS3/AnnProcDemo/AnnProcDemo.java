import java.lang.reflect.Method;

public class AnnProcDemo
{
   public static void main(String[] args) throws Exception
   {
      if (args.length != 1)
      {
         System.err.println("usage: java AnnProcDemo classfile");
         return;
      }
      Method[] methods = Class.forName(args[0]).getMethods();
      for (int i = 0; i < methods.length; i++)
      {
         if (methods[i].isAnnotationPresent(ToDo.class))
         {
            ToDo todo = methods[i].getAnnotation(ToDo.class);
            String[] components = todo.value().split(",");
            System.out.printf("ID = %s%n", components[0]);
            System.out.printf("Finish date = %s%n", components[1]);
            System.out.printf("Coder = %s%n%n", components[2]);
         }
      }
   }
}