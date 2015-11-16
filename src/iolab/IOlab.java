/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.io.*;
import java.util.*;
/**
 *
 * @author Nicholas
 */
public class IOlab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int recordwanted = 3;
        int numrecords = 3;
          boolean append = true;
	  File data = new File("C:" + File.separatorChar + "temp" + File.separatorChar + "Lab1.txt");
          BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! couldn't read this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        System.out.println("----------------------------");
//          PrintWriter out = new PrintWriter(
//						new BufferedWriter(
//						new FileWriter(data, append)));
//          out.print("Darth Vador \nDeath Star \nSolar System, IL ???");
//          out.close(); // be sure you close your streams when done!!
//	
//	  System.out.println("Wrote file to: " + data.getAbsolutePath());
            in = null;
            List<String> Lines = new ArrayList<>();
            try {   
                in = new BufferedReader(new FileReader("C:" + File.separatorChar + "temp" + File.separatorChar + "Lab1.txt"));
                String str;
                while ((str = in.readLine()) != null) {
                    Lines.add(str);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    in.close();
                }
            }
            System.out.print(Lines.get(recordwanted * numrecords - 3));
            System.out.print("'s state: ");
            String line = (Lines.get(recordwanted * numrecords - 1));
            String [] lines = line.split(" ");
            System.out.println(lines[1]);
    }
}
    

