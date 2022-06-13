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
public class PhieuNhapDTO {
    private String MaPhieu,Ngay,MaNCC,MaNV;
    private float TongTien;

    public PhieuNhapDTO() {
        MaPhieu=null;
        Ngay=null;
        MaNCC=null;
        MaNV=null;
    }

    public PhieuNhapDTO(String MaPhieu, String Ngay, String MaNCC, String MaNV, float TongTien) {
        this.MaPhieu = MaPhieu;
        this.Ngay = Ngay;
        this.MaNCC = MaNCC;
        this.MaNV = MaNV;
        this.TongTien = TongTien;
    }
    
    public PhieuNhapDTO(PhieuNhapDTO pn){
        this.MaPhieu = pn.MaPhieu;
        this.Ngay = pn.Ngay;
        this.MaNCC = pn.MaNCC;
        this.MaNV = pn.MaNV;
        this.TongTien = pn.TongTien;
    }

    public String getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(String MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }
    
    
}
