/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CT_Hoa_DonDTO;
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
public class CT_Hoa_DonDAO {
    SqlConnect my = new SqlConnect("localhost","sa", "16112000@Abc", "QLCH1");
   
   public ArrayList<CT_Hoa_DonDTO> doccthd(){
       ArrayList<CT_Hoa_DonDTO> list = new ArrayList<>();
       
       try {
           String sql="SELECT * FROM CT_HOADON";
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               CT_Hoa_DonDTO cthd= new CT_Hoa_DonDTO();
               cthd.setMaHD(rs.getString("MaHD"));
               cthd.setMaSP(rs.getString("MaSP"));
               cthd.setSL(rs.getInt("SoLuong"));
               cthd.setDonGia(rs.getFloat("DonGia"));
               cthd.setThanhTien(rs.getFloat("ThanhTien"));
               cthd.setGiamGia(rs.getFloat("GiamGia"));
               list.add(cthd);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
           e.printStackTrace();
       }
       
       return list;
   }
   
   public boolean themcthd(CT_Hoa_DonDTO cthd){
       String sql= "INSERT INTO CT_HOADON(MaHD,MaSP,SoLuong,DonGia,ThanhTien,GiamGia)"+"VALUES(?,?,?,?,?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, cthd.getMaHD());
           ps.setString(2, cthd.getMaSP());
           ps.setInt(3, cthd.getSL());
           ps.setFloat(4, cthd.getDonGia());
           ps.setFloat(5, cthd.getThanhTien());
           ps.setFloat(6, cthd.getGiamGia());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Đã tồn tại sản phẩm");
           
       }
       return false;
   }
   
   public boolean suacthd(CT_Hoa_DonDTO cthd){
       String sql="UPDATE CT_HOADON SET SoLuong=?,ThanhTien=?,GiamGia=? WHERE MaHD=? AND MaSP=? ";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setInt(1, cthd.getSL());
           ps.setFloat(2, cthd.getThanhTien());
           ps.setFloat(3, cthd.getGiamGia());
           ps.setString(4, cthd.getMaHD());
           ps.setString(5, cthd.getMaSP());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa chi tiết hóa đơn");
       }
       return false;
   }
   public Vector docma(){
        String sql="SELECT * FROM HOA_DON";
        Vector cbMa= new Vector();
        try {
            
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                cbMa.add(rs.getString(1));
            }
            
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu lên combobox");
            ex.printStackTrace();
        }
        return cbMa;
    }
   
   public Vector docma1(){
        String sql="SELECT * FROM SAN_PHAM";
        Vector cbMa1= new Vector();
        try {
            
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                cbMa1.add(rs.getString(1));
            }
            
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu lên combobox");
            ex.printStackTrace();
        }
        return cbMa1;
    }
   
   public int getSLCT(String mahd,String masp){
        String sql="SELECT * FROM CT_HOADON WHERE MaHD='"+mahd+"' AND MaSP='"+masp+"' ";
       int t=0;
       try {
           PreparedStatement ps=my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
              t=rs.getInt("SoLuong");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy số lượng");
       }
       return t;
   }
   
   public float getgg(String masp){
        String sql="SELECT * FROM CT_KHUYENMAI WHERE MaSP='"+masp+"' ";
       float t=0;
       try {
           PreparedStatement ps=my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
              t=rs.getFloat("GiamGia");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy giảm giá");
       }
       return t;
   }
   
}
