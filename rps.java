
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int pcnum = (int) (Math.random() * 3);
            System.out.println("0 is for rock \n 1 is for papper \n 2 is for scissor \n 4 to exit");
            System.out.println("choose a number");
            int user = sc.nextInt();
            if (pcnum == 0 && user == 1) {
                System.out.println("======\n====\nYOU WON\n======\n====\n");
            } else if (pcnum == 1 && user == 2) {
                System.out.println("======\n====\nYOU WON\n======\n====\n");
            } else if (pcnum == 2 && user == 0) {
                System.out.println("======\n====\nYOU WON\n======\n====\n");
            } else if (pcnum == 2 && user == 1) {
                System.out.println("======\n====\nCOMPUTER WON\n======\n====\n");
            } else if (pcnum == 1 && user == 0) {
                System.out.println("======\n====\nCOMPUTER WON\n======\n====\n");
            } else if (pcnum == 0 && user == 2) {
                System.out.println("======\n====\nCOMPUTER WON\n======\n====\n");
            } else if (pcnum == 0 && user == 0) {
                System.out.println("======\n====\nMATCH DRAW\n======\n====\n");
            } else if (pcnum == 2 && user == 2) {
                System.out.println("======\n====\nMATCH DRAW\n======\n====\n");
            } else if (pcnum == 1 && user == 1) {
                System.out.println("======\n====\nMATCH DRAW\n======\n====\n");
            }

            if (user == 4) {
                // sc.close();
                break;
            }
            //
        }
    }

}