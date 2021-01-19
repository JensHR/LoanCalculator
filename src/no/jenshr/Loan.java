package no.jenshr;

import java.util.ArrayList;

public abstract class Loan {
    //Abstrakt funksjoner for de to mest forespurte betalings planene.
    abstract ArrayList<Double> calculateMonthlyPaymentPlan();
    abstract ArrayList<Double> calculateYearlyPaymentPlan();
}
