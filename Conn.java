import java.sql.*;
public class Conn {
    Connection c;
    Statement stmt;
    public Conn()
    {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicformood","root","Luciefer");
            stmt = c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
