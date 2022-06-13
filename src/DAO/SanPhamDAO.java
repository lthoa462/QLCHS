/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.SanPhamDTO;
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
public class SanPhamDAO {

   SqlConnect my = new SqlConnect("localhost", "sa", "16112000@Abc", "QLCH1");
    public SanPhamDAO(){
         
    }
    public ArrayList<SanPhamDTO> docSanPham() throws Exception{
        ArrayList<SanPhamDTO> list = new ArrayList<>();
        
        try {
        String sql="SELECT * FROM SAN_PHAM";
        PreparedStatement ps = my.getPreparedStatement(sql);
        ResultSet rs =my.executeQuery();
        while(rs.next()){
            SanPhamDTO sv= new SanPhamDTO();
            sv.setMaSP(rs.getString("MaSP"));
            sv.setTenSP(rs.getString("TenSP"));
            sv.setGiaGoc(rs.getFloat("GiaGoc"));
            sv.setDonGia(rs.getFloat("DonGia"));
            sv.setSoLuong(rs.getInt("SoLuong"));
            sv.setDonViTinh(rs.getString("DonViTinh"));
            sv.setMaLoai(rs.getString("MaLoai"));
            list.add(sv);
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không lấy được dữ liệu");
        }
       return list;
    }
    
    public boolean Them(SanPhamDTO sp){
     
        String sql="INSERT INTO SAN_PHAM(MaSP,TenSP,GiaGoc,DonGia,SoLuong,DonViTinh,MaLoai)"+"VALUES(?,?,?,?,?,?,?)" ;
        try {
            PreparedStatement ps =my.getPreparedStatement(sql);
            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.setFloat(3, sp.getGiaGoc());
            ps.setFloat(4, sp.getDonGia());
            ps.setInt(5, sp.getSoLuong());
            ps.setString(6, sp.getDonViTinh());
            ps.setString(7, sp.getMaLoai());
            return my.excuteUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public boolean SuaSP(SanPhamDTO sp){
        String sql="UPDATE SAN_PHAM SET TenSP=?,GiaGoc=?,DonGia=?,SoLuong=?,DonViTinh=?,MaLoai=? WHERE MaSP=?";
        
        try {
            PreparedStatement ps= my.getPreparedStatement(sql);
            ps.setString(1, sp.getTenSP());
            ps.setFloat(2, sp.getGiaGoc());
            ps.setFloat(3, sp.getDonGia());
            ps.setInt(4, sp.getSoLuong());
            ps.setString(5, sp.getDonViTinh());
            ps.setString(6, sp.getMaLoai());
            ps.setString(7, sp.getMaSP());
            return my.excuteUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không sửa được sản phẩm ");
        }
        return false;
    }
    //lấy dữ liệu combobox mã loại
    public Vector loadCombobox(){
        Vector cbBox= new Vector();
        String sql="SELECT * FROM LOAI_SP ";
       try {
           PreparedStatement ps = my.getPreparedStatement(sql);
            ResultSet rs =my.executeQuery();
           while(rs.next()){
               cbBox.add(rs.getString(1));
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu combobox");
       }
       return cbBox;
    }
   
    
  
   
}
