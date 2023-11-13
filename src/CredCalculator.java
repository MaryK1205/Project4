public class CredCalculator {
    public double calculate(int sumKred, double rateYear, int numYear) {
        double rateMonth = rateYear / 100 / 12;
        double constant = Math.pow((1 + rateMonth), (numYear * 12));
        double payment = sumKred * (rateMonth * constant) / (constant - 1);
        return (int) payment;

    }
}
