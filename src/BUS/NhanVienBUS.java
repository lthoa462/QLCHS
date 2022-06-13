/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NhanVienBUS {
    public ArrayList<NhanVienDTO> dsnv;
    
    public ArrayList<NhanVienDTO> docnhanvien(){
        NhanVienDAO data= new NhanVienDAO();
        dsnv= data.docnhanvien();
        return dsnv;
    }
    
    public boolean themnv(NhanVienDTO nv){
        if(new NhanVienDAO().ThemNV(nv)){
          return dsnv.add(nv);
        }
        return false;
    }
 
    
    public boolean suanv(NhanVienDTO nv){
        if(new NhanVienDAO().SuaNV(nv)){
            return true;
        }
        return false;
    }
    
     public ArrayList<NhanVienDTO> timKiemID(String ma)
    {
        
        
    	ArrayList<NhanVienDTO> find = new ArrayList<NhanVienDTO>(); 
        NhanVienDTO nv2;
        //int flag=1;
        for(NhanVienDTO nv:dsnv)
        {
        	if( nv.getMaNV().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		nv2 = new NhanVienDTO(nv);
                        find.add(nv);      
                }          
        }   
        return find;
    }
     public ArrayList<NhanVienDTO> timKiemten(String ten)
    {
        
        
    	ArrayList<NhanVienDTO> find = new ArrayList<NhanVienDTO>(); 
        NhanVienDTO nv2;
        //int flag=1;
        for(NhanVienDTO nv:dsnv)
        {
        	if( nv.getTenNV().toLowerCase().indexOf(ten.trim().toLowerCase()) != -1)
        	{
        		nv2 = new NhanVienDTO(nv);
                        find.add(nv);      
                }          
        }   
        return find;
    }
    
    public Vector loadcombobox(){
        NhanVienDAO dao= new NhanVienDAO();
        Vector cbMaCV= dao.docmacv();
        return cbMaCV;
    }
}
