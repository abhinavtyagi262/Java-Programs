package exceptiontypes.checkedexceptions;

import java.sql.*;

// Exception that occurs at compile time is called checked exception
public class SQLExceptionClass {

    // For checked exceptions, either we need to add throws in the method definition or we need to handle it using try-catch block
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/database1";
        String uname = "root";
        String password = "root";
        String query = "select name,age from emp where id = '1' ";

        try {
//		    Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, password); // throw new SQLException("No suitable driver found for jdbc:mysql://localhost:3306/database1")
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println(name);

                String age = rs.getString(2);
                System.out.println(age);
            }
            con.close();
            ps.close();
            rs.close();
        } catch (SQLException e) { // This catch block handles SQLException
            System.out.println("Exception Object: " + e); // Exception Object: java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306/database1
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: No suitable driver found for jdbc:mysql://localhost:3306/database1
            e.printStackTrace();
            // java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306/database1
            // at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:708)
            // at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:230)
            // at exceptiontypes.checkedexceptions.SQLExceptionClass.main(SQLExceptionClass.java:18)
        }
        System.out.println("Program continues after exception handling");
    }


}
