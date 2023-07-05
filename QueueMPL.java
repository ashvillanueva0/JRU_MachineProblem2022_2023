package javafundamentals;

import java.util.Scanner;

public class QueueMPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        boolean done = false;
        while (!done) {
            System.out.println("\nThe word is: " + word);
            System.out.println("E/e Enqueue a letter");
            System.out.println("D/d Dequeue a letter");
            System.out.println("Q/q Quit");
            
            System.out.print("\nChoose an option: ");
            String input = sc.nextLine();
            
            try {
                switch (input.toUpperCase()){
                    case "E":
                        System.out.print("\nEnter a letter to enqueue: ");
                        String letter = sc.nextLine();
                        	if (letter.length() > 0) {
                        		word += letter.charAt(0);
                        	}
                        	break;
                    case "D":
                        if (word.length() > 0) {
                            word = word.substring(1, word.length());
                        }
                        break;
                    case "Q":
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid input. Please enter a letter.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}