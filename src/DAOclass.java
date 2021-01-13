import java.sql.*;
public class DAOclass 
{
    Connection con=null;
    PreparedStatement pst=null;
    public void Connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String constring="jdbc:mysql://localhost:3306/aoop project";
            con=DriverManager.getConnection(constring,"root","");
        }
        catch (Exception ae)
        {
            System.out.println("Exception"+ae.getMessage());
        }
    }   
    //INSERT   
   public int insert(Log L)
    {
        int a=0;
        try
        {
            Connection();
            String qry="insert into log_tbl values(?,?,?)";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,L.UserName);
            pst.setString(2,L.Password);
            pst.setString(3,L.Marks);
            a=pst.executeUpdate();
            
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
        return a;
    }
    //END INSERT
    
    //UPDATE
    public int Update(Log L)
    {
        int a=0;
    
        try
        {
            Connection();
            String qry="Update log_tbl set Password=? where UserName=? " ;
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(2,L.Password);
            a=pst.executeUpdate();
            
        }
        catch(Exception ae)
        {
            System.out.println("Error in Update Function");
        }
        return a;
    }
        //END UPDATE
        
        //DELETE
    public int Delete(Log L)
    {
        int a=0;
        try
        {
            Connection();
            String qry="Delete from log_tbl where UserName=?";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,L.UserName);
            a=pst.executeUpdate();
            
        }
        catch(Exception ae)
        {
            System.out.println("Error in Delete Function");
        }
        return a;
    }
    //END DELETE
    
    //SELECT ALL
    public ResultSet SelectAll(Log L)
    {
        ResultSet rs=null;
        try
        {
            Connection();
            String qry="Select * from log_tbl";
            Statement st=con.createStatement();
            rs=st.executeQuery(qry);
        }
        catch(Exception ae)
        {
            System.out.println("Error in Select All Function");
        }
        return rs;
        //END SELECT ALL
     }
    //SELECT 
    public ResultSet Select(Log L)
    {
        ResultSet rs=null;
        try
        {
            Connection();
            String qry="Select * FROM log_tbl WHERE UserName=? and Password=?";
            pst=con.prepareStatement(qry);
            pst.setString(1,L.UserName);
            pst.setString(2,L.Password);
             rs=pst.executeQuery();
            
        }
        catch(Exception ae)
        {
            System.out.println("Error in Select Function");
        }
        return rs;
        //END SELECT 
     }
}
