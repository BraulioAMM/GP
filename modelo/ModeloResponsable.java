/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Conexion;
import clases.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author braul
 */
public class ModeloResponsable {
    public ArrayList<Usuario> getClientes() throws SQLException {
        Connection cn = Conexion.conectar();
        Statement stmt;
        ResultSet rs;
        ArrayList<Usuario> listaProyecto = new ArrayList<>();
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("select id_proyecto, nombre_proyecto from proyecto");
            while (rs.next()) {
                Usuario responsable = new Usuario();
                responsable.setId_responsable(rs.getInt("id_responsable"));
                responsable.setNombre_responsable(rs.getString("nombre_responsable"));
                responsable.setPuesto(rs.getString("puesto"));
                listaProyecto.add(responsable);
            }
        } catch (SQLException e) {

        }
        return listaProyecto;
    }
}
