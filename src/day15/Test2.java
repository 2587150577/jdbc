package day15;

import day15.utils.JdbcUtil;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) throws Exception{
//        ArrayList<Emp> list = search1(2);
//        list.stream().forEach(n -> {
//            System.out.println(n);
//        });
        Emp emp = new Emp(null,"马云1","乡村教师","2020-01-01",new BigDecimal(8000.00));
        Emp emp1 = new Emp(null,"马云11","乡村教师1","2020-01-01",new BigDecimal(8000.00));
        Emp emp2 = new Emp(null,"马云11","乡村教师2","2020-01-01",new BigDecimal(8000.00));
        Emp emp3 = new Emp(null,"马云11","乡村教师3","2020-01-01",new BigDecimal(8000.00));
        ArrayList<Emp> list = new ArrayList<Emp>();
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        add(list);

//        Emp emp = new Emp(null,"马云","乡村教师","2020-01-01",new BigDecimal(8000.00));
//        add(emp);

//        Emp emp = new Emp(3,"马云","乡村教师","2018-01-02",new BigDecimal(8000));
//         update(emp);
//            delete(1);
    }

//    分页
    public static ArrayList<Emp> search1(Integer p) throws Exception{
    ArrayList<Emp> list = new ArrayList<>();
    Limlt l = new Limlt();
    Connection con = JdbcUtil.getCon();
    PreparedStatement ps = null;
    ResultSet rs = null;
    Integer pageSize = l.getPageSize();

    String sql = "select * from emp limit ?,?";
        ps = con.prepareStatement(sql);
//        System.out.println(pageSize);
    ps.setInt(1,pageSize);
//    System.out.println(p);
    ps.setInt(2,p);
    rs = ps.executeQuery();

    while (rs.next()) {
        int id = rs.getInt(1);
        String ename = rs.getString(2);
        String job = rs.getString(3);
        String hiredate = rs.getString(4);
        BigDecimal sal = rs.getBigDecimal(5);
        Emp emp = new Emp();
        emp.setId(id);
        emp.setName(ename);
        emp.setJob(job);
        emp.setHiredate(hiredate);
        emp.setSal(sal);
        list.add(emp);

    }
    JdbcUtil.close(con, ps, rs);
    return list;
}





    public static ArrayList<Emp> search(String name) throws Exception{
        ArrayList<Emp> list = new ArrayList<>();
        Connection con = JdbcUtil.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;
            String sql = "select * from emp where  ename like?";
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                String hiredate = rs.getString(4);
                BigDecimal sal = rs.getBigDecimal(5);
                Emp emp = new Emp();
                emp.setId(id);
                emp.setName(ename);
                emp.setJob(job);
                emp.setHiredate(hiredate);
                emp.setSal(sal);
                list.add(emp);

        }
        JdbcUtil.close(con, ps, rs);
        return list;
    }
    public static void add(ArrayList<Emp> list) throws Exception{
        Connection con = JdbcUtil.getCon();
        PreparedStatement ps = null;
            String sql = "insert into emp (ename,job,hiredate,sal) values ";

        for (int i = 0; i <list.size()  ; i++) {
            sql += "(" + "'"+list.get(i).getName()+"'" +
                    "," + "'"+list.get(i).getJob()+"'" +
                    "," + "'"+list.get(i).getHiredate()+"'" +
                    "," + list.get(i).getSal() +
                    "),";
        }

            sql = sql.substring(0,sql.length()-1);
//            System.out.println(sql);
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JdbcUtil.close(con, ps);
    }

        public static  void update(Emp emp) throws Exception{
        Connection con = JdbcUtil.getCon();
        PreparedStatement ps = null;
            String sql = "update emp set ename = ?,job=?,hiredate = ? ,sal=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,emp.getName());
            ps.setString(2,emp.getJob());
            ps.setString(3,emp.getHiredate());
            ps.setBigDecimal(4,emp.getSal());
            ps.setInt(5,emp.getId());
            ps.executeUpdate();
            JdbcUtil.close(con, ps);
        }

    public  static  void delete(Integer id) throws Exception{
        Connection con = JdbcUtil.getCon();
        PreparedStatement ps = null;
            String sql = "delete from emp where id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
            JdbcUtil.close(con, ps);
    }

}


