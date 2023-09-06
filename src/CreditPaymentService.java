public class CreditPaymentService {
    public int calculate (int a, int b) {

        double c = 1.008325;
        double d = Math.pow (c,b);

        double x = d - 1;
        double e = 0.008325 / x;

        double f = 0.008325 + e;

        double result = f * a;

        return (int) result;
    }
}
