package no.jenshr;

import java.util.ArrayList;

public abstract class Loan implements PaymentPlan{

    private double Interest;
    private int Amount;
    private short PaybackYears;

    public Loan(double interest, int amount, short paybackYears) {
        Interest = interest;
        Amount = amount;
        PaybackYears = paybackYears;
    }

    public Loan(int amount, short paybackYears) {
        Amount = amount;
        PaybackYears = paybackYears;
    }

    public Loan() {
    }

    public double getInterest() {
        return Interest;
    }

    public void setInterest(double interest) {
        Interest = interest;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public short getPaybackYears() {
        return PaybackYears;
    }

    public void setPaybackYears(short paybackYears) {
        PaybackYears = paybackYears;
    }
}
