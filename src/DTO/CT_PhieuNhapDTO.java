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
public class CT_PhieuNhapDTO {
    private String MaPhieu,MaSP;
    private int SoLuong;
    private float GiaGoc,ThanhTien;

    public CT_PhieuNhapDTO() {
        MaPhieu=null;
        MaSP=null;
        SoLuong=0;
        GiaGoc=0;
        ThanhTien=0;
    }

    public CT_PhieuNhapDTO(String MaPhieu, String MaSP, int SoLuong, float GiaGoc, float ThanhTien) {
        this.MaPhieu = MaPhieu;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
        this.GiaGoc = GiaGoc;
        this.ThanhTien = ThanhTien;
    }
    public CT_PhieuNhapDTO(CT_PhieuNhapDTO ctpn){
        this.MaPhieu = ctpn.MaPhieu;
        this.MaSP = ctpn.MaSP;
        this.SoLuong = ctpn.SoLuong;
        this.GiaGoc = ctpn.GiaGoc;
        this.ThanhTien = ctpn.ThanhTien;
    }

    public String getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(String MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaGoc() {
        return GiaGoc;
    }

    public void setGiaGoc(float GiaGoc) {
        this.GiaGoc = GiaGoc;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
}
