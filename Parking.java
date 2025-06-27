import java.util.Scanner;

public class Parking {
    static int avaiableCount = 6;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        


        while(avaiableCount!=0){
            System.out.print("If you want to park the car then write \'P\' and \'U\' for unpark : ");
            String str = sc.next();
            if(str.equals("P") || str.equals("p") ){
                parking(avaiableCount);
                System.out.println("Available slot : "+ avaiableCount);
            }
            else if(str.equals("U")  || str.equals("u") ){
                unparking(avaiableCount);
                System.out.println("Available slot : "+ avaiableCount);
            }else{
                System.out.println("Wrong Input");
            }
        }

        sc.close();

    }
    public static void parking(int count){
        avaiableCount--;
        
    }
    
    public static void unparking(int count){
        avaiableCount++;

    }
}
