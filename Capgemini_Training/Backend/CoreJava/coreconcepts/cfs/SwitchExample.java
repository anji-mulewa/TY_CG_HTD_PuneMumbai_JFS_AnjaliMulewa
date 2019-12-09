package com.capgemini.coreconcepts.cfs;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dayNumber = 10;

		switch (dayNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default: // default statement can be used anywhere but we have to use break
			System.out.println("Invalid");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		}
		switch (dayNumber = 7) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekdays");
			break;
		case 6:
		case 7:
			System.out.println("Weekends");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
