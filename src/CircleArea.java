
public class CircleArea implements ISubscriber {

	@Override
	public void notifySubscriber(int input) {
		
		System.out.println("The Area of the circle = " + input*input*Math.PI);
	}

}
