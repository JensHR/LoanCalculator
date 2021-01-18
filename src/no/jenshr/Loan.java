package no.jenshr;

import java.util.ArrayList;

public abstract class Loan {
    //Abstrakt funksjon for
    abstract ArrayList<Double> calculateMonthlyPaymentPlan();
    abstract ArrayList<Double> calculateYearlyPaymentPlan();
}
