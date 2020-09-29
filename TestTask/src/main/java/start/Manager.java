package start;

import database.ConnectionToDBPutWage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Manager {
    public static void main(String[] args) throws SQLException {
        ConnectionToDBPutWage connection = null;
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("contextTestTask.xml");

        Object obj = applicationContext.getBean("connect");

        if(obj instanceof ConnectionToDBPutWage) {
            connection = (ConnectionToDBPutWage) obj;
        }

        connection.connectionFromSQL();
    }
}
