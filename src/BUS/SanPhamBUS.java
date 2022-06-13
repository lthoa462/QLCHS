/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPhamDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SanPhamBUS {
    public ArrayList<SanPhamDTO> dssp;
    
   
    public ArrayList<SanPhamDTO> docdulieu(){
        SanPhamDAO data= new SanPhamDAO();
        try {
            dssp=data.docSanPham();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "List not found");
        }
        return dssp;
    }
    
   
    public boolean ThemSP(SanPhamDTO sp){
    
        if(new SanPhamDAO().Them(sp)){
           
            return docdulieu().add(sp);
        }
       
     
        return false;
    }
    
    public boolean SuaSP(SanPhamDTO sp){
        if(new SanPhamDAO().SuaSP(sp)){
            return true;
        }
        return false;
    }
    
     public ArrayList<SanPhamDTO> timKiemten(String ten)
    {
        
        
    	ArrayList<SanPhamDTO> find = new ArrayList<SanPhamDTO>(); 
        SanPhamDTO sp2;
        //int flag=1;
        for(SanPhamDTO sp:dssp)
        {
        	if( sp.getTenSP().toLowerCase().indexOf(ten.trim().toLowerCase()) != -1)
        	{
        		sp2 = new SanPhamDTO(sp);
                        find.add(sp);      
                }          
        }   
        return find;
    }
    
      public ArrayList<SanPhamDTO> timKiemID(String ma)
    {
        
        
    	ArrayList<SanPhamDTO> find = new ArrayList<SanPhamDTO>(); 
        SanPhamDTO sp2;
        //int flag=1;
        for(SanPhamDTO sp:dssp)
        {
        	if( sp.getMaSP().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		sp2 = new SanPhamDTO(sp);
                        find.add(sp);      
                }          
        }   
        return find;
    }
    public Vector loadComboBox(){
        SanPhamDAO dao = new SanPhamDAO();
        return dao.loadCombobox();
    }
    
   
}
