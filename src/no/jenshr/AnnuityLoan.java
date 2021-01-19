package no.jenshr;

import java.util.ArrayList;

public class AnnuityLoan extends Loan{

    private double Interest = 0.05;
    private int Amount;
    private short PaybackYears;

    public AnnuityLoan(int amount, short paybackYears) {
        super(amount, paybackYears);
    }

    @Override
    public ArrayList<Double> calculateMonthlyPaymentPlan() {
        return null;
    }

    @Override
    public ArrayList<Double> calculateYearlyPaymentPlan() {

        return null;
    }

}
