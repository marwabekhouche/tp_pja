package Dev_TP2;

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Class1 {

	public static int nb;
	public static String name;
	public static String address;
	public static transient int SSN;
	public static int number;
	static int i;
	
	

public static void main (String args []) throws FileNotFoundException {
	
	       Scanner L = new Scanner(System.in);
	
		   System.out.println("entrez le num d'objet à sérialiser");
		   nb=L.nextInt();
		   System.out.println(" -  le nombre est " +nb);
		 for (i=0;i<nb;i++) {
		 Employee e = new Employee("name","adress",SSN,number);  
		 e.name=L.next();
		 e.address=L.next();
		 e.SSN=L.nextInt();
		 e.number=L.nextInt();
		 try {
		      FileOutPutStream fos = new FileOutPutStream("emp.dat");
		      ObjectOutputStream p = ObjectOutPutStream(fileOut);
		      p.writeObject(e);
		      p.close();
		       fileOut.close();
		      System.out.println("la sérialisation est enregistrer dans emp.data");
		      
		    
		         
		 }catch(IOException j){
			 j.printStackTrace();
		 }
			 
		 }
		 }


}
