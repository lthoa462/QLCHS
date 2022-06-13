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
public class CT_Hoa_DonDTO {
    private String MaHD,MaSP;
    private int SL;
    private float DonGia,ThanhTien,GiamGia;

    public CT_Hoa_DonDTO() {
        MaHD=null;
        MaSP=null;
        SL=0;
        DonGia=0;
        ThanhTien=0;
        GiamGia=0;
    }

    public CT_Hoa_DonDTO(String MaHD, String MaSP, int SL, float DonGia, float ThanhTien, float GiamGia) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.SL = SL;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
        this.GiamGia = GiamGia;
    }
    
    public CT_Hoa_DonDTO(CT_Hoa_DonDTO cthd){
        this.MaHD = cthd.MaHD;
        this.MaSP = cthd.MaSP;
        this.SL = cthd.SL;
        this.DonGia = cthd.DonGia;
        this.ThanhTien = cthd.ThanhTien;
        this.GiamGia = cthd.GiamGia;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public float getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(float GiamGia) {
        this.GiamGia = GiamGia;
    }
    
    
    
}
