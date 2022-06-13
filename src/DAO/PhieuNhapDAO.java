/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PhieuNhapDTO;
import SQLCONNECT.SqlConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class PhieuNhapDAO {
    SqlConnect my= new SqlConnect("localhost", "sa", "16112000@Abc", "QLCH1");
    
    public ArrayList<PhieuNhapDTO> docpn(){
        ArrayList<PhieuNhapDTO> list = new ArrayList<>();
        try {
            String sql= "SELECT * FROM PHIEU_NHAP_HANG";
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                PhieuNhapDTO pn= new PhieuNhapDTO();
                pn.setMaPhieu(rs.getString("MaPhieu"));
                pn.setNgay(rs.getString("Ngay"));
                pn.setMaNCC(rs.getString("MaNCC"));
                pn.setMaNV(rs.getString("MaNV"));
                pn.setTongTien(rs.getFloat("TongTien"));
                list.add(pn);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
        }
        return list;
    }
    public boolean thempn(PhieuNhapDTO pn){
       String sql= "INSERT INTO PHIEU_NHAP_HANG(MaPhieu,Ngay,MaNCC,MaNV,TongTien)"+"VALUES(?,?,?,?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, pn.getMaPhieu());
           ps.setString(2, pn.getNgay());
           ps.setString(3, pn.getMaNCC());
           ps.setString(4, pn.getMaNV());
           ps.setFloat(5, pn.getTongTien());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
           e.printStackTrace();
       }
       return false;
   }
   
   
   
   public boolean suactkm(PhieuNhapDTO pn){
       String sql="PHIEU_NHAP_HANG MaPhieu=?,Ngay=?,MaNCC=?,MaNV=?,TongTien=? WHERE MaKM=? ";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, pn.getMaPhieu());
           ps.setString(2, pn.getNgay());
           ps.setString(3, pn.getMaNCC());
           ps.setString(4, pn.getMaNV());
           ps.setFloat(3, pn.getTongTien());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa ");
       }
       return false;
   }
   
   public Vector loadcbmcc(){
       Vector cb= new Vector();
        try {
            String sql= "SELECT * FROM NHA_CUNG_CAP";
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                cb.add(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
        }
        return cb;
    }
    
    public Vector loadcbmnv(){
       Vector cb= new Vector();
        try {
            String sql= "SELECT * FROM NHAN_VIEN";
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                cb.add(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
        }
        return cb;
    }
    
}
