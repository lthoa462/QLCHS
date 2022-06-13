/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.CT_KhuyenMaiDAO;
import DAO.PhieuNhapDAO;
import DTO.PhieuNhapDTO;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class PhieuNhapBUS {
       public ArrayList<PhieuNhapDTO> dspn;
    
    public ArrayList<PhieuNhapDTO> docpn(){
        PhieuNhapDAO data= new PhieuNhapDAO();
        dspn= data.docpn();
        return dspn;
    }
    
   public boolean thempn(PhieuNhapDTO pn){
       if(new PhieuNhapDAO().thempn(pn)){
          return dspn.add(pn);
       }
       return false;
   }
   
  
   
   public boolean suactpn(PhieuNhapDTO pn){
       if(new PhieuNhapDAO().suactkm(pn)){
           return true;
       }
       return false;
   }
   
   
    public ArrayList<PhieuNhapDTO> timKiemma(String ma)
    {
        
        
    	ArrayList<PhieuNhapDTO> find = new ArrayList<PhieuNhapDTO>(); 
        PhieuNhapDTO pn2;
        //int flag=1;
        for(PhieuNhapDTO pn:dspn)
        {
        	if( pn.getMaPhieu().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		pn2 = new PhieuNhapDTO(pn);
                        find.add(pn);      
                }          
        }   
        return find;
    }
    
    public ArrayList<PhieuNhapDTO> timKiemngay(String ngay)
    {
        
        
    	ArrayList<PhieuNhapDTO> find = new ArrayList<PhieuNhapDTO>(); 
        PhieuNhapDTO pn2;
        //int flag=1;
        for(PhieuNhapDTO pn:dspn)
        {
        	if( pn.getNgay().toLowerCase().indexOf(ngay.trim().toLowerCase()) != -1)
        	{
        		pn2 = new PhieuNhapDTO(pn);
                        find.add(pn);      
                }          
        }   
        return find;
    }
    
    public Vector loadcb(){
        Vector cb= new PhieuNhapDAO().loadcbmcc();
        return cb;
    }
    
    public Vector loadcb1(){
        Vector cb= new PhieuNhapDAO().loadcbmnv();
        return cb;
    }
}
