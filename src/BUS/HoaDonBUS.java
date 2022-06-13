/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HoaDonDAO;
import DAO.KhuyenMaiDAO;
import DAO.SanPhamDAO;
import DTO.HoaDonDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class HoaDonBUS {
    public ArrayList<HoaDonDTO> dshd;
    
    public ArrayList<HoaDonDTO> dochd(){
        HoaDonDAO data= new  HoaDonDAO();
        dshd= data.dochd();
        return dshd;
    }
    
   public boolean themhd(HoaDonDTO hd){
       if(new HoaDonDAO().themhd(hd)){
          return dshd.add(hd);
       }
       return false;
   }
   
   public boolean suahd(HoaDonDTO hd){
       if(new HoaDonDAO().suahd(hd)){
           return true;
       }
       return false;
   }
   
    public ArrayList<HoaDonDTO> timKiemTheoTien(float from, float to){
        ArrayList<HoaDonDTO> dsReturn = new ArrayList<HoaDonDTO>();
        for(HoaDonDTO hd:dshd){
            if(hd.getSauGiam() >= from && hd.getSauGiam() <= to)
                dsReturn.add(hd);
        }
        return dsReturn;
    }
    
    public ArrayList<HoaDonDTO> timKiemTheoNgay(String from, String to){
        ArrayList<HoaDonDTO> dsReturn = new ArrayList<HoaDonDTO>();
          try {
            for(HoaDonDTO hd:dshd){
           
          
                if(parseDate(hd.getNgay()).compareTo(parseDate(from)) >= 0 && parseDate(hd.getNgay()).compareTo(parseDate(to))<=0)
                    dsReturn.add(hd);
            
            
        }} catch (Exception e) {
               
            }
        return dsReturn;
    }
    
    public Date parseDate(String str) throws ParseException{
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        Date date=df.parse(str);
        return date;
    }
   
    public ArrayList<HoaDonDTO> timkiem(String ma){
        ArrayList<HoaDonDTO> find = new ArrayList<HoaDonDTO>(); 
        HoaDonDTO hd2;
        //int flag=1;
        for(HoaDonDTO hd:dshd)
        {
        	if( hd.getMaHD().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		hd2 = new HoaDonDTO(hd);
                        find.add(hd);      
                }          
        }   
        return find;
    }
    

    public Vector loadcombobox(){
        HoaDonDAO dao= new HoaDonDAO();
        Vector cbMa= dao.docma();
        return cbMa;
    }
    public Vector loadcombobox1(){
        HoaDonDAO dao= new HoaDonDAO();
        Vector cbMa= dao.docma1();
        return cbMa;
    }
    public Vector loadcombobox2(){
        HoaDonDAO dao= new HoaDonDAO();
        Vector cbMa= dao.docma2();
        return cbMa;
    }
    
    public int SL(String masp){
        int res= new HoaDonDAO().getSL(masp);
        return res;
    }
    
    public float TongTien(String mahd){
        float res= new HoaDonDAO().TongTien(mahd);
        return res;
    }
    
    public boolean SuaTT(String mahd,float tongtien){
        if(new HoaDonDAO().SuaTT(tongtien,mahd)){
            return true;
        }
        return false;
    }
    
    public boolean SuaSL(String masp,int sl){
        if(new HoaDonDAO().SuaSL(sl, masp)){
            return true;
        }
        return false;
    }
    
    public float TongGiam(String mahd){
        float res= new HoaDonDAO().TongTienGiam(mahd);
        return res;
    }
    public float TienGiam(String mahd){
        float res= new HoaDonDAO().TienGiam(mahd);
        return res;
    }
    
     public float Tien(String mahd){
        float res= new HoaDonDAO().getTien(mahd);
        return res;
    }
    
   public boolean SuaTTG(float tongtiengiam,String mahd){
       if(new HoaDonDAO().SuaTTG(tongtiengiam, mahd)){
           return true;
       }
       return false;
   }
   
   public boolean SuaTSG(float tongtiengiam,String mahd){
       if(new HoaDonDAO().SuaTSG(tongtiengiam, mahd)){
           return true;
       }
       return false;
   }
   
   public boolean SuaMakm(HoaDonDTO hd){
       if(new HoaDonDAO().Makm(hd)){
           return true;
           
       }
       return false;
   }
   
    
    
}
