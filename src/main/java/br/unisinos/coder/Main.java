package br.unisinos.coder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Select the desired operation:");
        System.out.println("1. Encode file");
        System.out.println("2. Decode file");

        int selectedOperation = userInput.nextInt();

        System.out.println("Select the encoding/decoding strategy:");
        System.out.println("1. Golomb");
        System.out.println("2. Elias-Gamma");
        System.out.println("3. Fibonacci");
        System.out.println("4. Unary");
        System.out.println("5. Delta");

        int selectedStrategy = userInput.nextInt();

        if (selectedOperation == 1) {

        } else if (selectedOperation == 2) {

        }
    }
}
