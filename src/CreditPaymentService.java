public class CreditPaymentService {
    public int calculate (int money, int months) {

        double index = 0.008325 + 1;
        double calcOne = Math.pow (index,months);

        double calcTwo = calcOne - 1;
        double calcThree = 0.008325 / calcTwo;

        double calcFour = 0.008325 + calcThree;

        double result = calcFour * money;

        return (int) result;
    }
}
