
public class ReallySimpleSubscriber implements ISubscriber {
	@Override
	public void notifySubscriber(int input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am really a simple subscriber and I am notified with " + input);
	}
}
