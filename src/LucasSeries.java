// i added this comment just for any change to register ID
public class LucasSeries implements ISubscriber {
    public int culc_lucas(int n) {
        int x = 2, y = 1, result = 0;
        if (n == 0)
            System.out.println(2);
        else if (n == 1)
            System.out.println(1);
        else {
            for (int i = 2; i <= n; i++) {
                result = x + y;
                x = y;
                y = result;
            }
            return result;
        }
        return 0;
    }
    @Override
    public void notifySubscriber(int input){
        System.out.println("\nHello, I am Lucas Series and I am notified with " + input+ " , the result : " + culc_lucas(input));
    }

}
