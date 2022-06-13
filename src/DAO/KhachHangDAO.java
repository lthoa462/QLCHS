/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachHangDTO;
import SQLCONNECT.SqlConnect;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author NGANDOAN
 */
public class KhachHangDAO {
    SqlConnect my = new SqlConnect("localhost","sa", "16112000@Abc", "QLCH1");
    public KhachHangDAO(){}
    public ArrayList<KhachHangDTO> readkhachhang(){
        ArrayList<KhachHangDTO> list=new ArrayList<KhachHangDTO>();
        try {
            String qry="SELECT * FROM KHACH_HANG";
            PreparedStatement ps=my.getPreparedStatement(qry);
            ResultSet rs=my.executeQuery();
            while(rs.next()){
             KhachHangDTO kh=new KhachHangDTO();
             kh.setMa(rs.getString(1));
             kh.setHo(rs.getString(2));
             kh.setTen(rs.getString(3));
             kh.setNgaysinh(rs.getString(4));
             kh.setGender(rs.getString(5));
             kh.setDiachi(rs.getString(6));
             kh.setSdt(rs.getString(7));
             list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean add(KhachHangDTO kh){
        String sql="INSERT INTO KHACH_HANG(MaKH,Ho,Ten,NgaySinh,GioiTinh,DiaChi,SDT)"+"VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=my.getPreparedStatement(sql);
            ps.setString(1,kh.getMa());
            ps.setString(2,kh.getHo());
            ps.setString(3,kh.getTen());
            ps.setString(4,kh.getNgaysinh());
            ps.setString(5,kh.getGender());
            ps.setString(6,kh.getDiachi());
            ps.setString(7,kh.getSdt());
            
           return my.excuteUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ADD DB ERROR");
            e.printStackTrace();
        }
        return false;
    }
    public boolean change(KhachHangDTO kh){
        String sql="UPDATE KHACH_HANG SET Ho=?,Ten=?,NgaySinh=?,GioiTinh=?,DiaChi=?,SDT=? WHERE MaKH=?";
        try {
            PreparedStatement ps=my.getPreparedStatement(sql);
          
            ps.setString(1,kh.getHo());
            ps.setString(2,kh.getTen());
            ps.setString(3,kh.getNgaysinh());
            ps.setString(4,kh.getGender());
            ps.setString(5,kh.getDiachi());
            ps.setString(6,kh.getSdt());
            ps.setString(7,kh.getMa());
            
            return my.excuteUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"CHANGE DB ERROR");
            e.printStackTrace();
        }
        return false;
    }
   
}
