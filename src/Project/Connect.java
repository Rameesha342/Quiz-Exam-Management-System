package Project;

import java.sql.*;

public class Connect 
{
   public static Connection getcon()
    {
        PreparedStatement ps;
        Connection Con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/aoop project";
            Con=DriverManager.getConnection(url,"root","");
            return Con;
        }
        catch (Exception ae)
        {
            System.out.println("Exception"+ae.getMessage());
            return null;
        }
    }    
}
