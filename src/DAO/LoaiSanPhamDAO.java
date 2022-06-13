/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiSanPhamDTO;
import SQLCONNECT.SqlConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamDAO {
    SqlConnect my = new SqlConnect("localhost","sa", "16112000@Abc", "QLCH1");
   
   public ArrayList<LoaiSanPhamDTO> docloaisp(){
       ArrayList<LoaiSanPhamDTO> list = new ArrayList<>();
       
       try {
           String sql="SELECT * FROM LOAI_SP";
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               LoaiSanPhamDTO sp= new LoaiSanPhamDTO();
               sp.setMaLoai(rs.getString("MaLoai"));
               sp.setTenLoai(rs.getString("TenLoai"));
               list.add(sp);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
       }
       return list;
   }
   
   public boolean themloaisp(LoaiSanPhamDTO sp){
       String sql= "INSERT INTO LOAI_SP(MaLoai,TenLoai)"+"VALUES(?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, sp.getMaLoai());
           ps.setString(2, sp.getTenLoai());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
           e.printStackTrace();
       }
       return false;
   }
   
   
   
   public boolean sualoaisp(LoaiSanPhamDTO sp){
       String sql="UPDATE LOAI_SP SET TenLoai=? WHERE MaLoai=?";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, sp.getTenLoai());
           ps.setString(2, sp.getMaLoai());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa loại sản phẩm");
       }
       return false;
   }
}
