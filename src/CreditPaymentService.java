public class CreditPaymentService {
    public int calculate(int money, int months) {

        double percent = 9.99;
        double rate = percent / 100 / 12;

        double index = rate + 1;
        double calcOne = Math.pow(index, months);

        double calcTwo = calcOne - 1;
        double calcThree = rate / calcTwo;

        double calcFour = rate + calcThree;

        double result = calcFour * money;

        return (int) result;
    }
}
