import java.sql.*;
public class Conn {
    Connection c;
    Statement stmt;
    public Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicformood","root","Password");
            stmt = c.createStatement();
;        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
