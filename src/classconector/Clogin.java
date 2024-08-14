package classconector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import NotesApp.Next;
import javax.swing.JLabel;

public class Clogin {
    
    public void CheckUser(JLabel TxTuser, JPasswordField TxTpass, Next athis){
        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            classconector.Cconexion objetoCconexion = new classconector.Cconexion();
          
            String consult = "SELECT * FROM `users_logs` WHERE users_logs.User_id = ? AND users_logs.PassWord = ?";
            ps = objetoCconexion.SetConection().prepareStatement(consult);
           
            String user = TxTuser.getText().trim();
            String pass = String.valueOf(TxTpass.getPassword()).trim();
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                //JOptionPane.showMessageDialog(null, "Password correcto");
                NotesApp.NotesFrame objetoMenu = new NotesApp.NotesFrame();
                objetoMenu.setVisible(true);
                athis.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
}
