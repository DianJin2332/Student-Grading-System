package tut1212;
import java.util.Scanner;

public class Java1212 {

	public static void main(String[] args) {
		
		Scanner b = new Scanner (System.in);
		
		System.out.println("Enter the number of rows you want:（The number should be odd)");
		int h = b.nextInt();
		
		if (h%2==0) {
			System.out.println("Please enter an odd number");
			h =b. nextInt();
			}while(h%2==0);
			
		int count = h/2+1;
		
		 for (int i = 1; i <= count; i++) {
	            // Print spaces
	            for (int j = 1; j <= count - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

		 for (int i = count-1; i >= 0; i--) {
	            // Print spaces
	            for (int j = 1; j <= count - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		 
		
		b.close();
					
		}			

	}
