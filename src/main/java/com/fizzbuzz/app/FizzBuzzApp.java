package com.fizzbuzz.app;

import com.fizzbuzz.exception.FizzBuzzInvalidInputException;
import com.fizzbuzz.generator.FizzBuzzStringGenerator;
import com.fizzbuzz.generator.IFizzBuzzStringGenerator;

import java.util.Scanner;
/*
 * Ceci est une simple simulation d'un client(IHM) qui va consommer le service
 * fournit par l'API
 */
public class FizzBuzzApp {

    public static void main(String[] args) {
        IFizzBuzzStringGenerator generator = new FizzBuzzStringGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int start = getNumber(scanner) ;
        System.out.print("Enter end number : ");
        int end = getNumber(scanner) ;

        try {
            System.out.println(generator.generate(start,end));
        } catch (FizzBuzzInvalidInputException e) {
            e.printStackTrace();
        }

    }

    private static int getNumber(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.print("You must enter a number, Try again: ");
            }
        }
    }
}
