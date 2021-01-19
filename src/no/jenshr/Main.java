package no.jenshr;

import no.jenshr.Loan.Loan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){

        //Lånets renter
        double interest = 0.035;
        //Størrelsen på lånet, skal mottas av brukerinput
        int loanAmount;
        //Hvor mange år som skal brukes til å nedbetale lånet, skal mottas av brukerinput
        short paybackTimeYears;

        //Lagrer verdier hentet fra bruker
        int[] requestedValues = requestVariables(args);
        loanAmount = (int) requestedValues[0];
        paybackTimeYears = (short) requestedValues[1];


        //Lager en instanse av SeriesLoan klassen med verdiene vi hentet fra bruker.
        Loan loan = new SeriesLoan(interest, loanAmount, paybackTimeYears);
        //Printer lån instansen sine verdier for totalsum (lån) antall (år) og renter.
        System.out.println(loan.toString());
        //Printer ArrayListen vi får som resultat fra calculateYearlyPaymentPlan() altså hvor mye som må betales hvert år.
        System.out.println(loan.calculateYearlyPaymentPlan());
        //Printer ArrayListen vi får som resultat fra calculateMonthlyPaymentPlan() altså hvor mye som må betales hver måned.
        System.out.println(loan.calculateMonthlyPaymentPlan());
    }

    public static int[] requestVariables(String[] args){

        int[] requestedValues;

        try{
            //Forsøker å hente verdier fra program argumenter. Denne ble laget for mer effektiv testing.
            requestedValues = new int[]{Integer.parseInt(args[0]), Short.parseShort(args[1])};

        }catch (ArrayIndexOutOfBoundsException aioobE) {
            System.out.println("Missing arguments");

            //Henter verdier fra konsoll
            requestedValues = requestVariablesFromConsole();

        }
        return requestedValues;
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