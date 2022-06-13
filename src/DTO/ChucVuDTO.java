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
public class ChucVuDTO {
    public String MaCV,TenChucVu;

    public ChucVuDTO() {
        MaCV=null;
        TenChucVu=null;
    }

    public ChucVuDTO(String MaCV, String TenChucVu) {
        this.MaCV = MaCV;
        this.TenChucVu = TenChucVu;
    }
    
    public ChucVuDTO(ChucVuDTO cv){
        this.MaCV=cv.MaCV;
        this.TenChucVu=cv.TenChucVu;
    }

    public String getMaCV() {
        return MaCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    public String getTenChucVu() {
        return TenChucVu;
    }

    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }
    
    
}
