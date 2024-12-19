package DAO;

import Controller.conexionMYSQL;
import Model.Cheque;
import Model.Cuenta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alvaro
 */
// REQ: PATRONES DE DISEÑO - DAO
public class ChequeDAO {

    private Connection conexion;

    public ChequeDAO() {
        this.conexion = conexionMYSQL.getInstance().getConnection();
    }

    //Crea un nuevo cheque
    public boolean NuevoCheque(String numCheque, Cuenta cuenta, String benficiario, double monto, String firmaDigital, Enum prioridad) {

        String query = "INSERT INTO cheques (numero_cheque, id_cuenta, beneficiario, monto, monto_letras, prioridad,"
                + " firma_digital, fecha_emision, cuenta_saldo_momento) VALUES (?,?,?,?,?,?,?,?,?)";

        Date fecha = null;

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, numCheque);
            ps.setInt(2, cuenta.getId());
            ps.setString(3, benficiario);
            ps.setDouble(4, monto);
            ps.setString(5, query);
            ps.setObject(6, prioridad);
            ps.setString(7, firmaDigital);
            ps.setDate(8, fecha);
            ps.setDouble(9, monto);

            int rowAffected = ps.executeUpdate();

            if (rowAffected > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //Obiene un cheque
    public Cheque ObtenerCheque(String numCheque) {

        String query = "SELECT * FROM cheques WHERE numCheque = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, numCheque);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println(rs);

                Cheque cheque = new Cheque(
                        rs.getInt("id"),
                        numCheque,
                        rs.getInt("id_cuenta"),
                        rs.getString("beneficiario"),
                        rs.getDouble("monto"),
                        rs.getString("monto_letras"),
                        null,
                        rs.getString("firma_digital"),
                        null,
                        null,
                        rs.getDate("fecha_emision"),
                        rs.getTimestamp("fecha_proceso"),
                        rs.getBoolean("cobrado"),
                        rs.getDouble("cuenta_saldo_momento"),
                        rs.getTimestamp("fecha_modificacion"),
                        rs.getString("usuario_modificacion")
                );

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    //Actualiza un cheque
    public boolean ActualizarCheque(String usuario_modificacion, String numCheque) {

        
        String query = "UPDATE cheques SET usuario_Modificacion = ? WHERE numero_cheque = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, usuario_modificacion);
            ps.setString(2, numCheque);

            int rowAffected = ps.executeUpdate();

            if (rowAffected > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
        
    }

    //Elimina un cheque
    public boolean EliminarCheque(String numCheque) {

        String query = "DELETE cheques WHERE numero_cheque = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, numCheque);

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
    public List<Cheque> ObtenerCheques() {
        
        List<Cheque> cheques = new ArrayList<>();

        String query = "SELECT * FROM cheques";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(rs);

                Cheque cheque = new Cheque(
                        rs.getInt("id"),
                        rs.getString("numero_cheque"),
                        rs.getInt("id_cuenta"),
                        rs.getString("beneficiario"),
                        rs.getDouble("monto"),
                        rs.getString("monto_letras"),
                        null,
                        rs.getString("firma_digital"),
                        null,
                        null,
                        rs.getDate("fecha_emision"),
                        rs.getTimestamp("fecha_proceso"),
                        rs.getBoolean("cobrado"),
                        rs.getDouble("cuenta_saldo_momento"),
                        rs.getTimestamp("fecha_modificacion"),
                        rs.getString("usuario_modificacion")
                );
                
                cheques.add(cheque);

            }
            
            return cheques;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

}
