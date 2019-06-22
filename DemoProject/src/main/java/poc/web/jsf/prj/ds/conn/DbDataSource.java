/**
 * 
 */
package poc.web.jsf.prj.ds.conn;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @author Ashok Kumar Jha
 *
 */
public class DbDataSource {

    private static BasicDataSource ds = new BasicDataSource();

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }        
        ds.setUrl("jdbc:postgresql://localhost/poc");
        ds.setUsername("ashok");
        ds.setPassword("ash0k");
        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(100);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    private DbDataSource(){ }
}
