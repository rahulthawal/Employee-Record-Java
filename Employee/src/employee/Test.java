/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import javax.swing.JOptionPane;

/**
 *
 * @author rahulthawal
 */
public class Test 
{
    public static void main (String args[])
    {
        
        AddressBook ab = new AddressBook();
        String input, s;
        int ch;
        
        
        while (true) 
        {// dialog box always return in string so parse it 
            input = JOptionPane.showInputDialog("Enter 1 to add " +
            "\n Enter 2 to Search \n Enter 3 to Delete" +
            "\n Enter 4 to Exit");
            
            ch = Integer.parseInt(input);
            
            
            switch (ch) 
            {
                case 1:
                ab.addPerson();
                break;
                    
                case 2:
                s = JOptionPane.showInputDialog(
                "Enter name to search ");
                ab.searchPerson(s);
                break;
                    
                case 3:
                s = JOptionPane.showInputDialog(
                "Enter name to delete ");
                ab.deletePerson(s);
                break;
                    
                case 4:
                ab.savePersons();
                System.exit(0);
            }
        }
    
}
}