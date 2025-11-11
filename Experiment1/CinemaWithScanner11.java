package Experiment1;
import java.util.Scanner;
public class CinemaWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audiance = new String[4][2]; 
        int row, coloum;
        String name, next;
        while (true) {
            System.out.println("Enter a name: ");
            name = sc.nextLine();
            System.out.println("Enter Row number: ");
            row = sc.nextInt();
            System.out.println("Enter Coloum number: ");
            coloum = sc.nextInt();
            sc.nextLine();

            audiance[row-1][coloum-1]= name ;
            System.out.print("are there any other audiences to be added? (y/n): ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        sc.close();
    }
}
