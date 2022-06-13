/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChucVuDAO;
import DAO.KhuyenMaiDAO;
import DTO.KhuyenMaiDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class KhuyenMaiBUS {
    public ArrayList<KhuyenMaiDTO> dskm;
    
    public ArrayList<KhuyenMaiDTO> dockm(){
        KhuyenMaiDAO data= new KhuyenMaiDAO();
        dskm= data.dockm();
        return dskm;
    }
    
   public boolean themkm(KhuyenMaiDTO km){
       if(new KhuyenMaiDAO().themkm(km)){
          return dskm.add(km);
       }
       return false;
   }
   
  
   
   public boolean suakm(KhuyenMaiDTO km){
       if(new KhuyenMaiDAO().suakm(km)){
           return true;
       }
       return false;
   }
   
    
    
    public ArrayList<KhuyenMaiDTO> timKiemten(String ten)
    {
        
        
    	ArrayList<KhuyenMaiDTO> find = new ArrayList<KhuyenMaiDTO>(); 
        KhuyenMaiDTO km2;
        //int flag=1;
        for(KhuyenMaiDTO km:dskm)
        {
        	if( km.getTenKM().toLowerCase().indexOf(ten.trim().toLowerCase()) != -1)
        	{
        		km2 = new KhuyenMaiDTO(km);
                        find.add(km);      
                }          
        }   
        return find;
    }
    
    public ArrayList<KhuyenMaiDTO> timKiemma(String ma)
    {
        
        
    	ArrayList<KhuyenMaiDTO> find = new ArrayList<KhuyenMaiDTO>(); 
        KhuyenMaiDTO km2;
        //int flag=1;
        for(KhuyenMaiDTO km:dskm)
        {
        	if( km.getMaKM().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		km2 = new KhuyenMaiDTO(km);
                        find.add(km);      
                }          
        }   
        return find;
    }
}
