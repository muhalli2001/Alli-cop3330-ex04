package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner noun = new Scanner(System.in);
        System.out.println("Enter noun:");
        String Noun = noun.nextLine();

        Scanner verb = new Scanner(System.in);
        System.out.println("Enter verb");
        String Verb = verb.nextLine();

        Scanner adj = new Scanner(System.in);
        System.out.println("Enter adjective:");
        String Adj = adj.nextLine();

        Scanner adv = new Scanner(System.in);
        System.out.println("Enter adverb:");
        String Adv = adv.nextLine();

        System.out.println("Do you "+ Verb + " your " + Adj + Noun + Adv +" ? " + "That's hilarous !");


    }
}