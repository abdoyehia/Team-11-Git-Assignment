
public class SphereCircumference implements ISubscriber{
	public double circumference(int r)
	{
		double sphereCirc = Math.PI * 2 * r;
		return sphereCirc;
	}
	
	public void notifySubscriber(int input) {
      System.out.print( "The sphere circumference = : " + circumference(input));

  }

}
