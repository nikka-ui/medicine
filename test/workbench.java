
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.util.Vector;


/**
 *
 * @author ASUS
 */
public class workbench extends javax.swing.JFrame {
    
    private static final String username = "root";
    private static final String password = "02nikk@A";
    private static final String dataConn = "jdbc:mysql://localhost:3306/connector";
    
    Connection sqlCon = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;
    
    public workbench(){
        initComponents();
    }
    /**
     * Creates new form workbench
     */
    
    public void upDateDB(){
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      sqlCon = DriverManager.getConnection(dataConn, username, password);
      pst = sqlCon.prepareStatement("select * from connector");
      
      rs = pst.executeQuery();
      ResultSetMetaData stData = rs.getMetaData();
       
      q = stData.getColumnCount();
       
      DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
      RecordTable.setRowCount(0);
       
      while(rs.next()){
        Vector columnData = new Vector ();
         
        for (i = 1; i <= q; i++)
        {
          columnData.add(rs.getString("id"));
          columnData.add(rs.getString("StudentID"));
          columnData.add(rs.getString("Firstname"));
          columnData.add(rs.getString("Surname"));
          columnData.add(rs.getString("Address"));
          columnData.add(rs.getString("PostCode"));
          columnData.add(rs.getString("Telephone"));  
        }
        RecordTable.addRow(columnData);
      }
    }
    catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, ex);
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(workbench.class.getName()).log(Level.SEVERE, 
                    null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        asd = new javax.swing.JLabel();
        jtxtStudentID = new javax.swing.JTextField();
        szc = new javax.swing.JLabel();
        jtxtFirstname = new javax.swing.JTextField();
        dv = new javax.swing.JLabel();
        jtxtSurname = new javax.swing.JTextField();
        s = new javax.swing.JLabel();
        jtxtAddress = new javax.swing.JTextField();
        sfw = new javax.swing.JLabel();
        jtxtPostCode = new javax.swing.JTextField();
        ht = new javax.swing.JLabel();
        jtxtTelephone = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jbtnAddNew = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnRest = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 234, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(188, 184, 177));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 63, 58), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(188, 184, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(188, 184, 177));
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Leelawadee UI", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student ID", "Firstname", "Surname", "Address", "Post Code", "Telephone"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 290));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 104, 94));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Created by: Nikka T. Cruz");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 320, 780, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 790, 350));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 940, -1));

        jLabel1.setBackground(new java.awt.Color(242, 248, 246));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 30, 28));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OOP FINAL QUIZ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 824, 50));

        jPanel3.setBackground(new java.awt.Color(188, 184, 177));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asd.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        asd.setForeground(new java.awt.Color(22, 20, 19));
        asd.setText("Student ID");
        asd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(asd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 30));

        jtxtStudentID.setBackground(new java.awt.Color(226, 223, 223));
        jtxtStudentID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtStudentID.setForeground(new java.awt.Color(22, 20, 19));
        jtxtStudentID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtStudentIDActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 400, 30));

        szc.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        szc.setForeground(new java.awt.Color(22, 20, 19));
        szc.setText("Firstname");
        szc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(szc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        jtxtFirstname.setBackground(new java.awt.Color(226, 223, 223));
        jtxtFirstname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtFirstname.setForeground(new java.awt.Color(22, 20, 19));
        jtxtFirstname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jtxtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 400, 30));

        dv.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dv.setForeground(new java.awt.Color(22, 20, 19));
        dv.setText("Surname");
        dv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 30));

        jtxtSurname.setBackground(new java.awt.Color(226, 223, 223));
        jtxtSurname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtSurname.setForeground(new java.awt.Color(22, 20, 19));
        jtxtSurname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jtxtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 400, 30));

        s.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        s.setForeground(new java.awt.Color(22, 20, 19));
        s.setText("Address");
        s.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

        jtxtAddress.setBackground(new java.awt.Color(226, 223, 223));
        jtxtAddress.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtAddress.setForeground(new java.awt.Color(22, 20, 19));
        jtxtAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 400, 30));

        sfw.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        sfw.setForeground(new java.awt.Color(22, 20, 19));
        sfw.setText("Post Code");
        sfw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(sfw, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 30));

        jtxtPostCode.setBackground(new java.awt.Color(226, 223, 223));
        jtxtPostCode.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtPostCode.setForeground(new java.awt.Color(22, 20, 19));
        jtxtPostCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jtxtPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 400, 30));

        ht.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ht.setForeground(new java.awt.Color(22, 20, 19));
        ht.setText("Telephone");
        ht.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 30));

        jtxtTelephone.setBackground(new java.awt.Color(226, 223, 223));
        jtxtTelephone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtTelephone.setForeground(new java.awt.Color(22, 20, 19));
        jtxtTelephone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jtxtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 400, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 550, 270));

        jPanel5.setBackground(new java.awt.Color(188, 184, 177));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnAddNew.setBackground(new java.awt.Color(240, 216, 209));
        jbtnAddNew.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnAddNew.setForeground(new java.awt.Color(22, 20, 19));
        jbtnAddNew.setText("ADD NEW");
        jbtnAddNew.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnAddNew.setBorderPainted(false);
        jbtnAddNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAddNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAddNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAddNewMouseClicked(evt);
            }
        });
        jPanel5.add(jbtnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 30));

        jbtnUpdate.setBackground(new java.awt.Color(240, 216, 209));
        jbtnUpdate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnUpdate.setForeground(new java.awt.Color(22, 20, 19));
        jbtnUpdate.setText("UPDATE");
        jbtnUpdate.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnUpdate.setBorderPainted(false);
        jbtnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnUpdateMouseClicked(evt);
            }
        });
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 30));

        jbtnPrint.setBackground(new java.awt.Color(240, 216, 209));
        jbtnPrint.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnPrint.setForeground(new java.awt.Color(22, 20, 19));
        jbtnPrint.setText("PRINT");
        jbtnPrint.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnPrint.setBorderPainted(false);
        jbtnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPrintMouseClicked(evt);
            }
        });
        jPanel5.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 30));

        jbtnRest.setBackground(new java.awt.Color(240, 216, 209));
        jbtnRest.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnRest.setForeground(new java.awt.Color(22, 20, 19));
        jbtnRest.setText("RESET");
        jbtnRest.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnRest.setBorderPainted(false);
        jbtnRest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRestActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 30));

        jbtnDelete.setBackground(new java.awt.Color(240, 216, 209));
        jbtnDelete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnDelete.setForeground(new java.awt.Color(22, 20, 19));
        jbtnDelete.setText("DELETE");
        jbtnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnDelete.setBorderPainted(false);
        jbtnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnDeleteMouseClicked(evt);
            }
        });
        jPanel5.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 30));

        jbtnExit.setBackground(new java.awt.Color(240, 216, 209));
        jbtnExit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(22, 20, 19));
        jbtnExit.setText("EXIT");
        jbtnExit.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnExit.setBorderPainted(false);
        jbtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 230, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtStudentIDActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", 
                "MySQL Connector",
            JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_OPTION)
    {
        System.exit(0);
        }

    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRestActionPerformed
        jtxtStudentID.setText("");
        jtxtFirstname.setText("");

        jtxtSurname.setText("");
        jtxtAddress.setText("");

        jtxtPostCode.setText("");
        jtxtTelephone.setText("");
    }//GEN-LAST:event_jbtnRestActionPerformed

    private void jbtnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnUpdateMouseClicked
        // TODO add your handling code here:
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataConn, username, password);
            pst = sqlCon.prepareStatement("update connector set StudentID = ?, Firstname = ?, Surname = ?, "
                + "Address = ?, PostCode = ?, Telephone = ? where id = ?");

            pst.setString(1, jtxtStudentID.getText());
            pst.setString(2, jtxtFirstname.getText());
            pst.setString(3, jtxtSurname.getText());
            pst.setString(4, jtxtAddress.getText());
            pst.setString(5, jtxtPostCode.getText());
            pst.setString(6, jtxtTelephone.getText());
            pst.setInt(7, selectedRecordId);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated!");
            upDateDB();
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(workbench.class.getName()).log(java.util.logging.Level.SEVERE, 
                    null, ex);
        } 
        catch (SQLException ex) {
        Logger.getLogger(workbench.class.getName()).log(java.util.logging.Level.SEVERE, 
                null, ex);
        }
    }//GEN-LAST:event_jbtnUpdateMouseClicked

    private void jbtnAddNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAddNewMouseClicked
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataConn, username, password);
            pst = sqlCon.prepareStatement("INSERT INTO connector (StudentID, Firstname, Surname, "
                    + "Address, PostCode, Telephone) VALUES (?,?,?,?,?,?)");

            pst.setString(1, jtxtStudentID.getText());
            pst.setString(2, jtxtFirstname.getText());
            pst.setString(3, jtxtSurname.getText());
            pst.setString(4, jtxtAddress.getText());
            pst.setString(5, jtxtPostCode.getText());
            pst.setString(6, jtxtTelephone.getText());

            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added!");
            upDateDB();
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(workbench.class.getName()).log(java.util.logging.Level.SEVERE, 
                    null, ex);
        } 
        catch (SQLException ex)
        {
        Logger.getLogger(workbench.class.getName()).log(java.util.logging.Level.SEVERE, 
                null, ex);
        }       
    }//GEN-LAST:event_jbtnAddNewMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        selectedRecordId = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
        
        jtxtStudentID.setText (RecordTable.getValueAt(SelectedRows, 1).toString());
        jtxtFirstname.setText (RecordTable.getValueAt(SelectedRows, 2).toString());
        jtxtSurname.setText (RecordTable.getValueAt(SelectedRows, 3).toString());
        jtxtAddress.setText (RecordTable.getValueAt(SelectedRows, 4).toString());
        jtxtPostCode.setText (RecordTable.getValueAt(SelectedRows, 5).toString());
        jtxtTelephone.setText (RecordTable.getValueAt(SelectedRows, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPrintMouseClicked
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}");

        try 
        {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        } 
        catch (PrinterException e) 
        {
            System.err.format("No printer found", e.getMessage());
        }

    }//GEN-LAST:event_jbtnPrintMouseClicked

    private void jbtnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnDeleteMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        try
        {
            id = Integer.parseInt (RecordTable.getValueAt(SelectedRows, 0).toString());
           
            deleteItem = JOptionPane.showConfirmDialog (null, 
                    "Confirm if you want to delete item.", "WARNING", JOptionPane.YES_NO_OPTION);
           
            if (deleteItem == JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlCon = DriverManager.getConnection(dataConn, username, password);
                pst = sqlCon.prepareStatement("delete from connector where id = ?");
                
                pst.setInt (1, id);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Student Record Updated!");
                upDateDB();
                
                jtxtStudentID.setText ("");
                jtxtFirstname.setText ("");
                jtxtSurname.setText ("");
                jtxtAddress.setText ("");
                jtxtPostCode.setText ("");
                jtxtTelephone.setText ("");
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(workbench.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(workbench.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnDeleteMouseClicked

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnUpdateActionPerformed
private JFrame frame;
private int selectedRecordId;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(workbench.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workbench.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workbench.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workbench.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                workbench frame = new workbench();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null); // Center the frame
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asd;
    private javax.swing.JLabel dv;
    private javax.swing.JLabel ht;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAddNew;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRest;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtPostCode;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTelephone;
    private javax.swing.JLabel s;
    private javax.swing.JLabel sfw;
    private javax.swing.JLabel szc;
    // End of variables declaration//GEN-END:variables

    
}
