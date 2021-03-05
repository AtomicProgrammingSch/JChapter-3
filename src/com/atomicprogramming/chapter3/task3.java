package com.atomicprogramming.chapter3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class task3 {

    private final Scanner scanner = new Scanner(System.in);

    private boolean another() {
        String reply;
        System.out.println("Would you like to enter another number? (y/n)");
        while (true) {
            reply = scanner.nextLine();
            if (reply.equalsIgnoreCase("y")) {
                return true;
            } else if (reply.equalsIgnoreCase("n")) {
                return false;
            }
        }
    }

    public List<Double> GetValues() throws InputMismatchException {
        List<Double> numbers = new ArrayList<>();
        boolean another = true;
        double num;
        while (another) {
            System.out.println("Please enter a number:");
            num = scanner.nextDouble();
            another = another();
            numbers.add(num);
        }
        return numbers;
    }

    public static void main(String[] args) {
        task3 task = new task3();
        List<Double> numbers = task.GetValues();
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        System.out.println("The sum of the numbers you entered is " + total);
    }
}
