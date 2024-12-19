package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class GestionCheques {

    public void MenuCuentaPrincipal() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Gestión de Cheques\n1.crear cheque\n2.Buscar Cuenta\n"
                + "3.Ver Cuentas\n4.Desactivar cuenta\n5.Regresar"));

        JOptionPane.showMessageDialog(null, "Me disculpo de antemano, no se encuentra este módulo en funcionamiento");
        menuPrincipal menu = new menuPrincipal();
        menu.menuPrincipal();

    }

}
