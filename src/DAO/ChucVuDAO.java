/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChucVuDTO;
import SQLCONNECT.SqlConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ChucVuDAO {
   SqlConnect my = new SqlConnect("localhost","sa", "16112000@Abc", "QLCH1");
   
   public ArrayList<ChucVuDTO> docchucvu(){
       ArrayList<ChucVuDTO> list = new ArrayList<>();
       
       try {
           String sql="SELECT * FROM CHUC_VU";
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               ChucVuDTO cv= new ChucVuDTO();
               cv.setMaCV(rs.getString("MaCV"));
               cv.setTenChucVu(rs.getString("TenCV"));
               list.add(cv);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
       }
       return list;
   }
   
   public boolean themChucvu(ChucVuDTO cv){
       String sql= "INSERT INTO CHUC_VU(MaCV,TenCV)"+"VALUES(?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, cv.getMaCV());
           ps.setString(2, cv.getTenChucVu());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
           e.printStackTrace();
       }
       return false;
   }
   
   
   
   public boolean suachucvu(ChucVuDTO cv){
       String sql="UPDATE CHUC_VU SET TenCV=? WHERE MaCV=?";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, cv.getTenChucVu());
           ps.setString(2, cv.getMaCV());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa chức vụ");
       }
       return false;
   }
}
