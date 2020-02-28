public class Multiplicationseriess implements ISubscriber {
    public int m(int n){
     int result =1;
     for(int i=1; i<=n ; i++){
         result=result*i;
     }
    return result ;
    }
   @Override
	public void notifySubscriber(int input) {
      System.out.print("Hello,I am a multiplication series and  I am notified with"+input);
      System.out.print( "and my result is : " + m(input));
      
      
      
  }
    
}
