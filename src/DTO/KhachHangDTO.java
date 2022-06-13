/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author NGANDOAN
 */
public class KhachHangDTO {
  private String ma,ho,ten,ngaysinh,gender,diachi,sdt;

    public KhachHangDTO() {
    }

    public KhachHangDTO(String ma, String ho, String ten, String ngaysinh, String gender, String diachi, String sdt) {
        this.ma = ma;
        this.ho = ho;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gender = gender;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public KhachHangDTO(KhachHangDTO kh){
        this.ma=kh.ma;
        this.ho=kh.ho;
        this.ngaysinh=kh.ngaysinh;
        this.gender=kh.gender;
        this.diachi=kh.diachi;
        this.sdt=kh.sdt;
    }
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
  
  
}
