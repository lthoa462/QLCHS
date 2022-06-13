/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.CT_KhuyenMaiDAO;
import DTO.CT_Khuyen_MaiDTO;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class CT_KhuyenMaiBUS {
     public ArrayList<CT_Khuyen_MaiDTO> dsctkm;
    
    public ArrayList<CT_Khuyen_MaiDTO> docctkm(){
        CT_KhuyenMaiDAO data= new CT_KhuyenMaiDAO();
        dsctkm= data.docctkm();
        return dsctkm;
    }
    
   public boolean themctkm(CT_Khuyen_MaiDTO km){
       if(new CT_KhuyenMaiDAO().themctkm(km)){
          return dsctkm.add(km);
       }
       return false;
   }
   
  
   
   public boolean suactkm(CT_Khuyen_MaiDTO km){
       if(new CT_KhuyenMaiDAO().suactkm(km)){
           return true;
       }
       return false;
   }
   
   
    public ArrayList<CT_Khuyen_MaiDTO> timKiemten(String ma)
    {
        
        
    	ArrayList<CT_Khuyen_MaiDTO> find = new ArrayList<CT_Khuyen_MaiDTO>(); 
        CT_Khuyen_MaiDTO km2;
        //int flag=1;
        for(CT_Khuyen_MaiDTO km: docctkm())
        {
        	if( km.getMaKM().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		km2 = new CT_Khuyen_MaiDTO(km);
                        find.add(km);      
                }          
        }   
        return find;
    }
    
    public Vector loadcbMakm(){
        CT_KhuyenMaiDAO data= new CT_KhuyenMaiDAO();
        Vector cb= data.loadcbKM();
        return cb;
        
    }
    public Vector loadcbMasp(){
        CT_KhuyenMaiDAO data= new CT_KhuyenMaiDAO();
        Vector cb= data.loadcbSP();
        return cb;
        
    }
}
