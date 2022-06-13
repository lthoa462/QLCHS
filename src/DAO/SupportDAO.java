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
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SupportDAO {
    SqlConnect my = new SqlConnect("localhost", "sa", "16112000@Abc", "QLCH1");
   
    public ArrayList<SanPhamDTO> docSanPham() {
        ArrayList<SanPhamDTO> list = new ArrayList<>();
        
        try {
        String sql="SELECT * FROM SAN_PHAM";
        PreparedStatement ps = my.getPreparedStatement(sql);
        ResultSet rs =my.executeQuery();
        while(rs.next()){
            SanPhamDTO sv= new SanPhamDTO();
            sv.setMaSP(rs.getString("MaSP"));
            sv.setTenSP(rs.getString("TenSP"));
            sv.setSoLuong(rs.getInt("SoLuong"));
            sv.setDonGia(rs.getFloat("DonGia"));
            list.add(sv);
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không lấy được dữ liệu");
        }
       return list;
    }
}
