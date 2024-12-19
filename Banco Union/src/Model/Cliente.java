package Model;

import java.sql.Timestamp;

/**
 *
 * @author Alvaro
 */
public class Cliente {
    
    private int id;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private Enum estado;
    private Timestamp fecha_Registro;
    private Timestamp ultima_Actividad;
    
        public Cliente(int id, String identificacion, String nombre, String apellido, String direccion,
            String telefono, String correo) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Cliente(int id, String identificacion, String nombre, String apellido, String direccion,
            String telefono, String correo, Enum estado, Timestamp fecha_Registro, Timestamp ultima_Actividad) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
        this.fecha_Registro = fecha_Registro;
        this.ultima_Actividad = ultima_Actividad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    public Timestamp getFecha_Registro() {
        return fecha_Registro;
    }

    public void setFecha_Registro(Timestamp fecha_Registro) {
        this.fecha_Registro = fecha_Registro;
    }

    public Timestamp getUltima_Actividad() {
        return ultima_Actividad;
    }

    public void setUltima_Actividad(Timestamp ultima_Actividad) {
        this.ultima_Actividad = ultima_Actividad;
    }
          
}
