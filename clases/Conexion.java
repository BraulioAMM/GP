package clases;
import java.sql.*;
/**
 *
 * @author braul
 */
public class Conexion {
    public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sgp", "root", "");
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sgpv2", "root", "");
            return cn;
        }catch(Exception e){
            System.out.println("Error en conexión local"+e);
        }
        return null;
    }
}
