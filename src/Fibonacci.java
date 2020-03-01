
public class Fibonacci implements ISubscriber{  
	static int N1=4,N2=8,N3=0;  
	 
	 static void Fibonnacci(int counter){    
	    if(counter>0){    
	         N3 = N1 + N2;    
	         N1 = N2;    
	         N2 = N3;    
	         System.out.print(" "+N3);   
	        Fibonnacci(counter-1);    
	     }
	    System.out.print("\n");   
	 }
	public  void notifySubscriber (int input) {
		 
			
			
		  System.out.print("\n"+"Hello,I am a Subscriber and fibonnaci  series  is  : "+N1+" "+N2);  
		 
		  Fibonnacci(input-2);
		  
			 }}