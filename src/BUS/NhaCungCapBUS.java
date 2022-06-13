/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCapDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NhaCungCapBUS {
   public ArrayList<NhaCungCapDTO> dsncc;
    
    public ArrayList<NhaCungCapDTO> docncc(){
        NhaCungCapDAO data= new NhaCungCapDAO();
        dsncc= data.docncc();
        return dsncc;
    }
    
   public boolean themncc(NhaCungCapDTO ncc){
       if(new NhaCungCapDAO().themNhacc(ncc)){
          return dsncc.add(ncc);
       }
       return false;
   }
   
   
   
   public boolean suancc(NhaCungCapDTO ncc){
       if(new NhaCungCapDAO().suanhacc(ncc)){
           return true;
       }
       return false;
   }
   
   public ArrayList<NhaCungCapDTO> timKiemID(String ma)
    {
        
        
    	ArrayList<NhaCungCapDTO> find = new ArrayList<NhaCungCapDTO>(); 
        NhaCungCapDTO ncc2;
        //int flag=1;
        for(NhaCungCapDTO ncc:dsncc)
        {
        	if( ncc.getMaCC().toLowerCase().indexOf(ma.trim().toLowerCase()) != -1)
        	{
        		ncc2 = new NhaCungCapDTO(ncc);
                        find.add(ncc);      
                }          
        }   
        return find;
    }
     public ArrayList<NhaCungCapDTO> timKiemten(String ten)
    {
        
        
    	ArrayList<NhaCungCapDTO> find = new ArrayList<NhaCungCapDTO>(); 
        NhaCungCapDTO ncc2;
        //int flag=1;
        for(NhaCungCapDTO ncc:dsncc)
        {
        	if( ncc.getTenCC().toLowerCase().indexOf(ten.trim().toLowerCase()) != -1)
        	{
        		ncc2 = new NhaCungCapDTO(ncc);
                        find.add(ncc);      
                }          
        }   
        return find;
    }
}
