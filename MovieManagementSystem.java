package level1;
import java.util.*;


public class MovieManagementSystem {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of tickets: ");
		int tickets=sc.nextInt();
		
		int max=10;
		int price;
		int totalprice=0;
		
		if(tickets>10) {
			System.out.println("Invalid input,The total no of seats are 10 only");
		}
	
		else {
			
			System.out.println("Enter 1 for Gold tickets ");
			System.out.println("Enter 2 for Silver Tickets");
			System.out.println("Enter 3 for Platinum Tikcets");
//			System.out.println("Enter 4 for Checking Balance");
//			System.out.println("Enter 5 for vacant Seats");
		
			
		for(int i=1;i<=tickets;i++) {
		
		//For Seats
		System.out.println("Enter the input:");
		int input=sc.nextInt();
		if(input==1) {
			 price=300*tickets;
			 totalprice+=price;
			
		}
		else if(input==2) {
			price=200*tickets;
			totalprice+=price;
		}
		else if(input==3) {
			price=500*tickets;
			totalprice+=price;
		}
		else {
			System.out.print("Invalid Input,Enter a valid Input");
		}
		
		}
		System.out.println("The total price of tickets is: " +totalprice);
		int leftticket=max-tickets;
		System.out.println("The no of seats available after booking: " +leftticket);

		}
		
	
	}

}
