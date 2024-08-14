 package NotesApp;

import classconector.Cconexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

public class SaveInfo {
    public static void main(String[] args) {
    }

    public boolean registrarCliente(String User_id, String Order_ID, String Added_Notes) {
        String sql = "INSERT INTO `orders` (User_id, Order_ID, Added_Notes) VALUES (?,?,?)";

        Connection conectar;
        PreparedStatement pst;

        try {
            Cconexion conexion = new Cconexion();
            conectar = conexion.SetConection();

            pst = conectar.prepareStatement(sql);

            pst.setString(1, User_id);
            pst.setString(2, Order_ID);
            pst.setString(3, Added_Notes);

            int i = pst.executeUpdate();

            if (i != 0) {
                showTimedMessage("Info save it sucessfully");
                NotesFrame.orderid.setText(null);
                NotesFrame.TxTissue.setSelectedIndex(-1);
                NotesFrame.ResolutionTxT.setSelectedIndex(-1);
                NotesFrame.PromisesTxT.setSelectedIndex(0);
                NotesFrame.Ainfo.setText("N/A");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Transaction error");
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Doesn´t work properly");
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    private void showTimedMessage(String message) {
        JOptionPane optionPane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Mensaje");
        Timer timer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
                dialog.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();

        dialog.setVisible(true);
    }
}
