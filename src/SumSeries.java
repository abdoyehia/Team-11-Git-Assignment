
public class SumSeries implements ISubscriber{

	@Override
	public void notifySubscriber(int input) {
		// TODO Auto-generated method stub
		
		int val= Math.abs(input)*(Math.abs(input)+1);
		
		val=val/2;
        
		System.out.println("Hello, I am a SumSeries and I am notified with " + input + " and my result is " + val);

	}
	
	
}
