package Model;

import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author Alvaro
 */
public class Cuenta {
    
    private int id;
    private int id_Cliente;
    private Enum tipo;
    private double saldo;
    private double limite_Saldo;
    private Timestamp fecha_Apertura;
    private Enum estado;

    public Cuenta(int id, int id_Cliente, Enum tipo, double saldo, double limite_Saldo, Timestamp fecha_Apertura, Enum estado) {
        this.id = id;
        this.id_Cliente = id_Cliente;
        this.tipo = tipo;
        this.saldo = saldo;
        this.limite_Saldo = limite_Saldo;
        this.fecha_Apertura = fecha_Apertura;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite_Saldo() {
        return limite_Saldo;
    }

    public void setLimite_Saldo(double limite_Saldo) {
        this.limite_Saldo = limite_Saldo;
    }

    public Timestamp getFecha_Apertura() {
        return fecha_Apertura;
    }

    public void setFecha_Apertura(Timestamp fecha_Apertura) {
        this.fecha_Apertura = fecha_Apertura;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }
    
    
    
}
