public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditOne = service.calculate(1000000,12);
        System.out.println(creditOne);

        int creditTwo = service.calculate(1000000,24);
        System.out.println(creditTwo);

        int creditThree = service.calculate(1000000,36);
        System.out.println(creditThree);
    }
}