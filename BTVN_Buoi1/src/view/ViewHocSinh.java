/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entity.HocSinh;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewHocSinh extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private List<HocSinh> listHocSinh;

    public ViewHocSinh() {
        initComponents();
        listHocSinh = new ArrayList<>();
        tblHienThi.setModel(dtm = new DefaultTableModel());
        String[] headers = {"Name", "Age", "Gender", "Department", "Favorite"};
        dtm.setColumnIdentifiers(headers);
        fakeData(listHocSinh);
        showData(listHocSinh);
        fillData(listHocSinh, 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        cbbDepartment = new javax.swing.JComboBox<>();
        checkBoxSport = new javax.swing.JCheckBox();
        checkBoxMusic = new javax.swing.JCheckBox();
        checkBoxDoABC = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        jLabel3.setText("Gender:");

        jLabel4.setText("Department:");

        jLabel5.setText("Favorite:");

        buttonGroup1.add(radioMale);
        radioMale.setText("Male");

        buttonGroup1.add(radioFemale);
        radioFemale.setText("Female");

        cbbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SE", "JS", "EE" }));

        checkBoxSport.setText("Sport");

        checkBoxMusic.setText("Music");

        checkBoxDoABC.setText("do ABC");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(82, 82, 82)
                                .addComponent(radioMale))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(btnClear)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(radioFemale)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(checkBoxSport)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBoxMusic)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBoxDoABC))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(211, 211, 211)
                                        .addComponent(btnAdd)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(checkBoxSport)
                    .addComponent(checkBoxMusic)
                    .addComponent(checkBoxDoABC))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel6.setText("Student List:");

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHienThi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseClicked
        int index = tblHienThi.getSelectedRow();
        fillData(listHocSinh, index);
    }//GEN-LAST:event_tblHienThiMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtAge.setText("");
        radioMale.setSelected(true);
        cbbDepartment.setSelectedIndex(0);
        checkBoxDoABC.setSelected(false);
        checkBoxSport.setSelected(false);
        checkBoxMusic.setSelected(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        HocSinh hsADD = addHocSinh();
        listHocSinh.add(hsADD);
        showData(listHocSinh);
        JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
    }//GEN-LAST:event_btnAddActionPerformed
    public void fakeData(List<HocSinh> listHocSinh) {
        listHocSinh.add(new HocSinh("Thuy Duong 1", 18, false, "JS", "Music"));
        listHocSinh.add(new HocSinh("Thuy Duong 2", 18, true, "EE", "Music , Sport, do ABC"));
        listHocSinh.add(new HocSinh("Thuy Duong 3", 18, true, "EE", "Music, Sport"));
        listHocSinh.add(new HocSinh("Thuy Duong 4", 18, false, "FE", "Music, do ABC"));
        listHocSinh.add(new HocSinh("Thuy Duong 5", 18, false, "JS", "do ABC"));
    }

    public void showData(List<HocSinh> listHocSinh) {
        dtm.setRowCount(0);
        for (HocSinh hocSinh : listHocSinh) {
            dtm.addRow(hocSinh.toDataRow());
        }
    }

    public void fillData(List<HocSinh> listHocSinh, int index) {
        HocSinh hsFill = listHocSinh.get(index);
        txtName.setText(hsFill.getTen());
        txtAge.setText(String.valueOf(hsFill.getTuoi()));
        if (hsFill.isGioiTinh()) {
            radioMale.setSelected(true);
        } else {
            radioFemale.setSelected(true);
        }
        cbbDepartment.setSelectedItem(hsFill.getPhongBan());
        String soThich = hsFill.getSoThich();
        if (soThich.contains("Music") && !(soThich.contains("Sprt")) && !(soThich.contains("do ABC"))) {
            checkBoxMusic.setSelected(true);
            checkBoxSport.setSelected(false);
            checkBoxDoABC.setSelected(true);
        }
        if (soThich.contains("Sport") && !(soThich.contains("Music")) && !(soThich.contains("do ABC"))) {
            checkBoxSport.setSelected(true);
            checkBoxMusic.setSelected(false);
            checkBoxDoABC.setSelected(false);
        }
        if (soThich.contains("do ABC") && !(soThich.contains("Music")) && !(soThich.contains("Sport"))) {
            checkBoxDoABC.setSelected(true);
            checkBoxMusic.setSelected(false);
            checkBoxSport.setSelected(false);
        }
        if (soThich.contains("Music") && soThich.contains("Sport") && !(soThich.contains("do ABC"))) {
            checkBoxDoABC.setSelected(false);
            checkBoxMusic.setSelected(true);
            checkBoxSport.setSelected(true);
        }
        if (soThich.contains("Music") && !(soThich.contains("Sport")) && soThich.contains("do ABC")) {
            checkBoxSport.setSelected(false);
            checkBoxMusic.setSelected(true);
            checkBoxDoABC.setSelected(true);
        }
        if (!(soThich.contains("Music")) && soThich.contains("Sport") && soThich.contains("do ABC")) {
            checkBoxSport.setSelected(true);
            checkBoxMusic.setSelected(false);
            checkBoxDoABC.setSelected(false);
        }
        if (soThich.contains("Music") && soThich.contains("Sport") && soThich.contains("do ABC")) {
            checkBoxSport.setSelected(true);
            checkBoxMusic.setSelected(true);
            checkBoxDoABC.setSelected(true);
        }
    }

    public HocSinh addHocSinh() {
        String ten = txtName.getText();
        int tuoi = Integer.valueOf(txtAge.getText());
        boolean gioiTinh;
        if (radioMale.isSelected()) {
            gioiTinh = true;
        } else {
            gioiTinh = false;
        }
        String loai = (String) cbbDepartment.getSelectedItem();
        String soThich = "";
        if (checkBoxSport.isSelected()) {
            soThich = "Sport";
        }
        if (checkBoxMusic.isSelected()) {
            soThich += "  Music";
        }
        if (checkBoxDoABC.isSelected()) {
            soThich += "  do ABC";
        }
        HocSinh hsAdd = new HocSinh(ten, tuoi, gioiTinh, loai, soThich);
        return hsAdd;
    }

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
            java.util.logging.Logger.getLogger(ViewHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewHocSinh().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbDepartment;
    private javax.swing.JCheckBox checkBoxDoABC;
    private javax.swing.JCheckBox checkBoxMusic;
    private javax.swing.JCheckBox checkBoxSport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblHienThi;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}