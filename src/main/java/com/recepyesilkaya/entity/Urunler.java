
package com.recepyesilkaya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="urunler")
public class Urunler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UrunId")
    private int urunId;
    
    @Column(name = "UrunAd")
    private String urunAd;
    
    @Column(name = "Birim")
    private String birimi;
    
    @Column(name = "Fiyat")
    private int fiyat;
    
    @Column(name = "StokAdet")
    private int stokAdet;

    public Urunler() {
    }

    public Urunler(String urunAd, String birimi, int fiyat, int stokAdet) {
        this.urunAd = urunAd;
        this.birimi = birimi;
        this.fiyat = fiyat;
        this.stokAdet = stokAdet;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public String getBirimi() {
        return birimi;
    }

    public void setBirimi(String birimi) {
        this.birimi = birimi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getStokAdet() {
        return stokAdet;
    }

    public void setStokAdet(int stokAdet) {
        this.stokAdet = stokAdet;
    }

    @Override
    public String toString() {
        return "Urunler{" + "urunId=" + urunId + ", urunAd=" + urunAd + ", birimi=" + birimi + ", fiyat=" + fiyat + ", stokAdet=" + stokAdet + '}';
    }
    
    
}
