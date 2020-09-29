package database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.Manager;
import wage.Payment;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class ConnectionToDBPutWage {
    private static final String URL = "jdbc:mysql://localhost:3306/testspring?useUnicode=true&useSSL=true" +
            "&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static  final String USERNAME = "root";
    private static  final String PASSWORD = "rootPassword";

    private static final String GET_NAME_POSITION = "SELECT salary FROM testspring.staff";
    private static final String UPDATE_WAGE = "UPDATE staff SET wage = ? where id = ?";

    private Connection connection;
    private static Random random = null;
    private int wage = 0;
    private  int j = 0;
    public void connectionFromSQL() throws SQLException {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("contextTestTask.xml");

        Random random = (Random) applicationContext.getBean("rand");

        try {

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement(GET_NAME_POSITION);
            ResultSet resultset = preparedStatement.executeQuery();
            int column = resultset.getMetaData().getColumnCount();
            preparedStatement = connection.prepareStatement(UPDATE_WAGE);

            while (resultset.next()) {
                for( int i = 1; i <= column ; i++) {
                    j++;
                    wage = Payment.payrollPreparation(random.nextInt(29), resultset.getInt(i));
                    preparedStatement.setInt(1, wage);
                    preparedStatement.setInt(2, j);
                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
