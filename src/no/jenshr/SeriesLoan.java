package no.jenshr;

import no.jenshr.Loan.Loan;

import java.util.ArrayList;

public class SeriesLoan extends Loan {

    public SeriesLoan(double interest, int amount, short paybackYears) {
        super(interest, amount, paybackYears);
    }

    public ArrayList<Double> calculateYearlyPaymentPlan(){

        return calculatePaymentPlan(getPaybackYears());
    }

    @Override
    public ArrayList<Double> calculateMonthlyPaymentPlan() {

        int paybackMonths = getPaybackYears() * 12;

        return calculatePaymentPlan(paybackMonths);
    }

    //Egen funksjon for utregning og oppdeling av betalings plan. Ettersom både årlig og månedlig regnes ut helt likt bare med forskellige tidsperspektiv kan denne brukes.
    public ArrayList<Double> calculatePaymentPlan(int paybackIntervals){
        System.out.println(paybackIntervals);
        ArrayList<Double> result = new ArrayList<>();

        int installment = getAmount() / paybackIntervals;
        int priceLeft = getAmount();

        for (int i=0; i < paybackIntervals; i++){
            double payThisYear = installment + priceLeft * getInterest();
            priceLeft -= installment;

            result.add(payThisYear);
        }

        return result;
    }


}
