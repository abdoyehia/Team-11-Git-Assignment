
import java.util.Scanner; 
class Fibo{  
 static int N1=4,N2=8,N3=0;    
 static void Fibonnacci(int counter){    
    if(counter>0){    
         N3 = N1 + N2;    
         N1 = N2;    
         N2 = N3;    
         System.out.print(" "+N3);   
        Fibonnacci(counter-1);    
     }    
 }
 
 
 public static void main(String args[]){  
	 System.out.print("1-Fibonnaci ");
	Scanner scan= new Scanner(System.in);
	System.out.print("Enter your choice: ");
	int choice = scan.nextInt();
	
	
	if(choice==1) {
		System.out.print("Enter num : ");
		int num=scan.nextInt();
  System.out.print(N1+" "+N2);  
 
  Fibonnacci(num-2);
	 }
 }  
} 