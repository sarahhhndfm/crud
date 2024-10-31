package aplikasi;

    import app.db.Mahasiswa;
    import app.db.MahasiswaManager;
    import java.awt.event.MouseEvent;
    import java.util.ArrayList;
    import java.util.List;
    import javax.swing.JOptionPane;

public class JendelaUtama extends javax.swing.JFrame {
    List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    int currentRow = 0;
    
    public JendelaUtama() {
        String lookAndFeel = javax.swing.UIManager.getSystemLookAndFeelClassName();
        try {
            javax.swing.UIManager.setLookAndFeel(lookAndFeel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to set Look and Feel", "Error", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
            loadData();
            binData();

            this.setTitle("Data Mahasiswa");
            txtNoBP.setEditable(false);
            txtNama.setEditable(false);
            txtTempatLahir.setEditable(false);
            txtTanggalLahir.setEditable(false);
            txtAlamat.setEditable(false);
            txtTelp.setEditable(false);
            txtAsalSekolah.setEditable(false);
            this.setLocationRelativeTo(this);
            
    }
    
    private void loadData() {
        MahasiswaManager mhsmgr = new MahasiswaManager();
        mahasiswa = mhsmgr.getMahasiswa();
        mhsmgr.closeConnection();

    }
    
    private void binData() {
        if (mahasiswa.size()>0) {
            Mahasiswa m = mahasiswa.get(currentRow);
            txtNoBP.setText(m.getNoBP());
            txtNama.setText(m.getNama());
            txtTempatLahir.setText(m.getTempatLahir());
            txtTanggalLahir.setText(m.getTanggalLahir());
            txtAlamat.setText(m.getAlamat());
            txtTelp.setText(m.getTelp());
            txtAsalSekolah.setText(m.getAsalSekolah());
        } else {
            clearFields();
        }
    }
    private void clearFields() {
            txtNoBP.setText("");
            txtNama.setText("");
            txtTempatLahir.setText("");
            txtTanggalLahir.setText("");
            txtAlamat.setText("");
            txtTelp.setText("");
            txtAsalSekolah.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNoBP = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTempatLahir = new javax.swing.JTextField();
        txtTanggalLahir = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        txtAsalSekolah = new javax.swing.JTextField();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Mahasiswa\n"));

        jLabel1.setText("NoBP");

        jLabel2.setText("Nama");

        jLabel3.setText("TempatLahir / TanggalLahir");

        jLabel4.setText("/");

        jLabel5.setText("Alamat");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jLabel6.setText("Telp");

        jLabel7.setText("AsalSekolah");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtTanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalLahirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(jLabel4))
                                .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(225, 225, 225)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(254, 254, 254))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNew.setText("Baru");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Ubah");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if(btnNew.getText().equals("Baru")) {
            clearFields();
            setFieldsEditable(true);
            btnNew.setText("Simpan");
            btnDelete.setText("Batal");
            btnEdit.setEnabled(false);
            btnNext.setEnabled(false);
            btnPrev.setEnabled(false);
        }else {
            if(!txtNoBP.getText().equals("")&& !txtNama.getText().equals("")) {
                MahasiswaManager mhsmgr = new MahasiswaManager();
                Mahasiswa m = new Mahasiswa();
                m.setNoBP(txtNoBP.getText());
                m.setNama(txtNama.getText());
                m.setTempatLahir(txtTempatLahir.getText());
                m.setTanggalLahir(txtTanggalLahir.getText());
                m.setAlamat(txtAlamat.getText());
                m.setTelp(txtTelp.getText());
                m.setAsalSekolah(txtAsalSekolah.getText());
                if (mhsmgr.Insert(m)>0) {
                    loadData();
                    currentRow = mahasiswa.size()-1;
                    binData();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
                btnNew.setText("Baru");
                btnDelete.setText("Hapus");
                btnEdit.setEnabled(true);
                btnPrev.setEnabled(true);
                btnNext.setEnabled(true);
                mhsmgr.closeConnection();
            } else {
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnEdit.getText().equals("Edit")) {
            setFieldsEditable(true);
            txtNoBP.requestFocus();
            btnNew.setText("Simpan");
            btnDelete.setText("Batal");
            btnEdit.setText("Ubah");
            btnPrev.setEnabled(false);
            btnNext.setEnabled(false);
        } else {
            MahasiswaManager mhsmgr = new MahasiswaManager();
            Mahasiswa m = new Mahasiswa();
            m.setNoBP(txtNoBP.getText());
            m.setNama(txtNama.getName());
            m.setTempatLahir(txtTempatLahir.getText());
            m.setTanggalLahir(txtTanggalLahir.getText());
            m.setAlamat(txtAlamat.getText());
            m.setTelp(txtTelp.getText());
            m.setAsalSekolah(txtAsalSekolah.getText());
            if (mhsmgr.Update(m)>0) {
                loadData();
                binData();
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            setFieldsEditable(false);
            btnNew.setText("Baru");
            btnDelete.setText("Hapus");
            btnEdit.setText("Edit");            
            btnPrev.setEnabled(true);
            btnNext.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (btnDelete.getText().equals("Hapus")) {
            int dialog = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Akan Menghapus Data Ini ?","Konfirmasi", JOptionPane.YES_NO_OPTION);
            MahasiswaManager mhsmgr = new MahasiswaManager();
            Mahasiswa m = mahasiswa.get(currentRow);
            if (dialog == JOptionPane.YES_NO_OPTION) {
                if (mhsmgr.Delete(m)>0) {
                    loadData();
                    currentRow = currentRow - 1;
                    binData();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus","Informasi", JOptionPane.INFORMATION_MESSAGE);

                }  else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if (btnDelete.getText().equals("Batal")) {
            loadData();
            binData();
            setFieldsEditable(false);
            btnNew.setText("Baru");
            btnEdit.setText("Edit");
            btnDelete.setText("Hapus");
            btnEdit.setEnabled(true);
            btnNew.setEnabled(true);
            btnPrev.setEnabled(true);
            btnNext.setEnabled(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    private void tbDataMouseClicked(MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked

    }//GEN-LAST:event_tbDataMouseClicked

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (currentRow > 0) {
            --currentRow;
            btnNext.setEnabled(true);
        }else {
            btnPrev.setEnabled(false);
        }
        binData();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (currentRow < mahasiswa.size()-1){
            ++currentRow;
            btnPrev.setEnabled(true);
        } else{
            btnNext.setEnabled(false);
        }
        binData();
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtTanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalLahirActionPerformed

    private void setFieldsEditable(boolean editable) {
        txtNoBP.setEditable(editable);
        txtNama.setEditable(editable);
        txtTempatLahir.setEditable(editable);
        txtTanggalLahir.setEditable(editable);
        txtAlamat.setEditable(editable);
        txtTelp.setEditable(editable);
        txtAsalSekolah.setEditable(editable);        
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
            java.util.logging.Logger.getLogger(JendelaUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JendelaUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JendelaUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JendelaUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JendelaUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtAsalSekolah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoBP;
    private javax.swing.JTextField txtTanggalLahir;
    private javax.swing.JTextField txtTelp;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables


}