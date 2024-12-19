package DAO;

import Controller.conexionMYSQL;
import Model.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alvaro
 */
//REQ: PATRONES DE DISEÑO - DAO
public class ClienteDAO {

    private Connection conexion;

    public ClienteDAO() {
        this.conexion = conexionMYSQL.getInstance().getConnection();
    }

    //Crear cliente
    public Cliente nuevoCliente(String identificacion, String nombre, String apellido, String direccion, String telefono, String correo) {

        String query = "INSERT INTO cheques (identificacion, nombre, apellido, direccion, telefono, correo) VALUES (?,?,?,?,?,?)";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, identificacion);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, direccion);
            ps.setString(5, telefono);
            ps.setString(7, correo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Cliente cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("identificacion"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        null,
                        rs.getTimestamp("fecha_registro"),
                        rs.getTimestamp("ultima_actividad")
                );

                return cliente;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    //Obiene un cliente
    public Cliente ObtenerCliente(String identificacion) {

        String query = "SELECT * FROM clientes WHERE identificacion = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, identificacion);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println(rs);

                Cliente cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("identificacion"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        null,
                        rs.getTimestamp("fecha_registro"),
                        rs.getTimestamp("ultima_actividad")
                );

                return cliente;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    //Actualiza un cliente
    public boolean ActualizarCheque(String identificacion, Enum estado) {

        String query = "UPDATE cheques SET estado = ? WHERE identificacion = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setObject(1, estado);
            ps.setString(2, identificacion);

            int rowAffected = ps.executeUpdate();

            if (rowAffected > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;

    }

    //Elimina un cliente
    public boolean EliminarCheque(String identificacion) {

        String query = "DELETE clientes WHERE identificacion = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, identificacion);

            int rowAffected = ps.executeUpdate();

            if (rowAffected > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //Obtiene la lista de cheques
    public List<Cliente> ObtenerClientes() {

        List<Cliente> clientes = new ArrayList<>();

        String query = "SELECT * FROM cheques";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs);

                Cliente cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("identificacion"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        null,
                        rs.getTimestamp("fecha_registro"),
                        rs.getTimestamp("ultima_actividad")
                );

                clientes.add(cliente);

            }

            return clientes;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

}
