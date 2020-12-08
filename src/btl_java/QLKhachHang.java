/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form QLKhachHang
     */
    public QLKhachHang() {
        initComponents();
        Form_load();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_makh = new javax.swing.JTextField();
        tf_tenkh = new javax.swing.JTextField();
        tf_diachi = new javax.swing.JTextField();
        tf_sdt = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        radio_vip = new javax.swing.JRadioButton();
        radio_thuong = new javax.swing.JRadioButton();
        btn_Them = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_Du_lieu_goc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Email", "Hạng thành viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Mã KH");

        jLabel2.setText("Tên KH");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("Số điện thoại");

        jLabel5.setText("Email");

        jLabel6.setText("Hạng thành viên");

        buttonGroup1.add(radio_vip);
        radio_vip.setText("VIP");

        buttonGroup1.add(radio_thuong);
        radio_thuong.setText("Thường");

        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
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

        jButton4.setText("Lọc dữ liệu theo mã hoặc tên");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Quản lý Khách Hàng");

        btn_Du_lieu_goc.setText("Dữ liệu gốc");
        btn_Du_lieu_goc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Du_lieu_gocActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Them)
                        .addGap(76, 76, 76)
                        .addComponent(jButton2)
                        .addGap(82, 82, 82)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(tf_tenkh)
                            .addComponent(tf_makh))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_sdt)
                                    .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(radio_vip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(77, 77, 77)
                                        .addComponent(btn_Du_lieu_goc))
                                    .addComponent(radio_thuong)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(tf_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(tf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_vip)
                    .addComponent(radio_thuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(btn_Du_lieu_goc))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        tf_makh.setText(jTable1.getValueAt(index, 0).toString());
        tf_tenkh.setText(jTable1.getValueAt(index, 1).toString());
        tf_diachi.setText(jTable1.getValueAt(index, 2).toString());
        tf_sdt.setText(jTable1.getValueAt(index, 3).toString());
        tf_email.setText(jTable1.getValueAt(index, 4).toString());
        if (jTable1.getValueAt(index, 5).toString().equals("VIP")) {
            radio_vip.setSelected(true);

        } else if (jTable1.getValueAt(index, 5).toString().equals("THƯỜNG")) {
            radio_thuong.setSelected(true);
        } else {
            return;
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        Add();
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Update();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Delete();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_Du_lieu_gocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Du_lieu_gocActionPerformed
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        tbn.setRowCount(0);
        Form_load();
    }//GEN-LAST:event_btn_Du_lieu_gocActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        tbn.setRowCount(0);
        Search();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new mainInterface().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Add() {
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        try {
//           
            String query = "insert into KHACHHANG values(?,?,?,?,?,?)";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
        
              ps.setString(1,tf_makh.getText());
              ps.setString(2,tf_tenkh.getText());
              ps.setString(3,tf_diachi.getText());
              ps.setString(4,tf_sdt.getText());
              ps.setString(5,tf_email.getText());
              if(radio_vip.isSelected()){
              ps.setString(6,"1");
              }
              else 
              ps.setString(6,"0");
              int check=ps.executeUpdate();
              
              if(check>0){
                  tf_makh.setText("");
                  tf_tenkh.setText("");
                  tf_diachi.setText("");
                  tf_sdt.setText("");
                  tf_email.setText("");
                  tbn.setRowCount(0);
                  Form_load();
                  JOptionPane.showMessageDialog(this, "Thêm thành công");
                  
              }
         
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thêm được do đã tồn tại khách hàng có mã "+tf_makh.getText());
                  System.out.println("false");
        }
    }

    public void Form_load() {
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        try {
//           
            String query = "Select * from KHACHHANG";
            Connection cn = DAO.getConnection();
            Statement ps = cn.createStatement();
            ResultSet rs = ps.executeQuery(query);

            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("Makh"));
                vector.add(rs.getString("Tenkh"));
                vector.add(rs.getString("Diachi"));
                vector.add(rs.getString("Dienthoai"));
                vector.add(rs.getString("Email"));
                if(rs.getString("Membership").equals("1"))
                {
                    vector.add("VIP");
                }
                else{
                    vector.add("THƯỜNG");
                }
                
                tbn.addRow(vector);

            }
            jTable1.setModel(tbn);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void Update(){
         DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        try {
//           
            String query = "Update KHACHHANG set Tenkh=?,Diachi=?,Dienthoai=?,Email=?,Membership=? where Makh=?";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
        
              
              ps.setString(1,tf_tenkh.getText());
              ps.setString(2,tf_diachi.getText());
              ps.setString(3,tf_sdt.getText());
              ps.setString(4,tf_email.getText());
              if(radio_vip.isSelected()){
              ps.setString(5,"1");
              }
              else 
              ps.setString(5,"0");
              ps.setString(6,tf_makh.getText());
              int check=ps.executeUpdate();
              
              if(check>0){
                  
                  tbn.setRowCount(0);
                  Form_load();
                  JOptionPane.showMessageDialog(this, "Sửa thành công");
                  
              }
         
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thay đổi được dữ liệu");
                  System.out.println(e);
        }
    }
    public void Delete(){
         DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        try {
//           
            String query = "delete from KHACHHANG where Makh=?";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
        
              
              ps.setString(1,tf_makh.getText());
              if(JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa dữ liệu này?","Confirm",JOptionPane.YES_NO_OPTION)
                      ==JOptionPane.YES_OPTION){
              int check=ps.executeUpdate();
                  
                  tbn.setRowCount(0);
                  Form_load();
              }
            
         
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không xóa được dữ liệu");
                  System.out.println(e);
        }
    }
    public void Search(){
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        try {
//           
            String query = "Select * from KHACHHANG where Makh=? or Tenkh like ?";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
             ps.setString(1,tf_makh.getText());
             ps.setString(2,"%"+tf_tenkh.getText()+"%");
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("Makh"));
                vector.add(rs.getString("Tenkh"));
                vector.add(rs.getString("Diachi"));
                vector.add(rs.getString("Dienthoai"));
                vector.add(rs.getString("Email"));
                vector.add(rs.getString("Membership"));
                tbn.addRow(vector);

            }
            jTable1.setModel(tbn);

        } catch (Exception e) {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Du_lieu_goc;
    private javax.swing.JButton btn_Them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radio_thuong;
    private javax.swing.JRadioButton radio_vip;
    private javax.swing.JTextField tf_diachi;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_makh;
    private javax.swing.JTextField tf_sdt;
    private javax.swing.JTextField tf_tenkh;
    // End of variables declaration//GEN-END:variables
}