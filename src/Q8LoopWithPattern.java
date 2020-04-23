public class Q8LoopWithPattern {
    public static void main(String[] args) {
        // first one
        System.out.println("Exercise 8(i): ");
        for(int i = 0; i < 4 ; i++){

            for(int j = 0 ; j < 10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // second one
        System.out.println("Exercise 8(ii): ");
        for(int i = 0; i < 5 ; i++){

            for(int j = 0 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        // third one
        System.out.println("Exercise 8(iii): ");
        for(int i = 0; i < 5 ; i++){

            for(int j = 2*(5-i) ; j >=0; j--){

                System.out.print(" ");
            }
            for(int k =0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
