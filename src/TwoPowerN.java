public class TwoPowerN implements ISubscriber{
    private double calculate(int n){
        return Math.pow(2, n);
    }

    @Override
    public void notifySubscriber(int n) {
        double output = calculate(n);
        System.out.println("Hello, I am a 2PowerN and I am notified with " + n + " and my result is " + output);
    }
}
