package other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/kohinoor";
        String uname="root";
        String password="password1234";
        Connection con= DriverManager.getConnection(url, uname, password);
        Statement st=con.createStatement();
        ResultSet resultset=st.executeQuery("select * from Student");
        while(resultset.next()) {
            System.out.println("Student name : " + resultset.getString(1));
            System.out.println("Student subject : " + resultset.getString(2));


        }
    }

}
