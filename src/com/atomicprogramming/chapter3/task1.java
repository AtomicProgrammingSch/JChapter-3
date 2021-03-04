package com.atomicprogramming.chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static boolean another() {
        Scanner scanner = new Scanner(System.in);
        String reply;
        while (true) {
            System.out.println("Do you have another favourite quotation? (y/n)");
            reply = scanner.nextLine();
            if (reply.equals("y")) {
                return true;
            } else if (reply.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid response!");
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> quotations = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String quote;
        boolean another;
        do {
            System.out.println("Please enter one of your favourite quotations:");
            quote = scanner.nextLine();
            quotations.add(quote);
            another = another();
        } while (another);
        String quotes = "Your favourite quotations are:\n";
        for (String quotation : quotations) {
            assert false;
            quotes += quotation + "\n";
        }
        System.out.println(quotes);
    }
}
