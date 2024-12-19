package Model;

import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author Alvaro
 */
public class transaccion {
    
    private int id;
    private int id_Cuenta;
    private Enum tipo;
    private double monto;
    private Timestamp fecha;
    private String Referencia;
    private double saldo_Anterior;
    private double saldo_Nuevo;
    private Enum estado;

    public transaccion(int id, int id_Cuenta, Enum tipo, double monto, Timestamp fecha, String Referencia, double saldo_Anterior, double saldo_Nuevo, Enum estado) {
        this.id = id;
        this.id_Cuenta = id_Cuenta;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.Referencia = Referencia;
        this.saldo_Anterior = saldo_Anterior;
        this.saldo_Nuevo = saldo_Nuevo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Cuenta() {
        return id_Cuenta;
    }

    public void setId_Cuenta(int id_Cuenta) {
        this.id_Cuenta = id_Cuenta;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public double getSaldo_Anterior() {
        return saldo_Anterior;
    }

    public void setSaldo_Anterior(double saldo_Anterior) {
        this.saldo_Anterior = saldo_Anterior;
    }

    public double getSaldo_Nuevo() {
        return saldo_Nuevo;
    }

    public void setSaldo_Nuevo(double saldo_Nuevo) {
        this.saldo_Nuevo = saldo_Nuevo;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }
    
}
