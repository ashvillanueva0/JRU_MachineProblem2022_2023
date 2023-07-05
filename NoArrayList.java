package javafundamentals;

import java.util.Scanner;

public class NoArrayList {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers");
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = sc.nextInt();
        }
        while (true) {
        System.out.println("\tNavigation Menu:");
        System.out.println("A. Display the numbers.");
        System.out.println("B. Display the values of even indexes.");
        System.out.println("C. Display the values of odd indexes.");
        System.out.println("D. Display the values in ascending order.");
        System.out.println("E. Display the values in descending order.");
        System.out.println("Q. Quit");

        System.out.print("Enter your choice: ");
        String choice = sc.next();

        switch (choice.toUpperCase()) {
            case "A":
            	System.out.print("Number: ");
                displayNumbers(numbers);
                break;
            case "B":
            	System.out.print("Even Number: ");
                displayEvenIndexes(numbers);
                break;
            case "C":
            	System.out.print("Odd Numbers: ");
                displayOddIndexes(numbers);
                break;
            case "D":
            	System.out.print("Ascending Order: ");
                displayAscendingOrder(numbers);
                break;
            case "E":
            	System.out.print("Descending order: ");
                displayDescendingOrder(numbers);
                break;
            case "Q":
            	sc.close();
            	System.exit(0);
            default:
                System.out.println("Invalid choice!"); 
        	}
        System.out.println();
        }
    }
    /* A. Display All Insert Number */
    public static void displayNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    /* B. Even Numbers */
    public static void displayEvenIndexes(int[] numbers) {
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    /* C. Odd Numbers */
    public static void displayOddIndexes(int[] numbers) {
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    /* D. Ascending Numbers */
    public static void displayAscendingOrder(int[] numbers) {
    	for (int i = 0; i < numbers.length -1 ; i++) 
    	{
            for (int j = 0; j < numbers.length - i - 1; j++) 
            {
                if (numbers[j] > numbers[j + 1]) 
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
    	}
    	displayNumbers(numbers);
    }
    /* E. Descending Numbers */
    private static void displayDescendingOrder(int[] numbers) 
    {
    	for (int i = 0; i < numbers.length - 1; i++) 
    	{
            for (int j = 0; j < numbers.length - i - 1; j++) 
            {
                if (numbers[j] < numbers[j + 1]) 
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
    	}
    	displayNumbers(numbers);
    }
}
