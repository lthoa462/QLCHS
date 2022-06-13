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
public class LoaiSanPhamDTO {
    public String MaLoai,TenLoai;

    public LoaiSanPhamDTO() {
        MaLoai=null;
        TenLoai=null;
    }

    public LoaiSanPhamDTO(String MaLoai, String TenLoai) {
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
    }
    
    public LoaiSanPhamDTO(LoaiSanPhamDTO sp){
        this.MaLoai=sp.MaLoai;
        this.TenLoai=sp.TenLoai;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
    
}
