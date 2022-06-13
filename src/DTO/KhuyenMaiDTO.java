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
public class KhuyenMaiDTO {
    private String MaKM,TenKM,TuNgay,DenNgay,DieuKien;
   

    public KhuyenMaiDTO() {
        MaKM=null;
        TenKM=null;
        TuNgay=null;
        DenNgay=null;
        DieuKien=null;
    }

    public KhuyenMaiDTO(String MaKM, String TenKM, String TuNgay, String DenNgay, String DieuKien) {
        this.MaKM = MaKM;
        this.TenKM = TenKM;
        this.TuNgay = TuNgay;
        this.DenNgay = DenNgay;
        this.DieuKien = DieuKien;
    }

    
    
    public KhuyenMaiDTO(KhuyenMaiDTO km){
        this.MaKM = km.MaKM;
        this.TenKM = km.TenKM;
        this.TuNgay = km.TuNgay;
        this.DenNgay = km.DenNgay;
        this.DieuKien = km.DieuKien;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    public String getTuNgay() {
        return TuNgay;
    }

    public void setTuNgay(String TuNgay) {
        this.TuNgay = TuNgay;
    }

    public String getDenNgay() {
        return DenNgay;
    }

    public void setDenNgay(String DenNgay) {
        this.DenNgay = DenNgay;
    }

    public String getDieuKien() {
        return DieuKien;
    }

    public void setDieuKien(String DieuKien) {
        this.DieuKien = DieuKien;
    }

   
}
