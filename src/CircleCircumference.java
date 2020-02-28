
public class CircleCircumference implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		int radius = Integer.parseInt(input);
		System.out.println("The circumference of the circle = " + 2*radius*Math.PI);
	}

}
