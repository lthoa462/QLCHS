/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChucVuDAO;
import DTO.ChucVuDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ChucVuBUS {
    public ArrayList<ChucVuDTO> dscv;
    
    public ArrayList<ChucVuDTO> docchucvu(){
        ChucVuDAO data= new ChucVuDAO();
        dscv= data.docchucvu();
        return dscv;
    }
    
   public boolean themchucvu(ChucVuDTO cv){
       if(new ChucVuDAO().themChucvu(cv)){
          return dscv.add(cv);
       }
       return false;
   }
   
   
   
   public boolean suachucvu(ChucVuDTO cv){
       if(new ChucVuDAO().suachucvu(cv)){
           return true;
       }
       return false;
   }
   
    public ArrayList<ChucVuDTO> timKiemID(String ma)
    {
        
        
    	ArrayList<ChucVuDTO> find = new ArrayList<ChucVuDTO>(); 
        ChucVuDTO cv2;
        //int flag=1;
        for(ChucVuDTO cv:dscv)
        {
        	if( cv.getMaCV().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		cv2 = new ChucVuDTO(cv);
                        find.add(cv);      
                }          
        }   
        return find;
    }
     public ArrayList<ChucVuDTO> timKiemten(String ten)
    {
        
        
    	ArrayList<ChucVuDTO> find = new ArrayList<ChucVuDTO>(); 
        ChucVuDTO cv2;
        //int flag=1;
        for(ChucVuDTO cv:dscv)
        {
        	if( cv.getTenChucVu().toLowerCase().indexOf(ten.trim().toLowerCase()) != -1)
        	{
        		cv2 = new ChucVuDTO(cv);
                        find.add(cv);      
                }          
        }   
        return find;
    }
}
