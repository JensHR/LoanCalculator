package no.jenshr.Loan;

import no.jenshr.Loan.Loan;

import java.util.ArrayList;

public class AnnuityLoan extends Loan {

    public AnnuityLoan(double interest, int amount, short paybackYears) {
        super(interest, amount, paybackYears);
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
