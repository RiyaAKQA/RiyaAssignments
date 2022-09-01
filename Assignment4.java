/**
 * 
 */
package assignment;

import java.util.Arrays;
import java.util.List;


/**
 * @author riya.grover
 *
 */
public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam" , "Sam" , "Peter" , "Sam" , "Sam" , "Peter");
//		 
//		 String str = "";
//		  for ( int i= 0 ; i <names.size() ; i++) {
//			  str = names.get(i);
//			  names.set(i , str.toUpperCase() );
//		  }
          names.replaceAll(String:: toUpperCase);

		 System.out.println("UpperCase list " + names);
		   
			
				
		  
		  }

		 
		
		

	}

