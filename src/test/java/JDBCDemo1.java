import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws Exception {Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/kohinoor";
        String uname = "root";
        String password = "password1234";

        ResultSet resultset=null;
        Connection con=null;
        String query="select * from Student";
        String insertquery="Insert into Student values('Rudra','Python');";
        try {
            con = DriverManager.getConnection(url, uname, password);
            Statement st = con.createStatement();
            boolean execute = st.execute(insertquery);
            if (execute) {
                ResultSet resultset1 = st.getResultSet();
                resultset1.next();
                System.out.println(resultset1.getString(1));
            }
            else{
                System.out.println("no. of rows updated ==== "+st.getUpdateCount());
            }
        }
        finally{
            if (resultset!=null)
                resultset.close();
            if(con!=null)
                con.close();
    }
}}