/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Timkiem_NHANVIEN extends javax.swing.JFrame {

    /**
     * Creates new form Timkiem_NHANVIEN
     */
    public Timkiem_NHANVIEN() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_nv = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_manv = new javax.swing.JTextField();
        tf_tennv = new javax.swing.JTextField();
        tf_cmt = new javax.swing.JTextField();
        tf_diachi = new javax.swing.JTextField();
        btn_tim_theo_ma = new javax.swing.JButton();
        btn_tim_theo_ten = new javax.swing.JButton();
        btn_tim_theo_cmt = new javax.swing.JButton();
        btn_tim_theo_sdt = new javax.swing.JButton();
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
        jLabel1.setText("TÌM KIẾM NHÂN VIÊN");

        jTable_nv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma NV", "Tên NV", "Ngày Sinh", "Giới tính", "Số CMT/CCCD", "Địa Chỉ", "Điện Thoại"
            }
        ));
        jScrollPane1.setViewportView(jTable_nv);

        jLabel2.setText("Mã NV");

        jLabel3.setText("Tên NV");

        jLabel4.setText("Số CMT/CCCD");

        jLabel5.setText("Địa Chỉ");

        btn_tim_theo_ma.setText("Lọc theo mã nv");
        btn_tim_theo_ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_theo_maActionPerformed(evt);
            }
        });

        btn_tim_theo_ten.setText("Lọc theo tên nv");
        btn_tim_theo_ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_theo_tenActionPerformed(evt);
            }
        });

        btn_tim_theo_cmt.setText("Lọc theo CMT/CCCD");
        btn_tim_theo_cmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_theo_cmtActionPerformed(evt);
            }
        });

        btn_tim_theo_sdt.setText("Lọc theo địa chỉ");
        btn_tim_theo_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_theo_sdtActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_manv)
                                    .addComponent(tf_tennv)
                                    .addComponent(tf_cmt)
                                    .addComponent(tf_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_tim_theo_cmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_tim_theo_ma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_tim_theo_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_tim_theo_sdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_dulieugoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tim_theo_ma)
                    .addComponent(btn_dulieugoc))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_tennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tim_theo_ten)
                    .addComponent(btn_thoat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_cmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tim_theo_cmt))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tim_theo_sdt))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dulieugocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dulieugocActionPerformed
       DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel();
       tbn.setRowCount(0);
        hienthi();
    }//GEN-LAST:event_btn_dulieugocActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel();
       tbn.setRowCount(0);
        hienthi();
    }//GEN-LAST:event_formComponentShown

    private void btn_tim_theo_maActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_theo_maActionPerformed
        DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel();
       tbn.setRowCount(0);
        Search_MANV();
    }//GEN-LAST:event_btn_tim_theo_maActionPerformed

    private void btn_tim_theo_tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_theo_tenActionPerformed
         DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel();
       tbn.setRowCount(0);
        Search_TENNV();
                      
    }//GEN-LAST:event_btn_tim_theo_tenActionPerformed

    private void btn_tim_theo_cmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_theo_cmtActionPerformed
        DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel();
       tbn.setRowCount(0);
       Search_CMT();
    }//GEN-LAST:event_btn_tim_theo_cmtActionPerformed

    private void btn_tim_theo_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_theo_sdtActionPerformed
        DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel();
       tbn.setRowCount(0);
       Search_DIACHI();
    }//GEN-LAST:event_btn_tim_theo_sdtActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        this.setVisible(false);
        new QLNHANVIEN().setVisible(true);
    }//GEN-LAST:event_btn_thoatActionPerformed

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
    public void Search_MANV(){
        try {
            DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel(); 
            String query="select * from NHANVIEN where Manv=?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,tf_manv.getText().toString());
            ResultSet rs=ps.executeQuery();
            System.out.println(rs);
            while(rs.next()){
            Vector vt=new Vector();
            vt.add(rs.getString("Manv"));
            vt.add(rs.getString("Tennv"));
            vt.add(rs.getString("Ngaysinh"));
            vt.add(rs.getString("Gioitinh"));
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
     public void Search_TENNV(){
        try {
            DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel(); 
            String query="select * from NHANVIEN where Tennv like ?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,"%"+tf_tennv.getText().toString()+"%");
            ResultSet rs=ps.executeQuery();
            System.out.println(rs);
            while(rs.next()){
            Vector vt=new Vector();
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
      public void Search_CMT(){
        try {
            DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel(); 
            String query="select * from NHANVIEN where SoCmt=?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,tf_cmt.getText().toString());
            ResultSet rs=ps.executeQuery();
            System.out.println(rs);
            while(rs.next()){
            Vector vt=new Vector();
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
       public void Search_DIACHI(){
        try {
            DefaultTableModel tbn=(DefaultTableModel) jTable_nv.getModel(); 
            String query="select * from NHANVIEN where Diachi like ?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,"%"+tf_diachi.getText().toString()+"%");
            ResultSet rs=ps.executeQuery();
            System.out.println(rs);
            while(rs.next()){
            Vector vt=new Vector();
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
            java.util.logging.Logger.getLogger(Timkiem_NHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timkiem_NHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timkiem_NHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timkiem_NHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timkiem_NHANVIEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dulieugoc;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_tim_theo_cmt;
    private javax.swing.JButton btn_tim_theo_ma;
    private javax.swing.JButton btn_tim_theo_sdt;
    private javax.swing.JButton btn_tim_theo_ten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_nv;
    private javax.swing.JTextField tf_cmt;
    private javax.swing.JTextField tf_diachi;
    private javax.swing.JTextField tf_manv;
    private javax.swing.JTextField tf_tennv;
    // End of variables declaration//GEN-END:variables
}
