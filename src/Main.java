import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
			new sphereAreae(),
			new Multiplicationseriess(),
		        new Fibonacci(),
			new CircleCircumference(),
			new LucasSeries(),
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		mathTopic.dispatchEvent(input);
	}
}
