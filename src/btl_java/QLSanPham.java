/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLSanPham extends javax.swing.JFrame {

    /**
     * Creates new form QLSanPham
     */
    public QLSanPham() {
        initComponents();
       
    }

    public void Form_load_LoaiSP() {
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
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
            jTable1.setModel(tbn);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void Form_load_NCC() {
        DefaultTableModel tbNCC = (DefaultTableModel) jTable_ncc.getModel();
        try {
//           
            String query = "Select * from NHACC";
            Connection cn = DAO.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("MaNhaCc"));
                vector.add(rs.getString("TenNhaCc"));
                vector.add(rs.getString("DiaChi"));
                vector.add(rs.getString("DienThoai"));
                
                tbNCC.addRow(vector);
            }
            jTable_ncc.setModel(tbNCC);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public void exportExcel(JTable table) {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                // ten Cot
                for (int j = 0; j < table.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Lay du lieu dong
                for (int j = 0; j < table.getRowCount(); j++) {
                    for (int k = 0; k < table.getColumnCount(); k++) {
                        bwrite.write(model.getValueAt(j, k) + "\t");
                    }
                    bwrite.write("\n");
                }
                bwrite.close();
                JOptionPane.showMessageDialog(null, "Lưu file thành công!");
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "Lỗi khi lưu file!");
            }
        }
    }
    public void Form_load_SANPHAM(){
        DefaultTableModel tbn=(DefaultTableModel) table_sp.getModel();
        try {
            String query="select SANPHAM.MaSp,SANPHAM.TenSP,SANPHAM.MauSac,SANPHAM.DvTinh,LOAISP.Tenloai from SANPHAM inner join LOAISP on SANPHAM.Maloai=LOAISP.Maloai";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Vector vt=new Vector();
                vt.add(rs.getString("SANPHAM.MaSp"));
                vt.add(rs.getString("SANPHAM.TenSP"));
                vt.add(rs.getString("SANPHAM.MauSac"));
                vt.add(rs.getString("SANPHAM.DvTinh"));
                vt.add(rs.getString("LOAISP.Tenloai"));
                tbn.addRow(vt);
                
                
            }
            table_sp.setModel(tbn);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void Form_comboBox_loaiSP(){
         
        try {
            String query="select Tenloai from LOAISP";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                jcb_maloai.addItem(rs.getString("LOAISP.Tenloai")); 
            }
           
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public String getMaloaisp(String tenloai){
        String maloai="";
        try {
            String query="select Maloai from LOAISP where Tenloai=?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,tenloai);
            ResultSet rs=ps.executeQuery();
           while(rs.next()){
           maloai=rs.getString("Maloai");
           }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return maloai;
    }
    
    //Sản phẩm
    public void Add_SP(){
        DefaultTableModel tbn = (DefaultTableModel) table_sp.getModel();
        try {
            String query = "insert into SANPHAM values(?,?,?,?,?)";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tf_masp.getText());
            ps.setString(2, tf_tensp.getText());
            ps.setString(3, tf_mausac.getText());
            ps.setString(4, tf_donvitinh.getText());
            ps.setString(5, getMaloaisp(jcb_maloai.getSelectedItem().toString()));
            int check = ps.executeUpdate();
//            System.out.println(check);
            if (check > 0) {
                tf_maloai.setText("");
                tf_tenloai.setText("");
                tf_kichco.setText("");
                tf_chat_lieu.setText("");
                tbn.setRowCount(0);
                Form_load_SANPHAM();
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thêm được sản phẩm do đã tồn tại hoặc trống");
            System.out.println(e);
           
            
        }
    }
    public void Update_SP(){
        DefaultTableModel tbn=(DefaultTableModel) table_sp.getModel();
        try {
            String query="update SANPHAM set TenSP=?,MauSac=?,DvTinh=?,Maloai=? where MaSP=?";
            Connection conn=new DAO().getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,tf_tensp.getText());
            ps.setString(2,tf_mausac.getText());
            ps.setString(3,tf_donvitinh.getText());
            ps.setString(4,getMaloaisp(jcb_maloai.getSelectedItem().toString()));
            ps.setString(5,tf_masp.getText());
            int check=ps.executeUpdate();
            if(check>0){
                tbn.setRowCount(0);
                Form_load_SANPHAM();
                JOptionPane.showMessageDialog(this,"Cập nhật dữ liệu cho sản phẩm "+tf_maloai.getText()+" thành công");     
            }
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Cập nhật dữ liệu cho sản phẩm "+tf_maloai.getText()+" thất bại");
        }
    }
    public void Delete_SanPham(){
    DefaultTableModel tbn=(DefaultTableModel) table_sp.getModel();
        try {
            String query="delete from SANPHAM where MaSP=?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,tf_masp.getText());
            if(JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa "+tf_masp.getText()+"?", "Confirm", JOptionPane.YES_NO_OPTION)
                    ==JOptionPane.YES_OPTION){
           ps.executeUpdate();
            tbn.setRowCount(0);
            Form_load_SANPHAM();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không xóa được dữ liệu do liên quan ràng buộc khóa ngoài");
                  System.out.println(e);
        }
    }

    //Loại sản phẩm
    public void Add_LoaiSanPham() {
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        try {
            String query = "insert into LOAISP values(?,?,?,?)";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tf_maloai.getText());
            ps.setString(2, tf_tenloai.getText());
            ps.setString(3, tf_kichco.getText());
            ps.setString(4, tf_chat_lieu.getText());
            int check = ps.executeUpdate();
//            System.out.println(check);
            if (check > 0) {
                tf_maloai.setText("");
                tf_tenloai.setText("");
                tf_kichco.setText("");
                tf_chat_lieu.setText("");
                tbn.setRowCount(0);
                Form_load_LoaiSP();
                JOptionPane.showMessageDialog(this, "Thêm loại sản phẩm thành công");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thêm được loại sản phẩm do mã loại đã tồn tại hoặc trống");
            System.out.println(e);
        }
    }

    public void Update_LoaiSanPham() {
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        try {
            String query = "update LOAISP set Tenloai=?,Kichco=?,Chatlieu=? where Maloai=?";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(4, tf_maloai.getText());
            ps.setString(1, tf_tenloai.getText());
            ps.setString(2, tf_kichco.getText());
            ps.setString(3, tf_chat_lieu.getText());
            int check=ps.executeUpdate();
            if(check>0){
                tbn.setRowCount(0);
                Form_load_LoaiSP();
                JOptionPane.showMessageDialog(this,"Cập nhật dữ liệu cho mã loại "+tf_maloai.getText()+" thành công");
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Cập nhật dữ liệu cho mã loại "+tf_maloai.getText()+" thất bại");
        }
    }
    public void Delete_LoaiSanPham(){
    DefaultTableModel tbn=(DefaultTableModel) jTable1.getModel();
        try {
            String query="delete from LOAISP where Maloai=?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,tf_maloai.getText());
            if(JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa "+tf_maloai.getText()+"?", "Confirm", JOptionPane.YES_NO_OPTION)
                    ==JOptionPane.YES_OPTION){
           ps.executeUpdate();
            tbn.setRowCount(0);
            Form_load_LoaiSP();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không xóa được dữ liệu");
                  System.out.println(e);
        }
    }
    
    //Nhà cung cấp
    public void Add_NCC() {
        DefaultTableModel tbn = (DefaultTableModel) jTable_ncc.getModel();
        try {
            String query = "insert into NHACC values(?,?,?,?)";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tf_mancc.getText());
            ps.setString(2, tf_tenncc.getText());
            ps.setString(3, tf_diachincc.getText());
            ps.setString(4, tf_sdtncc.getText());
            int check = ps.executeUpdate();
            if (check > 0) {
                tf_mancc.setText("");
                tf_tenncc.setText("");
                tf_diachincc.setText("");
                tf_sdtncc.setText("");
                tbn.setRowCount(0);
                Form_load_NCC();
                JOptionPane.showMessageDialog(this, "Thêm nhà cung cấp thành công");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thêm được nhà cung cấp do mã nhà cung cấp đã tồn tại hoặc trống");
            System.out.println(e);
        }
    }
    public void Update_NCC(){
         DefaultTableModel tbn = (DefaultTableModel) jTable_ncc.getModel();
        try {
            String query = "update NHACC set TenNhaCc=?,DiaChi=?,DienThoai=? where MaNhaCc=?";
            Connection conn = DAO.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(4, tf_mancc.getText());
            ps.setString(1, tf_tenncc.getText());
            ps.setString(2, tf_diachincc.getText());
            ps.setString(3, tf_sdtncc.getText());
            int check=ps.executeUpdate();
            if(check>0){
                tbn.setRowCount(0);
                Form_load_NCC();
                JOptionPane.showMessageDialog(this,"Cập nhật dữ liệu cho mã ncc "+tf_mancc.getText()+" thành công");
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Cập nhật dữ liệu cho mã loại "+tf_mancc.getText()+" thất bại");
        }
    }
    public void Delete_NHACC(){
    DefaultTableModel tbn=(DefaultTableModel) jTable_ncc.getModel();
        try {
            String query="delete from NHACC where MaNhaCc=?";
            Connection conn=DAO.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,tf_mancc.getText());
            if(JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa "+tf_mancc.getText()+"?", "Confirm", JOptionPane.YES_NO_OPTION)
                    ==JOptionPane.YES_OPTION){
           ps.executeUpdate();
            tbn.setRowCount(0);
            Form_load_NCC();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không xóa được dữ liệu");
                  System.out.println(e);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_maloai = new javax.swing.JTextField();
        tf_tenloai = new javax.swing.JTextField();
        tf_kichco = new javax.swing.JTextField();
        tf_chat_lieu = new javax.swing.JTextField();
        btn_them_loaisp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_Timkiem_LoaiSP = new javax.swing.JButton();
        btn_Loaisp_Hienthi = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btn_thoat_loaisp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_sp = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_masp = new javax.swing.JTextField();
        tf_tensp = new javax.swing.JTextField();
        tf_mausac = new javax.swing.JTextField();
        tf_donvitinh = new javax.swing.JTextField();
        jcb_maloai = new javax.swing.JComboBox();
        btn_them_sp = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        btn_tim_sp = new javax.swing.JButton();
        btn_thoat_mat_hang = new javax.swing.JButton();
        btn_dulieugoc_sp = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel_ncc = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_ncc = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_mancc = new javax.swing.JTextField();
        tf_tenncc = new javax.swing.JTextField();
        tf_diachincc = new javax.swing.JTextField();
        tf_sdtncc = new javax.swing.JTextField();
        btn_them_ncc = new javax.swing.JButton();
        btn_updateNCC = new javax.swing.JButton();
        btn_xoa_ncc = new javax.swing.JButton();
        btn_timkiem = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại", "Tên loại", "Kích cỡ", "Chất liệu"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Mã loại sp");

        jLabel2.setText("Tên loại sản phẩm");

        jLabel4.setText("Kích cỡ");

        jLabel5.setText("Chất liệu");

        btn_them_loaisp.setText("Thêm");
        btn_them_loaisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them_loaispActionPerformed(evt);
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

        btn_Timkiem_LoaiSP.setText("Tìm kiếm");
        btn_Timkiem_LoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Timkiem_LoaiSPActionPerformed(evt);
            }
        });

        btn_Loaisp_Hienthi.setText("Dữ liệu gốc");
        btn_Loaisp_Hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Loaisp_HienthiActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("LOẠI SẢN PHẨM");

        btn_thoat_loaisp.setText("Thoát");
        btn_thoat_loaisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoat_loaispActionPerformed(evt);
            }
        });

        jButton1.setText("Xuất Báo Cáo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_maloai, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                            .addComponent(tf_tenloai))
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_kichco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_chat_lieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(126, 126, 126)
                                                .addComponent(btn_Timkiem_LoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(132, 132, 132))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn_thoat_loaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(219, 219, 219)))))))
                        .addContainerGap(192, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Loaisp_Hienthi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_them_loaisp)
                        .addGap(72, 72, 72)
                        .addComponent(jButton2)
                        .addGap(90, 90, 90)
                        .addComponent(jButton3)
                        .addGap(228, 228, 228))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Timkiem_LoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(tf_kichco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_tenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_chat_lieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them_loaisp)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btn_Loaisp_Hienthi))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_thoat_loaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Loại sản phẩm", jPanel1);

        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });

        table_sp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Màu sắc", "Đơn vị tính", "Tên loại"
            }
        ));
        table_sp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_spMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_sp);

        jLabel7.setText("Mã sản phẩm");

        jLabel8.setText("Tên sản phẩm");

        jLabel9.setText("Màu sắc");

        jLabel11.setText("Đơn vị tính");

        jLabel12.setText("Tên loại");

        btn_them_sp.setText("Thêm");
        btn_them_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them_spActionPerformed(evt);
            }
        });

        jButton10.setText("Sửa");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Xóa");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        btn_tim_sp.setText("Tìm kiếm");
        btn_tim_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_spActionPerformed(evt);
            }
        });

        btn_thoat_mat_hang.setText("Thoát");
        btn_thoat_mat_hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoat_mat_hangActionPerformed(evt);
            }
        });

        btn_dulieugoc_sp.setText("Dữ liệu gốc");
        btn_dulieugoc_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dulieugoc_spActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SẢN PHẨM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_masp, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(tf_tensp)
                    .addComponent(tf_mausac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_donvitinh)
                    .addComponent(jcb_maloai, 0, 176, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btn_them_sp)
                        .addGap(69, 69, 69)
                        .addComponent(jButton10)
                        .addGap(90, 90, 90)
                        .addComponent(jButton11)
                        .addGap(106, 106, 106)
                        .addComponent(btn_tim_sp)
                        .addGap(60, 60, 60)
                        .addComponent(btn_dulieugoc_sp))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(btn_thoat_mat_hang, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_masp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tf_donvitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_tensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jcb_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them_sp)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(btn_tim_sp)
                    .addComponent(btn_dulieugoc_sp))
                .addGap(50, 50, 50)
                .addComponent(btn_thoat_mat_hang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Sản phẩm", jPanel2);

        jPanel_ncc.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel_nccComponentShown(evt);
            }
        });

        jTable_ncc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Số điện thoại"
            }
        ));
        jTable_ncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_nccMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_ncc);

        jLabel3.setText("Mã NCC");

        jLabel6.setText("Tên NCC");

        jLabel13.setText("Địa chỉ");

        jLabel14.setText("Số điện thoại");

        btn_them_ncc.setText("Thêm");
        btn_them_ncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them_nccActionPerformed(evt);
            }
        });

        btn_updateNCC.setText("Sửa");
        btn_updateNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateNCCActionPerformed(evt);
            }
        });

        btn_xoa_ncc.setText("Xóa");
        btn_xoa_ncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoa_nccActionPerformed(evt);
            }
        });

        btn_timkiem.setText("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("NHÀ CUNG CẤP");

        javax.swing.GroupLayout jPanel_nccLayout = new javax.swing.GroupLayout(jPanel_ncc);
        jPanel_ncc.setLayout(jPanel_nccLayout);
        jPanel_nccLayout.setHorizontalGroup(
            jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_nccLayout.createSequentialGroup()
                .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_nccLayout.createSequentialGroup()
                        .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_nccLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_nccLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btn_them_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btn_updateNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btn_xoa_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_nccLayout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 188, Short.MAX_VALUE))
                    .addGroup(jPanel_nccLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_tenncc)
                            .addComponent(tf_mancc, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_diachincc)
                            .addComponent(tf_sdtncc, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel_nccLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_nccLayout.setVerticalGroup(
            jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_nccLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(tf_mancc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_diachincc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(tf_tenncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_sdtncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel_nccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_updateNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("Nhà cung cấp", jPanel_ncc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Loaisp_HienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Loaisp_HienthiActionPerformed
        DefaultTableModel tbn = (DefaultTableModel) jTable1.getModel();
        tbn.setRowCount(0);
        Form_load_LoaiSP();
    }//GEN-LAST:event_btn_Loaisp_HienthiActionPerformed

    private void btn_them_loaispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them_loaispActionPerformed
        Add_LoaiSanPham();
    }//GEN-LAST:event_btn_them_loaispActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        tf_maloai.setText(jTable1.getValueAt(index, 0).toString());
        tf_tenloai.setText(jTable1.getValueAt(index, 1).toString());
        tf_kichco.setText(jTable1.getValueAt(index, 2).toString());
        tf_chat_lieu.setText(jTable1.getValueAt(index, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Update_LoaiSanPham();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Delete_LoaiSanPham();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_Timkiem_LoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Timkiem_LoaiSPActionPerformed
        this.setVisible(false);
        new Timkiem_LoaiSP().setVisible(true);
    }//GEN-LAST:event_btn_Timkiem_LoaiSPActionPerformed

    private void jPanel_nccComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_nccComponentShown
        DefaultTableModel tbNCC=(DefaultTableModel) jTable_ncc.getModel();
        tbNCC.setRowCount(0);
        Form_load_NCC();
    }//GEN-LAST:event_jPanel_nccComponentShown

    private void btn_them_nccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them_nccActionPerformed
        Add_NCC();
    }//GEN-LAST:event_btn_them_nccActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        DefaultTableModel tbNCC=(DefaultTableModel) jTable1.getModel();
        tbNCC.setRowCount(0);
        Form_load_LoaiSP();
    }//GEN-LAST:event_jPanel1ComponentShown

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        this.setVisible(false);
        new mainInterface().setVisible(true);
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        this.setVisible(false);
        new Timkiem_NHACC().setVisible(true);
    }//GEN-LAST:event_btn_timkiemActionPerformed

    private void jTable_nccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_nccMouseClicked
        int index=jTable_ncc.getSelectedRow();
        tf_mancc.setText(jTable_ncc.getValueAt(index, 0).toString());
        tf_tenncc.setText(jTable_ncc.getValueAt(index, 1).toString());
        tf_diachincc.setText(jTable_ncc.getValueAt(index, 2).toString());
        tf_sdtncc.setText(jTable_ncc.getValueAt(index, 3).toString());
    }//GEN-LAST:event_jTable_nccMouseClicked

    private void btn_updateNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateNCCActionPerformed
        Update_NCC();
    }//GEN-LAST:event_btn_updateNCCActionPerformed

    private void btn_xoa_nccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoa_nccActionPerformed
       Delete_NHACC();
    }//GEN-LAST:event_btn_xoa_nccActionPerformed

    private void btn_thoat_mat_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoat_mat_hangActionPerformed
        this.setVisible(false);
        new mainInterface().setVisible(true);
    }//GEN-LAST:event_btn_thoat_mat_hangActionPerformed

    private void btn_thoat_loaispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoat_loaispActionPerformed
         this.setVisible(false);
        new mainInterface().setVisible(true);
    }//GEN-LAST:event_btn_thoat_loaispActionPerformed

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown
        DefaultTableModel tbn=(DefaultTableModel) table_sp.getModel();
        jcb_maloai.removeAllItems();
        tbn.setRowCount(0);
        Form_comboBox_loaiSP();
        Form_load_SANPHAM();
    }//GEN-LAST:event_jPanel2ComponentShown

    private void btn_dulieugoc_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dulieugoc_spActionPerformed
        DefaultTableModel tbn=(DefaultTableModel) table_sp.getModel();
        tbn.setRowCount(0);
        Form_load_SANPHAM();
    }//GEN-LAST:event_btn_dulieugoc_spActionPerformed

    private void table_spMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_spMouseClicked
        int index=table_sp.getSelectedRow();
        tf_masp.setText(table_sp.getValueAt(index, 0).toString());
        tf_tensp.setText(table_sp.getValueAt(index, 1).toString());
        tf_mausac.setText(table_sp.getValueAt(index,2).toString());
        tf_donvitinh.setText(table_sp.getValueAt(index, 3).toString());
        jcb_maloai.setSelectedItem(table_sp.getValueAt(index, 4));
    }//GEN-LAST:event_table_spMouseClicked

    private void btn_them_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them_spActionPerformed
        Add_SP();
    }//GEN-LAST:event_btn_them_spActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Update_SP();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Delete_SanPham();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btn_tim_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_spActionPerformed
        this.setVisible(false);
        new Timkiem_SANPHAM().setVisible(true);
    }//GEN-LAST:event_btn_tim_spActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        exportExcel(jTable1);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Loaisp_Hienthi;
    private javax.swing.JButton btn_Timkiem_LoaiSP;
    private javax.swing.JButton btn_dulieugoc_sp;
    private javax.swing.JButton btn_them_loaisp;
    private javax.swing.JButton btn_them_ncc;
    private javax.swing.JButton btn_them_sp;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_thoat_loaisp;
    private javax.swing.JButton btn_thoat_mat_hang;
    private javax.swing.JButton btn_tim_sp;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_updateNCC;
    private javax.swing.JButton btn_xoa_ncc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel_ncc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_ncc;
    private javax.swing.JComboBox jcb_maloai;
    private javax.swing.JTable table_sp;
    private javax.swing.JTextField tf_chat_lieu;
    private javax.swing.JTextField tf_diachincc;
    private javax.swing.JTextField tf_donvitinh;
    private javax.swing.JTextField tf_kichco;
    private javax.swing.JTextField tf_maloai;
    private javax.swing.JTextField tf_mancc;
    private javax.swing.JTextField tf_masp;
    private javax.swing.JTextField tf_mausac;
    private javax.swing.JTextField tf_sdtncc;
    private javax.swing.JTextField tf_tenloai;
    private javax.swing.JTextField tf_tenncc;
    private javax.swing.JTextField tf_tensp;
    // End of variables declaration//GEN-END:variables
}
