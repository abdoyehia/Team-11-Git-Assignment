
public class CircleCircumference implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		double radius =  Double.parseDouble(input);
		System.out.println("The circumference of the circle = " + 2*radius*Math.PI);
	}

}
