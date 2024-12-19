package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Alvaro
 */
public class conexionMYSQL {
    
    private static conexionMYSQL instance;
    private Connection conexion;

    // REQ: PATRONES DE DISEÑO - Singleton
    private conexionMYSQL() {
        
        try{
            
            String url = "jdbc:mysql://localhost:3306/banco_union";
            String user = "campus2023";
            String password = "campus2023";
            
            this.conexion = DriverManager.getConnection(url, user, password);
            
        }catch(SQLException e){
            
        }
        
    }
    
    public static conexionMYSQL getInstance(){
        
        if(instance == null){
            instance = new conexionMYSQL();
        }
        
        return instance;
        
    }
    
    public Connection getConnection(){
        
        return conexion;
        
    }
    
}
