import java.util.Scanner;

public class MyFirstGame {

    public static void main(String[] args) {
        int finish = 0;
        int guess;

            Scanner input = new Scanner(System.in);
            String more;
            System.out.println("Let's play!");

            int number = 1 + (int) (Math.random() * 50);

            while(finish == 0){
            try {
                System.out.println("Guess the number [1-50]: ");
                String text = input.nextLine();
                guess = Integer.parseInt(text);
                if (guess > 50 || guess < 1) {
                    System.out.println("Number out of range");
                } else if (guess < number) {
                    System.out.println("Number too small");
                } else if (guess > number) {
                    System.out.println("Number too large");
                } else {
                    System.out.println("You got it!");
                    while(true){
                    System.out.println("Want to play again? Please enter Y or N.");
                    more = input.nextLine();
                    if (more.equalsIgnoreCase("n")) {
                        System.out.println("THX for playing");
                        finish = 1;
                        break;
                        } else if (more.equalsIgnoreCase("y")) {
                        System.out.println("Here we go again");
                        number = 1 + (int) (Math.random() * 50);
                        break;
                        } else {
                        System.out.println("Incorrect answer");
                        }
                    }
                    }
                }
            catch (NumberFormatException e)
            {
                System.out.println("Should enter an integer");
            }
            }


        }
    }