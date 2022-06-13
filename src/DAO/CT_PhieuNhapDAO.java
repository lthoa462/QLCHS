/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CT_PhieuNhapDTO;
import SQLCONNECT.SqlConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CT_PhieuNhapDAO {
    SqlConnect my= new SqlConnect("localhost", "sa", "16112000@Abc", "QLCH1");
    
    public ArrayList<CT_PhieuNhapDTO> docctpn(){
        ArrayList<CT_PhieuNhapDTO> list = new ArrayList<>();
        try {
            String sql= "SELECT * FROM CT_PHIEUNHAPHANG";
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                CT_PhieuNhapDTO ctpn= new CT_PhieuNhapDTO();
                ctpn.setMaPhieu(rs.getString("MaPhieu"));
                ctpn.setMaSP(rs.getString("MaSP"));
                ctpn.setSoLuong(rs.getInt("SoLuong"));
                ctpn.setGiaGoc(rs.getFloat("GiaGoc"));
                ctpn.setThanhTien(rs.getFloat("ThanhTien"));
                list.add(ctpn);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
        }
        return list;
    }
    public boolean themctpn(CT_PhieuNhapDTO ctpn){
       String sql= "INSERT INTO CT_PHIEUNHAPHANG(MaPhieu,MaSP,SoLuong,GiaGoc,ThanhTien)"+"VALUES(?,?,?,?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, ctpn.getMaPhieu());
           ps.setString(2, ctpn.getMaSP());
           ps.setInt(3, ctpn.getSoLuong());
           ps.setFloat(4, ctpn.getGiaGoc());
           ps.setFloat(5, ctpn.getThanhTien());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
           e.printStackTrace();
       }
       return false;
   }
   
   
   
   public boolean suactkm(CT_PhieuNhapDTO ctpn){
       String sql="UPDATE CT_PHIEUNHAPHANG MaPhieu=?,MaSP=?,SoLuong=?,GiaGoc=?,ThanhTien=? WHERE MaKM=? ";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, ctpn.getMaPhieu());
           ps.setString(2, ctpn.getMaSP());
           ps.setInt(3, ctpn.getSoLuong());
           ps.setFloat(4, ctpn.getGiaGoc());
           ps.setFloat(5, ctpn.getThanhTien());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa ");
       }
       return false;
   }
}
