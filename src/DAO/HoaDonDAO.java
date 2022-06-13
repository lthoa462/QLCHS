/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HoaDonDTO;
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
public class HoaDonDAO {
     SqlConnect my = new SqlConnect("localhost","sa", "16112000@Abc", "QLCH1");
   
   public ArrayList<HoaDonDTO> dochd(){
       ArrayList<HoaDonDTO> list = new ArrayList<>();
       
       try {
           String sql="SELECT * FROM HOA_DON";
           PreparedStatement ps= my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
               HoaDonDTO hd= new HoaDonDTO();
               hd.setMaHD(rs.getString("MaHD"));
               hd.setNgay(rs.getString("Ngay"));
               hd.setMaKM(rs.getString("MaKM"));
               hd.setMaNV(rs.getString("MaNV"));
               hd.setMaKH(rs.getString("MaKH"));
               hd.setTongGiam(rs.getFloat("TongTienGiam"));
               hd.setTongTien(rs.getFloat("TongTien"));
               hd.setSauGiam(rs.getFloat("TongTienSauKhiGiam"));
               list.add(hd);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
           e.printStackTrace();
       }
       
       return list;
   }
   
   public boolean themhd(HoaDonDTO hd){
       String sql= "INSERT INTO HOA_DON(MaHD,Ngay,MaKM,MaNV,MaKH,TongTienGiam,TongTien,TongTienSauKhiGiam)"+"VALUES(?,?,?,?,?,?,?,?)";
       
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, hd.getMaHD());
           ps.setString(2, hd.getNgay());
           ps.setString(3, hd.getMaKM());
           ps.setString(4, hd.getMaNV());
           ps.setString(5, hd.getMaKH());
           ps.setFloat(6, hd.getTongGiam());
           ps.setFloat(7, hd.getTongTien());
           ps.setFloat(8, hd.getSauGiam());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
           e.printStackTrace();
       }
       return false;
   }
   
   public boolean suahd(HoaDonDTO hd){
       String sql="UPDATE HOA_DON SET Ngay=?,MaNV=?,MaKH=? WHERE MaHD=? ";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, hd.getNgay());
           ps.setString(2, hd.getMaNV());
           ps.setString(3, hd.getMaKH());
           ps.setString(4, hd.getMaHD());
           return my.excuteUpdate();
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, "Lỗi sửa hóa đơn");
       }
       return false;
   }
   public Vector docma(){
        String sql="SELECT * FROM KHUYEN_MAI";
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
        String sql="SELECT * FROM NHAN_VIEN";
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
   
   public Vector docma2(){
        String sql="SELECT * FROM KHACH_HANG";
        Vector cbMa2= new Vector();
        try {
            
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                cbMa2.add(rs.getString(1));
            }
            
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu lên combobox");
            ex.printStackTrace();
        }
        return cbMa2;
    }
   
   public float TongTien(String mahd){
       String sql="SELECT sum(ThanhTien) AS TongTien FROM CT_HOADON Where MaHD='"+mahd+"' ";
       float t=0;
       try {
           PreparedStatement ps=my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
              t=rs.getFloat("TongTien");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy tổng tiền");
       }
       return t;
   }
   
  
   
   public boolean SuaTT(float tongtien,String mahd){
       String sql="UPDATE HOA_DON SET TongTien=? WHERE Mahd=?";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setFloat(1, tongtien);
           ps.setString(2, mahd);
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi sửa tổng tiền");
       }
       return false;
   }
   
   public boolean SuaTSG(float tongtien,String mahd){
       String sql="UPDATE HOA_DON SET TongTienSauKhiGiam=? WHERE Mahd=?";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setFloat(1, tongtien);
           ps.setString(2, mahd);
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi sửa tổng tiền");
       }
       return false;
   }
    public boolean SuaSL(int sl,String masp){
       String sql="UPDATE SAN_PHAM SET SoLuong=? WHERE MaSP=?";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setInt(1,sl);
           ps.setString(2, masp);
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi sửa số lượng");
       }
       return false;
   }
     
   
   public int getSL(String masp){
        String sql="SELECT * FROM SAN_PHAM WHERE MaSP='"+masp+"' ";
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
   
   /////
   public float TongTienGiam(String mahd){
       String sql="SELECT sum(GiamGia) AS TongTienGiam FROM CT_HOADON Where MaHD='"+mahd+"' ";
       float t=0;
       try {
           PreparedStatement ps=my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
              t=rs.getFloat("TongTienGiam");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy tổng tiền giảm");
       }
       return t;
   }
   
   public float TienGiam(String mahd){
       String sql="SELECT * FROM HOA_DON Where MaHD='"+mahd+"' ";
       float t=0;
       try {
           PreparedStatement ps=my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
              t=rs.getFloat("TongTienGiam");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy tổng tiền giảm1");
       }
       return t;
   }
   
   public float getTien(String mahd){
       String sql="SELECT * FROM HOA_DON Where MaHD='"+mahd+"' ";
       float t=0;
       try {
           PreparedStatement ps=my.getPreparedStatement(sql);
           ResultSet rs= my.executeQuery();
           while(rs.next()){
              t=rs.getFloat("TongTien");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy tổng tiền giảm1");
       }
       return t;
   }
   
    public boolean SuaTTG(float tongtiengiam,String mahd){
       String sql="UPDATE HOA_DON SET TongTienGiam=? WHERE Mahd=?";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setFloat(1, tongtiengiam);
           ps.setString(2, mahd);
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi sửa tổng tiền giảm");
       }
       return false;
   }
    
     public boolean Makm(HoaDonDTO hd){
       String sql="UPDATE HOA_DON SET MaKM=? WHERE Mahd=?";
       try {
           PreparedStatement ps= my.getPreparedStatement(sql);
           ps.setString(1, hd.getMaKM());
           ps.setString(2, hd.getMaHD());
           return my.excuteUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi sửa mã khuyến mãi");
       }
       return false;
   }
}
