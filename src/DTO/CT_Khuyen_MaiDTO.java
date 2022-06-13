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
public class CT_Khuyen_MaiDTO {
    private String MaKM,MaSP;
    private float GiamGia;

    public CT_Khuyen_MaiDTO() {
        MaKM=null;
        MaSP=null;
        GiamGia=0;
    }

    public CT_Khuyen_MaiDTO(String MaKM, String MaSP, float GiamGia) {
        this.MaKM = MaKM;
        this.MaSP = MaSP;
        this.GiamGia = GiamGia;
    }
    
    public CT_Khuyen_MaiDTO(CT_Khuyen_MaiDTO km){
        this.MaKM = km.MaKM;
        this.MaSP = km.MaSP;
        this.GiamGia = km.GiamGia;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public float getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(float GiamGia) {
        this.GiamGia = GiamGia;
    }
    
    
}
