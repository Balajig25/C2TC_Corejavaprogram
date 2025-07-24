package Assignmentday3;
	import java.util.Scanner;
	// Student class with default constructor
	class Student {
		public Student() {
			System.out.println("✅ Student object is created.\n");
		}
	}
	// Commission class to store employee details and calculate commission
	public class Commission {
		// Data members
		String name, address, phone;
		double salesAmount;
		// Method to accept employee details
		public void acceptDetails() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Sales Employee Details:");
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Address: ");
			address = sc.nextLine();
			System.out.print("Phone: ");
			phone = sc.nextLine();
			System.out.print("Sales Amount: ₹");
			salesAmount = sc.nextDouble();
		}
		// Method to calculate commission
		public void calculateCommission() {
			double commission;
			if (salesAmount >= 100000) {
				commission = salesAmount * 0.10;
			} else if (salesAmount >= 50000) {
				commission = salesAmount * 0.05;
			} else if (salesAmount >= 30000) {
				commission = salesAmount * 0.03;
			} else {
				commission = 0;
			}
			System.out.println("\n🧾 Commission Summary:");
			System.out.println("Name: " + name);
			System.out.println("Sales Amount: ₹" + salesAmount);
			if (commission > 0)
				System.out.println("Commission: ₹" + commission);
			else
				System.out.println("Commission: No commission (Sales < ₹30000)");
		}
	}