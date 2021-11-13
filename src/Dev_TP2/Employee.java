package Dev_TP2;
import java.io.*;

public class Employee implements java.io.Serializable {

	public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public Employee( String name , String adress, int SSN , int number) {
		   this.name=name;
		   this.address=adress;
		   this.SSN=SSN;
		   this.number=number;   
	   }
	   
	   public void mailCheck()
	   {
	      System.out.println("Mail de verification de " + name + " " + address);
	   }
	
	
}

