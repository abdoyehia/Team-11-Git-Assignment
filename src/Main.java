import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
			new sphereAreae(),
			new Multiplicationseriess(),
			new CircleCircumference(),
			new LucasSeries(),
			new TwoPowerN(),
			new SphereCircumference(),
			new SumSeries(),
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		System.out.print("Enter num: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("1-Execute All");
		System.out.println("2-Execute Specific Subscriber");
		System.out.print("Enter choice: ");
		int choice=sc.nextInt();
		if(choice==1) {
			mathTopic.dispatchEvent(input);
		}
		if(choice==2) {
		System.out.println("2- sphereAreae");
		System.out.println("3- Multiplicationseriess");
		System.out.println("4- CircleCircumference");
		System.out.println("5- LucasSeries");
		System.out.println("6- TwoPowerN");
		System.out.println("7- SphereCircumference");
		System.out.println("8- SumSeries");
		System.out.print("Enter choice: ");
		int choice1=sc.nextInt();
		mathTopic.dispatchEvent2(input,choice1);
		}
	}
}
