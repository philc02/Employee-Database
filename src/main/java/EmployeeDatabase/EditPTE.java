/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeDatabase;

import static EmployeeDatabase.AddPTE.saveOrEditP;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author miphc
 */
public class EditPTE extends javax.swing.JFrame {
    MyHashTable myHashTable = new MyHashTable();
    public String filename;
    
    /**
     * Creates new form EditPTE
     */
    public EditPTE() throws IOException {
        initComponents();
        if(MyHashTable.fullOrPart){
        setEditValuesPart(Edit.editing);
        MyHashTable.fullOrPart = false;
        }else{
            setEditValuesFull(Edit.editing);
            MyHashTable.fullOrPart = true;
        }
        filename = "";
    }
      public void setEditValuesPart(int var) throws IOException{
        PTE pte = (PTE) myHashTable.getFromTable(Edit.editing);
        myHashTable.displayEmployees();
        System.out.println(pte);
        System.out.println("EN"+pte.employeeNumber);
        EN.setText(Integer.toString(pte.employeeNumber));
        FN.setText(pte.firstName);
        LN.setText(pte.lastName);
        L.setText(Integer.toString(pte.workLocation));
         if(pte.gender==0){
            Male.setSelected(true);
        }
        else if(pte.gender==1){
            Female.setSelected(true);
        }
        D.setText(Double.toString(pte.deductionRate));
        w.setText(Double.toString(pte.deductionRate));
        h.setText(Double.toString(pte.deductionRate));
        weeks.setText(Double.toString(pte.deductionRate));
         BufferedImage originalImage = ImageIO.read(new File(pte.image));
            ImageIcon imageIcon = new ImageIcon(originalImage); // load the image to a imageIcon
            Image image1 = imageIcon.getImage(); // transform it 
            Image newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg); 
            profilePic.setIcon(imageIcon);
    }
    public void setEditValuesFull(int var) throws IOException{
        FTE fte = (FTE) myHashTable.getFromTable(Edit.editing);
        myHashTable.displayEmployees();
        System.out.println(fte);
        System.out.println("EN"+fte.employeeNumber);
        EN.setText(Integer.toString(fte.employeeNumber));
        FN.setText(fte.firstName);
        LN.setText(fte.lastName);
        L.setText(Integer.toString(fte.workLocation));
      if(fte.gender==0){
            Male.setSelected(true);
        }
        else if(fte.gender==1){
            Female.setSelected(true);
        }
        D.setText(Double.toString(fte.deductionRate));
         BufferedImage originalImage = ImageIO.read(new File(fte.image));
            ImageIcon imageIcon = new ImageIcon(originalImage); // load the image to a imageIcon
            Image image1 = imageIcon.getImage(); // transform it 
            Image newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg); 
            profilePic.setIcon(imageIcon);
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
        jLabel1 = new javax.swing.JLabel();
        LN = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        L = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        w = new javax.swing.JTextField();
        h = new javax.swing.JTextField();
        weeks = new javax.swing.JTextField();
        D = new javax.swing.JTextField();
        AddPicture = new javax.swing.JButton();
        profilePic = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Part Time Employee");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Last Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        LN.setBackground(new java.awt.Color(51, 51, 51));
        LN.setForeground(new java.awt.Color(255, 255, 255));
        LN.setBorder(null);
        jPanel1.add(LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 329, 27));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Users\\miphc\\Downloads\\icons8-save-24.png")); // NOI18N
        save.setText("Edit");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 150, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Weeks");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hours/Week");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Wage");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        L.setBackground(new java.awt.Color(51, 51, 51));
        L.setForeground(new java.awt.Color(255, 255, 255));
        L.setBorder(null);
        jPanel1.add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 329, 25));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Deductions");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        FN.setBackground(new java.awt.Color(51, 51, 51));
        FN.setForeground(new java.awt.Color(255, 255, 255));
        FN.setBorder(null);
        jPanel1.add(FN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 329, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edit Employee");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 250, 40));

        EN.setBackground(new java.awt.Color(51, 51, 51));
        EN.setForeground(new java.awt.Color(255, 255, 255));
        EN.setBorder(null);
        jPanel1.add(EN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 329, 27));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Employee ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        w.setBackground(new java.awt.Color(51, 51, 51));
        w.setForeground(new java.awt.Color(255, 255, 255));
        w.setBorder(null);
        jPanel1.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 60, 30));

        h.setBackground(new java.awt.Color(51, 51, 51));
        h.setForeground(new java.awt.Color(255, 255, 255));
        h.setBorder(null);
        jPanel1.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 60, 30));

        weeks.setBackground(new java.awt.Color(51, 51, 51));
        weeks.setForeground(new java.awt.Color(255, 255, 255));
        weeks.setBorder(null);
        jPanel1.add(weeks, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 70, 30));

        D.setBackground(new java.awt.Color(51, 51, 51));
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setBorder(null);
        jPanel1.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 329, 27));

        AddPicture.setBackground(new java.awt.Color(255, 255, 255));
        AddPicture.setIcon(new javax.swing.ImageIcon("C:\\Users\\miphc\\Downloads\\icons8-add-image-24.png")); // NOI18N
        AddPicture.setText("Edit Picture");
        AddPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPictureActionPerformed(evt);
            }
        });
        jPanel1.add(AddPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, 30));

        profilePic.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.add(profilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 120, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 329, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 330, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 330, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 330, 10));

        Male.setBackground(new java.awt.Color(51, 51, 51));
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        jPanel1.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        Female.setBackground(new java.awt.Color(51, 51, 51));
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        jPanel1.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Male");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, 20));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Female");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 330, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 60, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 60, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 70, 10));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\miphc\\Downloads\\icons8-back-24.png")); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 440));

        choice1.setFocusable(false);
        choice1.setForeground(new java.awt.Color(51, 51, 51));
        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });
        jPanel1.add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 120, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\miphc\\Downloads\\icons8-multiply-24.png")); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
             PTE partTime;
        try {
                int gender = 0;
                  if(Female.isSelected()){
                gender = 1;
            }
                if(filename.equals("")){
                    filename = "src\\main\\java\\EmployeeDatabase\\profile.jpg";
                }
                partTime = new PTE(Integer.parseInt(EN.getText()), FN.getText(), LN.getText(), gender, Integer.parseInt(L.getText()), Double.parseDouble(D.getText()), Double.parseDouble(w.getText()),
                Double.parseDouble(h.getText()),Double.parseDouble(weeks.getText()), filename);
                myHashTable.editTable(partTime, Edit.editing);
                myHashTable.writeToFile();
                JOptionPane.showMessageDialog(null, "Edited", "", JOptionPane.PLAIN_MESSAGE);
                MainMenu menu = new MainMenu();
                menu.setVisible(true);
                this.dispose();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "", "", JOptionPane.WARNING_MESSAGE);
            }



    }//GEN-LAST:event_saveActionPerformed

    private void AddPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPictureActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        try {
            BufferedImage originalImage = ImageIO.read(new File(filename));
            ImageIcon imageIcon = new ImageIcon(originalImage); // load the image to a imageIcon
            Image image1 = imageIcon.getImage(); // transform it
            Image newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way
            imageIcon = new ImageIcon(newimg);
            profilePic.setIcon(imageIcon);
            //close database connection
            System.out.println("A");
        } catch (Exception ex) {
            Logger.getLogger(EditEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddPictureActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        if(Male.isSelected()){
            Female.setSelected(false);
        }
    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        if(Female.isSelected()){
            Male.setSelected(false);
        }
    }//GEN-LAST:event_FemaleActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            MainMenu m = new MainMenu();
            m.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(AddPTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
        try {
            EditFTE fte = new EditFTE();
            fte.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(AddPTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choice1ItemStateChanged

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(EditPTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditPTE().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EditPTE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPicture;
    private javax.swing.JTextField D;
    private javax.swing.JTextField EN;
    private javax.swing.JTextField FN;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField L;
    private javax.swing.JTextField LN;
    private javax.swing.JRadioButton Male;
    private java.awt.Choice choice1;
    private javax.swing.JTextField h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel profilePic;
    private javax.swing.JButton save;
    private javax.swing.JTextField w;
    private javax.swing.JTextField weeks;
    // End of variables declaration//GEN-END:variables
}