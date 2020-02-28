
public class CircleCircumference implements ISubscriber {

	@Override
	public void notifySubscriber(int input) {
		
		System.out.println("The circumference of the circle = " + 2*input*Math.PI);
	}

}
