import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Q8Factorial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int input;
        int fact = 1;
        int limit = 20;

        System.out.print("\nEnter an integer number: ");
        input = keyboard.nextInt();

        if(input < 0){
            System.out.printf("Invalid input.");
            }
        else if(input == 0){
            System.out.printf("Factorial (%d!) = 1", input);
        }
        else if(input < 20){
            System.out.printf("Factorial (%d!) = ", input);
            for(int i = input; i >= 1; i--){
                System.out.print(i);
                if(i > 1){
                    System.out.print(" x ");
                }
                fact *= i;
            }
            System.out.printf(" = %d", fact);

        }
        else{
            System.out.printf("Factorial (%d!) is too big for the machine.", input);
        }
        keyboard.close();
    }
}
