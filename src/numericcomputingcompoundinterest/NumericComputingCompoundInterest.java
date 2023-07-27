/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericcomputingcompoundinterest;

import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public class NumericComputingCompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your amount of money: ");
        double amount = sc.nextDouble();

        System.out.println("Please enter your interest rate: ");
        double InterestRate = sc.nextDouble();

        System.out.println("Please enter 1 for per annum or 2 for per month or 3 for per day ");
        int choice = sc.nextInt();

        System.out.println("Please enter your compunding frequency: ");
        double ConpoundingFrequency = sc.nextDouble();

        System.out.println("Enter the time in year, month or day?");
        double time = sc.nextDouble();

        System.out.println("Enter 1 for Present Value or 2 for Future Value");
        int ChoiceForVal = sc.nextInt();

        String valueType;
        if (ChoiceForVal == 1) {
            valueType = "Present";
        } else {
            valueType = "Future";
        }

        switch (choice) {

            case 1:
                System.out.println("Your " + valueType + " Value in per annum");
                break;
            case 2:
                System.out.println("Your " + valueType + " value in per month");
                break;
            default:
                System.out.println("Your " + valueType + " value in per day");
                break;

        }

        if (ChoiceForVal == 1) {
            switch (choice) {
                case 1:
                    System.out.println(amount * Math.pow( 1 +InterestRate / 100, time) / ConpoundingFrequency);
                    break;
                case 2:
                    System.out.println(amount * Math.pow( 1 +InterestRate / 100, time) / 12);
                    break;
                default:
                    System.out.println(amount * Math.pow( 1 +InterestRate / 100, time) / 365);
                    break;
            }
        }
        if (ChoiceForVal == 2) {
            switch (choice) {
                case 1:
                    System.out.println(amount / Math.pow( 1 +InterestRate / 100, time) / ConpoundingFrequency);
                    break;
                case 2:
                    System.out.println(amount / Math.pow( 1 +InterestRate / 100, time) / 12);
                    break;
                default:
                    System.out.println(amount / Math.pow(1 + InterestRate / 100, time) / 365);
                    break;
            }
        }

    }
}
