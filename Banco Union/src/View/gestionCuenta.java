package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class gestionCuenta {

    public void MenuCuentaPrincipal() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Gestión de Cuentas\n1.Gestión de Clientes\n2.Gestionar las Cuentas\n3.Depositos\n4.Retiros\n5.Regresar"));

        opcionSeleccion(opcion);

    }

    public void opcionSeleccion(int opcion) {

        menuPrincipal menu = new menuPrincipal();
        GestionCuentas cuentas = new GestionCuentas();

        switch (opcion) {
            case 1:
                cuentas.MenuCuentaPrincipal();
                menu.menuPrincipal();
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "¡Estamos en mantenimiento!");
                menu.menuPrincipal();
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "¡Estamos en mantenimiento!");
                menu.menuPrincipal();
                break;

            case 4:
                menu.menuPrincipal();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Debes seleccionar una opción presentada");
                MenuCuentaPrincipal();
        }

    }

}
