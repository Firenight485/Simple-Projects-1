package SimpleHeloWorld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String name;
        //gives the introduction and takes in the users name.
        System.out.println("Hello World! \nPlease tell me your name");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        
        System.out.println("Nice to meet you "+name+"!");
    }
}
