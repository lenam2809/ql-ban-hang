/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_java;

import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Thongke extends javax.swing.JFrame {

    /**
     * Creates new form Thongke
     */
    public Thongke() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_thongke = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_thang = new javax.swing.JTextField();
        tf_nam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_loc = new javax.swing.JButton();
        btn_dulieugoc_thongke = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SLban = new javax.swing.JLabel();
        tongtiennhap = new javax.swing.JLabel();
        tongban = new javax.swing.JLabel();
        tongtienlai = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SPban = new javax.swing.JLabel();
        btn_thoat_thongke = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        table_thongke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng bán", "Đơn giá bán"
            }
        ));
        jScrollPane1.setViewportView(table_thongke);

        jLabel1.setText("Tháng");

        jLabel2.setText("Năm");

        jLabel3.setText("Tổng tiền nhập");

        jLabel4.setText("Tổng tiền bán");

        jLabel5.setText("Lãi");

        btn_loc.setText("Lọc");
        btn_loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_locActionPerformed(evt);
            }
        });

        btn_dulieugoc_thongke.setText("Dữ liệu gốc");
        btn_dulieugoc_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dulieugoc_thongkeActionPerformed(evt);
            }
        });

        jLabel7.setText("Tổng SL bán");

        SLban.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tongtiennhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tongban.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tongtienlai.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Tổng SP bán");

        SPban.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_thoat_thongke.setText("Thoát");
        btn_thoat_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoat_thongkeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THỐNG KÊ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(SLban, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                        .addGap(34, 34, 34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_thang)
                                        .addGap(41, 41, 41)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nam)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addComponent(btn_loc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_dulieugoc_thongke)
                                .addGap(18, 18, 18)
                                .addComponent(btn_thoat_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tongban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tongtiennhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tongtienlai, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(SPban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_loc))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(SLban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SPban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tongtiennhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tongban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tongtienlai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dulieugoc_thongke)
                    .addComponent(btn_thoat_thongke))
                .addGap(148, 148, 148))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel tbn = (DefaultTableModel) table_thongke.getModel();
        Locale localeVN = new Locale("vi", "VN");
             NumberFormat vn = NumberFormat.getInstance(localeVN);
        tbn.setRowCount(0);
        hienthi_thongke();
        tongtienban();
        tongtiennhap.setText(String.valueOf(vn.format(tongtiennhap())));
        
        tongSLban();
        tongSPban();
        tienlai();
    }//GEN-LAST:event_formComponentShown

    private void btn_thoat_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoat_thongkeActionPerformed
        this.setVisible(false);
        new mainInterface().setVisible(true);
    }//GEN-LAST:event_btn_thoat_thongkeActionPerformed

    private void btn_dulieugoc_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dulieugoc_thongkeActionPerformed
         DefaultTableModel tbn = (DefaultTableModel) table_thongke.getModel();
        Locale localeVN = new Locale("vi", "VN");
             NumberFormat vn = NumberFormat.getInstance(localeVN);
        tbn.setRowCount(0);
        hienthi_thongke();
        tongtienban();
        tongtiennhap.setText(String.valueOf(vn.format(tongtiennhap())));
        
        tongSLban();
        tongSPban();
        tienlai();
    }//GEN-LAST:event_btn_dulieugoc_thongkeActionPerformed

    private void btn_locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_locActionPerformed
        DefaultTableModel tbn=(DefaultTableModel) table_thongke.getModel();
        Locale localeVN = new Locale("vi", "VN");
             NumberFormat vn = NumberFormat.getInstance(localeVN);
        tbn.setRowCount(0);
        timDuLieu_namthang();
        tongtienban();
        tongtiennhap.setText(String.valueOf(vn.format(tongtiennhap_namthang())));
        
        tongSLban();
        tongSPban();
        tienlai_namthang();
    }//GEN-LAST:event_btn_locActionPerformed
    public void hienthi_thongke() {

        DefaultTableModel tbn = (DefaultTableModel) table_thongke.getModel();
        try {

            String query = "select SANPHAM.TenSP,SANPHAM.MaSP,sum(CTPXUAT.SlXuat),CTPXUAT.DgXuat"
                    
                    + " from CTPXUAT inner join SANPHAM on CTPXUAT.MaSP=SANPHAM.MaSP"
                    
                    +" group by SANPHAM.MaSP,CTPXUAT.DgXuat";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(rs.getString(1));
                vt.add(rs.getString(2));
                vt.add(rs.getString(3));
                vt.add(rs.getString(4));
             
                tbn.addRow(vt);
            }
            table_thongke.setModel(tbn);
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }

    public void tongtienban() {
        int sum = 0;
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);
        DefaultTableModel tbn = (DefaultTableModel) table_thongke.getModel();
        int size = table_thongke.getRowCount();
        for (int i = 0; i < size; i++) {
            sum += Integer.parseInt(table_thongke.getValueAt(i, 2).toString()) * Integer.parseInt(table_thongke.getValueAt(i, 3).toString());
        }
        tongban.setText(String.valueOf(vn.format(sum)));
    }
    public int tongtiennhap() {
        int sum=0;
        try {
            
            Locale localeVN = new Locale("vi", "VN");
             NumberFormat vn = NumberFormat.getInstance(localeVN);
            String query="select sum(SlNhap*DgNhap) from CTPNHAP";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                 sum=rs.getInt(1);
            }
            
        } catch (Exception e) {
        }
        return sum;
    }
     public int tongtiennhap_namthang() {
        int sum=0;
        try {
            
            Locale localeVN = new Locale("vi", "VN");
             NumberFormat vn = NumberFormat.getInstance(localeVN);
            String query="select sum(SlNhap*DgNhap) from CTPNHAP inner join PNHAP on PNHAP.SoPn=CTPNHAP.SoPn where MONTH(NgayNhap)=? and YEAR(NgayNhap)=?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, tf_thang.getText());
            ps.setString(2, tf_nam.getText());
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                 sum=rs.getInt(1);
            }
            
        } catch (Exception e) {
        }
        return sum;
    }

    public void tongSLban() {
       int sum = 0;
        DefaultTableModel tbn = (DefaultTableModel) table_thongke.getModel();
        int size = table_thongke.getRowCount();
        for (int i = 0; i < size; i++) {
            sum += Integer.parseInt(table_thongke.getValueAt(i, 2).toString());
        }
        SLban.setText(String.valueOf(sum));
    }
    public void tongSPban() {
       int sum = 0;
        
        int size = table_thongke.getRowCount();
        
        SPban.setText(String.valueOf(size));
    }
    public void tienlai_namthang(){
         int sumnhap = tongtiennhap_namthang();
         int sumban=0;
         int tienlai=0;
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);
        DefaultTableModel tbn = (DefaultTableModel) table_thongke.getModel();
        int size = table_thongke.getRowCount();
        for (int i = 0; i < size; i++) {
            sumban += Integer.parseInt(table_thongke.getValueAt(i, 2).toString()) * Integer.parseInt(table_thongke.getValueAt(i, 3).toString());
            
        }
        tienlai=sumban-sumnhap;
        tongtienlai.setText(String.valueOf(vn.format(tienlai)));
    }
    public void tienlai(){
         int sumnhap = tongtiennhap();
         int sumban=0;
         int tienlai=0;
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);
        DefaultTableModel tbn = (DefaultTableModel) table_thongke.getModel();
        int size = table_thongke.getRowCount();
        for (int i = 0; i < size; i++) {
            sumban += Integer.parseInt(table_thongke.getValueAt(i, 2).toString()) * Integer.parseInt(table_thongke.getValueAt(i, 3).toString());
            
        }
        tienlai=sumban-sumnhap;
        tongtienlai.setText(String.valueOf(vn.format(tienlai)));
    }
    public void timDuLieu_namthang(){
        DefaultTableModel tbn=(DefaultTableModel) table_thongke.getModel();
        try {
             String query = "select SANPHAM.TenSP,SANPHAM.MaSP,sum(CTPXUAT.SlXuat),CTPXUAT.DgXuat"
                    + " from CTPXUAT inner join SANPHAM on CTPXUAT.MaSP=SANPHAM.MaSP inner join PXUAT on PXUAT.SoPx=CTPXUAT.SoPx where month(NgayXuat)=? and year(NgayXuat)=?" 
                    +" group by SANPHAM.MaSP,CTPXUAT.DgXuat";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tf_thang.getText());
            ps.setString(2, tf_nam.getText());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(rs.getString(1));
                vt.add(rs.getString(2));
                vt.add(rs.getString(3));
                vt.add(rs.getString(4));
             
                tbn.addRow(vt);
            }
            table_thongke.setModel(tbn);
        } catch (Exception e) {
        }
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
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thongke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SLban;
    private javax.swing.JLabel SPban;
    private javax.swing.JButton btn_dulieugoc_thongke;
    private javax.swing.JButton btn_loc;
    private javax.swing.JButton btn_thoat_thongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_thongke;
    private javax.swing.JTextField tf_nam;
    private javax.swing.JTextField tf_thang;
    private javax.swing.JLabel tongban;
    private javax.swing.JLabel tongtienlai;
    private javax.swing.JLabel tongtiennhap;
    // End of variables declaration//GEN-END:variables
}
