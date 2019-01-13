import java.sql.*;

public class TestMysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String username = "root";
        String password = "root";
        String connectionURL = "jdbc:mysql://localhost:3306/test_db?verifyServerCertificate=false&useSSL=false&useUni" +
                "code=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection con = DriverManager.getConnection(connectionURL, username, password)){
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from books");


            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println("---------------");
            }

        }

    }
}
