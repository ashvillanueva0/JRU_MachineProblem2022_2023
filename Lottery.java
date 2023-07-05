package javafundamentals;

import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		//
		
		/*int winningNumbers []= new int [6];
		for ( i = 0; i < 6; i++) {
		    winningNumbers [i] = 1 + (int)(Math.random()*42);
		}*/
		
		int winningNumbers []= {34,23,1,7,15,25};
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
		int[] Numbers = new int[6];
	    	for ( i = 0; i < 6; i++) {
	        	System.out.print("Number " + (i + 1) + ": ");
	        	int PickNumber = sc.nextInt();
	        	
	        	if (PickNumber <1 || PickNumber > 42) {
	        		System.out.println("Invalid number. Please enter a number between 1 and 42.");
	                i--;
	                continue;
	        	}
	        	
	        	boolean isDuplicate = false;
	            for (int j = 0; j < i; j++) {
	                if (Numbers[j] == PickNumber) {
	                    System.out.println("Number already entered. Please enter a unique number.");
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (isDuplicate) {
	                i--;
	                continue;
	            	}
	            Numbers[i] = PickNumber;
	            }
	    		System.out.print("\nYour numbers: ");
	    		for (int number : Numbers) {
	            System.out.print(number + " ");
	    		}
	    		System.out.print("\n\nWinning Numbers: ");
	    		for ( i = 0; i < winningNumbers.length; i++) {
	    			System.out.print(winningNumbers[i] + " ");
	    		}

	    		int Matching = MatchedNumbers(Numbers, winningNumbers);
	    		System.out.println("\n\nYou matched " + Matching + " number(s).");

	    		switch (Matching) {
	    			case 3:
	    				System.out.println("Congratulations! You won P20.00");
	    				break;
	    			case 4:
	    				System.out.println("Congratulations! You won P1,000.00");
	    				break;
	    			case 5:
	    				System.out.println("Congratulations! You won P25,000.00");
	    				break;
	    			case 6:
	    				System.out.println("Congratulations! You won the jackpot of P9 million!");
	    				break;
	    			default:
	    				System.out.println("Better luck next time!");
	    				break;
	    		}
	    	
			}
			public static int MatchedNumbers(int[] userNum, int[] winningNumbers) {
				int count = 0;
				for (int setNumber : userNum) {
					for (int winningNumber : winningNumbers) {
						if (setNumber == winningNumber) {
							count++;
							break;
						}
					}
				}
				return count;
	    		}  
			}



