package java8;

import java.util.stream.IntStream;

public class java7VsJava8 {
	
	public static void main(String[] args) {
		
		int total =0 ;
		for(int i = 0 ; i < 50 ; i++) {
			total =+ i;
		}
		
		System.out.println(total);
		
		//java8
		
		int output = IntStream.rangeClosed(0, 50).sum();
		  System.out.println(output);

	}
	
	
	
}
