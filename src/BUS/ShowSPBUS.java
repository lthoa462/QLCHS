/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.SupportDAO;
import DTO.SanPhamDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ShowSPBUS {
    public ArrayList<SanPhamDTO> dssp;
    public  ArrayList<SanPhamDTO> docsp(){
        dssp=new SupportDAO().docSanPham();
        return dssp;
    }
            
            
            
}
