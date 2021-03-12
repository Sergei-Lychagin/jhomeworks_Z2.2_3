public class Main {
    public static void main(String[] args) throws Exception {
        CreditPaymentService service = new CreditPaymentService();
        int annuityPlantage = service.calculate(1000000, 12, 9.99);
        System.out.println("Credit amount 1000000p" + " " + "Credit term 1 years" + " " + "Percentage rate 9.99%" + " "
                + "Monthly payment" + " " + annuityPlantage);
    }
}
