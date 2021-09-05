/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt user for the first number
    save number input into 'firstNumber'
Prompt user for the second number
    save number input into 'secondNumber'
Add the two inputs and save it into 'addition'
subtract the two inputs and save it into 'subtraction'
multiply the two inputs and save it into 'multiplication'
divide the two inputs and save it into 'division'
Print "<firstNumber> + <secondNumber> = <addition>
       <firstNumber> - <secondNumber> = <subtraction>
       <firstNumber> * <secondNumber> = <multiplication>
       <firstNumber> / <secondNumber> = <division>
 */
public class Solution05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is the first number? ");
        int firstNumber = input.nextInt();
        System.out.printf("What is the second number? ");
        int secondNumber = input.nextInt();
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d",
                firstNumber, secondNumber, addition,
                firstNumber, secondNumber, subtraction,
                firstNumber, secondNumber, multiplication,
                firstNumber, secondNumber, division);
    }
}
