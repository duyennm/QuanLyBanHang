package poly.GUI;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poly.dao.MainDAO;
import poly.model.LichSuGiaoDich;

public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
        thoiGian();
        initModel();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension window = this.getSize();
        int x = (screen.width - window.width) / 2;
        int y = (screen.height - window.height) / 2;
        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel4 = new javax.swing.JLabel();
        txtThoiGian = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        grLichSuGiaoDich = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Quit = new javax.swing.JMenuItem();
        QuanLy = new javax.swing.JMenu();
        QLKH = new javax.swing.JMenuItem();
        QLSP = new javax.swing.JMenuItem();
        QLHD = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        hotro = new javax.swing.JMenuItem();
        trangchu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D-Start _ Quản Lý Bán Hàng");
        setBackground(new java.awt.Color(255, 153, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Boy.png"))); // NOI18N
        jLabel4.setText("Welcome to FPT Polytechnic");

        txtThoiGian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Clock.png"))); // NOI18N
        txtThoiGian.setText("dd/MM/yyyy HH:hh:mm");

        grLichSuGiaoDich.setAutoCreateRowSorter(true);
        grLichSuGiaoDich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên KH", "Số Lượng", "Ngày Mua"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grLichSuGiaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grLichSuGiaoDichMouseClicked(evt);
            }
        });
        grLichSuGiaoDich.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grLichSuGiaoDichKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(grLichSuGiaoDich);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Lịch Sử Giao Dịch");

        File.setText("Công Cụ");

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Đăng Xuất");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);
        File.add(jSeparator1);

        Quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Quit.setText("Thoát");
        File.add(Quit);

        jMenuBar1.add(File);

        QuanLy.setText("Quản Lý");
        QuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanLyActionPerformed(evt);
            }
        });

        QLKH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        QLKH.setText("Quản Lý Khách Hàng");
        QLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKHActionPerformed(evt);
            }
        });
        QuanLy.add(QLKH);

        QLSP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        QLSP.setText("Quản Lý Sản Phẩm");
        QLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLSPActionPerformed(evt);
            }
        });
        QuanLy.add(QLSP);

        QLHD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        QLHD.setText("Quản Lý Hóa Đơn");
        QLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLHDActionPerformed(evt);
            }
        });
        QuanLy.add(QLHD);

        jMenuBar1.add(QuanLy);

        Help.setText("Giúp Đỡ");

        hotro.setText("Hỗ trợ");
        hotro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotroActionPerformed(evt);
            }
        });
        Help.add(hotro);

        trangchu.setText("Trang Chủ");
        trangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trangchuActionPerformed(evt);
            }
        });
        Help.add(trangchu);
        Help.add(jSeparator3);

        About.setText("Giới thiệu");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        Help.add(About);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(82, 82, 82)
                        .addComponent(txtThoiGian))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtThoiGian)
                    .addComponent(jLabel4)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addGap(29, 29, 29)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
    }//GEN-LAST:event_AboutActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenActionPerformed

    private void hotroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotroActionPerformed

    private void trangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trangchuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trangchuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        initModel();
    }//GEN-LAST:event_formWindowOpened

    private void grLichSuGiaoDichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grLichSuGiaoDichMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_grLichSuGiaoDichMouseClicked

    private void grLichSuGiaoDichKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grLichSuGiaoDichKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_grLichSuGiaoDichKeyPressed

    private void QuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanLyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_QuanLyActionPerformed

    private void QLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLKHActionPerformed
        // TODO add your handling code here:
        DialogKhachHang f = new DialogKhachHang(this, true);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                initModel();
            }
        });
    }//GEN-LAST:event_QLKHActionPerformed

    private void QLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLSPActionPerformed
        // TODO add your handling code here:
        DialogSanPham f = new DialogSanPham(this, true);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                initModel();
            }
        });
    }//GEN-LAST:event_QLSPActionPerformed

    private void QLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLHDActionPerformed
        // TODO add your handling code here:
        DialogHoaDon f = new DialogHoaDon(this, true);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                initModel();
            }
        });
    }//GEN-LAST:event_QLHDActionPerformed


    public void mail() {
        JOptionPane.showConfirmDialog(null, "Vui lòng gửi mail về địa chỉ duyennmps04044@fpt.edu.vn", "Thông Báo", JOptionPane.OK_OPTION);

    }

    public void trangChu() {
        int ret = JOptionPane.showConfirmDialog(null, "Bạn muốn chuyển hướng đến website của chúng tôi ?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) //                System.exit(0);
        {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("https://www.facebook.com/minh.duyen.2013"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    }

    

    

    public void quit() {
        Quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int ret = JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?", "Thoát", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    public void doShow() {
        setSize(450, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public void thoiGian() {
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        Date now = new Date();
                        SimpleDateFormat format = new SimpleDateFormat();
                        format.applyPattern("dd-MM-yyyy HH:hh:mm:ss");
                        String time = format.format(now);
                        txtThoiGian.setText(time);
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                        break;
                    }
                }
            }
        }.start();

    }

    


    public static void main() {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        Main bb = new Main();
        bb.doShow();
        bb.quit();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem QLHD;
    private javax.swing.JMenuItem QLKH;
    private javax.swing.JMenuItem QLSP;
    private javax.swing.JMenu QuanLy;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JTable grLichSuGiaoDich;
    private javax.swing.JMenuItem hotro;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem trangchu;
    private javax.swing.JLabel txtThoiGian;
    // End of variables declaration//GEN-END:variables
    
    DefaultTableModel model;
    List<LichSuGiaoDich> listGD;
    public void initModel() {
        model = (DefaultTableModel) grLichSuGiaoDich.getModel();
        model.setRowCount(0);
         listGD = new ArrayList<LichSuGiaoDich>();
         listGD.clear();
         
        listGD = new MainDAO().showGiaoDich();
        
        for (LichSuGiaoDich lichSuGiaoDich : listGD) {
            model.addRow(lichSuGiaoDich.toVector());
        }
    }
    
}
