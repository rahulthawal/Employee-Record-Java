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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
import java.util.*;
public class AddressBook
{

    ArrayList persons;
    
//constructor
public AddressBook ( ) {
persons = new ArrayList();
loadPersons();
}
 public void loadPersons ( )
    {
        String tokens[] = null;
        String name, add, ph;
        try 
        {
            FileReader fr = new FileReader("/home/rahulthawal/Desktop/ADVANCE _JAVA/person.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            
            while ( line != null ) 
            {
                    tokens = line.split(",");
                    
                    name = tokens[0];
                    add = tokens[1];
                    ph = tokens[2];
                    
                    PersonInfo p = new PersonInfo(name, add, ph);
                    persons.add(p); // Arraylist 
                   
                    
            }

        }
        catch(IOException ioEx){
            System.out.println(ioEx);
            }
    }

 
 public void savePersons ( )
 {
    try 
    {
        PersonInfo p;
        String line;
        FileWriter fw = new FileWriter("/home/rahulthawal/Desktop/ADVANCE _JAVA/person.txt");
        PrintWriter pw = new PrintWriter(fw);
        
        for(int i=0; i<persons.size(); i++)
        {
                p = (PersonInfo)persons.get(i);
                line = p.name +","+ p.address +","+ p.phoneNum;
                // writes line to file (person.txt) line by line
                
                pw.println(line);
        }
        pw.flush();
        pw.close();
        fw.close();
    }

    catch(IOException ioEx)
    {
    System.out.println(ioEx);
    }
}
//add new person record to arraylist after taking input
public void addPerson( ) {
String name =JOptionPane.showInputDialog("Enter Name");
String add = JOptionPane.showInputDialog("Enter Address");
String pNum = JOptionPane.showInputDialog("Enter Phone no");

//construt new person object
PersonInfo p = new PersonInfo(name, add, pNum);
//add the above PersonInfo object to arraylist
persons.add(p);

}


//search person record by name by iterating over arraylist
public void searchPerson (String n) {
    
    for (int i=0; i< persons.size(); i++) 
    {
    
    PersonInfo p = (PersonInfo)persons.get(i);

        if ( n.equals(p.name) ) 
        {
            p.print();
        }
        else
        {JOptionPane.showInputDialog("NO RECORD FOUND");}    
    } // end for
} // end searchPerson


//delete person record by name by iterating over arraylist
public void deletePerson (String n) 
{
    for (int i=0; i< persons.size(); i++) 
    {
        PersonInfo p = (PersonInfo)persons.get(i);
        if ( n.equals(p.name) ) 
        {
            persons.remove(i);
        }

    }
}



}