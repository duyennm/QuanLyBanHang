package poly.GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import poly.dao.SanPhamDAO;
import poly.model.SanPham;


public class DialogSanPham extends javax.swing.JDialog {
    TableRowSorter sorter;
    String txtMaSP;
    public DialogSanPham(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        /*
         * Đưa form ra giữa màn hình
         */
        initModel();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension window = this.getSize();
        int x = (screen.width - window.width)/2;
        int y = (screen.height - window.height)/2;
        this.setLocation(x, y);
        this.setResizable(false);
        btnSuaSP.setEnabled(false);
        btnXoaSP.setEnabled(false);
        btnThemSP.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        grSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDonViTinh = new javax.swing.JTextField();
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTimKiemSP = new javax.swing.JTextField();
        btnNhapLaiSP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboLoaiSP = new javax.swing.JComboBox<>();
        btnXoaTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("D-Start _ Quản Lý Sản Phẩm");
        setAlwaysOnTop(true);

        grSanPham.setAutoCreateRowSorter(true);
        grSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Mã Loại SP", "Đơn Giá", "Đơn Vị Tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grSanPhamMouseClicked(evt);
            }
        });
        grSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grSanPhamKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(grSanPham);
        if (grSanPham.getColumnModel().getColumnCount() > 0) {
            grSanPham.getColumnModel().getColumn(0).setResizable(false);
            grSanPham.getColumnModel().getColumn(1).setResizable(false);
            grSanPham.getColumnModel().getColumn(2).setResizable(false);
            grSanPham.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        jLabel2.setText("Tên SP:");

        jLabel3.setText("Đơn giá:");

        jLabel5.setText("Đơn vị tính:");

        btnThemSP.setText("Thêm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnSuaSP.setText("Sửa");
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });

        btnXoaSP.setText("Xóa");
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        jLabel6.setText("Nhập Tên Tìm Kiếm:");

        txtTimKiemSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemSPKeyPressed(evt);
            }
        });

        btnNhapLaiSP.setText("Nhập lại");
        btnNhapLaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapLaiSPActionPerformed(evt);
            }
        });

        jLabel4.setText("Loại SP:");

        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Máy Tính", "Thiết Bị Tin Học", "Thiết Bị Mạng", "Thiết Bị Kỹ Thuật Số", "Thiết Bị Văn Phòng" }));

        btnXoaTimKiem.setText("Xóa tìm kiếm");
        btnXoaTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenSP)
                            .addComponent(txtDonGia)
                            .addComponent(txtDonViTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(cboLoaiSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThemSP)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaSP)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaSP)
                        .addGap(18, 18, 18)
                        .addComponent(btnNhapLaiSP))))
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaTimKiem))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnXoaTimKiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaSP)
                    .addComponent(btnXoaSP)
                    .addComponent(btnThemSP)
                    .addComponent(btnNhapLaiSP))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grSanPhamMouseClicked
        // TODO add your handling code here:
        int i = grSanPham.getSelectedRow();

        if (i < 0) {
            return;
        }

        txtMaSP = grSanPham.getValueAt(i, 0).toString();
        txtTenSP.setText(grSanPham.getValueAt(i, 1).toString());
        cboLoaiSP.setSelectedIndex(Integer.parseInt(grSanPham.getValueAt(i, 2).toString())-1);
        txtDonGia.setText(grSanPham.getValueAt(i, 3).toString());
        txtDonViTinh.setText(grSanPham.getValueAt(i, 4).toString());
        
        btnSuaSP.setEnabled(true);
        btnXoaSP.setEnabled(true);
        btnThemSP.setEnabled(false);

    }//GEN-LAST:event_grSanPhamMouseClicked

    private void grSanPhamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grSanPhamKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_grSanPhamKeyPressed

    private void btnNhapLaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapLaiSPActionPerformed
        // TODO add your handling code here:
        setNullField();
    }//GEN-LAST:event_btnNhapLaiSPActionPerformed

    private void txtTimKiemSPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemSPKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sorter = (TableRowSorter) grSanPham.getRowSorter();

            ArrayList dk = new ArrayList();
            String s = txtTimKiemSP.getText().trim();
            dk.add(javax.swing.RowFilter.regexFilter("(?i)" + s, 1));
            sorter.setRowFilter(javax.swing.RowFilter.andFilter(dk));
        }
    }//GEN-LAST:event_txtTimKiemSPKeyPressed

    private void btnXoaTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTimKiemActionPerformed
        // TODO add your handling code here:
        txtTimKiemSP.setText(null);
        sorter.setRowFilter(null);
    }//GEN-LAST:event_btnXoaTimKiemActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        // TODO add your handling code here:
        if (txtTenSP.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống Tên sản phẩm?", "Thông báo", JOptionPane.OK_OPTION);
            txtTenSP.requestFocus();
            return;
        }
        if (txtDonGia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống Đơn giá?", "Thông báo", JOptionPane.OK_OPTION);
            txtDonGia.requestFocus();
            return;
        }
        do {
                Pattern p = null;
                Matcher m = null;
                p = Pattern.compile("[0-9]+", Pattern.CASE_INSENSITIVE);
                m = p.matcher(txtDonGia.getText());
                if (!m.matches()) {
                    JOptionPane.showMessageDialog(this, "Nhập sai định dạng số !!");
                    txtDonGia.requestFocus();
                    return;
                }
                break;
            } while (true);
        if (txtDonViTinh.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống?", "Thông báo", JOptionPane.OK_OPTION);
            txtDonViTinh.requestFocus();
            return;
        }
        
        SanPham sp = new SanPham(txtTenSP.getText().toString(), (cboLoaiSP.getSelectedIndex() + 1),Integer.parseInt(txtDonGia.getText().toString()),txtDonViTinh.getText().toString());
        SanPhamDAO spDAO = new SanPhamDAO();
        if (spDAO.insert(sp)>0) {
                setNullField();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                model.setRowCount(0);
                initModel();
        } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        // TODO add your handling code here:
        int a = grSanPham.getSelectedRow();
        if (a < 0) {
            JOptionPane.showMessageDialog(this, "Chưa chọn dòng nào ");
            return;
        }
        if (txtMaSP.length() == 0) {
            JOptionPane.showMessageDialog(this, "Có lỗi trong lúc chọn dòng vui lòng chọn lại");
            return;
        }
        if (txtTenSP.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống Tên sản phẩm?", "Thông báo", JOptionPane.OK_OPTION);
            txtTenSP.requestFocus();
            return;
        }
        if (txtDonGia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống Đơn giá?", "Thông báo", JOptionPane.OK_OPTION);
            txtDonGia.requestFocus();
            return;
        }
        do {
                Pattern p = null;
                Matcher m = null;
                p = Pattern.compile("^[0-9]+", Pattern.CASE_INSENSITIVE);
                m = p.matcher(txtDonGia.getText());
                if (!m.matches()) {
                    JOptionPane.showMessageDialog(this, "Nhập sai định dạng số !!");
                    txtDonGia.requestFocus();
                    return;
                }
                break;
            } while (true);
        if (txtDonViTinh.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống?", "Thông báo", JOptionPane.OK_OPTION);
            txtDonViTinh.requestFocus();
            return;
        }
        
        SanPham sp = new SanPham(Integer.parseInt(txtMaSP),txtTenSP.getText().toString(), (cboLoaiSP.getSelectedIndex()+1),Integer.parseInt(txtDonGia.getText().toString()),txtDonViTinh.getText().toString());
        SanPhamDAO spDAO = new SanPhamDAO();
        if (spDAO.update(sp)>0) {
                setNullField();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                model.setRowCount(0);
                initModel();
        } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
        }
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        // TODO add your handling code here:
        int a = grSanPham.getSelectedRow();
        if (a < 0) {
            JOptionPane.showMessageDialog(this, "Chưa chọn dòng nào ");
            return;
        }
        if (txtMaSP.length() == 0) {
            JOptionPane.showMessageDialog(this, "Có lỗi trong lúc chọn dòng vui lòng chọn lại");
            return;
        }
        int i = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá ? ", "Xoá", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            //PhieuNX pnx = new PhieuNX();
           // pnx.findNhanVien(txtMaNV.getText());
            //System.out.println(pnx.getMaNV());
          //  if (pnx.getMaNV() != null) {
          //      JOptionPane.showMessageDialog(null, "Nhân viên này đã từng tạo phiếu \n Xoá thất bại");
          //      return;
         //   }
            SanPhamDAO dao = new SanPhamDAO();
            if (dao.delete(Integer.parseInt(txtMaSP))>0) {
                JOptionPane.showMessageDialog(this, "Xoá sản phẩm thành công");
                model.setRowCount(0);
                initModel();
                return;

            } else {
                JOptionPane.showMessageDialog(this, "Xoá sản phẩm thất bại");
                return;
            }
        }
    }//GEN-LAST:event_btnXoaSPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void chayAbout() {
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
            java.util.logging.Logger.getLogger(DialogSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogSanPham dialog = new DialogSanPham(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                
                dialog.setSize(370, 300);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapLaiSP;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JButton btnXoaTimKiem;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JTable grSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiemSP;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel model;
    List<SanPham> listSP;
    private void initModel() {
        model = (DefaultTableModel) grSanPham.getModel();
        model.setRowCount(0);
         listSP = new ArrayList<SanPham>();
         listSP.clear();
         
         listSP = new SanPhamDAO().showSanPham("");
        
        for (SanPham sp : listSP) {
            model.addRow(sp.toVector());
        }
    }
    private void setNullField() {
        txtMaSP = "";
        txtDonGia.setText("");
        txtDonViTinh.setText("");
        txtTenSP.setText("");
        cboLoaiSP.setSelectedIndex(0);
        btnSuaSP.setEnabled(false);
        btnXoaSP.setEnabled(false);
        btnThemSP.setEnabled(true);
    }
}
