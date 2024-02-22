package application;
import java.util.Locale;
import java.util.Scanner;
import entities.employer;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		employer x = new employer();

		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employer : " + x);
		System.out.println();
		System.out.println("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + x);

		sc.close();
	}

}
