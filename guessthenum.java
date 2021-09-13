import java.util.Random;
import java.util.Scanner;

class game {
    public int number;
    public int userinput;
    public int numberOfGuess = 0;

    public int getNumberOfGuess() {
        return numberOfGuess;
    }

    public game() {
        Random rand = new Random();
        number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println(" \nguesss the number");
        Scanner sc = new Scanner(System.in);
        userinput = sc.nextInt();
        sc.close();

    }

    boolean isCorrectNumber() {
        numberOfGuess++;
        if (userinput == number) {
            System.out.format("your guessed the right number the number was %d in %d attempt", number,
                    getNumberOfGuess());
            return true;
        } else if (userinput > number) {
            System.out.println("too high");
        } else if (userinput < number) {
            System.out.println("too low");
        }
        return false;
    }

}

public class guessthenum {
    public static void main(String[] args) {

        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }            

}
