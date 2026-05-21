//Database Connection Code:
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
 Connection con;
 public Connection getConnection() {
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 con = DriverManager.getConnection(
 "jdbc:mysql://localhost:3306/examdb",
 "root",
 "password");
 } catch(Exception e) {
 System.out.println(e);
 }
 return con;
 }
}

//Timer Thread Code:
class TimerThread extends Thread {
 int time = 60;
 public void run() {
 try {
 while(time > 0) {
 System.out.println("Time Left: " + time);
 time--;
 Thread.sleep(1000);
 }
 } catch(Exception e) {
 System.out.println(e);
 }
 }
}
public class Main {
    public static void main(String[] args) {

        String username = "admin";
        String password = "1234";
      
//Login Validation Code:
if(username.equals("admin") && password.equals("1234")) {
 System.out.println("Login Successful");
} else {
 System.out.println("Invalid Credentials");
}
