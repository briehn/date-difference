package MonthDifference;

import java.util.Scanner;

public class DateDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstMonth, secondMonth;
		int firstMonthNumber = 0, secondMonthNumber = 0, firstYear, secondYear, yearDifference, monthDifference;
		
		
		//Input
		System.out.println("For the first date, \nEnter month: ");
		firstMonth = scan.next();
		System.out.println("Enter year: ");
		firstYear = scan.nextInt();
		
		switch (firstMonth.toLowerCase()) {
			case "january":
				firstMonthNumber = 1;
				break;
			case "february":
				firstMonthNumber = 2;
				break;
			case "march":
				firstMonthNumber = 3;
				break;
			case "april":
				firstMonthNumber = 4;
				break;
			case "may":
				firstMonthNumber = 5;
				break;
			case "june":
				firstMonthNumber = 6;
				break;
			case "july":
				firstMonthNumber = 7;
				break;
			case "august":
				firstMonthNumber = 8;
				break;
			case "september":
				firstMonthNumber = 9;
				break;
			case "october":
				firstMonthNumber = 10;
				break;
			case "november":
				firstMonthNumber = 11;
				break;
			case "december":
				firstMonthNumber = 12;
				break;
			default:
				break;
		}
		
		
		System.out.println("\nFor the second date, \nEnter month: ");
		secondMonth = scan.next();
		System.out.println("Enter year: ");
		secondYear = scan.nextInt();
		
		switch (secondMonth.toLowerCase()) {
			case "january":
				secondMonthNumber = 1;
				break;
			case "february":
				secondMonthNumber = 2;
				break;
			case "march":
				secondMonthNumber = 3;
				break;
			case "april":
				secondMonthNumber = 4;
				break;
			case "may":
				secondMonthNumber = 5;
				break;
			case "june":
				secondMonthNumber = 6;
				break;
			case "july":
				secondMonthNumber = 7;
				break;
			case "august":
				secondMonthNumber = 8;
				break;
			case "september":
				secondMonthNumber = 9;
				break;
			case "october":
				secondMonthNumber = 10;
				break;
			case "november":
				secondMonthNumber = 11;
				break;
			case "december":
				secondMonthNumber = 12;
				break;
			default:
				break;
		}
		
		//Processing
		// If the second year is greater than the first, subtract the first from the second. If not, do the opposite.
		yearDifference = ((secondYear > firstYear) ? (secondYear - firstYear) : (firstYear - secondYear));
		monthDifference = ((secondYear > firstYear) ? (secondMonthNumber - firstMonthNumber) : (firstMonthNumber - secondMonthNumber));
		
		if (monthDifference < 0 && yearDifference != 0) {
			yearDifference = yearDifference - 1;
			monthDifference = 12 + monthDifference;
		} else if (yearDifference == 0) {
			monthDifference = monthDifference * -1;
		}
		
		//Output
		System.out.println("\nThese dates are " + yearDifference + " year(s) and " + monthDifference + " month(s) apart.");
		scan.close();
	}

}
