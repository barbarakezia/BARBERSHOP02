/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BK_DAO;



import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author barbara
 */
public class BK_ConexaoDB {
    private static final String USERNAME = "arnold";
    private static  final String PASSWORD = "84150501";
    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/BK_BARBERSHOP_rmi?useTimezone=trure&serverTimezone=UTC";
    
    public static Connection retornaBK_Conexao () throws Exception{
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            return connection;
            
        }catch(Exception e){
            
            System.out.println("erro:"+e.toString());
            
        }
        return null;
    }

    public static void inicia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
