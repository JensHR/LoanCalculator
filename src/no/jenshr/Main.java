package no.jenshr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){

        int loanAmount = 0;
        short paybackTimeYears = 0;

        try{
            //Forsøker å hente verdier fra program argumenter
            loanAmount = Integer.parseInt(args[0]);
            paybackTimeYears = Short.parseShort(args[1]);

        }catch (ArrayIndexOutOfBoundsException aioobE) {
            System.out.println("Missing arguments");

            //Henter verdier fra konsoll
            int[] requestedValues = requestVariablesFromConsole();

            loanAmount = (int) requestedValues[0];
            paybackTimeYears = (short) requestedValues[1];
        }

        //Lager en instanse av SeriesLoan klassen med verdiene vi hentet fra bruker.
        Loan loan = new SeriesLoan(loanAmount, paybackTimeYears);
        //Printer lån instansen sine verdier for totalsum (lån) antall (år) og renter.
        System.out.println(loan.toString());
        //Printer ArrayListen vi får som resultat fra calculateYearlyPaymentPlan() altså hvor mye som må betales hvert år.
        System.out.println(loan.calculateYearlyPaymentPlan());
        //Printer ArrayListen vi får som resultat fra calculateMonthlyPaymentPlan() altså hvor mye som må betales hver måned.
        System.out.println(loan.calculateMonthlyPaymentPlan());
    }

    public static int[] requestVariablesFromConsole(){
        int loanAmount = 0;
        int paybackTimeYears = 0;

        try {
            System.out.println("Enter requested loan amount: ");
            loanAmount = getLoanAmount();
            System.out.println("Enter requested payback time in years: ");
            paybackTimeYears = getPaybackTimeYears();

        }catch (IOException ioE){
            System.out.println("IOE requesting variables from console");
            ioE.printStackTrace();
        }

        return new int[]{loanAmount, paybackTimeYears};
    }

    public static int getLoanAmount() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String loanAmount = reader.readLine();
        return Integer.parseInt(loanAmount);
    }

    public static int getPaybackTimeYears() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String loanAmount = reader.readLine();
        return Integer.parseInt(loanAmount);
    }
}