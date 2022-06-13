/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhaCungCapDTO;
import SQLCONNECT.SqlConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NhaCungCapDAO {
     SqlConnect my = new SqlConnect("localhost","sa", "16112000@Abc", "QLCH1");
   
   public ArrayList<NhaCungCapDTO> docncc(){
       ArrayList<NhaCungCapDTO> list = new ArrayList<>();
       
       try {
           String sql="SELECT * FROM NHA_CUNG_CAP";
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               NhaCungCapDTO ncc= new NhaCungCapDTO();
               ncc.setMaCC(rs.getString("MaNCC"));
               ncc.setTenCC(rs.getString("TenNCC"));
               list.add(ncc);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
       }
       return list;
   }
   
   public boolean themNhacc(NhaCungCapDTO ncc){
       String sql= "INSERT INTO NHA_CUNG_CAP(MaNCC,TenNCC)"+"VALUES(?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, ncc.getMaCC());
           ps.setString(2, ncc.getTenCC());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
           e.printStackTrace();
       }
       return false;
   }
   
   
   
   public boolean suanhacc(NhaCungCapDTO ncc){
       String sql="UPDATE NHA_CUNG_CAP SET TenNCC=? WHERE MaNCC=?";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, ncc.getTenCC());
           ps.setString(2, ncc.getMaCC());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa nhà cung cấp");
       }
       return false;
   }
}
