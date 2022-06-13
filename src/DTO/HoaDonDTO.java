/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class HoaDonDTO {
   private String MaHD,Ngay,MaKM,MaNV,MaKH;
   private float TongGiam,TongTien,SauGiam;

    public HoaDonDTO() {
        MaHD=null;
        Ngay=null;
        MaKM=null;
        MaNV=null;
        MaKH=null;
        TongGiam=0;
        TongTien=0;
        SauGiam=0;
    }

    public HoaDonDTO(String MaHD, String Ngay, String MaKM, String MaNV, String MaKH, float TongGiam, float TongTien,float SauGiam) {
        this.MaHD = MaHD;
        this.Ngay = Ngay;
        this.MaKM = MaKM;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.TongGiam = TongGiam;
        this.TongTien = TongTien;
        this.SauGiam=SauGiam;
    }
    
    public HoaDonDTO(HoaDonDTO hd){
        this.MaHD = hd.MaHD;
        this.Ngay = hd.Ngay;
        this.MaKM = hd.MaKM;
        this.MaNV = hd.MaNV;
        this.MaKH = hd.MaKH;
        this.TongGiam = hd.TongGiam;
        this.TongTien = hd.TongTien;
        this.SauGiam= hd.SauGiam;
    }

    public float getSauGiam() {
        return SauGiam;
    }

    public void setSauGiam(float SauGiam) {
        this.SauGiam = SauGiam;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public float getTongGiam() {
        return TongGiam;
    }

    public void setTongGiam(float TongGiam) {
        this.TongGiam = TongGiam;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }
   
}
