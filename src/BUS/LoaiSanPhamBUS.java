/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiSanPhamDAO;
import DTO.LoaiSanPhamDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamBUS {
    public ArrayList<LoaiSanPhamDTO> dslsp;
    
    public ArrayList<LoaiSanPhamDTO> doclsp(){
        LoaiSanPhamDAO data= new LoaiSanPhamDAO();
        dslsp= data.docloaisp();
        return dslsp;
    }
    
   public boolean themloaisp(LoaiSanPhamDTO sp){
       if(new LoaiSanPhamDAO().themloaisp(sp)){
          return dslsp.add(sp);
       }
       return false;
   }
   
   
   
   public boolean sualoaisp(LoaiSanPhamDTO sp){
       if(new LoaiSanPhamDAO().sualoaisp(sp)){
           return true;
       }
       return false;
   }
   
    public ArrayList<LoaiSanPhamDTO> timKiemID(String ma)
    {
        
        
    	ArrayList<LoaiSanPhamDTO> find = new ArrayList<LoaiSanPhamDTO>(); 
        LoaiSanPhamDTO sp2;
        //int flag=1;
        for(LoaiSanPhamDTO sp:dslsp)
        {
        	if( sp.getMaLoai().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		sp2 = new LoaiSanPhamDTO(sp);
                        find.add(sp);      
                }          
        }   
        return find;
    }
     public ArrayList<LoaiSanPhamDTO> timKiemten(String ten)
    {
        
        
    	ArrayList<LoaiSanPhamDTO> find = new ArrayList<LoaiSanPhamDTO>(); 
        LoaiSanPhamDTO sp2;
        //int flag=1;
        for(LoaiSanPhamDTO sp:dslsp)
        {
        	if( sp.getTenLoai().toLowerCase().indexOf(ten.trim().toLowerCase()) != -1)
        	{
        		sp2 = new LoaiSanPhamDTO(sp);
                        find.add(sp);      
                }          
        }   
        return find;
    }
}
