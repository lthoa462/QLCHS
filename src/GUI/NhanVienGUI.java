/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.NhanVienBUS;
import DTO.NhanVienDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class NhanVienGUI extends javax.swing.JDialog {

    DefaultTableModel mode = new DefaultTableModel();
    NhanVienBUS bus = new NhanVienBUS();

    /**
     * Creates new form NhanVienGUI
     */
    public NhanVienGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            UIManager.setLookAndFeel(new com.jtattoo.plaf.graphite.GraphiteLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setLocationRelativeTo(null);
        mode = (DefaultTableModel) tbl.getModel();
        docnhanvien();
        loadcombobox();
    }

    public void docnhanvien() {
        for (NhanVienDTO nv : bus.docnhanvien()) {
            mode.addRow(new Object[]{
                nv.getMaNV(), nv.getHoNV(), nv.getTenNV(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), nv.getSdt(), nv.getThuDienTu(), nv.getLuong(), nv.getMaCV()
            });
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        lbMaNV = new javax.swing.JLabel();
        txMaNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbMaCV = new javax.swing.JComboBox<>();
        lbHo = new javax.swing.JLabel();
        txHo = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        txTen = new javax.swing.JTextField();
        lbNgaySinh = new javax.swing.JLabel();
        cbNam = new javax.swing.JRadioButton();
        cbNu = new javax.swing.JRadioButton();
        lbSDT = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txSdt = new javax.swing.JTextField();
        lbLuong = new javax.swing.JLabel();
        txLuong = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
        lbDiaChi = new javax.swing.JLabel();
        txDiChi = new javax.swing.JTextField();
        txDate = new com.toedter.calendar.JDateChooser();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        lbSearch = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();
        cbSearch = new javax.swing.JComboBox<>();
        txInfo = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        mnBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nh??n vi??n");

        p1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QU???N L?? NH??N VI??N");

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Th??ng tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        lbMaNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMaNV.setText("M?? nh??n vi??n :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("M?? ch???c v??? :");

        cbMaCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbHo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbHo.setText("H??? :");

        lbTen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTen.setText("T??n :");

        lbNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNgaySinh.setText("Ng??y sinh :");

        cbNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cbNam);
        cbNam.setText("Nam");

        cbNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cbNu);
        cbNu.setText("N???");
        cbNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNuActionPerformed(evt);
            }
        });

        lbSDT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSDT.setText("??i???n tho???i :");

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEmail.setText("Email :");

        lbLuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLuong.setText("L????ng :");

        lbDiaChi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDiaChi.setText("?????a ch??? :");

        txDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(lbMaNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(lbHo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txHo)))
                .addGap(13, 13, 13)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(lbTen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMaCV, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNgaySinh)
                    .addComponent(lbLuong))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(txDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNu))
                    .addComponent(txLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSDT)
                    .addComponent(lbDiaChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(txSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                    .addComponent(txDiChi))
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMaNV)
                        .addComponent(txMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cbMaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNgaySinh)
                        .addComponent(cbNam)
                        .addComponent(cbNu)
                        .addComponent(lbSDT)
                        .addComponent(txSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEmail))
                    .addComponent(txDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHo)
                    .addComponent(txHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen)
                    .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLuong)
                    .addComponent(txLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiaChi)
                    .addComponent(txDiChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-insert-row-25.png"))); // NOI18N
        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-update-25.png"))); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnShow.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-checked-25.png"))); // NOI18N
        btnShow.setText("Hi???n th???");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-reset-25.png"))); // NOI18N
        btnReset.setText("?????t l???i");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-exit-25.png"))); // NOI18N
        btnThoat.setText("Quay l???i");

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T??m ki???m", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        lbSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSearch.setText("T??m ki???m theo :");

        lbInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbInfo.setText("Nh???p th??ng tin :");

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M?? nh??n vi??n", "T??n nh??n vi??n" }));
        cbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchActionPerformed(evt);
            }
        });

        txInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txInfoKeyReleased(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-more-25.png"))); // NOI18N
        btnSearch.setText("T??m ki???m");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSearch)
                    .addComponent(lbInfo))
                .addGap(27, 27, 27)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(377, Short.MAX_VALUE))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(txInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSearch)
                    .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInfo)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? nh??n vi??n", "H???", "T??n", "Ng??y sinh", "Gi???i t??nh", "?????a ch???", "S??? ??i???n tho???i", "Th?? ??i???n t???", "L????ng", "M?? ch???c v???"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua)
                            .addComponent(btnThem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThoat)
                            .addComponent(btnReset)
                            .addComponent(btnShow)))
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        mnBar1.add(jMenu1);

        jMenu2.setText("Edit");
        mnBar1.add(jMenu2);

        setJMenuBar(mnBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
       if(kt()){
        NhanVienDTO nv1 = getFromTF();
        
        int i= tbl.getSelectedRow();
        if(i>=0){
            int res=JOptionPane.showConfirmDialog(rootPane, "B???n mu???n s???a nh??n vi??n n??y ?");
           if(res==JOptionPane.YES_OPTION){
            if(bus.suanv(nv1)){
                NhanVienDTO nv= bus.docnhanvien().set(i, nv1);
                mode.setValueAt(nv1.getMaNV(), i, 0);
                mode.setValueAt(nv1.getHoNV(), i, 1);
                mode.setValueAt(nv1.getTenNV(), i, 2);
                mode.setValueAt(nv1.getNgaySinh(), i, 3);
                mode.setValueAt(nv1.getGioiTinh(), i, 4);
                mode.setValueAt(nv1.getDiaChi(), i, 5);
                mode.setValueAt(nv1.getSdt(), i, 6);
                mode.setValueAt(nv1.getThuDienTu(), i, 7);
                mode.setValueAt(nv1.getLuong(), i, 8);
                mode.setValueAt(nv1.getMaCV(), i, 9);
               
                reset();
                JOptionPane.showMessageDialog(rootPane, "S???a th??nh c??ng");
            }else
                JOptionPane.showMessageDialog(rootPane, "S???a th???t b???i");
           }
        }         
        }else
                JOptionPane.showMessageDialog(rootPane, "S???a th???t b???i");
            
         
    }//GEN-LAST:event_btnSuaActionPerformed

    private void cbNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNuActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        int i = tbl.getSelectedRow();
        if (i >= 0) {
            txMaNV.setText(tbl.getModel().getValueAt(i, 0).toString());
            txHo.setText(tbl.getModel().getValueAt(i, 1).toString());
            txTen.setText(tbl.getModel().getValueAt(i, 2).toString());
            txDiChi.setText(tbl.getModel().getValueAt(i, 5).toString());
            txSdt.setText(tbl.getModel().getValueAt(i, 6).toString());
            txEmail.setText(tbl.getModel().getValueAt(i, 7).toString());
            txLuong.setText(tbl.getModel().getValueAt(i, 8).toString());
            cbMaCV.setSelectedItem(tbl.getModel().getValueAt(i, 9).toString());
            try {
                txDate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tbl.getModel().getValueAt(i, 3)+""));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            if (tbl.getModel().getValueAt(i, 4).equals("Nam")) {
                cbNam.setSelected(true);
            }
            if (tbl.getModel().getValueAt(i, 4).equals("N???")) {
                cbNu.setSelected(true);
            }
            txMaNV.setEnabled(false);
            cbMaCV.setEnabled(false);
        }
    }//GEN-LAST:event_tblMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(kt()){
        NhanVienDTO nv = new NhanVienDTO();
        boolean check1=true,check2=true;
        nv.setMaNV(txMaNV.getText());
        nv.setHoNV(txHo.getText());
        nv.setTenNV(txTen.getText());
        try {
             nv.setNgaySinh(new SimpleDateFormat("yyyy-MM-dd").format(txDate.getDate()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "B???n ch??a ch???n ng??y sinh");
            check1=false;
        }
        
        if (cbNam.isSelected()) {
            nv.setGioiTinh("Nam");
        }
        if (cbNu.isSelected()) {
            nv.setGioiTinh("N???");
        }
        nv.setDiaChi(txDiChi.getText());
        nv.setSdt(txSdt.getText());
        
        nv.setThuDienTu(txEmail.getText());
        try {
            nv.setLuong(Float.parseFloat(txLuong.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "L????ng ph???i l?? s???");
            check1=false;
        }
        
        nv.setMaCV((String) cbMaCV.getSelectedItem());
         for(int i=0;i<bus.dsnv.size();i++){
            if(bus.dsnv.get(i).getMaNV().trim().equals(txMaNV.getText().trim())){
                check1=false;
                JOptionPane.showMessageDialog(rootPane, "Tr??ng m?? s???n ph???m");
                txMaNV.setText("");
                txMaNV.requestFocus();
                break;
            }
            else
            {
                check2=true;
            }
        }
        if( check1==true && check2==true){
        int res= JOptionPane.showConfirmDialog(rootPane, "B???n mu???n th??m nh??n vi??n n??y?");
        if(res==JOptionPane.YES_OPTION){
        if (bus.themnv(nv)) {
            showwResult();
            reset();
            JOptionPane.showMessageDialog(rootPane, "Th??m th??nh c??ng");
        }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Th??m th???t b???i");
        }
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Th??m th???t b???i");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        mode.setRowCount(0);
        docnhanvien();
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txInfoKeyReleased
        // TODO add your handling code here:
        if(cbSearch.getSelectedIndex()==0){
            showSearchID();
        }
         if(cbSearch.getSelectedIndex()==1){
            showSearchTen();
        }
    }//GEN-LAST:event_txInfoKeyReleased

    private void cbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchActionPerformed
        // TODO add your handling code here:
        if(cbSearch.getSelectedIndex()==0){
            btnSearch.setEnabled(false);
        }
         if(cbSearch.getSelectedIndex()==01){
             btnSearch.setEnabled(false);
        }
    }//GEN-LAST:event_cbSearchActionPerformed
    public void showwResult() {
        NhanVienDTO nv = bus.dsnv.get(bus.dsnv.size() - 1);
        mode.addRow(new Object[]{
            nv.getMaNV(), nv.getHoNV(), nv.getTenNV(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), nv.getSdt(), nv.getThuDienTu(), nv.getLuong(), nv.getMaCV()
        });
    }
    
    public void showSearchID(){
        mode.setRowCount(0);
        for(NhanVienDTO nv: bus.timKiemID(txInfo.getText().toLowerCase())){
            mode.addRow(new Object[]{
               nv.getMaNV(), nv.getHoNV(), nv.getTenNV(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), nv.getSdt(), nv.getThuDienTu(), nv.getLuong(), nv.getMaCV()
           });
        }
    }
    public void showSearchTen(){
        
        mode.setRowCount(0);
        for(NhanVienDTO nv: bus.timKiemten(txInfo.getText())){
            mode.addRow(new Object[]{
                nv.getMaNV(), nv.getHoNV(), nv.getTenNV(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), nv.getSdt(), nv.getThuDienTu(), nv.getLuong(), nv.getMaCV()
           });
        }
    }

    public NhanVienDTO getFromTF(){
        NhanVienDTO nv = new NhanVienDTO();
        //boolean check1=true;
        nv.setMaNV(txMaNV.getText());
        nv.setHoNV(txHo.getText());
        nv.setTenNV(txTen.getText());
        
             nv.setNgaySinh(new SimpleDateFormat("yyyy-MM-dd").format(txDate.getDate()));
    
        
        if (cbNam.isSelected()) {
            nv.setGioiTinh("Nam");
        }
        if (cbNu.isSelected()) {
            nv.setGioiTinh("N???");
        }
        nv.setDiaChi(txDiChi.getText());
        nv.setSdt(txSdt.getText());
        
        nv.setThuDienTu(txEmail.getText());
       
        nv.setLuong(Float.parseFloat(txLuong.getText()));
        nv.setMaCV((String) cbMaCV.getSelectedItem());
        return nv;
    }
    public void reset(){
        txMaNV.setText("");
        txHo.setText("");
        txTen.setText("");
        txDate.setDate(null);
        cbNam.setSelected(true);
        txDiChi.setText("");
        txSdt.setText("");
        txEmail.setText("");
        txLuong.setText("");
        cbMaCV.setSelectedIndex(0);
        txMaNV.setEnabled(true);
        cbMaCV.setEnabled(true);
        btnSearch.setEnabled(true);
        cbSearch.setSelectedIndex(0);
    }
    public void loadcombobox() {
        Vector maCV = bus.loadcombobox();
        cbMaCV.setModel(new DefaultComboBoxModel<>(maCV));
    }
    
    public boolean kt(){
        boolean check=true;
        if(txMaNV.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "M?? nh??n vi??n c??n tr???ng");
            check= false;
        }
        
        if(txMaNV.getText().length()>10){
            JOptionPane.showMessageDialog(rootPane, "M?? nh??n vi??n kh??ng qu?? 10 k?? t???");
            check= false;
        }
        
        if(txHo.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "H??? nh??n vi??n c??n tr???ng");
           check= false;
        }
        
        if(txTen.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "T??n nh??n vi??n c??n tr???ng");
           check= false;
        }
       
        if(txDiChi.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "?????a ch??? nh??n vi??n c??n tr???ng");
            check= false;
        }
        
        if(txSdt.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "S?? ??i???n tho???i nh??n vi??n c??n tr???ng");
            check= false;
        } 
        
        if(txSdt.getText().length()>10){
            JOptionPane.showMessageDialog(rootPane, "S?? ??i???n tho???i nh??n vi??n kh??ng v?????t qu?? 10 s???");
            check= false;
        } 
        
        if(txEmail.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Email nh??n vi??n c??n tr???ng");
            check= false;
        }
            if(txLuong.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "L????ng nh??n vi??n c??n tr???ng");
            check= false;
        }
       
       
       return check;
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
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhanVienGUI dialog = new NhanVienGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbMaCV;
    private javax.swing.JRadioButton cbNam;
    private javax.swing.JRadioButton cbNu;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHo;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbLuong;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbTen;
    private javax.swing.JMenuBar mnBar1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JTable tbl;
    private com.toedter.calendar.JDateChooser txDate;
    private javax.swing.JTextField txDiChi;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txHo;
    private javax.swing.JTextField txInfo;
    private javax.swing.JTextField txLuong;
    private javax.swing.JTextField txMaNV;
    private javax.swing.JTextField txSdt;
    private javax.swing.JTextField txTen;
    // End of variables declaration//GEN-END:variables
}
