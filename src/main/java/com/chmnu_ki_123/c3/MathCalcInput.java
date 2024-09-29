package com.chmnu_ki_123.c3;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class MathCalcInput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            double x, a, b, c;

            System.out.print("Enter the value of x: ");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for x (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of a: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for a (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of b: ");
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for b (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of c: ");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for c (use a dot as the decimal separator)!");
                return;
            }

            double expAxB = exp(a * x - b);
            double log10AbsXC = log10(abs(x - c));

            if (log10AbsXC == 0) {
                System.err.println("Logarithm is undefined for the given values!");
                return;
            }

            double result = expAxB / log10AbsXC;

            System.out.printf("Result: %.5f\n", result);
        }
    }
}