package recursion;

public class Fibonacci {
	
	public static int fibonacci(int a) {
		
		if (a==1||a==2) 
			return 1;
	    else 
	    	return fibonacci(a-1)+fibonacci(a-2);
		}
			
	

}
