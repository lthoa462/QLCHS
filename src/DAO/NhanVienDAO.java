/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhanVienDTO;
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
public class NhanVienDAO {
    SqlConnect my= new SqlConnect("localhost", "sa", "16112000@Abc", "QLCH1");
    
    public ArrayList<NhanVienDTO> docnhanvien(){
        String sql="SELECT * FROM NHAN_VIEN";
        ArrayList<NhanVienDTO> list = new ArrayList<>();
        try {
            
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                NhanVienDTO nv= new NhanVienDTO();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHoNV(rs.getString("Ho"));
                nv.setTenNV(rs.getString("Ten"));
                nv.setNgaySinh(rs.getString("NgaySinh"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSdt(rs.getString("SDT"));
                nv.setThuDienTu(rs.getString("ThuDienTu"));
                nv.setLuong(rs.getFloat("Luong"));
                nv.setMaCV(rs.getString("MaCV"));
                list.add(nv);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu");
        }
        return list;
    }
    
    public boolean ThemNV(NhanVienDTO nv){
        String sql="INSERT INTO NHAN_VIEN(MaNV,Ho,Ten,NgaySinh,GioiTinh,DiaChi,SDT,ThuDienTu,Luong,MaCV)"+"VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps= my.getPreparedStatement(sql);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHoNV());
            ps.setString(3, nv.getTenNV());
            ps.setString(4, nv.getNgaySinh());
            ps.setString(5, nv.getGioiTinh());
            ps.setString(6, nv.getDiaChi());
            try {
                 ps.setString(7, nv.getSdt());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Số điện thoại phải là số");
            }
           
            ps.setString(8, nv.getThuDienTu());
            ps.setFloat(9, nv.getLuong());
            ps.setString(10, nv.getMaCV());
            return my.excuteUpdate();
        } catch (Exception e) {
             //JOptionPane.showMessageDialog(null, "Lỗi thêm dữ liệu");
             e.printStackTrace();
        }
        return false;
    }
    
    
   
    public boolean SuaNV(NhanVienDTO nv){
        String sql="UPDATE NHAN_VIEN SET Ho=?,Ten=?,NgaySinh=?,GioiTinh=?,DiaChi=?,SDT=?,ThuDienTu=?,Luong=?,MaCV=? WHERE  MaNV=? ";
        try {
            PreparedStatement ps= my.getPreparedStatement(sql);
            
            ps.setString(1, nv.getHoNV());
            ps.setString(2, nv.getTenNV());
            ps.setString(3, nv.getNgaySinh());
            ps.setString(4, nv.getGioiTinh());
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getSdt());
            ps.setString(7, nv.getThuDienTu());
            ps.setFloat(8, nv.getLuong());
            ps.setString(9, nv.getMaCV());
            ps.setString(10, nv.getMaNV());
            return my.excuteUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi sửa sản phẩm");
        }
        return false;
    }
    public Vector docmacv(){
        String sql="SELECT * FROM CHUC_VU ";
        Vector cbMacv= new Vector();
        try {
            
            PreparedStatement ps= my.getPreparedStatement(sql);
            ResultSet rs= my.executeQuery();
            while(rs.next()){
                cbMacv.add(rs.getString(1));
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy dữ liệu lên combobox");
        }
        return cbMacv;
    }
}
