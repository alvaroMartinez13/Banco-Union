package Factory;

import Model.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class CuentaEmpresarial implements CuentaCorriente {

    @Override
    public Cuenta nuevaCuenta() {
        JOptionPane.showMessageDialog(null, "Este apartado es para crear cuenta empresarial. Por estos momentos estamos en mantenimiento");
        return null;
    }

    @Override
    public boolean cambiarEstado() {
        JOptionPane.showMessageDialog(null, "Este apartado es para cambiar el estado de la cuenta personal a activo o inactivo."
                + " Por estos momentos estamos en mantenimiento");
        return true;
    }

}
