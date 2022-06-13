/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVienDTO {
    private String MaNV,HoNV,TenNV,GioiTinh,DiaChi,Sdt,ThuDienTu,MaCV;
    private String NgaySinh;
    private float Luong;

    public NhanVienDTO() {
        MaNV= null;
        HoNV= null;
        TenNV=null;
        GioiTinh=null;
        DiaChi=null;
        Sdt=null;
        ThuDienTu=null;
        MaCV=null;
        NgaySinh=null;
        Luong=0;
    }

    public NhanVienDTO(String MaNV, String HoNV, String TenNV, String GioiTinh, String DiaChi, String Sdt, String ThuDienTu, String MaCV, String NgaySinh, float Luong) {
        this.MaNV = MaNV;
        this.HoNV = HoNV;
        this.TenNV = TenNV;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.ThuDienTu = ThuDienTu;
        this.MaCV = MaCV;
        this.NgaySinh = NgaySinh;
        this.Luong = Luong;
    }
    
    public NhanVienDTO(NhanVienDTO nv){
        this.MaNV = nv.MaNV;
        this.HoNV = nv.HoNV;
        this.TenNV = nv.TenNV;
        this.GioiTinh = nv.GioiTinh;
        this.DiaChi = nv.DiaChi;
        this.Sdt = nv.Sdt;
        this.ThuDienTu = nv.ThuDienTu;
        this.MaCV = nv.MaCV;
        this.NgaySinh = nv.NgaySinh;
        this.Luong = nv.Luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoNV() {
        return HoNV;
    }

    public void setHoNV(String HoNV) {
        this.HoNV = HoNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getThuDienTu() {
        return ThuDienTu;
    }

    public void setThuDienTu(String ThuDienTu) {
        this.ThuDienTu = ThuDienTu;
    }

    public String getMaCV() {
        return MaCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }
    
    
    
}
