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
public class NhaCungCapDTO {
    public String MaCC,TenCC;

    public NhaCungCapDTO() {
        MaCC=null;
        TenCC=null;
    }

    public NhaCungCapDTO(String MaCC, String TenCC) {
        this.MaCC = MaCC;
        this.TenCC = TenCC;
    }
    
    public NhaCungCapDTO(NhaCungCapDTO ncc){
        this.MaCC=ncc.MaCC;
        this.TenCC=ncc.TenCC;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public String getTenCC() {
        return TenCC;
    }

    public void setTenCC(String TenCC) {
        this.TenCC = TenCC;
    }
    
}
