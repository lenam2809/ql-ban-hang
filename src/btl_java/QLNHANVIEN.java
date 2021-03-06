/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_java;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLNHANVIEN extends javax.swing.JFrame {

    /**
     * Creates new form QLNHANVIEN
     */
    public QLNHANVIEN() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_nv = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_manv = new javax.swing.JTextField();
        tf_tennv = new javax.swing.JTextField();
        tf_ngaysinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_sdt = new javax.swing.JTextField();
        tf_cmt = new javax.swing.JTextField();
        tf_diachi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radio_nam = new javax.swing.JRadioButton();
        radio_nu = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_timkiem = new javax.swing.JButton();
        btn_dulieugoc = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jTable_nv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma NV", "Tên NV", "Ngày Sinh", "Giới tính", "Số CMT/CCCD", "Địa Chỉ", "Điện Thoại"
            }
        ));
        jTable_nv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_nvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_nv);

        jLabel2.setText("Mã NV");

        jLabel3.setText("Tên NV");

        jLabel4.setText("Ngày Sinh");

        jLabel5.setText("Điện Thoại");

        jLabel6.setText("Số CMT");

        jLabel7.setText("Địa Chỉ");

        jLabel8.setText("Giới Tính");

        buttonGroup1.add(radio_nam);
        radio_nam.setText("Nam");

        buttonGroup1.add(radio_nu);
        radio_nu.setText("Nữ");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_timkiem.setText("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        btn_dulieugoc.setText("Dữ liệu gốc");
        btn_dulieugoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dulieugocActionPerformed(evt);
            }
        });

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(93, 93, 93)
                        .addComponent(jButton2)
                        .addGap(57, 57, 57)
                        .addComponent(jButton3)
                        .addGap(77, 77, 77)
                        .addComponent(btn_timkiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btn_dulieugoc))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_manv)
                            .addComponent(tf_tennv)
                            .addComponent(tf_ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_sdt)
                            .addComponent(tf_cmt)
                            .addComponent(tf_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(radio_nam)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(radio_nu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btn_thoat)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(radio_nam)
                    .addComponent(radio_nu))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_tennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tf_cmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btn_timkiem)
                    .addComponent(btn_dulieugoc)
                    .addComponent(btn_thoat))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        this.setVisible(false);
        new mainInterface().setVisible(true);
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_dulieugocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dulieugocActionPerformed
        DefaultTableModel tbn = (DefaultTableModel) jTable_nv.getModel();
        tbn.setRowCount(0);
        hienthi();
    }//GEN-LAST:event_btn_dulieugocActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel tbn = (DefaultTableModel) jTable_nv.getModel();
        tbn.setRowCount(0);
        hienthi();
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Update_NV();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Delete_NV();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable_nvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_nvMouseClicked
        try {
             int index = jTable_nv.getSelectedRow();
        tf_manv.setText(jTable_nv.getValueAt(index, 0).toString());
        tf_tennv.setText(jTable_nv.getValueAt(index, 1).toString());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String ngaysinh = jTable_nv.getValueAt(index, 2).toString();
            
        Date date =  new SimpleDateFormat("yyyy-MM-dd").parse(ngaysinh);
            
        String strDate = formatter.format(date);

        tf_ngaysinh.setText(strDate);

        if (jTable_nv.getValueAt(index, 3).toString().equals("Nam")) {
            radio_nam.setSelected(true);
        } else {
            radio_nu.setSelected(true);
        }
        tf_cmt.setText(jTable_nv.getValueAt(index, 4).toString());
        tf_diachi.setText(jTable_nv.getValueAt(index, 5).toString());
        tf_sdt.setText(jTable_nv.getValueAt(index, 6).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable_nvMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Add_NV();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        this.setVisible(false);
        new Timkiem_NHANVIEN().setVisible(true);
    }//GEN-LAST:event_btn_timkiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public void hienthi() {
        try {
            DefaultTableModel tbn = (DefaultTableModel) jTable_nv.getModel();
            String query = "select * from NHANVIEN";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(rs.getString("Manv"));
                vt.add(rs.getString("Tennv"));
                vt.add(rs.getString("Ngaysinh"));
                if (rs.getString("Gioitinh").equals("1")) {
                    vt.add("Nam");
                } else {
                    vt.add("Nữ");
                }
                vt.add(rs.getString("SoCmt"));
                vt.add(rs.getString("Diachi"));
                vt.add(rs.getString("Sdt"));
                tbn.addRow(vt);
            }
            jTable_nv.setModel(tbn);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Add_NV() {
        try {

            DefaultTableModel tbn = (DefaultTableModel) jTable_nv.getModel();
            String query = "insert into NHANVIEN values(?,?,?,?,?,?,?)";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tf_manv.getText());
            ps.setString(2, tf_tennv.getText());
            //format datetime
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(tf_ngaysinh.getText());
            String strDate = formatter.format(date);
            ps.setString(3, strDate);

            if (radio_nam.isSelected()) {
                ps.setString(4, "1");
            } else {
                ps.setString(4, "0");
            }
            ps.setString(5, tf_cmt.getText());
            ps.setString(6, tf_diachi.getText());
            ps.setString(7, tf_sdt.getText());
            int check = ps.executeUpdate();
            if (check > 0) {
                tbn.setRowCount(0);
                hienthi();
                JOptionPane.showMessageDialog(this, "Thêm nhân viên có mã nhân viên " + tf_manv.getText() + " thành công");
            }
        } catch (Exception e) {
            System.out.println(e);

            JOptionPane.showMessageDialog(this, "Không thể nhân viên có mã nhân viên " + tf_manv.getText() + " do bị trùng hoặc bỏ trống!");
        }
    }

    public void Update_NV() {
        try {
            DefaultTableModel tbn = (DefaultTableModel) jTable_nv.getModel();
            String query = "Update NHANVIEN set Tennv=?,Ngaysinh=?,Gioitinh=?,SoCmt=?,Diachi=?,Sdt=? where Manv=?";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tf_tennv.getText());
            
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(tf_ngaysinh.getText());
            String strDate = formatter.format(date);
//            
            ps.setString(2, strDate);
            
            
            if (radio_nam.isSelected()) {
                ps.setString(3, "1");
            } else {
                ps.setString(3, "0");
            }
            ps.setString(4, tf_cmt.getText());
            ps.setString(5, tf_diachi.getText());
            ps.setString(6, tf_sdt.getText());
            ps.setString(7, tf_manv.getText());
            int check = ps.executeUpdate();
            if (check > 0) {

                tbn.setRowCount(0);
                hienthi();
                JOptionPane.showMessageDialog(this, "Sửa thành công");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thay đổi được dữ liệu");
            System.out.println(e);
        }
    }

    public void Delete_NV() {
        DefaultTableModel tbn = (DefaultTableModel) jTable_nv.getModel();
        try {
//           
            String query = "delete from NHANVIEN where Manv=?";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, tf_manv.getText());
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa dữ liệu này?", "Confirm", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                int check = ps.executeUpdate();

                tbn.setRowCount(0);
                hienthi();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không xóa được dữ liệu");
            System.out.println(e);
        }
    }

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
            java.util.logging.Logger.getLogger(QLNHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNHANVIEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dulieugoc;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_nv;
    private javax.swing.JRadioButton radio_nam;
    private javax.swing.JRadioButton radio_nu;
    private javax.swing.JTextField tf_cmt;
    private javax.swing.JTextField tf_diachi;
    private javax.swing.JTextField tf_manv;
    private javax.swing.JTextField tf_ngaysinh;
    private javax.swing.JTextField tf_sdt;
    private javax.swing.JTextField tf_tennv;
    // End of variables declaration//GEN-END:variables
}
