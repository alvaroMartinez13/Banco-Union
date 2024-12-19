package Factory;

import Model.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class CuentaPersonal implements CuentaCorriente{

    @Override
    public Cuenta nuevaCuenta() {
        JOptionPane.showMessageDialog(null,"Este apartado es para crear cuenta personal. Por estos momentos estamos en mantenimiento");
        return null;
    }

    @Override
    public boolean cambiarEstado() {
        JOptionPane.showMessageDialog(null,"Este apartado es para cambiar el estado de la cuenta personal a activo o inactivo."
                + " Por estos momentos estamos en mantenimiento");
        return true;
    }
    
    
    
}
