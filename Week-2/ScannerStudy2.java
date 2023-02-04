import java.util.Scanner;

public class ScannerStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your First Name : ");
		String firstName = sc.nextLine();
		System.out.print("Please enter your Last Name : ");
		String lastName = sc.nextLine();
		System.out.print("Please enter your Profession : ");
		String profession = sc.nextLine();
		System.out.print("Please enter your Address : ");
		String address = sc.nextLine();
		System.out.print("Please enter your House number : ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("Please enter your average Percentage : ");
		float percentage = Float.parseFloat(sc.nextLine());
		
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Profession : " + profession);
		System.out.println("Address : " + address);
		System.out.println("House number : " + number);
		System.out.println("Percentage : " + percentage);



	}

}
