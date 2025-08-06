package mypackage.java;


		import java.util.Scanner;

		public class StudentMarks {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int[] marks = new int[6];
		        int total = 0;

		        System.out.println("Enter marks for 6 subjects:");
		        for (int i = 0; i < 6; i++) {
		            System.out.print("Subject " + (i + 1) + ": ");
		            marks[i] = scanner.nextInt();
		            total += marks[i];
		        }

		        double average = total / 6.00;

		        System.out.println("\nSubject Marks:");
		        for (int i = 0; i < 6; i++) {
		            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
		        }

		        System.out.println("Total: " + total);
		        System.out.println("Average: " + average);

		        scanner.close();
		    }
		


	}


