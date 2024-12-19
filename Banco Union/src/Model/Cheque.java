package Model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Alvaro
 */
public class Cheque {
    
    private int id;
    private String numero_Cheque;
    private int id_Cuenta;
    private String beneficiario;
    private double monto;
    private String monto_Letras;
    private Enum prioridad;
    private String firma_Digital;
    private Enum estado;
    private Enum razon_Rechazo;
    private Date fecha_Emision;
    private Timestamp fecha_Proceso;
    private boolean cobrado;
    private double cuenta_SaldoMomento;
    private Timestamp fecha_Modificacion;
    private String usuario_Modificacion;

    public Cheque(int id, String numero_Cheque, int id_Cuenta, String beneficiario, double monto, String monto_Letras, Enum prioridad, String firma_Digital, Enum estado, Enum razon_Rechazo, Date fecha_Emision, Timestamp fecha_Proceso, boolean cobrado, double cuenta_SaldoMomento, Timestamp fecha_Modificacion, String usuario_Modificacion) {
        this.id = id;
        this.numero_Cheque = numero_Cheque;
        this.id_Cuenta = id_Cuenta;
        this.beneficiario = beneficiario;
        this.monto = monto;
        this.monto_Letras = monto_Letras;
        this.prioridad = prioridad;
        this.firma_Digital = firma_Digital;
        this.estado = estado;
        this.razon_Rechazo = razon_Rechazo;
        this.fecha_Emision = fecha_Emision;
        this.fecha_Proceso = fecha_Proceso;
        this.cobrado = cobrado;
        this.cuenta_SaldoMomento = cuenta_SaldoMomento;
        this.fecha_Modificacion = fecha_Modificacion;
        this.usuario_Modificacion = usuario_Modificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_Cheque() {
        return numero_Cheque;
    }

    public void setNumero_Cheque(String numero_Cheque) {
        this.numero_Cheque = numero_Cheque;
    }

    public int getId_Cuenta() {
        return id_Cuenta;
    }

    public void setId_Cuenta(int id_Cuenta) {
        this.id_Cuenta = id_Cuenta;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMonto_Letras() {
        return monto_Letras;
    }

    public void setMonto_Letras(String monto_Letras) {
        this.monto_Letras = monto_Letras;
    }

    public Enum getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Enum prioridad) {
        this.prioridad = prioridad;
    }

    public String getFirma_Digital() {
        return firma_Digital;
    }

    public void setFirma_Digital(String firma_Digital) {
        this.firma_Digital = firma_Digital;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    public Enum getRazon_Rechazo() {
        return razon_Rechazo;
    }

    public void setRazon_Rechazo(Enum razon_Rechazo) {
        this.razon_Rechazo = razon_Rechazo;
    }

    public Date getFecha_Emision() {
        return fecha_Emision;
    }

    public void setFecha_Emision(Date fecha_Emision) {
        this.fecha_Emision = fecha_Emision;
    }

    public Timestamp getFecha_Proceso() {
        return fecha_Proceso;
    }

    public void setFecha_Proceso(Timestamp fecha_Proceso) {
        this.fecha_Proceso = fecha_Proceso;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    public double getCuenta_SaldoMomento() {
        return cuenta_SaldoMomento;
    }

    public void setCuenta_SaldoMomento(double cuenta_SaldoMomento) {
        this.cuenta_SaldoMomento = cuenta_SaldoMomento;
    }

    public Timestamp getFecha_Modificacion() {
        return fecha_Modificacion;
    }

    public void setFecha_Modificacion(Timestamp fecha_Modificacion) {
        this.fecha_Modificacion = fecha_Modificacion;
    }

    public String getUsuario_Modificacion() {
        return usuario_Modificacion;
    }

    public void setUsuario_Modificacion(String usuario_Modificacion) {
        this.usuario_Modificacion = usuario_Modificacion;
    }
            
}
