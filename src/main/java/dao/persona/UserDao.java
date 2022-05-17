package dao.persona;

import Herrramientas.Conexion;
import static Herrramientas.Conexion.*;
import dto.persona.Cliente;
import dto.persona.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao {

    static Connection con = null;
    static PreparedStatement pst = null;
    static ResultSet rst = null;

    private static final String INSERT = "INSERT INTO user (user_id,user_rol_id,nombre1,nombre2,apellido1,appellido2,telefono,correo,documento,contrasena) values (?,?,?,?,?,?,?,?,?,?)";

//registro UserDao;
    public static boolean registerUser(Cliente user) {

        boolean registerUser = true;

        try {
            con = getConnection();
            pst = con.prepareStatement(INSERT);
            pst.setString(1, user.getId());
            pst.setString(2, user.getRolId());
            pst.setString(3, user.getNombre1());
            pst.setString(4, user.getNombre2());
            pst.setString(5, user.getApellido1());
            pst.setString(6, user.getApellido2());
            pst.setString(7, user.getTelefono());
            pst.setString(8, user.getCorreo());
            pst.setString(9, user.getDocumento());
            pst.setString(10, user.getContrasena());
         
        
            System.out.println(user.getDocumento());
            pst.executeUpdate();

        } catch (SQLException ex) {
            registerUser = false;
            ex.printStackTrace(System.out);
        } finally {
            close(pst);
            Conexion.close(con);
        }
        return registerUser;
    }

}
