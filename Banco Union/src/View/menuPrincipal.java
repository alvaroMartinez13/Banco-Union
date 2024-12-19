package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class menuPrincipal {

    public void menuPrincipal() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Gestión de Cuentas\n2.Gestión de Cheques\n3.Salir"));

        opcionSeleccion(opcion);

    }

    public void opcionSeleccion(int opcion) {
        
        gestionCuenta cuenta = new gestionCuenta();
        GestionCheques cheques = new GestionCheques();

        switch (opcion) {
            case 1:
                cuenta.MenuCuentaPrincipal();
                break;

            case 2:
                cheques.MenuCuentaPrincipal();
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Adiós, vuelva pronto");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Debes seleccionar una opción presentada");
                menuPrincipal();
        }

    }

}
