import java.util.*;
public class ParkingLot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int capacity=0;
        int maxCapacity=6;
        int javaab=-1;
        while (javaab!=4) 
        {
            System.out.println("\nWelcome to Park your Car");
            System.out.println("Choose your options:");
            System.out.println("1) Current Capacity");
            System.out.println("2) Park my car");
            System.out.println("3) Take my car");
            System.out.println("4) Exit");
            javaab = sc.nextInt();
            switch(javaab) 
            {
                case 1:
                    System.out.println("Current Capacity is: "+ capacity+" / "+ maxCapacity);
                    break;
                case 2:
                    if(capacity < maxCapacity) 
                    {
                        capacity++;
                        System.out.println("Car parked successfully. Total cars now: " + capacity);
                    } 
                    else 
                    {
                        System.out.println("Parking Lot Full!");
                    }
                    break;
                case 3:
                    if(capacity>0) 
                    {
                        capacity--;
                        System.out.println("Car taken out successfully. Total cars now: " + capacity);
                    } 
                    else
                    {
                        System.out.println("Parking Lot is empty!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}