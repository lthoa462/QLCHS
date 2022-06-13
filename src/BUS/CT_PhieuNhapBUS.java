/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.CT_PhieuNhapDAO;
import DAO.PhieuNhapDAO;
import DTO.CT_PhieuNhapDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CT_PhieuNhapBUS {
    public ArrayList<CT_PhieuNhapDTO> dsctpn;
    
    public ArrayList<CT_PhieuNhapDTO> docctpn(){
        CT_PhieuNhapDAO data= new CT_PhieuNhapDAO();
        dsctpn= data.docctpn();
        return dsctpn;
    }
    
   public boolean themctpn(CT_PhieuNhapDTO ctpn){
       if(new CT_PhieuNhapDAO().themctpn(ctpn)){
          return dsctpn.add(ctpn);
       }
       return false;
   }
   
  
   
   public boolean suactpn(CT_PhieuNhapDTO ctpn){
       if(new CT_PhieuNhapDAO().suactkm(ctpn)){
           return true;
       }
       return false;
   }
   
   
    public ArrayList<CT_PhieuNhapDTO > timKiemma(String ma)
    {
        
        
    	ArrayList<CT_PhieuNhapDTO> find = new ArrayList<CT_PhieuNhapDTO>(); 
        CT_PhieuNhapDTO pn2;
        //int flag=1;
        for(CT_PhieuNhapDTO pn:docctpn())
        {
        	if( pn.getMaPhieu().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		pn2 = new CT_PhieuNhapDTO(pn);
                        find.add(pn);      
                }          
        }   
        return find;
    }
    
    public ArrayList<CT_PhieuNhapDTO> timKiemsl(int sl)
    {
        
        
    	ArrayList<CT_PhieuNhapDTO> find = new ArrayList<CT_PhieuNhapDTO>(); 
        CT_PhieuNhapDTO pn2;
        //int flag=1;
        for(CT_PhieuNhapDTO pn:dsctpn)
        {
        	if( pn.getSoLuong()==sl)
        	{
        		pn2 = new CT_PhieuNhapDTO(pn);
                        find.add(pn);      
                }          
        }   
        return find;
    }
    
    
}
