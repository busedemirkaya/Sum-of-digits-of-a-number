import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int numberCounter;
        int result = 0;
        while (number !=0) {
            numberCounter = number %10;
            number /= 10;
            result += numberCounter;
        }
        System.out.println("Total: " + result);




    }
}
