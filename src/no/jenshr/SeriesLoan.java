package no.jenshr;

import java.util.ArrayList;

public class SeriesLoan extends Loan{
    private double Interest = 0.035;
    private int Amount;
    private short PaybackYears;

    public SeriesLoan(int amount, short paybackYears) {
        super(amount, paybackYears);
    }

    public ArrayList<Double> calculateYearlyPaymentPlan(){

        return calculatePaymentPlan(PaybackYears);
    }

    @Override
    public ArrayList<Double> calculateMonthlyPaymentPlan() {

        int paybackMonths = PaybackYears * 12;

        return calculatePaymentPlan(paybackMonths);
    }

    //Egen funksjon for utregning og oppdeling av betalings plan. Ettersom både årlig og månedlig regnes ut helt likt bare med forskellige tidsperspektiv kan denne brukes.
    public ArrayList<Double> calculatePaymentPlan(int paybackIntervals){
        ArrayList<Double> result = new ArrayList<>();

        int installment = Amount / paybackIntervals;
        int priceLeft = Amount;

        //Kunne vært intressant
        int payedTotal = 0;

        for (int i=0; i < paybackIntervals; i++){
            double payThisYear = installment + priceLeft * Interest;
            priceLeft -= installment;
            payedTotal += payThisYear;

            result.add(payThisYear);
        }

        return result;
    }
}
