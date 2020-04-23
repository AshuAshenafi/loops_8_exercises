public class Q3OddNumbers {
    public static void main(String[] args) {
        System.out.print("List of Odd numbers from 1 to 20 are: ");
        for(int i = 1; i < 21; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
