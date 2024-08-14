package classconector;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Cconexion {
    Connection conector;
    String user="root";
    String password="";
    String bd="ordersdatebase";
    String ip="127.0.0.1";
    String port="3306";
    String chain ="jdbc:mysql://"+ip+":"+port+"/"+bd;
    
    public Connection SetConection(){
    
        try {
            conector = DriverManager.getConnection(chain,user,password);
            //JOptionPane.showMessageDialog(null,"se conecto correctamente" );
            
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"problema al conectar"+ e.toString());
        }
    return conector;
    }
    }
    

