/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recepyesilkaya.view;

import com.recepyesilkaya.entity.Kullanici;
import com.recepyesilkaya.entity.Urunler;
import com.recepyesilkaya.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RECEP
 */
public class AnasayfaJFrame extends javax.swing.JFrame {

    public static String girisYapanKullanici;
    DefaultTableModel sepetModel = new DefaultTableModel();

    public AnasayfaJFrame() {
        initComponents();
        this.setLocationRelativeTo(this);

        //Enabled işlemleri yapılıyor
        setEnabledFalse();
        txt_urunKodu.setEnabled(true);
        btn_urunBul.setEnabled(true);
        btn_iptal.setVisible(false);
        btn_kaydet.setVisible(false);
        lbl_toplamFiyat.setVisible(false);
        lbl_toplamYazi.setVisible(false);
        //Giriş yapan kullanıcı yazdırılıyor
        btn_cikisYap.setText(girisYapanKullanici + ", Çıkış Yap");
        //stok ürün tablo bilgileri çekiliyor
        tbl_stokUrun.setModel(urunleriCek());

        tbl_sepet.setModel(sepetModel);
        sepetModel.setColumnIdentifiers(new String[]{"Ürün Kod", "Ürün Ad", "Birim", "Fiyat", "Adet", "Toplam Fiyat"});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_cikisYap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_stokUrun = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sepet = new javax.swing.JTable();
        txt_urunKodu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_urunAdi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_urunBirimi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_urunFiyati = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_urunAdet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_guncelle = new javax.swing.JButton();
        btn_yeni = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_urunBul = new javax.swing.JButton();
        btn_sepeteEkle = new javax.swing.JButton();
        txt_urunStokAdet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_satinAl = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_kaydet = new javax.swing.JButton();
        btn_iptal = new javax.swing.JButton();
        btn_urunCikar = new javax.swing.JButton();
        lbl_toplamYazi = new javax.swing.JLabel();
        lbl_toplamFiyat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("YEŞİLKAYA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MARKET");

        btn_cikisYap.setText("Çıkış Yap");
        btn_cikisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(267, 267, 267)
                .addComponent(btn_cikisYap))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_cikisYap)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbl_stokUrun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_stokUrun);

        tbl_sepet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_sepet);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("ÜRÜN KODU :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Ürün Ad :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Birimi :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Fiyatı :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Sepete Adet/Kg :");

        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_yeni.setText("Yeni");
        btn_yeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yeniActionPerformed(evt);
            }
        });

        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_urunBul.setText("Ürün Bul");
        btn_urunBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunBulActionPerformed(evt);
            }
        });

        btn_sepeteEkle.setText("Sepete Ekle");
        btn_sepeteEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sepeteEkleActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Stok Adet :");

        btn_satinAl.setText("Satın Al");
        btn_satinAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_satinAlActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("STOK ÜRÜN");

        btn_kaydet.setText("Kaydet");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        btn_iptal.setText("İptal");
        btn_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iptalActionPerformed(evt);
            }
        });

        btn_urunCikar.setText("Ürün Çıkar");
        btn_urunCikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunCikarActionPerformed(evt);
            }
        });

        lbl_toplamYazi.setText("Toplam Fiyat :");

        lbl_toplamFiyat.setText("0 TL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_urunFiyati, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txt_urunStokAdet, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_urunAdet, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(btn_yeni, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_urunKodu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txt_urunAdi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_urunBirimi, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_urunBul, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                            .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_sepeteEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_urunCikar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_toplamYazi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_toplamFiyat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_satinAl, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_urunBul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_urunKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_urunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_sepeteEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_urunBirimi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_urunFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btn_iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_urunStokAdet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_urunAdet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_yeni)
                            .addComponent(btn_guncelle)
                            .addComponent(btn_sil))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_satinAl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_urunCikar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_toplamYazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_toplamFiyat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Stok ürün tablosu için table model oluşturuluyor
    public DefaultTableModel urunleriCek() {
        String[] columns = {" Ürün Kod ", " Ürün Ad ", " Adet/Kg "};

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            //Urunler list e de tutuluyor
            List<Urunler> urunler = session.createQuery("from Urunler", Urunler.class).list();
            urunler.forEach(s -> System.out.println(s.toString()));
            Object[][] data = new String[urunler.size()][];
            int sira = 0;
            //Ürünler Model e aktarılıyor
            for (Urunler s : urunler) {
                data[sira] = new String[]{String.valueOf(s.getUrunId()), s.getUrunAd(), String.valueOf(s.getStokAdet())};
                sira++;
            }
            DefaultTableModel model = new DefaultTableModel(data, columns);
            return model;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }

    //Giriş yapan kullanıcı bilgisi alınıyor
    public void setGirisYapanKullanici(String kullaniciAdi) {
        girisYapanKullanici = kullaniciAdi;
    }

    //Kullanıcının sepete eklediği ürünler hesaplanıyor
    public int sepetHesapla() {
        int toplamFiyat = 0;
        Object x;

        for (int i = 0; i < tbl_sepet.getRowCount(); i++) {
            x = tbl_sepet.getValueAt(i, 5);
            toplamFiyat += Integer.valueOf(String.valueOf(x));
        }
        return toplamFiyat;

    }

    //Kullanıcının listelemek istediği ürün kodunun varlığı kontrol ediliyor
    public boolean urunKoduVarmi(int urunKoduG) {
        int tabloUrunKoduG;
        Object x;

        for (int i = 0; i < tbl_stokUrun.getRowCount(); i++) {
            x = tbl_stokUrun.getValueAt(i, 0);
            tabloUrunKoduG = Integer.valueOf(String.valueOf(x));

            if (urunKoduG == tabloUrunKoduG) {
                return false;
            }
        }
        return true;

    }

    //Satın alma işlemi gerçekleştikten sonra stok adetinden veriler düşülüyor
    public void satinAlVeriCikar(int sepetUrunId1, int satilanAdet1) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            Urunler urun = session.load(Urunler.class, Integer.valueOf(sepetUrunId1));

            urun.setStokAdet(urun.getStokAdet() - satilanAdet1);
            session.update(urun);
            transaction.commit();
            tbl_stokUrun.setModel(urunleriCek());
            setEnabledFalse();
            txtTemizle();
            btn_kaydet.setVisible(false);
            btn_iptal.setVisible(false);
            btn_urunBul.setEnabled(true);
            txt_urunKodu.setEnabled(true);
            //tablo yenileniyor
            tbl_stokUrun.setModel(urunleriCek());

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

    }

    //Sürekli enabled işlemeri olduğu için tek fonsiyon da toplandı
    public void setEnabledFalse() {
        btn_guncelle.setEnabled(false);
        btn_sepeteEkle.setEnabled(false);
        btn_satinAl.setEnabled(false);
        btn_urunCikar.setEnabled(false);
        btn_urunBul.setEnabled(false);
        btn_sil.setEnabled(false);

        txt_urunKodu.setEnabled(false);
        txt_urunAdi.setEnabled(false);
        txt_urunAdet.setEnabled(false);
        txt_urunBirimi.setEnabled(false);
        txt_urunFiyati.setEnabled(false);
        txt_urunStokAdet.setEnabled(false);
    }

    public void setEnabledTrue() {
        txt_urunAdi.setEnabled(true);
        txt_urunAdet.setEnabled(true);
        txt_urunBirimi.setEnabled(true);
        txt_urunFiyati.setEnabled(true);
        txt_urunStokAdet.setEnabled(true);
    }

    public void txtTemizle() {
        txt_urunAdet.setText("");
        txt_urunAdi.setText("");
        txt_urunBirimi.setText("");
        txt_urunFiyati.setText("");
        txt_urunKodu.setText("");
        txt_urunStokAdet.setText("");
    }

    //Yeni ürün eklemek için ilgili alanlar aktif pasif edildi
    private void btn_yeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yeniActionPerformed
        btn_iptal.setVisible(true);
        btn_kaydet.setVisible(true);
        setEnabledFalse();
        txtTemizle();
        txt_urunAdet.setEnabled(false);
        setEnabledTrue();
        txt_urunAdet.setEnabled(false);


    }//GEN-LAST:event_btn_yeniActionPerformed

    //Yeni ürün kaydı işlemleri gerçekleştiriliyor
    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        //Kullanıcının gerekli alanları girilmesi isteniyor
        if (txt_urunStokAdet.getText().equals("") || txt_urunAdi.getText().equals("") || txt_urunBirimi.getText().equals("") || txt_urunFiyati.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen Tüm Alanları Doldurunuz  ", "Uyarı", JOptionPane.ERROR_MESSAGE);
        } else {
            Urunler urunler1 = new Urunler(txt_urunAdi.getText(), txt_urunBirimi.getText(), Integer.valueOf(txt_urunFiyati.getText()), Integer.valueOf(txt_urunStokAdet.getText()));
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {

                //Ürün veritabanına kaydediliyor
                transaction = session.beginTransaction();
                session.save(urunler1);
                transaction.commit();

                JOptionPane.showMessageDialog(null, "Ürün Ekleme Başarılı  ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);

                setEnabledFalse();
                txtTemizle();
                btn_kaydet.setVisible(false);
                btn_iptal.setVisible(false);
                btn_urunBul.setEnabled(true);
                txt_urunKodu.setEnabled(true);
                //table yenileniyor
                tbl_stokUrun.setModel(urunleriCek());

            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }

            //Kaydettikten sonra kullanıcı bilgileri yazdırılıyor
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                List<Kullanici> kullanicis = session.createQuery("from Kullanici", Kullanici.class).list();
                kullanicis.forEach(s -> System.out.println(s.toString()));
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_kaydetActionPerformed

    //Kullanıcı iptal etmek isteyip istemediği soruluyor,aktif pasif işlemleri gerçekleştiriliyor
    private void btn_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iptalActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "İptal etmek istediğinizden eminmisiniz?", "Bilgi", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            setEnabledFalse();
            txtTemizle();
            btn_kaydet.setVisible(false);
            btn_iptal.setVisible(false);
            btn_urunBul.setEnabled(true);
            txt_urunKodu.setEnabled(true);
        }
    }//GEN-LAST:event_btn_iptalActionPerformed

    //İlgili ürün bulunup ürün bilgileri, txt lere  yazdırılıyor
    private void btn_urunBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunBulActionPerformed
        if (txt_urunKodu.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ürün Kodunu Giriniz ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        } else if (urunKoduVarmi(Integer.valueOf(txt_urunKodu.getText()))) {
            JOptionPane.showMessageDialog(null, "Lütfen Geçerli Ürün Kodunu Giriniz ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                List<Urunler> urun = session.createQuery("from Urunler", Urunler.class).list();

                for (Urunler s : urun) {
                    //Kullanıcının istediği ürün kontrolü yapılıyor
                    if (s.getUrunId() == Integer.valueOf(txt_urunKodu.getText())) {
                        txt_urunStokAdet.setText(String.valueOf(s.getStokAdet()));
                        txt_urunAdi.setText(s.getUrunAd());
                        txt_urunBirimi.setText(s.getBirimi());
                        txt_urunFiyati.setText(String.valueOf(s.getFiyat()));
                    }
                }
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
            setEnabledTrue();
            btn_guncelle.setEnabled(true);
            btn_sil.setEnabled(true);
            btn_sepeteEkle.setEnabled(true);
        }
    }//GEN-LAST:event_btn_urunBulActionPerformed

    //Sepete Ekle Tablosuna ürünler ekleniyor, gerekli alanlar ve ürün stok miktarı kontrolü yapılyor
    private void btn_sepeteEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sepeteEkleActionPerformed
        if (txt_urunKodu.getText().equals("") || txt_urunFiyati.getText().equals("") || txt_urunAdet.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen Ürün Kodu,Fiyat ve Sepete Adet Alanlarını Doldurunuz  ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        }
        if (Integer.valueOf(txt_urunAdet.getText()) > Integer.valueOf(txt_urunStokAdet.getText())) {
            JOptionPane.showMessageDialog(null, "Stok da Yeterli Ürün Yok ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int toplamFiyat = Integer.valueOf(txt_urunFiyati.getText()) * Integer.valueOf(txt_urunAdet.getText());
            sepetModel.addRow(new String[]{txt_urunKodu.getText(), txt_urunAdi.getText(), txt_urunBirimi.getText(), txt_urunFiyati.getText(), txt_urunAdet.getText(), String.valueOf(toplamFiyat)});

            btn_satinAl.setEnabled(true);
            btn_urunCikar.setEnabled(true);

            txtTemizle();
            setEnabledFalse();
            txt_urunKodu.setEnabled(true);
            btn_urunCikar.setEnabled(true);
            btn_satinAl.setEnabled(true);
            btn_urunBul.setEnabled(true);
            lbl_toplamFiyat.setVisible(true);
            lbl_toplamYazi.setVisible(true);

            lbl_toplamFiyat.setText(sepetHesapla() + " TL");

        }


    }//GEN-LAST:event_btn_sepeteEkleActionPerformed

    //Kullanıcı çıkış işlemi gerçekleştiriliyor,Kullanıcı Giriş sayfasına yönlediriliyor
    private void btn_cikisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisYapActionPerformed
        GirisJFrame girisJFrame = new GirisJFrame();
        girisJFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_cikisYapActionPerformed

    //Kullanıcının txt lerde yaptığı değişiklik kontrol edilip güncelleştirme işlemi gerçekleştiriliyor
    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        if (txt_urunStokAdet.getText().equals("") || txt_urunAdi.getText().equals("") || txt_urunBirimi.getText().equals("") || txt_urunFiyati.getText().equals("") || txt_urunKodu.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ürün Bilgilerini Giriniz", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {

                transaction = session.beginTransaction();
                Urunler urun = session.load(Urunler.class, Integer.valueOf(txt_urunKodu.getText()));

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Değişiklikleri kaydetmek istiyormusunuz?", "Bilgi", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    urun.setBirimi(txt_urunBirimi.getText());
                    urun.setFiyat(Integer.valueOf(txt_urunFiyati.getText()));
                    urun.setStokAdet(Integer.valueOf(txt_urunStokAdet.getText()));
                    urun.setUrunAd(txt_urunAdi.getText());
                    session.update(urun);
                    transaction.commit();
                    tbl_stokUrun.setModel(urunleriCek());
                    setEnabledFalse();
                    txtTemizle();
                    btn_kaydet.setVisible(false);
                    btn_iptal.setVisible(false);
                    btn_urunBul.setEnabled(true);
                    txt_urunKodu.setEnabled(true);
                }
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    //Kullanıcının belirttiği ürün silinip gerekli aktif pasif işlemleri gerçekleştiriliyor
    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        if (txt_urunKodu.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ürün Kodunu Giriniz ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {

                transaction = session.beginTransaction();
                Object urun = session.load(Urunler.class, Integer.valueOf(txt_urunKodu.getText()));
                if (urun != null) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(null, "Ürünü silmek istediğinizden eminmisiniz?", "Bilgi", dialogButton);
                    if (dialogResult == JOptionPane.YES_OPTION) {
                        session.delete(urun);
                        transaction.commit();
                        tbl_stokUrun.setModel(urunleriCek());
                        setEnabledFalse();
                        txtTemizle();
                        btn_kaydet.setVisible(false);
                        btn_iptal.setVisible(false);
                        btn_urunBul.setEnabled(true);
                        txt_urunKodu.setEnabled(true);
                    }
                }
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btn_silActionPerformed

    //Sepet tablosundan seçilen ürün çıkartılıp fiyat bilgisi güncelleniyor
    private void btn_urunCikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunCikarActionPerformed

        try {
            sepetModel.removeRow(tbl_sepet.getSelectedRow());
            lbl_toplamFiyat.setText(sepetHesapla() + " TL");
            if (tbl_sepet.getRowCount() == 0) {
                btn_urunCikar.setEnabled(false);
                btn_satinAl.setEnabled(false);
                lbl_toplamFiyat.setVisible(false);
                lbl_toplamYazi.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lütfen Ürün Seçiniz ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btn_urunCikarActionPerformed

    //Kullanıcı satın alma işlemi gerçekleştirilip, ürün adet sayısı kadar stok miktarından düşürülüyor
    private void btn_satinAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_satinAlActionPerformed

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Toplam Fiyat : " + sepetHesapla() + " TL Ödeme İşlemi Gerçekleşsin mi?", "Bilgi", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {

            for (int i = 0; i < tbl_sepet.getRowCount(); i++) {
                //Sepet tablosundaki ürünlerin kodları satinAlVeriCikar fonksiyonuna gönderiliyor
                int sepetUrunId = Integer.valueOf(String.valueOf(tbl_sepet.getValueAt(i, 0)));
                int satilanAdet = Integer.valueOf(String.valueOf(tbl_sepet.getValueAt(i, 4)));
                satinAlVeriCikar(sepetUrunId, satilanAdet);
            }

            setEnabledFalse();
            txtTemizle();
            btn_kaydet.setVisible(false);
            btn_iptal.setVisible(false);
            btn_urunBul.setEnabled(true);
            txt_urunKodu.setEnabled(true);
            lbl_toplamFiyat.setVisible(false);
            lbl_toplamYazi.setVisible(false);
            //Sepet tablosu temizleniyor
            while (tbl_sepet.getRowCount() > 0) {
                for (int k = 0; k < tbl_sepet.getRowCount(); k++) {
                    sepetModel.removeRow(k);
                }
            }

        }
    }//GEN-LAST:event_btn_satinAlActionPerformed

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
            java.util.logging.Logger.getLogger(AnasayfaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnasayfaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnasayfaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnasayfaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnasayfaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikisYap;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_iptal;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JButton btn_satinAl;
    private javax.swing.JButton btn_sepeteEkle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_urunBul;
    private javax.swing.JButton btn_urunCikar;
    private javax.swing.JButton btn_yeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_toplamFiyat;
    private javax.swing.JLabel lbl_toplamYazi;
    private javax.swing.JTable tbl_sepet;
    private javax.swing.JTable tbl_stokUrun;
    private javax.swing.JTextField txt_urunAdet;
    private javax.swing.JTextField txt_urunAdi;
    private javax.swing.JTextField txt_urunBirimi;
    private javax.swing.JTextField txt_urunFiyati;
    private javax.swing.JTextField txt_urunKodu;
    private javax.swing.JTextField txt_urunStokAdet;
    // End of variables declaration//GEN-END:variables

}
