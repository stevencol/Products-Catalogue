package Herrramientas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String DB_URL = "jdbc:mysql://192.168.200.25:3306/tienda?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "Steven";
    private static final String DB_PASS = "1994";

    private static DataSource dataSource() {
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(DB_URL);
        bds.setUsername(DB_USER);
        bds.setPassword(DB_PASS);
        bds.setInitialSize(2);
        return bds;
    }

    public static Connection getConnection() throws SQLException {
        return dataSource().getConnection();
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void close(PreparedStatement pst) {
        try {
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
