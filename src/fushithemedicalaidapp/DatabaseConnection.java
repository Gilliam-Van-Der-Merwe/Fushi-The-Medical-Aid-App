/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fushithemedicalaidapp;

import static fushithemedicalaidapp.Controller.db;
import static fushithemedicalaidapp.Controller.lgn;
import static fushithemedicalaidapp.Controller.reg;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gvdme17
 */
public class DatabaseConnection 
{
   private Connection connection;
   private PreparedStatement statement;
   private ResultSet resultSet;   
   ////////////////////////////////////////////////////////////////////////////
   public DatabaseConnection()//Contructor method which establishes db connection.
   {
      try
      {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
      
         System.out.println("Driver successfully loaded");
      } 
      catch (ClassNotFoundException c) 
      {
         System.out.println("Unable to load driver\n" + c);
      }
   
      try//Connect to the database
      {
         File file = new File("FushiTheMedicalAidApp.accdb");
         String path = file.getAbsolutePath();
         if (path.contains("shiraz"))
         {
            String jippoPath = "jdbc:ucanaccess://C:\\Users\\gilli\\OneDrive\\Documents\\NetBeansProjects\\FusiTHeMedicalAidApp\\FushiTheMedicalAidApp.accdb";
            connection = DriverManager.getConnection(jippoPath);
         } 
         else 
         {  
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + path);//code to determine filepath of database
         }
      
         System.out.println("Connection successful");
      } 
      catch (SQLException e)
      {
         System.out.println("Unable to connect\n" + e);
      }
   }
   /////////////////////////////////////////////////////////////////////////////
   public ResultSet query(String stmt) throws SQLException 
   {
      statement = connection.prepareStatement(stmt);
      resultSet = statement.executeQuery();
      return resultSet;
   }
   /////////////////////////////////////////////////////////////////////////////
   public void update(String update) throws SQLException 
   {
      statement = connection.prepareStatement(update);
      statement.executeUpdate();
      statement.close();
   }
   /////////////////////////////////////////////////////////////////////////////
   public String loginInfo(String sql)//method used to retrieve login credentials 
   {
       String temp = "";
        try
        {
            ResultSet rs = query(sql);
            while(rs.next())
            {
                String un = rs.getString("Username");
                String pw = rs.getString("Password");
                
                temp = temp + un + " " + pw + "\n";
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }       
        return temp;
    }
   ////////////////////////////////////////////////////////////////////////////
   public void register(String n, String sN, String u, String p, String id, String dOB, String a, String mH)//method is used to register new profile for new users.
   {
      try//try catch block for exception handling.
      {
        if(n.equals("")||sN.equals("")||u.equals("")||p.equals("")||id.equals("")||dOB.equals("")||a.equals("")||mH.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Invalid Input");
            reg.setVisible(false);
            lgn.setVisible(true);
        }
        else
        {
            String query = "insert into tblUserLoginData(Username, Password, IDNumber) values (?, ?, ?)";//sql table insert query.        
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, u);
            preparedStmt.setString(2, p);
            preparedStmt.setString(3, id);      
            preparedStmt.execute();
            
            String query2  = "insert into tblUserPersonalData(IDNumber, Forename, Surname, DateOfBirth, Allergies, MedicalHistory) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt2 = connection.prepareStatement(query2);
            preparedStmt2.setString(1, id);
            preparedStmt2.setString(2, n);
            preparedStmt2.setString(3, sN);
            preparedStmt2.setString(4, dOB);
            preparedStmt2.setString(5, a);
            preparedStmt2.setString(6, mH);
            preparedStmt2.execute();
            
            String query3 = "insert into tblUserProfile(IDNumber, Score) values (?, ?)";
            PreparedStatement preparedStmt3 = connection.prepareStatement(query3);
            preparedStmt3.setString(1, id);
            preparedStmt3.setInt(2,0);
            preparedStmt3.execute();
            
            String query4 = "insert into tblLevels(IDNumber, Level, Progress) values (?, ?, ?)";
            PreparedStatement preparedStmt4 = connection.prepareStatement(query4);
            preparedStmt4.setString(1, id);
            preparedStmt4.setString(2,"Bronze"); 
            preparedStmt4.setString(2,"0");
            preparedStmt4.execute();
            connection.close();
        }              
      } 
      catch(Exception e)
      {
         e.printStackTrace();
      }
   }
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public String queryTblUserPersonalData(String sql)
    {
        String temp = "";
        try
        {
            ResultSet rs2 = db.query(sql);
            while(rs2.next())
            {
                String IDN = rs2.getString("IDNumber");
                String n = rs2.getString("Forename");
                String sN = rs2.getString("Surname");
                String dOB = rs2.getString("DateOfBirth");
                String a = rs2.getString("Allergies");
                String mH = rs2.getString("MedicalHistory");
                temp = temp + IDN + "\t" + n + "\t" + sN + "\t" + dOB + "\t" + a + "\t" + mH + "\n"; 
            }           
        }
        catch(SQLException s)
        {
            temp = temp + ("Cannot Execute Query");
            s.printStackTrace();
        }
        return temp;      
    }
   ////////////////////////////////////////////////////////////////////////////
   public String queryTblLevels(String sql)
    {
        String temp = "";
        try
        {
            ResultSet rs3 = db.query(sql);
            while(rs3.next())
            {
                String IDN = rs3.getString("IDNumber");
                String l = rs3.getString("Level");
                String p = rs3.getString("Progress");

                temp = IDN + "\t\t" + l + "\t\t" + p + "%" + "\t\t"; 
                //System.out.println(temp);
            }           
        }
        catch(SQLException s)
        {
            temp = temp + ("Cannot Execute Query");
            s.printStackTrace();
        }
        return temp;      
    }
   ////////////////////////////////////////////////////////////////////////////
   public String queryTblUserProfile(String sql)
    {
        String temp = "";
        try
        {
            ResultSet rs4 = db.query(sql);
            while(rs4.next())
            {
                String score = rs4.getString("Score");

                temp = score; 
                //System.out.println(temp);
            }           
        }
        catch(SQLException s)
        {
            temp = temp + ("Cannot Execute Query");
            s.printStackTrace();
        }
        return temp;      
    }
   ////////////////////////////////////////////////////////////////////////////
   
   ////////////////////////////////////////////////////////////////////////////
}
