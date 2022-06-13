
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhuyenMaiDTO;
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
public class KhuyenMaiDAO {
     SqlConnect my = new SqlConnect("localhost","sa", "16112000@Abc", "QLCH1");
   
   public ArrayList<KhuyenMaiDTO> dockm(){
       ArrayList<KhuyenMaiDTO> list = new ArrayList<>();
       
       try {
           String sql="SELECT * FROM KHUYEN_MAI";
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               KhuyenMaiDTO km= new KhuyenMaiDTO();
               km.setMaKM(rs.getString("MaKM"));
               km.setTenKM(rs.getString("TenKM"));
               km.setTuNgay(rs.getString("TuNgay"));
               km.setDenNgay(rs.getString("DenNgay"));
               km.setDieuKien(rs.getString("DieuKien"));
               list.add(km);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
           e.printStackTrace();
       }
       
       return list;
   }
   
   public boolean themkm(KhuyenMaiDTO km){
       String sql= "INSERT INTO KHUYEN_MAI(MaKM,TenKM,TuNgay,DenNgay,DieuKien)"+"VALUES(?,?,?,?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, km.getMaKM());
           ps.setString(2, km.getTenKM());
           ps.setString(3, km.getTuNgay());
           ps.setString(4, km.getDenNgay());
           ps.setString(5, km.getDieuKien());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
           e.printStackTrace();
       }
       return false;
   }
   
   
   
   public boolean suakm(KhuyenMaiDTO km){
       String sql="UPDATE KHUYEN_MAI SET TenKM=?,TuNgay=?,DenNgay=?,DieuKien=? WHERE MaKM=? ";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
          
           ps.setString(1, km.getTenKM());
           ps.setString(2, km.getTuNgay());
           ps.setString(3, km.getDenNgay());
           ps.setString(4, km.getDieuKien());
           ps.setString(5, km.getMaKM());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa khuyến mãi");
       }
       return false;
   }
   
  
}
