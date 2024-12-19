package Main;

import View.menuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class main {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "¡Bienvenido al Banco Union!");
        
        menuPrincipal menu = new menuPrincipal();
        menu.menuPrincipal();
    }
    
}
