package day15.utils;

import java.sql.*;

public class JdbcUtil {
    public static Connection getCon(){
         Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/text2?useSSL=false", "root", "123456");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void close(Connection con, PreparedStatement ps, ResultSet rs){
        try {
            if (con != null && ps != null && rs != null) {
                rs.close();
                con.close();
                ps.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection con, PreparedStatement ps){
        try {
            if (con != null && ps != null) {

                con.close();
                ps.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
