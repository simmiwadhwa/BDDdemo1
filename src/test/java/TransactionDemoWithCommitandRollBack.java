import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionDemoWithCommitandRollBack {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/MyDatabase";
        String uname = "root";
        String password = "password1234";
        Connection con= DriverManager.getConnection(url, uname, password);
        Statement st=con.createStatement();
        System.out.println("data before transaction");
        System.out.println("-----------------");
        ResultSet rs= st.executeQuery("select * from accounts");
        while(rs.next()){
            System.out.println(rs.getString(1)+"..."+rs.getInt(2));
        }
        System.out.println("Transaction begins...");
        con.setAutoCommit(false);
        st.executeUpdate("update accounts set balance=balance-2000 where user = 'Ziva'");
        st.executeUpdate("Update accounts set balance=balance+2000 where user = 'veeru'");
        st.executeUpdate("Update accounts set balance=balance-2000 where user = 'Ziva'");
        st.executeUpdate("Update accounts set balance=balance+2000 where user = 'simmi'");
        System.out.println("can you please confirm this transcation of 2000...[Yes|No] ");
        Scanner sc=new Scanner(System.in);
        String option=sc.next();
        if(option.equalsIgnoreCase("yes")){
            con.commit();
            System.out.println("Transaction committed");
        }
        else{
            con.rollback();
            System.out.println("Transaction Rolled Back");
        }
    }
}
