package View;

import Factory.CuentaCorriente;
import Factory.CuentaEmpresarial;
import Factory.CuentaPersonal;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class GestionCuentas {

    public void MenuCuentaPrincipal() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Gestión de Cuentas\n1.crear cuenta\n2.Buscar Cuenta\n"
                + "3.Ver Cuentas\n4.Desactivar cuenta\n5.Regresar"));

        opcionSeleccion(opcion);

    }

    public void opcionSeleccion(int opcion) {

        gestionCuenta cuenta = new gestionCuenta();

        switch (opcion) {
            case 1:
                crearCuenta();
                break;

            case 2:
                buscarCuenta();
                break;

            case 3:
                VerCuentas();
                break;

            case 4:
                desactivarCuenta();
                break;

            case 5:
                cuenta.MenuCuentaPrincipal();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Debes seleccionar una opción presentada");
                MenuCuentaPrincipal();
        }

    }

    public void crearCuenta() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué cuenta sea crear?\n1.Cuenta Personal\n2.Cuenta Empresarial"));

        // REQ: PATRONES DE DISEÑO - Factory implementación
        switch (opcion) {
            case 1:
                CuentaCorriente personal = new CuentaPersonal();
                personal.nuevaCuenta();
                MenuCuentaPrincipal();
                break;

            case 2:
                CuentaCorriente empresarial = new CuentaEmpresarial();
                empresarial.nuevaCuenta();
                MenuCuentaPrincipal();
                break;

            case 3:
                MenuCuentaPrincipal();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Debes seleccionar una opción presentada");
                MenuCuentaPrincipal();
        }

    }

    public void buscarCuenta() {

        JOptionPane.showMessageDialog(null, "En estos momentos nos encontramos en mantenimiento, inge Carlos");

    }

    public void VerCuentas() {

        JOptionPane.showMessageDialog(null, "En estos momentos nos encontramos en mantenimiento, inge Carlos");

    }
    
    public void desactivarCuenta(){

        JOptionPane.showMessageDialog(null, "En estos momentos nos encontramos en mantenimiento, inge Carlos");

    }

}
