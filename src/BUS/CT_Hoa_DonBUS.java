/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.CT_Hoa_DonDAO;
import DAO.HoaDonDAO;
import DTO.CT_Hoa_DonDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CT_Hoa_DonBUS {
     public ArrayList<CT_Hoa_DonDTO> dscthd;
    
    public ArrayList<CT_Hoa_DonDTO> doccthd(){
        CT_Hoa_DonDAO data= new  CT_Hoa_DonDAO();
        dscthd= data.doccthd();
        return dscthd;
    }
    
   public boolean themhd(CT_Hoa_DonDTO cthd){
       if(new CT_Hoa_DonDAO().themcthd(cthd)){
          return dscthd.add(cthd);
       }
       return false;
   }
   
   
   
   public boolean suacthd(CT_Hoa_DonDTO cthd){
       if(new CT_Hoa_DonDAO().suacthd(cthd)){
           return true;
       }
       return false;
   }
   
    public ArrayList<CT_Hoa_DonDTO> timkiem(String ma){
        int flag=1;
        ArrayList<CT_Hoa_DonDTO> list = new ArrayList<>();
        for(CT_Hoa_DonDTO cthd: dscthd){
            if(cthd.getMaHD().toLowerCase().equals(ma)|| cthd.getMaSP().toLowerCase().equals(ma)  ){
                list.add(cthd);
                flag=1;
            }
            else{
                flag=0;
            }
            if(flag==1){
            JOptionPane.showMessageDialog(null, "Tìm thành công");
           break;
            }
        }
        
        if(flag==0){
            JOptionPane.showMessageDialog(null, "Không tồn tại ");
          
            }
        return list;
    }
    
    public int SLCT(String mahd,String masp){
        int res= new CT_Hoa_DonDAO().getSLCT(mahd,masp);
        return res;
    }
    public float gg(String mahd){
        float res= new CT_Hoa_DonDAO().getgg(mahd);
        return res;
    }

    public Vector loadcombobox(){
        CT_Hoa_DonDAO dao= new CT_Hoa_DonDAO();
        Vector cbMa= dao.docma();
        return cbMa;
    }
    public Vector loadcombobox1(){
        CT_Hoa_DonDAO dao= new CT_Hoa_DonDAO();
        Vector cbMa= dao.docma1();
        return cbMa;
    }
    
     public ArrayList<CT_Hoa_DonDTO> timKiemten(String ma)
    {
    	ArrayList<CT_Hoa_DonDTO> find = new ArrayList<CT_Hoa_DonDTO>(); 
        CT_Hoa_DonDTO cthd2;
        //int flag=1;
        for(CT_Hoa_DonDTO cthd:doccthd())
        {
        	if( cthd.getMaHD().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		cthd2 = new CT_Hoa_DonDTO(cthd);
                        find.add(cthd);      
                }          
        }   
        return find;
    }
}
