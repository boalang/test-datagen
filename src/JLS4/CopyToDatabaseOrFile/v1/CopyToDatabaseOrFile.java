import java.io.IOException;

import java.sql.SQLException;

public class CopyToDatabaseOrFile
{
   public static void main(String[] args)
   {
      try
      {
         copy();
      }
      catch (IOException ex)
      {
         System.out.println(ex.getMessage());
         // additional handler code
      }
      catch (SQLException ex)
      {
         System.out.println(ex.getMessage());
         // additional handler code that's identical to the previous handler's
         // code
      }
   }

   static void copy() throws IOException, SQLException
   {
      if (Math.random() < 0.5)
         throw new IOException("cannot copy to file");
      else
         throw new SQLException("cannot copy to database");
   }
}