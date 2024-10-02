/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sharkmed;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class addToCart extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "02nikk@A";
    private static final String dataConn = "jdbc:mysql://localhost:3306/finals";
      
    java.sql.Connection sqlCon = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;
    
    private DefaultTableModel cartTableModel;
    JLabel BiogesicParacetamolTablet1;
    JLabel medicolAdvance;

      
    Border default_border = BorderFactory.createMatteBorder(3,0,0,0,new Color(155,155,155));
    Border blue_border = BorderFactory.createMatteBorder(3,0,0,0,Color.blue);
    
    //create an array of jbuttons
    JButton[] buttons;
    
    public addToCart() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);

        // Initialize the table model for the cart table
        cartTableModel = (DefaultTableModel) cartTbl.getModel();
        
        // Initialize the components, including BiogesicParacetamolTablet1
        BiogesicParacetamolTablet1 = new JLabel();
        medicolAdvance = new JLabel();
    }
    
    public void upDateDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataConn, username, password);
            pst = sqlCon.prepareStatement("select * from finals");
      
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
       
      cartTableModel = (DefaultTableModel)cartTbl.getModel();
      cartTableModel.setRowCount(0);
       
      while(rs.next()){
        Vector columnData = new Vector ();
         
        for (i = 1; i <= q; i++)
        {
          columnData.add(rs.getString("ID"));
          columnData.add(rs.getString("Name"));
          columnData.add(rs.getString("Qty"));
          columnData.add(rs.getString("Price"));
          cartTableModel.addRow(columnData);
        }
      }
    }
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
        
    public void addtable(String Name, int Qty, Double Price) {
        Vector v = new Vector();
        v.add(Name);
        v.add(Qty);
        v.add(Price);
        cartTableModel.addRow(v);
    }

    public void addtables(int id ,String Name,int Qty ,Double Price) {
        DecimalFormat df = new DecimalFormat("00.00");
        double totPrice = Price * Qty;
        String TotalPrice = df.format(totPrice);

        // Product already added check
        for (int row = 0; row < cartTbl.getRowCount(); row++) {
            if (Name.equals(cartTbl.getValueAt(row, 0))) {
                cartTableModel.removeRow(row);
            }
        }

        Vector v = new Vector();
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice);
        cartTableModel.addRow(v);
    }

    public void cal() {
        int numOfRow = cartTbl.getRowCount();
        double tot = 0.0;
        for (int i = 0; i < numOfRow; i++) {
            Object valueObj = cartTbl.getValueAt(i, 2);
            if (valueObj != null) {
                double value = Double.valueOf(valueObj.toString());
                tot += value;
            }
        }
        DecimalFormat df = new DecimalFormat("0");
        total.setText(df.format(tot));
        
        int numOfRows = cartTbl.getRowCount();
    double totalAmount = 0.0;

    for (int i = 0; i < numOfRows; i++) {
        int quantity = Integer.parseInt(cartTbl.getValueAt(i, 2).toString());
        double price = Double.parseDouble(cartTbl.getValueAt(i, 3).toString()); // Assuming column index 3 is the price

        totalAmount += quantity * price;
    }

    DecimalFormat dff = new DecimalFormat("00.00");
    total_amount.setText(dff.format(totalAmount));
    }
   
    
    private JTable dataTable;
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        sharkMeds = new javax.swing.JPanel();
        shark = new javax.swing.JLabel();
        meds = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        tblPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        total_amount = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        checkOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(228, 234, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_red.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 40));

        sharkMeds.setBackground(new java.awt.Color(200, 214, 228));
        sharkMeds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        sharkMeds.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shark.setFont(new java.awt.Font("Leelawadee UI", 1, 35)); // NOI18N
        shark.setForeground(new java.awt.Color(0, 74, 173));
        shark.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        shark.setText("shark");
        sharkMeds.add(shark, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        meds.setFont(new java.awt.Font("Leelawadee UI", 1, 35)); // NOI18N
        meds.setForeground(new java.awt.Color(0, 109, 255));
        meds.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        meds.setText("meds");
        sharkMeds.add(meds, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/small_logo.png"))); // NOI18N
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        sharkMeds.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 60, 60));

        cart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cart.png"))); // NOI18N
        cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
        });
        sharkMeds.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 40, 40));

        jPanel1.add(sharkMeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 80));

        tblPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Qty", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cartTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cartTbl);

        tblPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 280));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total:");
        tblPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 70, 30));

        total_amount.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        total_amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_amount.setText("0.0");
        total_amount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblPanel.add(total_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 90, 30));

        jLabel35.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel35.setText("Total quantity :");
        tblPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, -1));

        total.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("0");
        total.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblPanel.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 50, -1));

        checkOut.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        checkOut.setText("Check out");
        checkOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblPanel.add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 450, 140, 40));

        jPanel1.add(tblPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //create a function to add a mouseClick event to all buttons
    public void addAction(){
        for (JButton button : buttons){
            button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setButtonBorder(button);
                }
                @Override
                public void mousePressed(MouseEvent e) {                 
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    setButtonBorder(button);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                }
                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
            
        }
        }
    
    //create a function to set border to the selected menu item
    public void setButtonBorder (JButton button){
        
        //reset all buttons to the default border
        for(JButton btn : buttons){
            btn.setBorder(default_border);
        }
        //blue border for the selected item
        button.setBorder(blue_border);
    }
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        tblPanel.getAccessibleContext();
    }//GEN-LAST:event_cartMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        medicine m = new medicine();
        m.setVisible(true);
        m.pack();
        this.dispose();
    }//GEN-LAST:event_logoMouseClicked

    private void cartTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTblMouseClicked
       
    }//GEN-LAST:event_cartTblMouseClicked

    /**
     * @param args the command line arguments
     */
    private int selectedRecordId;
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
            java.util.logging.Logger.getLogger(addToCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addToCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addToCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addToCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addToCart().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cart;
    public javax.swing.JTable cartTbl;
    private javax.swing.JButton checkOut;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel meds;
    private javax.swing.JLabel shark;
    private javax.swing.JPanel sharkMeds;
    private javax.swing.JPanel tblPanel;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total_amount;
    // End of variables declaration//GEN-END:variables


public class RoundedPanel extends JPanel {
    private Color backgroundColor;
    private int cornerRadius = 15;

    public RoundedPanel() {
        super();
    }

    public RoundedPanel(int radius, int red, int green, int blue) {
        super();
        cornerRadius = radius;
        backgroundColor = new Color(red, green, blue);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }

        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
        graphics.setColor(getForeground());
    }
}

}