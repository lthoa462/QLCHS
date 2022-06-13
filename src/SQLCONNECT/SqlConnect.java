/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLCONNECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SqlConnect {
 private String host=" ";
    private String user="sa";
    private String psswd="16112000@Abc";
    private String database=" ";
    private Connection con;
    private PreparedStatement ps=null;
    
    private ResultSet rs=null;
    
    public SqlConnect (){}

    public SqlConnect(String host,String user,String psswd,String database) {
        this.host=host;
        this.user=user;
        this.psswd=psswd;
        this.database=database;
    }
    
   
    
    protected Connection getConnection(){
        if(this.con==null){
           
            
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con= DriverManager.getConnection("jdbc:sqlserver://"+this.host+":1433;databasename="+this.database+";username="+this.user+";password="+this.psswd+"");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Không thể kết nối đến cơ sở dữ liệu");
            }
        }
        return con;
    }
    
    public PreparedStatement getPreparedStatement(String sql) throws Exception{
        if(this.ps == null ? true:this.ps.isClosed()){
            this.ps=getConnection().prepareStatement(sql);
        }
        return this.ps;
    }
    
    public ResultSet executeQuery() throws Exception{
        try {
              this.rs= this.ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy cơ sở dữ liệu");
        }
      
        return rs;
    }
    
    public boolean excuteUpdate() throws Exception{
        return this.ps.executeUpdate()>0;
    }

   public void close() throws Exception{
       if(this.rs != null && !this.rs.isClosed()){
           this.rs.close();
           this.rs = null;
       }
       if(this.ps != null && !this.ps.isClosed()){
           this.ps.close();
           this.ps = null;
       }
       if(this.con != null && !this.con.isClosed()){
           this.con.close();
           this.con = null;
       }
    }
   
}
