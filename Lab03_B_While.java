package lab03_b_while.java;
import java.util.*;

public class Lab03_B_While {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
       
        int num1, num2, even_sum = 0, hold;
        
        System.out.print("Input the first number: ");
        num1 = console.nextInt();
        System.out.print("\nInput the second number: ");
        num2 = console.nextInt();
        hold = num1;
        
        System.out.printf("All odd numbers between %d and %d inclusive",
                    num1, num2);
            System.out.println();
            
        while(num1 <= num2)
        {
            if(num1 % 2 > 0)
            {
                System.out.println(num1);
            }
            else if (num1 % 2 == 0)
            {
                even_sum += num1;
            }
            num1++;
        }
        
        System.out.printf("Sum of all even numbers between %d and %d inclusive",
                    hold, num2);
        System.out.println("\n" + even_sum);
       
       
    }
    
}
