package lab03_b_for.java;
import java.util.*;

public class Lab03_B_For {
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int num1, num2, even_sum = 0;
        
        System.out.print("Input the first number: ");
        num1 = console.nextInt();
        System.out.print("\nInput the second number: ");
        num2 = console.nextInt();
        
        System.out.printf("All odd numbers between %d and %d inclusive",
                    num1, num2);
        System.out.println();
        
        for(int count = num1; count <= num2; count++)
        {
            if(count % 2 > 0)
            {
                System.out.println(count);
            }
            else if (count % 2 == 0)
            {
                even_sum += count;
            }
            
        }
                  
        System.out.printf("Sum of all even numbers between %d and %d inclusive",
                    num1, num2);
        System.out.println("\n" + even_sum);
    }
    
}
