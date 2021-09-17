package EvenAndOddChecker;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        
        int number;

        System.out.println("Pleae input a value....");

        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        if(number % 2 == 0){
            System.out.println("This value is even");
        }
        else{
            System.out.println("This value is odd");
        }
        System.exit(0);
    }
}
