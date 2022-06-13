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
public class SanPhamDTO {
    public String MaSP,TenSP,DonViTinh,MaLoai;
    private float  GiaGoc,DonGia;
    private int SoLuong;

    public SanPhamDTO(String MaSP, String TenSP, String DonViTinh, String MaLoai, float GiaGoc, float DonGia, int SoLuong) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.DonViTinh = DonViTinh;
        this.MaLoai = MaLoai;
        this.GiaGoc = GiaGoc;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
    }

    public SanPhamDTO() {
        MaSP=null;
        TenSP=null;
        GiaGoc=0;
        DonGia=0;
        SoLuong=0;
        DonViTinh=null;
        MaLoai=null;
    }
    
    public SanPhamDTO(SanPhamDTO sp){
        this.MaSP=sp.MaSP;
        this.TenSP=sp.TenSP;
        this.GiaGoc=sp.GiaGoc;
        this.DonGia=sp.DonGia;
        this.SoLuong=sp.SoLuong;
        this.DonViTinh=sp.DonViTinh;
        this.MaLoai=sp.MaLoai;
    }
    
    

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public float getGiaGoc() {
        return GiaGoc;
    }

    public void setGiaGoc(float GiaGoc) {
        this.GiaGoc = GiaGoc;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
