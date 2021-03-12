
public class CreditPaymentService {
    public int calculate(int loanAmount, int timeCredit, double interestRatePerYear) {
        double interestRate = interestRatePerYear / 100 / 12;
        double oper = Math.pow((1 + interestRate), timeCredit);
        int annuityPlantage = (int) (loanAmount * ((interestRate * oper) / (oper - 1)));
        return annuityPlantage;

    }
}
// оставил возможность менять процентную ставку.