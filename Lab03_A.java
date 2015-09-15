package lab3;
import java.util.*;
public class Lab03_A {
    
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        
        int pages;
        double price, service_charge = 3.00;
        
        System.out.print("How many pages to fax? ");
        pages = console.nextInt();
        if (pages <= 10)
        {
            price = service_charge + (pages * .2);
            System.out.printf("\nThat will cost $%.2f\n", price);
        } 
        else if(pages > 10)
        {
            price = service_charge + 2.00 + ((pages - 10) * .1);
            System.out.printf("\nThat will cost $%.2f\n", price);
        }
        
    }
    
}
