package Factory;

import Model.Cuenta;

/**
 *
 * @author Alvaro
 */

// REQ: PATRONES DE DISEÑO - Factory
public interface CuentaCorriente {
    
    Cuenta nuevaCuenta();
    boolean cambiarEstado();
    
}
