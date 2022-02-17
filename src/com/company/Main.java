package com.company;

import java.awt.print.Printable;
import java.time.Month;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your Principal: ");
        long Principal=input.nextLong();
        while(!(Principal>=1000&&Principal<=100000000))
        {
            System.out.println("Enter a number between $1K and $1M: ");
            Principal=input.nextLong();
        }
        System.out.print("Enter your Annual Interest Rate: ");
        double Annual_Interest_Rate=input.nextDouble();
        while(!(Annual_Interest_Rate>0&&Annual_Interest_Rate<=30))
        {
            System.out.println("Enter a number greater than 0 and less or equal than 30: ");
            Annual_Interest_Rate=input.nextDouble();
        }
        System.out.print("Enter your Period: ");
        int Period=input.nextInt();
        while(!(Period>=1&&Period<=100))
        {
            System.out.println("Enter a number greater than or equal 1 and less or equal than 100: ");
            Period=input.nextInt();
        }
        final byte Months_of_year=12;
        final int Percent=100;
        double Annual_to_Month=Annual_Interest_Rate/Percent/Months_of_year;
        int Real_period=Period*12;
        double Mortgage=Principal*((Annual_to_Month*Math.pow(1+Annual_to_Month,Real_period))/((Math.pow(1+Annual_to_Month,Real_period))-1));
        System.out.println("Your Mortgage is: "+Mortgage);
    }
}
