import java.util.Scanner;

public class ScannerStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Name : ");
		String firstName = sc.next();
		String lastName = sc.next();
		System.out.println("Please enter your Profession : ");
		String profession = sc.next();
		System.out.println("Please enter your Address : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Please enter your House number : ");
		int number = sc.nextInt();
		
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Profession : " + profession);
		System.out.println("Address : " + address);
		System.out.println("House number : " + number);



	}

}
