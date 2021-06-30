/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagementSystem;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
/**
 *
 * @author Adarsh Maurya
 */
public class DbDetails {
     DbDetails(){
         try {
            // Creating an object of a file
            File myObj = new File("dbDetails"); 
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
          } 
         catch (IOException e) {
            System.out.println("An error occurred.");
             e.printStackTrace();
            }
     }
     public void saveDetails(String[] details){
        try {
             FileWriter myWriter = new FileWriter("dbDetails");
             // Writes this content into the specified file
             myWriter.write(details[0]+" "+details[1]); 
 
                // Closing is necessary to retrieve the resources allocated
                 myWriter.close();
             System.out.println("Successfully wrote to the file.");
         } catch (IOException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
     }
     public String[] getDetails(){
          String details[]=new String[2];
         try {
// Creating an object of the file for reading the data
             File myObj = new File("dbDetails");
             Scanner myReader = new Scanner(myObj);
             
                 String data[] = myReader.nextLine().trim().split("\\ ");
                 details[0]=data[0];
                 details[1]=data[1];
             myReader.close();
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
        
         return details;
     }
}
