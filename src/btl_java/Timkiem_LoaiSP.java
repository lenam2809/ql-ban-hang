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
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Timkiem_LoaiSP extends javax.swing.JFrame {

    /**
     * Creates new form Timkiem_LoaiSP
     */
    public Timkiem_LoaiSP() {
        initComponents();
        DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        tbn.setRowCount(0);
        Form_load_LoaiSP();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPane_timloaisp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_timkiemloaisp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_maloai = new javax.swing.JTextField();
        tf_tenloai = new javax.swing.JTextField();
        tf_kichco = new javax.swing.JTextField();
        tf_chat_lieu = new javax.swing.JTextField();
        btn_tim_tenloai = new javax.swing.JButton();
        btn_tim_kichco = new javax.swing.JButton();
        btn_tim_chatlieu = new javax.swing.JButton();
        btn_tim_maloai = new javax.swing.JButton();
        btn_Loaisp_Hienthi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_timkiemloaisp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại", "Tên loại", "Kích cỡ", "Chất liệu"
            }
        ));
        table_timkiemloaisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_timkiemloaispMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_timkiemloaisp);

        jLabel1.setText("Mã loại sp");

        jLabel2.setText("Tên loại sản phẩm");

        jLabel4.setText("Kích cỡ");

        jLabel5.setText("Chất liệu");

        btn_tim_tenloai.setText("Tìm theo tên loại");
        btn_tim_tenloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_tenloaiActionPerformed(evt);
            }
        });

        btn_tim_kichco.setText("Tìm theo kích cỡ");
        btn_tim_kichco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_kichcoActionPerformed(evt);
            }
        });

        btn_tim_chatlieu.setText("Tìm theo chất liệu");
        btn_tim_chatlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_chatlieuActionPerformed(evt);
            }
        });

        btn_tim_maloai.setText("Tìm theo mã loại");
        btn_tim_maloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_maloaiActionPerformed(evt);
            }
        });

        btn_Loaisp_Hienthi.setText("Dữ liệu gốc");
        btn_Loaisp_Hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Loaisp_HienthiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TÌM KIẾM LOẠI SẢN PHẨM");

        btn_thoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPane_timloaispLayout = new javax.swing.GroupLayout(jPane_timloaisp);
        jPane_timloaisp.setLayout(jPane_timloaispLayout);
        jPane_timloaispLayout.setHorizontalGroup(
            jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_timloaispLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPane_timloaispLayout.createSequentialGroup()
                        .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPane_timloaispLayout.createSequentialGroup()
                                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_maloai, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(tf_tenloai))
                                .addGap(76, 76, 76)
                                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_kichco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_chat_lieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPane_timloaispLayout.createSequentialGroup()
                        .addComponent(btn_Loaisp_Hienthi)
                        .addGap(34, 34, 34)
                        .addComponent(btn_tim_tenloai)
                        .addGap(18, 18, 18)
                        .addComponent(btn_tim_kichco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btn_tim_chatlieu)
                        .addGap(100, 100, 100)
                        .addComponent(btn_tim_maloai)
                        .addGap(55, 55, 55))))
            .addGroup(jPane_timloaispLayout.createSequentialGroup()
                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_timloaispLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPane_timloaispLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPane_timloaispLayout.setVerticalGroup(
            jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane_timloaispLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(tf_kichco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_timloaispLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_tenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPane_timloaispLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_chat_lieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPane_timloaispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tim_tenloai)
                    .addComponent(btn_tim_kichco)
                    .addComponent(btn_tim_chatlieu)
                    .addComponent(btn_tim_maloai)
                    .addComponent(btn_Loaisp_Hienthi))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPane_timloaisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPane_timloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_timkiemloaispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_timkiemloaispMouseClicked
        int index = table_timkiemloaisp.getSelectedRow();
        tf_maloai.setText(table_timkiemloaisp.getValueAt(index, 0).toString());
        tf_tenloai.setText(table_timkiemloaisp.getValueAt(index, 1).toString());
        tf_kichco.setText(table_timkiemloaisp.getValueAt(index, 2).toString());
        tf_chat_lieu.setText(table_timkiemloaisp.getValueAt(index, 3).toString());
    }//GEN-LAST:event_table_timkiemloaispMouseClicked

    private void btn_tim_tenloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_tenloaiActionPerformed
        DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        tbn.setRowCount(0);
        Timkiem_tenLoai();
    }//GEN-LAST:event_btn_tim_tenloaiActionPerformed

    private void btn_tim_kichcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_kichcoActionPerformed
        DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        tbn.setRowCount(0);
        Timkiem_kichco();
    }//GEN-LAST:event_btn_tim_kichcoActionPerformed

    private void btn_tim_chatlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_chatlieuActionPerformed
        DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        tbn.setRowCount(0);
        Timkiem_chatlieu();
    }//GEN-LAST:event_btn_tim_chatlieuActionPerformed

    private void btn_Loaisp_HienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Loaisp_HienthiActionPerformed
        DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        tbn.setRowCount(0);
        Form_load_LoaiSP();
    }//GEN-LAST:event_btn_Loaisp_HienthiActionPerformed

    private void btn_tim_maloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_maloaiActionPerformed
        DefaultTableModel tbn=(DefaultTableModel) table_timkiemloaisp.getModel();
        tbn.setRowCount(0);
        Timkiem_maLoai();
    }//GEN-LAST:event_btn_tim_maloaiActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        this.setVisible(false);
        QLSanPham qlsp=new QLSanPham();
        qlsp.setVisible(true);
        
        
    }//GEN-LAST:event_btn_thoatActionPerformed

    /**
     * @param args the command line arguments
     */
     public void Form_load_LoaiSP() {
        DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        try {
//           
            String query = "Select * from LOAISP";
            Connection cn = DAO.getConnection();
            Statement ps = cn.createStatement();
            ResultSet rs = ps.executeQuery(query);

            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("Maloai"));
                vector.add(rs.getString("Tenloai"));
                vector.add(rs.getString("Kichco"));
                vector.add(rs.getString("Chatlieu"));
                vector.add(rs.getString("Chatlieu"));
                tbn.addRow(vector);

            }
            table_timkiemloaisp.setModel(tbn);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
     public void Timkiem_maLoai(){
      DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        try {         
            String query = "Select * from LOAISP where Maloai=?";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
             ps.setString(1,tf_maloai.getText());
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("Maloai"));
                vector.add(rs.getString("Tenloai"));
                vector.add(rs.getString("Kichco"));
                vector.add(rs.getString("Chatlieu"));
                tbn.addRow(vector);

            }
            table_timkiemloaisp.setModel(tbn);

        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     public void Timkiem_tenLoai(){
      DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        try {         
            String query = "Select * from LOAISP where Tenloai like ?";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
             ps.setString(1,"%"+tf_tenloai.getText()+"%");
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("Maloai"));
                vector.add(rs.getString("Tenloai"));
                vector.add(rs.getString("Kichco"));
                vector.add(rs.getString("Chatlieu"));
                tbn.addRow(vector);

            }
            table_timkiemloaisp.setModel(tbn);

        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     public void Timkiem_kichco(){
      DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        try {         
            String query = "Select * from LOAISP where Kichco like ?";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
             ps.setString(1,"%"+tf_kichco.getText()+"%");
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("Maloai"));
                vector.add(rs.getString("Tenloai"));
                vector.add(rs.getString("Kichco"));
                vector.add(rs.getString("Chatlieu"));
                tbn.addRow(vector);

            }
            table_timkiemloaisp.setModel(tbn);

        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     public void Timkiem_chatlieu(){
      DefaultTableModel tbn = (DefaultTableModel) table_timkiemloaisp.getModel();
        try {         
            String query = "Select * from LOAISP where Chatlieu like ?";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
             ps.setString(1,"%"+tf_chat_lieu.getText()+"%");
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("Maloai"));
                vector.add(rs.getString("Tenloai"));
                vector.add(rs.getString("Kichco"));
                vector.add(rs.getString("Chatlieu"));
                tbn.addRow(vector);

            }
            table_timkiemloaisp.setModel(tbn);

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
            java.util.logging.Logger.getLogger(Timkiem_LoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timkiem_LoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timkiem_LoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timkiem_LoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timkiem_LoaiSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Loaisp_Hienthi;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_tim_chatlieu;
    private javax.swing.JButton btn_tim_kichco;
    private javax.swing.JButton btn_tim_maloai;
    private javax.swing.JButton btn_tim_tenloai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPane_timloaisp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_timkiemloaisp;
    private javax.swing.JTextField tf_chat_lieu;
    private javax.swing.JTextField tf_kichco;
    private javax.swing.JTextField tf_maloai;
    private javax.swing.JTextField tf_tenloai;
    // End of variables declaration//GEN-END:variables
}