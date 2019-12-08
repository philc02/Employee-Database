/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeDatabase;

import java.awt.Color;
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
public class EditEmployee extends javax.swing.JFrame {
    MyHashTable myHashTable = new MyHashTable();
    String filename;
    /**
     * Creates new form EditFTE
     */
    public EditEmployee() throws IOException {
        initComponents();
        
        System.out.println("MYHASHTABLEE"+MyHashTable.fullOrPart);
        if(MyHashTable.fullOrPart){
            System.out.println("FIRST");
            choice2.addItem("Full Time");
        choice2.addItem("Part Time");
            setEditValuesFull(Edit.editing);
            MyHashTable.fullOrPart = false;
                                jLabel9.setVisible(true);
       jLabel8.setVisible(false);
       jLabel7.setVisible(false);
       w.setVisible(false);
       h.setVisible(false);
       weeks.setVisible(false);
       jSeparator8.setVisible(false);
       jSeparator9.setVisible(false);
      
       jSeparator10.setVisible(false);
        }
        else{
            choice2.addItem("Part Time");
            choice2.addItem("Full Time");
        
            setEditValuesPart(Edit.editing);
             MyHashTable.fullOrPart = true;
                               jLabel9.setVisible(true);
       jLabel8.setVisible(true);
       jLabel7.setVisible(true);
       w.setVisible(true);
       h.setVisible(true);
       weeks.setVisible(true);
       jSeparator8.setVisible(true);
       jSeparator9.setVisible(true);
      
       jSeparator10.setVisible(true);
jSeparator6.setVisible(false);
        S.setVisible(false);
        Salary.setVisible(false);
        }
        
        
        
        invis();
    }
   public void setEditValuesFull(int var) throws IOException{
        FTE fte = (FTE) myHashTable.getFromTable(Edit.editing);
        myHashTable.displayEmployees();
        System.out.println(fte);
        System.out.println("EN"+fte.employeeNumber);
        EN.setText(Integer.toString(fte.employeeNumber));
        FN.setText(fte.firstName);
        LN.setText(fte.lastName);
        L.setText(fte.workLocation);
        if(fte.gender==0){
            Male.setSelected(true);
        }
        else if(fte.gender==1){
            Female.setSelected(true);
        }
        D.setText(Double.toString(fte.deductionRate));
        S.setText(Double.toString(fte.annualSalary)); 
        email1.setText(fte.email);
            BufferedImage originalImage = ImageIO.read(new File(fte.image));
            ImageIcon imageIcon = new ImageIcon(originalImage); // load the image to a imageIcon
            Image image1 = imageIcon.getImage(); // transform it 
            Image newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg); 
            profilePic.setIcon(imageIcon);
            filename = fte.image;
    }
   public void setEditValuesPart(int var) throws IOException{
        PTE pte = (PTE) myHashTable.getFromTable(Edit.editing);
        myHashTable.displayEmployees();
        System.out.println(pte);
        System.out.println("EN"+pte.employeeNumber);
        EN.setText(Integer.toString(pte.employeeNumber));
        FN.setText(pte.firstName);
        LN.setText(pte.lastName);
        L.setText(pte.workLocation);
        if(pte.gender==0){
            Male.setSelected(true);
        }
        else if(pte.gender==1){
            Female.setSelected(true);
        }
        D.setText(Double.toString(pte.deductionRate));
        w.setText(Double.toString(pte.hoursPerWeek)); 
         h.setText(Double.toString(pte.hourlyWage)); 
          weeks.setText(Double.toString(pte.weeksPerYear)); 
        email1.setText(pte.email);
        BufferedImage originalImage = ImageIO.read(new File(pte.image));
            ImageIcon imageIcon = new ImageIcon(originalImage); // load the image to a imageIcon
            Image image1 = imageIcon.getImage(); // transform it 
            Image newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg); 
            profilePic.setIcon(imageIcon);
            filename = pte.image;
    }
      public void invis(){
     homeSep.setVisible(false);
     addSep.setVisible(false);
     editSep.setVisible(false);
     removeSep.setVisible(false);
     settingSep.setVisible(false);   
    homeSep.setForeground(Color.white.brighter()); // top line color
    homeSep.setBackground(Color.white.brighter());
    addSep.setForeground(Color.white.brighter()); // top line color
    addSep.setBackground(Color.white.brighter());
    editSep.setForeground(Color.white.brighter()); // top line color
    editSep.setBackground(Color.white.brighter());
    removeSep.setForeground(Color.white.brighter()); // top line color
    removeSep.setBackground(Color.white.brighter());
    settingSep.setForeground(Color.white.brighter()); // top line color
    settingSep.setBackground(Color.white.brighter());  
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
        jLabel6 = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        Salary = new javax.swing.JLabel();
        EmployeeNumber = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        FN = new javax.swing.JTextField();
        LN = new javax.swing.JTextField();
        EN = new javax.swing.JFormattedTextField();
        Gender = new javax.swing.JLabel();
        D = new javax.swing.JFormattedTextField();
        Location = new javax.swing.JLabel();
        S = new javax.swing.JFormattedTextField();
        L = new javax.swing.JTextField();
        Deductions = new javax.swing.JLabel();
        AddPicture = new javax.swing.JButton();
        profilePic = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        settingSep = new javax.swing.JSeparator();
        removeLabel = new javax.swing.JLabel();
        homeSep = new javax.swing.JSeparator();
        addLabel = new javax.swing.JLabel();
        addSep = new javax.swing.JSeparator();
        editLabel = new javax.swing.JLabel();
        editSep = new javax.swing.JSeparator();
        removeSep = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        Email = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        w = new javax.swing.JTextField();
        h = new javax.swing.JTextField();
        weeks = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Full Time Employee");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edit Employee");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 250, -1));

        lastName.setForeground(new java.awt.Color(255, 255, 255));
        lastName.setText("Last Name");
        jPanel1.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        Salary.setForeground(new java.awt.Color(255, 255, 255));
        Salary.setText("Salary");
        jPanel1.add(Salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        EmployeeNumber.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeNumber.setText("Employee ID");
        jPanel1.add(EmployeeNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setText("First Name");
        jPanel1.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        FN.setBackground(new java.awt.Color(51, 51, 51));
        FN.setForeground(new java.awt.Color(255, 255, 255));
        FN.setBorder(null);
        FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNActionPerformed(evt);
            }
        });
        jPanel1.add(FN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 386, 27));

        LN.setBackground(new java.awt.Color(51, 51, 51));
        LN.setForeground(new java.awt.Color(255, 255, 255));
        LN.setBorder(null);
        LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNActionPerformed(evt);
            }
        });
        jPanel1.add(LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 386, 28));

        EN.setBackground(new java.awt.Color(51, 51, 51));
        EN.setBorder(null);
        EN.setForeground(new java.awt.Color(255, 255, 255));
        EN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        EN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENActionPerformed(evt);
            }
        });
        jPanel1.add(EN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 386, 28));

        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 40, -1));

        D.setBackground(new java.awt.Color(51, 51, 51));
        D.setBorder(null);
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        jPanel1.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 380, 26));

        Location.setForeground(new java.awt.Color(255, 255, 255));
        Location.setText("Location");
        jPanel1.add(Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        S.setBackground(new java.awt.Color(51, 51, 51));
        S.setBorder(null);
        S.setForeground(new java.awt.Color(255, 255, 255));
        S.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });
        jPanel1.add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 386, 28));

        L.setBackground(new java.awt.Color(51, 51, 51));
        L.setForeground(new java.awt.Color(255, 255, 255));
        L.setBorder(null);
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        jPanel1.add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 380, 28));

        Deductions.setForeground(new java.awt.Color(255, 255, 255));
        Deductions.setText("Deductions");
        jPanel1.add(Deductions, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        AddPicture.setBackground(new java.awt.Color(255, 255, 255));
        AddPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-add-image-24.png"))); // NOI18N
        AddPicture.setText("Edit ");
        AddPicture.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPictureActionPerformed(evt);
            }
        });
        jPanel1.add(AddPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 110, 30));

        profilePic.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.add(profilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 380, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 380, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 380, 10));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-back-24.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 35));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-home-24.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        jPanel2.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, -1, -1));

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-view-26.png"))); // NOI18N
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingMouseExited(evt);
            }
        });
        jPanel2.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 310, -1, -1));

        settingSep.setOpaque(true);
        jPanel2.add(settingSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 340, 24, -1));

        removeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-remove-24 (1).png"))); // NOI18N
        removeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeLabelMouseExited(evt);
            }
        });
        jPanel2.add(removeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 255, -1, -1));

        homeSep.setForeground(new java.awt.Color(255, 255, 255));
        homeSep.setOpaque(true);
        jPanel2.add(homeSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 120, 24, -1));

        addLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-plus-24.png"))); // NOI18N
        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addLabelMouseExited(evt);
            }
        });
        jPanel2.add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 145, -1, -1));

        addSep.setForeground(new java.awt.Color(255, 255, 255));
        addSep.setOpaque(true);
        jPanel2.add(addSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 175, 24, -1));

        editLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-edit-24 (2).png"))); // NOI18N
        editLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editLabelMouseExited(evt);
            }
        });
        jPanel2.add(editLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 200, -1, -1));

        editSep.setOpaque(true);
        jPanel2.add(editSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 230, 24, -1));

        removeSep.setOpaque(true);
        jPanel2.add(removeSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 285, 24, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 460));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 380, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 380, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 380, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeDatabase/icons8-save-24.png"))); // NOI18N
        jButton1.setText("Edit");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 160, 30));

        Male.setBackground(new java.awt.Color(51, 51, 51));
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        jPanel1.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        Female.setBackground(new java.awt.Color(51, 51, 51));
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        jPanel1.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Male");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Female");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, 20));

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
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        choice2.setFocusable(false);
        choice2.setForeground(new java.awt.Color(51, 51, 51));
        choice2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice2ItemStateChanged(evt);
            }
        });
        jPanel1.add(choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 110, -1));

        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        email1.setBackground(new java.awt.Color(51, 51, 51));
        email1.setForeground(new java.awt.Color(255, 255, 255));
        email1.setBorder(null);
        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        jPanel1.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 380, 28));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 380, 10));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Weeks");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hours/Week");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Wage");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        w.setBackground(new java.awt.Color(51, 51, 51));
        w.setForeground(new java.awt.Color(255, 255, 255));
        w.setBorder(null);
        jPanel1.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 60, 30));

        h.setBackground(new java.awt.Color(51, 51, 51));
        h.setForeground(new java.awt.Color(255, 255, 255));
        h.setBorder(null);
        jPanel1.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 60, 30));

        weeks.setBackground(new java.awt.Color(51, 51, 51));
        weeks.setForeground(new java.awt.Color(255, 255, 255));
        weeks.setBorder(null);
        jPanel1.add(weeks, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 70, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 60, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 60, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 70, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNActionPerformed

    private void LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNActionPerformed

    private void ENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LActionPerformed

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
            Error i = new Error();
            i.setVisible(true);
        }
    }//GEN-LAST:event_AddPictureActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            MainMenu m = new MainMenu();
            MyHashTable.file = "";
            m.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Error i = new Error();
            i.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            //            String value= gender.getSelectedItem();
            int g = 0;
            //            if("Female".equals(value)){
                //                g = 1;
                //            }
            if(Female.isSelected()){
                g = 1;
            }
            if(filename.equals("")){
                filename = "src\\main\\java\\EmployeeDatabase\\profile.jpg";
            }
            if(choice2.getSelectedItem().equals("Full Time")){
                System.out.println("FILENAME"+filename);
                FTE fullTime = new FTE(Integer.parseInt(EN.getText()), FN.getText(), LN.getText(), g, L.getText(), Double.parseDouble(D.getText()), Double.parseDouble(S.getText()),
                    filename, email1.getText());

                myHashTable.editTable(fullTime, Edit.editing);
            }else{
                PTE partTime = new PTE(Integer.parseInt(EN.getText()), FN.getText(), LN.getText(), g, L.getText(), Double.parseDouble(D.getText()), Double.parseDouble(w.getText()),
                Double.parseDouble(h.getText()),Double.parseDouble(weeks.getText()), filename, email1.getText());
                myHashTable.editTable(partTime, Edit.editing);

            }
            myHashTable.writeToFile();
            Success.t = "Employee Edited";
            Success s = new Success();
            s.setVisible(true);
            //          JOptionPane.showMessageDialog(null, "Employee Added", "", JOptionPane.PLAIN_MESSAGE);
        }catch(Exception e){
            //            JOptionPane.showMessageDialog(null, "Enter Valid Values", "", JOptionPane.WARNING_MESSAGE);
            Error i = new Error();
            i.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(Color.red);
        close.setOpaque(true);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(51,51,51));
        close.setOpaque(true);
    }//GEN-LAST:event_closeMouseExited

    private void choice2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice2ItemStateChanged
        if(choice2.getSelectedItem().toString().equals("Part Time")){
            jLabel9.setVisible(true);
            jLabel8.setVisible(true);
            jLabel7.setVisible(true);
            w.setVisible(true);
            h.setVisible(true);
            weeks.setVisible(true);
            Salary.setVisible(false);
            S.setVisible(false);
            jSeparator6.setVisible(false);
            jSeparator8.setVisible(true);
            jSeparator9.setVisible(true);
            jSeparator10.setVisible(true);
        }else{
            jSeparator6.setVisible(true);
            jLabel9.setVisible(false);
            jLabel8.setVisible(false);
            jLabel7.setVisible(false);
            w.setVisible(false);
            h.setVisible(false);
            weeks.setVisible(false);
            Salary.setVisible(true);
            S.setVisible(true);
            jSeparator8.setVisible(false);
            jSeparator9.setVisible(false);
            jSeparator10.setVisible(false);
            
        }

        //        try {
            //            MyHashTable.file = filename;
            //            AddPTE pte = new AddPTE();
            //            pte.setVisible(true);
            //
            //            this.dispose();
            //        } catch (IOException ex) {
            //            Logger.getLogger(AddFTE.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_choice2ItemStateChanged

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void editLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLabelMouseExited
        editSep.setVisible(false);
    }//GEN-LAST:event_editLabelMouseExited

    private void editLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLabelMouseEntered
        editSep.setVisible(true);
    }//GEN-LAST:event_editLabelMouseEntered

    private void editLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLabelMouseClicked
        Edit e = new Edit();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editLabelMouseClicked

    private void addLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseExited
        addSep.setVisible(false);
    }//GEN-LAST:event_addLabelMouseExited

    private void addLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseEntered
        addSep.setVisible(true);
    }//GEN-LAST:event_addLabelMouseEntered

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
        try {
            AddEmployee f = new AddEmployee();
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addLabelMouseClicked

    private void removeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLabelMouseExited
        removeSep.setVisible(false);
    }//GEN-LAST:event_removeLabelMouseExited

    private void removeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLabelMouseEntered
        removeSep.setVisible(true);
    }//GEN-LAST:event_removeLabelMouseEntered

    private void removeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLabelMouseClicked
        Remove r = new Remove();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeLabelMouseClicked

    private void settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseExited
        settingSep.setVisible(false);
    }//GEN-LAST:event_settingMouseExited

    private void settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseEntered
        settingSep.setVisible(true);
    }//GEN-LAST:event_settingMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        homeSep.setVisible(false);
    }//GEN-LAST:event_HomeMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        homeSep.setVisible(true);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        try {
            MainMenu m = new MainMenu();
            m.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeMouseClicked

    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        Display d = new Display();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_settingMouseClicked

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
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditEmployee().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EditEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPicture;
    private javax.swing.JFormattedTextField D;
    private javax.swing.JLabel Deductions;
    private javax.swing.JFormattedTextField EN;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EmployeeNumber;
    private javax.swing.JTextField FN;
    private javax.swing.JRadioButton Female;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Home;
    private javax.swing.JTextField L;
    private javax.swing.JTextField LN;
    private javax.swing.JLabel Location;
    private javax.swing.JRadioButton Male;
    private javax.swing.JFormattedTextField S;
    private javax.swing.JLabel Salary;
    private javax.swing.JLabel addLabel;
    private javax.swing.JSeparator addSep;
    private java.awt.Choice choice2;
    private javax.swing.JLabel close;
    private javax.swing.JLabel editLabel;
    private javax.swing.JSeparator editSep;
    private javax.swing.JTextField email1;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField h;
    private javax.swing.JSeparator homeSep;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel profilePic;
    private javax.swing.JLabel removeLabel;
    private javax.swing.JSeparator removeSep;
    private javax.swing.JLabel setting;
    private javax.swing.JSeparator settingSep;
    private javax.swing.JTextField w;
    private javax.swing.JTextField weeks;
    // End of variables declaration//GEN-END:variables
}
