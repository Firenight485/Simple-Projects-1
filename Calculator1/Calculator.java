package Calculator1;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        int num1;
        int num2; 
        int output;

        //Allows for the user to input both the values and the type of operation
        System.out.println("Welcome to the calulator! \n Please enter your first value.");
        Scanner keyboard = new Scanner(System.in);
        num1 = keyboard.nextInt();
        System.out.println("Please enter your second value.");
        num2 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What type of operation are you performing?");
        char operations = keyboard.nextLine().charAt(0);

        //Checks what type of operation was inputted and perfoms it
        if(operations == '+'){
            output = (num1 + num2);
            System.out.println("Your answer is: " + output);
        }
        else if (operations == '-'){
            output = (num1 - num2);
            System.out.println("Your answer is: " + output);
        }
        else if (operations == '*'){
            output = (num1 * num2);
            System.out.println("Your answer is:" + output);
        }
        else if (operations == '/'){
            output = (num1 / num2);
            System.out.println("Your answer is: " + output);
        }
        else{
            System.out.println("Please enter '+, -, *, /' ");
        }
    }
}