import java.util.Scanner;

public class Q7SumOfUpto {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int input;
        int sum = 0;

        System.out.print("Enter number: ");
        input = keyboard.nextInt();
        if(input < 0){
            System.out.printf("Sum of Integers from %d to 1 are: ", input);
            for(int i = input; i <= 1; i++){
                sum += i;
            }
                System.out.print(sum);
        }
        else{
            System.out.printf("Sum of Integers from 1 to %d is: ", input);
            for(int i = 1; i <= input; i++){
                sum += i;
            }
                System.out.print(sum);
        }
        keyboard.close();
    }
}
