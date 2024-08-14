package com.DatabaseExample.DatabaseExample.database;
import  java.sql.*;

import static java.lang.Class.forName;

public class DemoClass
{
    public static void main(String[] args) throws Exception{

        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="mysql";
        int userID=9;
        String userName="Het";
        String query="insert into users values(?,?)";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con=DriverManager.getConnection(url,uname,pass);
        PreparedStatement st=con.prepareStatement(query);
    st.setInt(1,userID);
    st.setString(2,userName);
        int count=st.executeUpdate();

        System.out.println(count+" rows affected");
//        String userdata="";
//        String name=rs.getString("userName");
//
//        System.out.println(name);

//        while (rs.next()) {
//            // Assuming you have columns named 'userName' and 'userId' in the 'users' table
//            userdata=rs.getInt(1)+":"+rs.getString(2);
//            System.out.println(userdata);
//        }

//        rs.next();
//        userdata=rs.getInt(1)+":"+rs.getString(2);
//        System.out.println(userdata);


//        rs.next();
//        userdata=rs.getInt(1)+":"+rs.getString(2);
//        System.out.println(userdata);


//        rs.next();
//        userdata=rs.getInt(1)+":"+rs.getString(2);
//        System.out.println(userdata);

        st.close();
        con.close();

    }
}
