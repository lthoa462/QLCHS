/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CT_Khuyen_MaiDTO;
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
public class CT_KhuyenMaiDAO {
    SqlConnect my= new SqlConnect("localhost", "sa", "16112000@Abc", "QLCH1");
     public ArrayList<CT_Khuyen_MaiDTO> docctkm(){
        ArrayList<CT_Khuyen_MaiDTO> list = new ArrayList<>();
       
       try {
           String sql="SELECT * FROM CT_KHUYENMAI";
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               CT_Khuyen_MaiDTO ctkm= new CT_Khuyen_MaiDTO();
                ctkm.setMaKM(rs.getString("MaKM"));
                ctkm.setMaSP(rs.getString("MaSP"));
                ctkm.setGiamGia(rs.getFloat("GiamGia"));
               list.add(ctkm);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
           e.printStackTrace();
       }
       
       return list;
   }
   
    public boolean themctkm(CT_Khuyen_MaiDTO ctkm){
       String sql= "INSERT INTO CT_KHUYENMAI(MaKM,MaSP,GiamGia)"+"VALUES(?,?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, ctkm.getMaKM());
           ps.setString(2, ctkm.getMaSP());
           ps.setFloat(3, ctkm.getGiamGia());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
           e.printStackTrace();
       }
       return false;
   }
   
   
   
   public boolean suactkm(CT_Khuyen_MaiDTO ctkm){
       String sql="UPDATE CT_KHUYENMAI SET MaKM=?,MaSP=?,GiamGia=? WHERE MaKM=? ";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, ctkm.getMaKM());
           ps.setString(2, ctkm.getMaSP());
           ps.setFloat(3, ctkm.getGiamGia());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa khuyến mãi");
       }
       return false;
   }
   
    public Vector loadcbKM(){
       String sql="SELECT * FROM KHUYEN_MAI";
       Vector cb= new Vector();
       try {
           
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               cb.add(rs.getString("MaKM"));
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
           e.printStackTrace();
       }
       
       return cb;
   }
    
    public Vector loadcbSP(){
       String sql="SELECT * FROM SAN_PHAM";
       Vector cb= new Vector();
       try {
           
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               cb.add(rs.getString("MaSP"));
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
           e.printStackTrace();
       }
       
       return cb;
   }
    
}
