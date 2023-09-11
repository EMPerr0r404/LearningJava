import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                    System.out.print("Number: ");
                    String text = scanner.nextLine();
                    int number = Integer.parseInt(text);

        if (number % 5 == 0 && number % 3 == 0) {System.out.println("FizzBuzz"); break;}
        else if (number % 5 == 0) {System.out.println("Fizz");break;}
        else if (number % 3 == 0) {System.out.println("Buzz");break;}
        else {System.out.println(number);break;}

        } catch (NumberFormatException e) {
                    System.out.println("Should enter an integer");
                }
        }
    }

}