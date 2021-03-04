package com.atomicprogramming.chapter3;

import java.util.ArrayList;
import java.util.List;
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
        List<String> quotations = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String quote;
        boolean another;
        do {
            System.out.println("Please enter one of your favourite quotations:");
            quote = scanner.nextLine();
            quotations.add(quote);
            another = another();
        } while (another);
        StringBuilder quotes = new StringBuilder();
        quotes.append("Your favourite quotes are:\n");
        int index = 1;
        for (String quotation : quotations) {
            quotes.append(index).append(") ").append(quotation).append("\n");
            index++;
        }
        System.out.println(quotes);
    }
}
