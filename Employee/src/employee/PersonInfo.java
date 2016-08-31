/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author rahulthawal
 */
import javax.swing.*;
public class PersonInfo 
{
  public String name;
  public String address;
  public String phoneNum;  
  
  //parameterized constructor
    public PersonInfo(String n, String a, String p) 
    {
        name = n;
        address = a;
        phoneNum = p;
    }
    
   
    
    
    
    
    //method for displaying person record on GUI
    public void print( ) 
    {
        JOptionPane.showMessageDialog(null, "Name: " + name +
        "Address: " + address + "Phone no: " + phoneNum);
    }
}

