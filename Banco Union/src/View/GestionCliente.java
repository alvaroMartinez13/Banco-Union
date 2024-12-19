package View;

import DAO.ClienteDAO;
import Model.Cliente;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class GestionCliente {

    private ClienteDAO cliente;

    public GestionCliente() {
        this.cliente = new ClienteDAO();
    }

    public void MenuCuentaPrincipal() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Gestión de Clientes\n1.Nuevo Cliente\n2.Ver Clientes"
                + "\n3.Actualizar Cliente\n4.Eliminar Cliente\n5.Regresar"));

        opcionSeleccion(opcion);

    }

    public void opcionSeleccion(int opcion) {

        gestionCuenta cuenta = new gestionCuenta();

        switch (opcion) {
            case 1:
                crearCliente();
                break;

            case 2:
                verClientes();
                break;

            case 3:
                ActualizarCliente();
                break;

            case 4:
                EliminarCliente();
                break;

            case 5:
                cuenta.MenuCuentaPrincipal();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Debes seleccionar una opción presentada");
                MenuCuentaPrincipal();
        }

    }

    public void crearCliente() {

        String identificacion = JOptionPane.showInputDialog("Digite su identifiacion");

        if (identificacion == null || identificacion.equals("")) {

            JOptionPane.showMessageDialog(null, "Debes registrar números");
            crearCliente();
        }

        String nombre = JOptionPane.showInputDialog("Digite su nombre");

        if (nombre == null || nombre.equals("")) {

            JOptionPane.showMessageDialog(null, "Debes registrar su nombre");
            crearCliente();
        }

        String apellido = JOptionPane.showInputDialog("Digite su apellido");

        if (apellido == null || apellido.equals("")) {

            JOptionPane.showMessageDialog(null, "Debes registrar su apellido");
            crearCliente();
        }

        String direccion = JOptionPane.showInputDialog("Digite su dirección");

        if (direccion == null || direccion.equals("")) {

            JOptionPane.showMessageDialog(null, "Debes registrar su dirección");
            crearCliente();
        }

        String telefono = JOptionPane.showInputDialog("Digite su telefono");

        if (telefono == null || telefono.equals("")) {

            JOptionPane.showMessageDialog(null, "Debes registrar su telefono");
            crearCliente();
        }

        String correo = JOptionPane.showInputDialog("Digite su correo");

        if (correo == null || correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Debes registrar su correo");
            crearCliente();
        }

        Cliente clienteNuevo = cliente.nuevoCliente(identificacion, nombre, apellido, direccion, telefono, correo);

        if (clienteNuevo != null) {
            JOptionPane.showMessageDialog(null, "Se ha creado correctamente cliente: " + clienteNuevo.getNombre() + " " + clienteNuevo.getApellido());
        } else {
            JOptionPane.showMessageDialog(null, "se ha generado un error. Comuniquese con el Servidor");
        }

        MenuCuentaPrincipal();

    }

    public void verClientes() {
        List<Cliente> clientes = cliente.ObtenerClientes();

        if (clientes != null) {

            for (Cliente clientee : clientes) {

                JOptionPane.showMessageDialog(null, "Cliente identificado con número: "
                        + clientee.getIdentificacion() + " | Nombre: " + clientee.getNombre() + " " + clientee.getApellido());

            }

        } else {
            JOptionPane.showMessageDialog(null, "se ha generado un error. Comuniquese con el Servidor");
        }

        MenuCuentaPrincipal();

    }

    public void ActualizarCliente() {
        JOptionPane.showMessageDialog(null, "Problemas técnicos", "Error", JOptionPane.ERROR_MESSAGE);
        MenuCuentaPrincipal();
    }

    public void EliminarCliente() {
        String ident = JOptionPane.showInputDialog("Digite la identificación de quién deseas eliminar");

        if (ident == null || ident.equals("")) {
            JOptionPane.showMessageDialog(null, "Debes registrar su identificación");
            EliminarCliente();
        }

        boolean eliminado = cliente.EliminarCheque(ident);

        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Has eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no existe");
        }

        MenuCuentaPrincipal();

    }

}
