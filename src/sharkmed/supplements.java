/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sharkmed;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author ASUS
 */
public class supplements extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    
    Border default_border = BorderFactory.createMatteBorder(3,0,0,0,new Color(155,155,155));
    Border blue_border = BorderFactory.createMatteBorder(3,0,0,0,Color.blue);
    
    //create an array of jbuttons
    JButton[] buttons;
    
    public supplements() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //add buttons to the array
        buttons = new JButton[4];
        buttons [0] = home;
        buttons [1] = med;
        buttons [2] = vitamins;
        buttons [3] = supplement;
        
        //default border to the buttons
        for (JButton button : buttons) {
            button.setBorder(default_border);
        }
        
        addAction();
        setButtonBorder(supplement);
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
        jPanel2 = new javax.swing.JPanel();
        shark = new javax.swing.JLabel();
        meds = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        supplement = new javax.swing.JButton();
        home = new javax.swing.JButton();
        med = new javax.swing.JButton();
        vitamins = new javax.swing.JButton();
        biogesic = new javax.swing.JLabel();
        BiogesicParacetamolTablet1 = new javax.swing.JLabel();
        mg1 = new javax.swing.JLabel();
        mg = new javax.swing.JLabel();
        addCart = new javax.swing.JButton();
        quick = new javax.swing.JButton();
        medicol = new javax.swing.JLabel();
        medicolAdvance = new javax.swing.JLabel();
        mg2 = new javax.swing.JLabel();
        mg3 = new javax.swing.JLabel();
        addCart1 = new javax.swing.JButton();
        quick1 = new javax.swing.JButton();
        medicol1 = new javax.swing.JLabel();
        medicolAdvance1 = new javax.swing.JLabel();
        mg4 = new javax.swing.JLabel();
        mg5 = new javax.swing.JLabel();
        addCart2 = new javax.swing.JButton();
        quick2 = new javax.swing.JButton();
        medicol3 = new javax.swing.JLabel();
        medicolAdvance3 = new javax.swing.JLabel();
        mg8 = new javax.swing.JLabel();
        mg9 = new javax.swing.JLabel();
        addCart4 = new javax.swing.JButton();
        quick4 = new javax.swing.JButton();
        biogesic1 = new javax.swing.JLabel();
        mg10 = new javax.swing.JLabel();
        BiogesicParacetamolTablet2 = new javax.swing.JLabel();
        mg11 = new javax.swing.JLabel();
        addCart5 = new javax.swing.JButton();
        quick5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(228, 234, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(200, 214, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shark.setFont(new java.awt.Font("Leelawadee UI", 1, 35)); // NOI18N
        shark.setForeground(new java.awt.Color(0, 74, 173));
        shark.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        shark.setText("shark");
        jPanel2.add(shark, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, -1));

        meds.setFont(new java.awt.Font("Leelawadee UI", 1, 35)); // NOI18N
        meds.setForeground(new java.awt.Color(0, 109, 255));
        meds.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        meds.setText("meds");
        jPanel2.add(meds, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/small_logo.png"))); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 60, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 80));

        supplement.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        supplement.setForeground(new java.awt.Color(155, 155, 155));
        supplement.setText("Supplements");
        supplement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        supplement.setContentAreaFilled(false);
        supplement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplementMouseClicked(evt);
            }
        });
        jPanel1.add(supplement, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 90, 30));

        home.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(155, 155, 155));
        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 30));

        med.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        med.setForeground(new java.awt.Color(155, 155, 155));
        med.setText("Medicine");
        med.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        med.setContentAreaFilled(false);
        med.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        med.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMouseClicked(evt);
            }
        });
        jPanel1.add(med, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, 30));

        vitamins.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        vitamins.setForeground(new java.awt.Color(155, 155, 155));
        vitamins.setText("Vitamins");
        vitamins.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        vitamins.setContentAreaFilled(false);
        vitamins.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vitamins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vitaminsMouseClicked(evt);
            }
        });
        jPanel1.add(vitamins, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 90, 30));

        biogesic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biogesic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Joint Max.png"))); // NOI18N
        jPanel1.add(biogesic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 90));

        BiogesicParacetamolTablet1.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        BiogesicParacetamolTablet1.setText("Joint Max");
        BiogesicParacetamolTablet1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(BiogesicParacetamolTablet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, 20));

        mg1.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg1.setText("5 g | 30 sachet");
        jPanel1.add(mg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 20));

        mg.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg.setText("PHP 1,200.00");
        jPanel1.add(mg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        addCart.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        addCart.setText("Add to cart");
        addCart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(addCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 80, 20));

        quick.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        quick.setText("Quick view");
        quick.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        quick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quick.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quickMouseClicked(evt);
            }
        });
        quick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickActionPerformed(evt);
            }
        });
        jPanel1.add(quick, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 80, 20));

        medicol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnc.png"))); // NOI18N
        jPanel1.add(medicol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 90));

        medicolAdvance.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        medicolAdvance.setText("GNC Omega Fish Oil");
        medicolAdvance.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(medicolAdvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 20));

        mg2.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg2.setText("1000 mg | 60 soft gels");
        jPanel1.add(mg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, 20));

        mg3.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg3.setText("PHP 2,460.00");
        jPanel1.add(mg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        addCart1.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        addCart1.setText("Add to cart");
        addCart1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addCart1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCart1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(addCart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 80, 20));

        quick1.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        quick1.setText("Quick view");
        quick1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        quick1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quick1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quick1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quick1MouseClicked(evt);
            }
        });
        quick1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quick1ActionPerformed(evt);
            }
        });
        jPanel1.add(quick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 80, 20));

        medicol1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/centrum advance.png"))); // NOI18N
        jPanel1.add(medicol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 90));

        medicolAdvance1.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        medicolAdvance1.setText("Centrum Advance 50+ Multivitamin");
        medicolAdvance1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(medicolAdvance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, 20));

        mg4.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg4.setText("200mg | 60 tablets");
        jPanel1.add(mg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 20));

        mg5.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg5.setText("PHP 252.00");
        jPanel1.add(mg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        addCart2.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        addCart2.setText("Add to cart");
        addCart2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addCart2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCart2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(addCart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 80, 20));

        quick2.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        quick2.setText("Quick view");
        quick2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        quick2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quick2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quick2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quick2MouseClicked(evt);
            }
        });
        quick2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quick2ActionPerformed(evt);
            }
        });
        jPanel1.add(quick2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 80, 20));

        medicol3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicol3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Kirkland.png"))); // NOI18N
        jPanel1.add(medicol3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 90, 90));

        medicolAdvance3.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        medicolAdvance3.setText("Kirkland Signature Daily Supplements");
        medicolAdvance3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(medicolAdvance3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, -1, 20));

        mg8.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg8.setText("1050mg | 500 tables");
        jPanel1.add(mg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, -1, 20));

        mg9.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg9.setText("PHP 1,350.00");
        jPanel1.add(mg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, -1, -1));

        addCart4.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        addCart4.setText("Add to cart");
        addCart4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addCart4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCart4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(addCart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 80, 20));

        quick4.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        quick4.setText("Quick view");
        quick4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        quick4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quick4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quick4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quick4MouseClicked(evt);
            }
        });
        quick4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quick4ActionPerformed(evt);
            }
        });
        jPanel1.add(quick4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 80, 20));

        biogesic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biogesic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Spirulina.png"))); // NOI18N
        jPanel1.add(biogesic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 90, 90));

        mg10.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg10.setText("PHP 560.00");
        jPanel1.add(mg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        BiogesicParacetamolTablet2.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        BiogesicParacetamolTablet2.setText("Spirulina Vitamins | Supplements");
        BiogesicParacetamolTablet2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(BiogesicParacetamolTablet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, 20));

        mg11.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        mg11.setText("500mg | 200 tablets");
        jPanel1.add(mg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, 20));

        addCart5.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        addCart5.setText("Add to cart");
        addCart5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addCart5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCart5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(addCart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 80, 20));

        quick5.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        quick5.setText("Quick view");
        quick5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        quick5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quick5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quick5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quick5MouseClicked(evt);
            }
        });
        quick5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quick5ActionPerformed(evt);
            }
        });
        jPanel1.add(quick5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 80, 20));

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
    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        home home = new home();
        home.setVisible(true);
        home.pack();
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void supplementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplementMouseClicked
        // TODO add your handling code here:
        supplements sup = new supplements();
        sup.setVisible(true);
        sup.pack();
        this.dispose();
    }//GEN-LAST:event_supplementMouseClicked

    private void vitaminsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vitaminsMouseClicked
        // TODO add your handling code here:
        vitamins vit = new vitamins();
        vit.setVisible(true);
        vit.pack();
        this.dispose();
    }//GEN-LAST:event_vitaminsMouseClicked

    private void medMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMouseClicked
        // TODO add your handling code here:
        medicine med = new medicine();
        med.setVisible(true);
        med.pack();
        this.dispose();
    }//GEN-LAST:event_medMouseClicked

    private void quickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quickMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quickMouseClicked

    private void quick1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quick1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quick1MouseClicked

    private void quick2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quick2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quick2MouseClicked

    private void quick5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quick5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quick5MouseClicked

    private void quick4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quick4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quick4MouseClicked

    private void quickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickActionPerformed
       ImageIcon bio = new ImageIcon("Joint Max.png");
        JOptionPane.showMessageDialog(null,"  is a hydrolyzed collagen supplement that:\n" +
"Helps ease joint pain and discomforts\n" +
"Helps make the joints smooth and mobile"
                ,"Joint Max",JOptionPane.INFORMATION_MESSAGE,bio);
    }//GEN-LAST:event_quickActionPerformed

    private void quick1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quick1ActionPerformed
        ImageIcon bio = new ImageIcon("gnc.png");
        JOptionPane.showMessageDialog(null,"  are known as “healthy fats” because they provide numerous health and wellness benefits."
                + "\n From heart health and joint support, to vision and cognition" 
                ,"gnc",JOptionPane.INFORMATION_MESSAGE,bio);
    }//GEN-LAST:event_quick1ActionPerformed

    private void quick2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quick2ActionPerformed
       ImageIcon bio = new ImageIcon("centrum advance.png");
        JOptionPane.showMessageDialog(null,"  is specially crafted to support your body at age 50 and beyond. It’s made with high-quality ingredients and essential vitamins and minerals to help support your heart14, bones5 and eyes13."
                + "\n Centrum Advance 50+ is backed by over 40 years of nutritional science from the world's No.1 brand of multivitamin "
                ,"centrum advance",JOptionPane.INFORMATION_MESSAGE,bio);
    }//GEN-LAST:event_quick2ActionPerformed

    private void quick5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quick5ActionPerformed
        ImageIcon bio = new ImageIcon("Spirulina.png");
        JOptionPane.showMessageDialog(null," to boost the levels of nutrients and antioxidants in their bodies, and it may help protect against various diseases."
                ,"Spirulina",JOptionPane.INFORMATION_MESSAGE,bio);
    }//GEN-LAST:event_quick5ActionPerformed

    private void quick4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quick4ActionPerformed
          ImageIcon bio = new ImageIcon("Kirkland.png");
        JOptionPane.showMessageDialog(null," is USP-verified and specially formulated to support your overall health by addressing nutrient gaps so your body "
                + "\n will meet the recommended daily intake. It contains calcium and vitamin D to keep your bones and teeth healthy."
                ,"Kirkland",JOptionPane.INFORMATION_MESSAGE,bio);
    }//GEN-LAST:event_quick4ActionPerformed

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
            java.util.logging.Logger.getLogger(supplements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supplements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supplements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supplements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new supplements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BiogesicParacetamolTablet1;
    private javax.swing.JLabel BiogesicParacetamolTablet2;
    private javax.swing.JButton addCart;
    private javax.swing.JButton addCart1;
    private javax.swing.JButton addCart2;
    private javax.swing.JButton addCart4;
    private javax.swing.JButton addCart5;
    private javax.swing.JLabel biogesic;
    private javax.swing.JLabel biogesic1;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JButton med;
    private javax.swing.JLabel medicol;
    private javax.swing.JLabel medicol1;
    private javax.swing.JLabel medicol3;
    private javax.swing.JLabel medicolAdvance;
    private javax.swing.JLabel medicolAdvance1;
    private javax.swing.JLabel medicolAdvance3;
    private javax.swing.JLabel meds;
    private javax.swing.JLabel mg;
    private javax.swing.JLabel mg1;
    private javax.swing.JLabel mg10;
    private javax.swing.JLabel mg11;
    private javax.swing.JLabel mg2;
    private javax.swing.JLabel mg3;
    private javax.swing.JLabel mg4;
    private javax.swing.JLabel mg5;
    private javax.swing.JLabel mg8;
    private javax.swing.JLabel mg9;
    private javax.swing.JButton quick;
    private javax.swing.JButton quick1;
    private javax.swing.JButton quick2;
    private javax.swing.JButton quick4;
    private javax.swing.JButton quick5;
    private javax.swing.JLabel shark;
    private javax.swing.JButton supplement;
    private javax.swing.JButton vitamins;
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