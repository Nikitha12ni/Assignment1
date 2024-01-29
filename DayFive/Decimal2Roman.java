package DayFive;

import java.util.Scanner;

public class Decimal2Roman {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the decimal ");
		 int decimalNumber = sc.nextInt();
      String romanNumeral = decimalToRoman(decimalNumber);
	        System.out.println("Decimal: " + decimalNumber);
	        System.out.println("Roman: " + romanNumeral );
	}
	      private static String decimalToRoman(int number) {
	        if (number <= 0 || number > 3999) {
	            return "Invalid input for Roman numeral conversion.";
	        }
	        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        StringBuilder romanNumeral = new StringBuilder();
	        for (int i = 0; i < decimalValues.length; i++) {
	            while (number >= decimalValues[i]) {
	                romanNumeral.append(romanSymbols[i]);
	                number -= decimalValues[i];
	            }
	        }

	        return romanNumeral.toString();
	}

} 
