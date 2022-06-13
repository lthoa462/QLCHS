/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

/**
 *
 * @author NGANDOAN
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author NGANDOAN
 */
public class KhachHangBUS {
    public ArrayList<KhachHangDTO> dskh;
    
    public ArrayList<KhachHangDTO> readdskh(){
        KhachHangDAO data=new KhachHangDAO();
            dskh=data.readkhachhang();
       
        return dskh;
    }
    public boolean addkh(KhachHangDTO kh){
        if(new KhachHangDAO().add(kh))
            return readdskh().add(kh);
        return false;
    }
    public boolean changekh(KhachHangDTO kh){
        if(new KhachHangDAO().change(kh))
            return true;
        return false;
    }
   

    public int kiemtratrung(String ma) {
        
          for(KhachHangDTO kh:dskh){
              if(kh.getMa().equals(ma))
                  return 0;
          }
          return 1;
      } 
     public ArrayList<KhachHangDTO> timKiemID(String ma)
    {
        
        
    	ArrayList<KhachHangDTO> find = new ArrayList<KhachHangDTO>(); 
        KhachHangDTO kh2;
        //int flag=1;
        for(KhachHangDTO kh:dskh)
        {
        	if(kh.getMa().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		kh2 = new KhachHangDTO(kh);
                        find.add(kh);      
                }          
        }   
        return find;
    }
     
     public ArrayList<KhachHangDTO> timKiemten(String ten)
    {
        
        
    	ArrayList<KhachHangDTO> find = new ArrayList<KhachHangDTO>(); 
        KhachHangDTO kh2;
        //int flag=1;
        for(KhachHangDTO kh:dskh)
        {
        	if(kh.getTen().toLowerCase().indexOf(ten.trim().toLowerCase()) != -1)
        	{
        		kh2 = new KhachHangDTO(kh);
                        find.add(kh);      
                }          
        }   
        return find;
    }
     
       
   
    }
    

