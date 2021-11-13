package Dev_TP2;
import java.util.*;
import java.io.*;

import java.io.FileNotFoundException;
import java .io.FileInputStream;
public class Class2  {

	Employee e= new Employee ("null","null",0,0);
	try {
		FileInputStream fileIn=new FileInPutStream(emp.dat);
		ObjectInputStream k= new ObjectInPutStream(fileIn);
		 k.readObject();
		 k.close();
		 fileIn.close();
		 
		
	}catch(IOException j) {  
		j.printStackTrace();
		return;
	}
	System.out.PrintLn("name is"  + e.name);
	System.out.PrintLn("name is"  + e.address);
	System.out.PrintLn("name is"  + e.SSN);
	System.out.PrintLn("name is"  + e.number);
	 RandomAccesFile  R = new RandomAccesFile("empdirect.dat"); 
	 
}
	
	
}
