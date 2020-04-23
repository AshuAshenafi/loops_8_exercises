import java.util.Scanner;

public class Q5NumberList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.print("Enter number: ");
        input = keyboard.nextInt();
        if(input < 0){
            System.out.printf("Numbers from %d to 1 are: ", input);
            for(int i = input; i <= 1; i++){
                System.out.print(i + " ");
            }
        }
        else{
            System.out.printf("Numbers from 1 to %d are: ", input);
            for(int i = 1; i <= input; i++){
                System.out.print(i + " ");
            }
        }
        keyboard.close();
    }
}
