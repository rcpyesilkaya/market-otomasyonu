
package com.recepyesilkaya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="kullanici")
public class Kullanici {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KullaniciId")
    private int kullaniciId;
    
    @Column(name = "KullaniciAdi")
    private String kullaniciAdi;
    
    @Column(name = "Parola")
    private String parola;
    
    @Column(name = "Email")
    private String email;

    public Kullanici() {
    }

    public Kullanici(String kullaniciAdi, String parola, String email) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.email = email;
    }

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "kullaniciId=" + kullaniciId + ", kullaniciAdi=" + kullaniciAdi + ", parola=" + parola + ", email=" + email + '}';
    }
    
    
    
    
}
