
package NotesApp;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class NotesFrame extends javax.swing.JFrame {

    public NotesFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(getIconImage());
    }
     public Image getIconImage(){
     Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("NotesApp/pictures/amazon.png"));
    return retValue;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        csaLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        orderid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ainfo = new javax.swing.JTextArea();
        TxTissue = new javax.swing.JComboBox<>();
        PromisesTxT = new javax.swing.JComboBox<>();
        ResolutionTxT = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        SubmitButtom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Themes = new javax.swing.JMenu();
        Tligth = new javax.swing.JMenuItem();
        DarkTheme = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenu();
        ExitP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ownership");
        setMaximumSize(new java.awt.Dimension(1200, 1200));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(541, 843));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 1200));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Welcome");

        csaLogin.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        csaLogin.setForeground(new java.awt.Color(0, 0, 0));
        csaLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        csaLogin.setText(" ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Cx's Issue:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Promises:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Order ID:");

        orderid.setBackground(new java.awt.Color(255, 255, 255));
        orderid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        orderid.setForeground(new java.awt.Color(0, 0, 0));
        orderid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orderid.setText(" ");
        orderid.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        orderid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                orderidKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Resolution:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Aditional Info:");

        Ainfo.setBackground(new java.awt.Color(255, 255, 255));
        Ainfo.setColumns(20);
        Ainfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ainfo.setForeground(new java.awt.Color(0, 0, 0));
        Ainfo.setRows(5);
        Ainfo.setText(" N/A");
        Ainfo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(Ainfo);

        TxTissue.setBackground(new java.awt.Color(255, 255, 255));
        TxTissue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TxTissue.setForeground(new java.awt.Color(0, 0, 0));
        TxTissue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Cx report DNR", "Defective item", "Lost on transit", "Order undeliverable", "Return item no refund" }));
        TxTissue.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        PromisesTxT.setBackground(new java.awt.Color(255, 255, 255));
        PromisesTxT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PromisesTxT.setForeground(new java.awt.Color(0, 0, 0));
        PromisesTxT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "FU to confirm Process", "ReturnLess Replacement", "Returnless Refund", "Return replacement order later", "Price honor for original order", "TIcket for stuck order", "Ticket to Cancel order", "Call later Cx", "Email later Cx" }));
        PromisesTxT.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        PromisesTxT.setMinimumSize(new java.awt.Dimension(233, 31));

        ResolutionTxT.setBackground(new java.awt.Color(255, 255, 255));
        ResolutionTxT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ResolutionTxT.setForeground(new java.awt.Color(0, 0, 0));
        ResolutionTxT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Refund for order", "Replacement", "Advise to wait", "ReturnLess Refund", "Refund returned Item", "No info for Returned item", "AC3 issue to take action" }));
        ResolutionTxT.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        ResolutionTxT.setMinimumSize(new java.awt.Dimension(233, 31));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotesApp/pictures/Bluebuttom.png"))); // NOI18N
        jButton1.setText("To Clipboard");
        jButton1.setToolTipText("Click to copy info");
        jButton1.setActionCommand(" ");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Click to copy to clipboard");

        SubmitButtom.setBackground(new java.awt.Color(255, 255, 255));
        SubmitButtom.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        SubmitButtom.setForeground(new java.awt.Color(0, 0, 0));
        SubmitButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotesApp/pictures/iconsubmit1.png"))); // NOI18N
        SubmitButtom.setToolTipText("Click to save Notes for order.");
        SubmitButtom.setBorder(null);
        SubmitButtom.setBorderPainted(false);
        SubmitButtom.setContentAreaFilled(false);
        SubmitButtom.setEnabled(false);
        SubmitButtom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SubmitButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtomActionPerformed(evt);
            }
        });
        SubmitButtom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SubmitButtomKeyReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotesApp/pictures/logo.png"))); // NOI18N
        jLabel2.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(csaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(orderid, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PromisesTxT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxTissue, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ResolutionTxT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106)
                        .addComponent(SubmitButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel6)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(csaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxTissue, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(ResolutionTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PromisesTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(SubmitButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(294, 294, 294)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(506, Short.MAX_VALUE)))
        );

        jMenu1.setText("Opciones");

        Themes.setText("Themes");

        Tligth.setText("Ligth Theme");
        Tligth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TligthActionPerformed(evt);
            }
        });
        Themes.add(Tligth);

        DarkTheme.setText("Dark Theme");
        DarkTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarkThemeActionPerformed(evt);
            }
        });
        Themes.add(DarkTheme);

        jMenu1.add(Themes);

        About.setText("About!");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu1.add(About);

        jMenuBar1.add(jMenu1);

        Exit.setText("Exit");

        ExitP.setText("SafeExit");
        ExitP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitPActionPerformed(evt);
            }
        });
        Exit.add(ExitP);

        jMenuBar1.add(Exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtomActionPerformed
        SaveInfo SendInfo = new SaveInfo();
        
        String User_id = csaLogin.getText();
        String Order_ID =  orderid.getText();
        String Added_Notes = "Cx issue:" + TxTissue.getSelectedItem().toString() + "\r\n"+ "Resolution :" + ResolutionTxT.getSelectedItem().toString()+ "\r\n" +"Promises :" + PromisesTxT.getSelectedItem().toString()+ "\r\n"+"Aditiona info: " + Ainfo.getText();  
        SendInfo.registrarCliente(User_id, Order_ID,Added_Notes);
    }//GEN-LAST:event_SubmitButtomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
                String CopyTxt = "Cx issue:" + TxTissue.getSelectedItem().toString() + "\r\n"+ "Resolution :" + ResolutionTxT.getSelectedItem().toString()+ "\r\n" +"Promises :" + PromisesTxT.getSelectedItem().toString()+ "\r\n"+"Aditiona info: " + Ainfo.getText();
                StringSelection stringSelection = new StringSelection(CopyTxt);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
                showTimedMessage("Info copied to clipboard");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SubmitButtomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SubmitButtomKeyReleased
       
    }//GEN-LAST:event_SubmitButtomKeyReleased

    private void orderidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderidKeyReleased
        if (!orderid.getText().isEmpty()) {
                 SubmitButtom.setEnabled(true);    
             }
        else{
             SubmitButtom.setEnabled(false); 
        }
    }//GEN-LAST:event_orderidKeyReleased

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        JOptionPane.showMessageDialog(null,"Author: Eduin Vargas \n Login: XVARGAED");
    }//GEN-LAST:event_AboutActionPerformed

    private void ExitPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitPActionPerformed
        System.exit(0);    
    }//GEN-LAST:event_ExitPActionPerformed

    private void DarkThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarkThemeActionPerformed
        getContentPane();jPanel2.setBackground(new Color(102,102,102));
        getContentPane();jPanel2.setForeground(Color.WHITE);
          
    }//GEN-LAST:event_DarkThemeActionPerformed

    private void TligthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TligthActionPerformed
        getContentPane();jPanel2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_TligthActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotesFrame().setVisible(true);
            }
        });
    }
    private void showTimedMessage(String message) {

        JOptionPane optionPane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Mensaje");

        Timer timer = new Timer(500, new ActionListener() {
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    public static javax.swing.JTextArea Ainfo;
    private javax.swing.JMenuItem DarkTheme;
    private javax.swing.JMenu Exit;
    private javax.swing.JMenuItem ExitP;
    public static javax.swing.JComboBox<String> PromisesTxT;
    public static javax.swing.JComboBox<String> ResolutionTxT;
    private javax.swing.JButton SubmitButtom;
    private javax.swing.JMenu Themes;
    private javax.swing.JMenuItem Tligth;
    public static javax.swing.JComboBox<String> TxTissue;
    public static javax.swing.JLabel csaLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField orderid;
    // End of variables declaration//GEN-END:variables
}
