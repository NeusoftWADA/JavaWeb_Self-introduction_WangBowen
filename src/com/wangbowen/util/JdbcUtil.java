package com.wangbowen.util;

import com.wangbowen.entity.LoginUsers;
import com.wangbowen.entity.Users;

import java.sql.*;

public class JdbcUtil {
    private Connection con = null;
    PreparedStatement stm = null;
    public JdbcUtil() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=web_user", "sa", "123");
    }

    public void test() {
        if (con != null)
            System.out.println("连接成功！");
        else
            System.out.println("连接失败！");
    }

    public void close() throws Exception {
        stm.close();
        con.close();
        System.out.println("关闭成功！");
    }

    public LoginUsers identify(String ID, String PWD) throws Exception {
        stm = con.prepareStatement("select * from web_user where username=? and password=?");
        stm.setString(1, ID);
        stm.setString(2, PWD);
        ResultSet result = stm.executeQuery();
        if (result.next()) {
            result.close();
            this.close();
            return new LoginUsers(ID, PWD);
        } else {
            result.close();
            this.close();
            return null;
        }
    }
    public void add(String ID, String Name, String Sex, String Birthdate, String State) throws Exception {
        stm = con.prepareStatement("insert into users values (?,?,?,?,?)");
        stm.setString(1,ID);
        stm.setString(2,Name);
        stm.setString(3,Sex);
        stm.setString(4,Birthdate);
        stm.setString(5,State);
        stm.executeUpdate();
        this.close();
    }
    public void delete(String ID) throws Exception {
        stm = con.prepareStatement("delete from users where ID=?");
        stm.setString(1,ID);
        stm.executeUpdate();
        this.close();
    }
    public void update(String ID, String Name, String Sex, String Birthdate, String State) throws Exception {
        stm = con.prepareStatement("update users set Name=?, Sex=?, Birthdate=?, State=? where ID=?");
        stm.setString(1,Name);
        stm.setString(2,Sex);
        stm.setString(3,Birthdate);
        stm.setString(4,State);
        stm.setString(5,ID);
        stm.executeUpdate();
        this.close();
    }
    public Users select(String ID) throws Exception {
        stm = con.prepareStatement("select * from users where ID=?");
        stm.setString(1,ID);
        ResultSet resultSet = stm.executeQuery();
        if(resultSet.next()){
            String id = resultSet.getString("ID");
            String name = resultSet.getString("Name");
            String sex = resultSet.getString("Sex");
            String birthdate = resultSet.getString("Birthdate");
            String state = resultSet.getString("State");
            resultSet.close();
            this.close();
            return new Users(id,name,sex,birthdate,state);
        }
        else{
            resultSet.close();
            this.close();
            return null;
        }
    }
}