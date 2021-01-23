package day15;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            //         第一步加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //         第二步获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/text2?useSSL=false", "root", "123456");
            //         获取Statement对象
            statement = connection.createStatement();
            String sql = "select * from student";
            //执行SQL语句
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                System.out.println("id" + id + ",name" + name + ",sex" + sex + ",age" + age);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null && statement != null && rs != null) {
                try {
                    connection.close();
                    statement.close();
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
