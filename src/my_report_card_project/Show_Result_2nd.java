package my_report_card_project;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anikesh
 */
public class Show_Result_2nd extends javax.swing.JFrame {

    int s1;
    int s2;
    int s3;
    int s4;
    int s5;
    int s6;
    int s7;
    int s8;
    int s9;

    PreparedStatement ptst;
    Statement st;
    ResultSet rs;

    String roll_num5;
    String Year1;
    String name2;
    String father3;
    String mother4;
    String Course6;
    String Gender7;
    String hindi8;
    String english9;
    String Women_Empowerment10;
    String Enterpreneurship11;
    String DBMS12;
    String DCCN13;
    String MySQL14;
    String Java_Language15;
    String Php_Language16;
    String total_Marks17;
    String result_18;

    public Show_Result_2nd() {
        initComponents();
    }

    public Show_Result_2nd(String roll_num) {
        initComponents();
        jTextField5.setText(roll_num);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        BackButton_01 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/1595483733332-removebg-preview200.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Sant Singaji Institute Of Science & Management");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 15, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Sandalpur (M.P.)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 59, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sesion 2022-23");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 108, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 173, 87, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 205, 87, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Father Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 239, 96, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Mother Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 273, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Roll Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 171, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Course");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 205, 86, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Gender");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 239, 86, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 171, 140, -1));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 205, 140, -1));

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 239, 140, -1));

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 273, 140, -1));

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 171, 140, -1));

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 205, 140, -1));

        jTextField7.setEditable(false);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 239, 140, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Subject                           |          Marks          |               Passing Marks        |     Marks Obtained");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 313, 615, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Hindi                              |                75           |                        23");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 341, 483, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("English                           |                75           |                        23");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 370, 483, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Women Empowerment |               75           |                        23");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 399, 483, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Enterpreneurship          |               75            |                        23");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 428, 483, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("DBMS                             |               75            |                        23");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 457, 483, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("DCCN                              |               75           |                        23");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 485, 483, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("MySql                             |               75           |                        23");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 513, 483, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Java Language              |               75            |                       23");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 542, 483, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Php Language               |                75           |                       23");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 571, 483, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Total Marks                   |                675         |                       ");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 600, 483, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Result");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 629, 483, -1));

        jTextField8.setEditable(false);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 342, 71, -1));

        jTextField9.setEditable(false);
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 371, 71, -1));

        jTextField10.setEditable(false);
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 71, -1));

        jTextField11.setEditable(false);
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 429, 71, -1));

        jTextField12.setEditable(false);
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 457, 71, -1));

        jTextField13.setEditable(false);
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 485, 71, -1));

        jTextField14.setEditable(false);
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 514, 71, -1));

        jTextField15.setEditable(false);
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 543, 71, -1));

        jTextField16.setEditable(false);
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 572, 71, -1));

        jTextField17.setEditable(false);
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 601, 71, -1));

        jTextField18.setEditable(false);
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 629, 71, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Get PDF");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, 59, -1));

        BackButton_01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackButton_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/icons8-back-button-30.png"))); // NOI18N
        BackButton_01.setText("Back");
        BackButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton_01ActionPerformed(evt);
            }
        });
        BackButton_01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackButton_01KeyPressed(evt);
            }
        });
        getContentPane().add(BackButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Result_Bckground.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        roll_num5 = jTextField5.getText();
        try {
            ClassLoadingAndConnectivity.loadAndConnect();
            Statement st = ClassLoadingAndConnectivity.con.createStatement();
            rs = st.executeQuery(
                    "select * from Student_Information2 inner join Student_Results1 where Student_Information2.Roll_Number='"
                    + roll_num5 + "' and Student_Results1.Roll_Num='" + roll_num5 + "' ");
            if (rs.next()) {

                Year1 = rs.getString(6);
                name2 = rs.getString(1);
                father3 = rs.getString(2);
                mother4 = rs.getString(3);
                Course6 = rs.getString(7);
                Gender7 = rs.getString(4);
                hindi8 = rs.getString(9);
                english9 = rs.getString(10);
                Women_Empowerment10 = rs.getString(11);
                Enterpreneurship11 = rs.getString(12);
                DBMS12 = rs.getString(13);
                DCCN13 = rs.getString(14);
                MySQL14 = rs.getString(15);
                Java_Language15 = rs.getString(16);
                Php_Language16 = rs.getString(17);

                jTextField1.setText(Year1);
                jTextField2.setText(name2);
                jTextField3.setText(father3);
                jTextField4.setText(mother4);
                jTextField6.setText(Course6);
                jTextField7.setText(Gender7);
                jTextField8.setText(hindi8);
                jTextField9.setText(english9);
                jTextField10.setText(Women_Empowerment10);
                jTextField11.setText(Enterpreneurship11);
                jTextField12.setText(DBMS12);
                jTextField13.setText(DCCN13);
                jTextField14.setText(MySQL14);
                jTextField15.setText(Java_Language15);
                jTextField16.setText(Php_Language16);

                s1 = Integer.parseInt(jTextField8.getText());
                s2 = Integer.parseInt(jTextField9.getText());
                s3 = Integer.parseInt(jTextField10.getText());
                s4 = Integer.parseInt(jTextField11.getText());
                s5 = Integer.parseInt(jTextField12.getText());
                s6 = Integer.parseInt(jTextField13.getText());
                s7 = Integer.parseInt(jTextField14.getText());
                s8 = Integer.parseInt(jTextField15.getText());
                s9 = Integer.parseInt(jTextField16.getText());
                int result = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9;
                total_Marks17 = String.valueOf(result);
                jTextField17.setText(total_Marks17);
                int count = 0;
                if (s1 < 23) {
                    count++;
                }
                if (s2 < 23) {
                    count++;
                }
                if (s3 < 23) {
                    count++;
                }
                if (s4 < 23) {
                    count++;
                }
                if (s5 < 23) {
                    count++;
                }
                if (s6 < 23) {
                    count++;
                }
                if (s7 < 23) {
                    count++;
                }
                if (s8 < 23) {
                    count++;
                }
                if (s9 < 23) {
                    count++;
                }
                if (count <= 3) {
                    result_18 = "ATKT";
                    jTextField18.setText(result_18);
                }
                if (count > 3) {
                    result_18 = "Fail";
                    jTextField18.setText(result_18);
                }
                if (count == 0) {
                    result_18 = "Pass";
                    jTextField18.setText(result_18);
                }

            } else {
                if (roll_num5.equals("")) {
                    JOptionPane.showMessageDialog(null, "please Enter Roll_number ");
                    setVisible(false);
                    new Student_Result().setVisible(true);
                }

            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GeneretedPdf();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BackButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton_01ActionPerformed
        setVisible(false);
        new Student_Result().setVisible(true);
    }//GEN-LAST:event_BackButton_01ActionPerformed

    private void BackButton_01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackButton_01KeyPressed
        setVisible(false);
        new Student_Result().setVisible(true);
    }//GEN-LAST:event_BackButton_01KeyPressed
    void GeneretedPdf() {
        try {
            Document document;

            String file = roll_num5 + "Result(2ndYear).pdf";
            document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();
            float fntSize;
            fntSize = 24.7f;
            String line1 = "Sant Singaji Institute of Science &     \n     Management Sandalpur ( MP )\n\n         Session 2022--2023\n\n                                    -----------------------------------";
            Paragraph p1 = new Paragraph(new Phrase(20f, line1,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, fntSize)));
            p1.setAlignment(5);
            document.add(p1);
            String line2 = "Roll_Number:           " + roll_num5;
            Paragraph p2 = new Paragraph(new Phrase(30f, line2,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p2.setAlignment(5);
            document.add(p2);
            String line3 = "Year:                  " + Year1;
            Paragraph p3 = new Paragraph(new Phrase(30f, line3,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p3.setAlignment(5);
            document.add(p3);
            String line4 = "Name:                  " + name2;
            Paragraph p4 = new Paragraph(new Phrase(30f, line4,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p4.setAlignment(5);
            document.add(p4);
            String line5 = "Father_Name:           " + father3;
            Paragraph p5 = new Paragraph(new Phrase(30f, line5,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p5.setAlignment(5);
            document.add(p5);
            String line6 = "Mother_Name:           " + mother4;
            Paragraph p6 = new Paragraph(new Phrase(30f, line6,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p6.setAlignment(5);
            document.add(p6);
            String line7 = "Course:                " + Course6;
            Paragraph p7 = new Paragraph(new Phrase(30f, line7,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p7.setAlignment(5);
            document.add(p7);
            String line8 = "Gender:                " + Gender7;
            Paragraph p8 = new Paragraph(new Phrase(30f, line8,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p8.setAlignment(5);
            document.add(p8);
            String line9 = "\n____________________________________________________\n";
            Paragraph p9 = new Paragraph(new Phrase(30f, line9,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p9.setAlignment(5);
            document.add(p9);
            String line10 = "\n";
            Paragraph p10 = new Paragraph(new Phrase(30f, line10,
                    FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
            p9.setAlignment(5);
            document.add(p10);
            PdfPTable pdft = new PdfPTable(4);
            pdft.getDefaultCell().setMinimumHeight(20f);
            pdft.setTotalWidth(510f);
            pdft.setLockedWidth(true);
            pdft.setSpacingBefore(12.4f);
            pdft.addCell("Subject");
            pdft.addCell("Marks");
            pdft.addCell("Passing Marks");
            pdft.addCell("Marks Obtained");
            ClassLoadingAndConnectivity.loadAndConnect();
            Statement st = ClassLoadingAndConnectivity.con.createStatement();
            ResultSet r = st.executeQuery(
                    "select * from Student_Information2 inner join Student_Results1 where Student_Information2.Roll_Number='"
                    + roll_num5 + "' and Student_Results1.Roll_Num='" + roll_num5 + "' ");
            if (r.next()) {
                pdft.addCell("Hindi");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(hindi8);
                pdft.addCell("English");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(english9);
                pdft.addCell("Women Empowerment");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(Women_Empowerment10);
                pdft.addCell("Enterpreneurship");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(Enterpreneurship11);
                pdft.addCell("DBMS");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(DBMS12);
                pdft.addCell("DCCN");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(DCCN13);
                pdft.addCell("MySQL");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(MySQL14);
                pdft.addCell("Java_Language");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(Java_Language15);
                pdft.addCell("Php_Language");
                pdft.addCell("75");
                pdft.addCell("23");
                pdft.addCell(Php_Language16);
                pdft.addCell("Total Marks ");
                pdft.addCell("675");
                pdft.addCell("-");
                pdft.addCell(total_Marks17);
                pdft.addCell("Result");
                pdft.addCell("-");
                pdft.addCell("-");
                pdft.addCell(result_18);
            }
            document.add(pdft);
            document.close();
            JOptionPane.showMessageDialog(null, "Pdf Created");
        } catch (DocumentException | HeadlessException | FileNotFoundException | ClassNotFoundException
                | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton_01;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        @Override
        public void run() {
            new Show_Result_2nd().setVisible(true);
        }
    }
}
