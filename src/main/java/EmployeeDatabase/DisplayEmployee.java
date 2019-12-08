/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeDatabase;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author miphc
 */
public class DisplayEmployee extends javax.swing.JFrame {
    MyHashTable myHash = new MyHashTable();
   
    EmployeeInfo temp;
    /**
     * Creates new form DisplayEmployee
     */
    public DisplayEmployee() {
        initComponents();
        
        temp = Display.temp;
        System.out.println("NAME"+temp.firstName);
        FTE fte;
        PTE pte;
        String gender = "";
        if(temp.gender==0){
            gender = "Male";
        }
        else{
            gender = "Female";
        }
        
        try{
        String partfull = "";
        double salary = 0;
            System.out.println(temp.firstName);
        if(temp instanceof FTE){
            fte = (FTE) temp;
            partfull = "Full Time";
            salary = fte.annualSalary;
        }
        else if(temp instanceof PTE){
            pte = (PTE) temp;
            partfull = "Part Time";
            salary = pte.calcAnnualNetIncome();
           
            
        }
        port.setText(partfull+" Employee");
        label.setText("<html>"+"<br/>"+"Employee Number:  "+temp.employeeNumber+"<br/>"+"First Name:  "+temp.firstName+"<br/>"+"Last Name:  "+temp.lastName+"<br/>"+"Gender:  "+gender+"<br/>"+"Location:  "+temp.workLocation+"<br/>"+"Annual Salary:  "+"$"+salary+"<br/>"+"</html>");
        BufferedImage originalImage = ImageIO.read(new File(temp.image));
        ImageIcon imageIcon = new ImageIcon(originalImage); // load the image to a imageIcon
        Image image1 = imageIcon.getImage(); // transform it 
       System.out.println("TRANSFORM");
        Image newimg = image1.getScaledInstance(120, 120, java.awt.Image.SCALE_DEFAULT); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        picture.setIcon(imageIcon);
    
        //JOptionPane.showMessageDialog(null, partfull+" Employee"+"\n\n"+"Employee Number:  "+temp.employeeNumber+"\n"+"First Name:  "+temp.firstName+"\n"+"Last Name:  "+temp.lastName+"\n"+"Annual Salary:  "+"$"+salary+"\n","Employee Information", JOptionPane.PLAIN_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Employee Not In System","", JOptionPane.PLAIN_MESSAGE);
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
        picture = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        goEdit = new javax.swing.JLabel();
        port = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        goEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture.setBackground(new java.awt.Color(255, 255, 255));
        picture.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, 114));

        label.setBackground(new java.awt.Color(51, 51, 51));
        label.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 224, 140));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-multiply-24.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 3, 30, 30));

        goEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-edit-24 (2).png"))); // NOI18N
        goEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                goEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                goEditMouseExited(evt);
            }
        });
        jPanel1.add(goEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 30, 30));

        port.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        port.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(port, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 150, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        goEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-send-email-24.png"))); // NOI18N
        goEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goEmailMouseClicked(evt);
            }
        });
        jPanel1.add(goEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 4, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Display.count2 = 0;
    }//GEN-LAST:event_formWindowClosed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void goEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goEditMouseClicked
          java.awt.Window win[] = java.awt.Window.getWindows();
        for (int i = 0; i < win.length; i++) {
            win[i].dispose();
        }
        System.out.println("EMPLOYEE"+temp.employeeNumber);
        if(temp instanceof FTE){
            try {
                Edit.editing = temp.employeeNumber;
                MyHashTable.fullOrPart = true;
                EditEmployee pte = new EditEmployee();
                pte.setVisible(true);
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(DisplayEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(temp instanceof PTE){
            try {
                System.out.println("PART TIME EMP");
                Edit.editing = temp.employeeNumber;
                MyHashTable.fullOrPart = false;
                EditEmployee fte = new EditEmployee();
                fte.setVisible(true);
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(DisplayEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_goEditMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(Color.red);
        close.setOpaque(true);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(51,51,51));
        close.setOpaque(true);
    }//GEN-LAST:event_closeMouseExited

    private void goEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goEditMouseEntered
        goEdit.setBackground(Color.red);
        goEdit.setOpaque(true);
    }//GEN-LAST:event_goEditMouseEntered

    private void goEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goEditMouseExited
        goEdit.setBackground(new Color(51,51,51));
        goEdit.setOpaque(true);
    }//GEN-LAST:event_goEditMouseExited

    private void goEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goEmailMouseClicked
        Email e = new Email();
        e.setVisible(true);
        MyHashTable.email = temp.email;
        //this.dispose();
    }//GEN-LAST:event_goEmailMouseClicked

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
            java.util.logging.Logger.getLogger(DisplayEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel goEdit;
    private javax.swing.JLabel goEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel port;
    // End of variables declaration//GEN-END:variables
}
