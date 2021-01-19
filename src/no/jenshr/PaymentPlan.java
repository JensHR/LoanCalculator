package no.jenshr;

import java.util.ArrayList;

public interface PaymentPlan {

    //Abstrakte funksjoner for de to mest forespurte betalings planene.
    ArrayList<Double> calculateMonthlyPaymentPlan();
    ArrayList<Double> calculateYearlyPaymentPlan();
}
