import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Intro
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Welcome! Please select from the Menu: ");
            System.out.println("1. New Account (Console) " + "\n" +
                    "2. New Account (GUI)" + "\n" + "3. Exit");
            number = input.nextInt();

            switch (number) {
                //Console
                case 1:
                    System.out.println("Please enter your Name.");
                    String name = input.next();
                    System.out.println("Please enter your ID.");
                    String id = input.next();
                    BankAccount myBank = new BankAccount(name, id);
                    Menu myMenu = new Menu(myBank);
                    myMenu.showMenu();
                    break;
                //GUI
                case 2:
                    new BankGUI();
                    System.out.println("Now Opening Window...");
                    break;
                //Exit
                case 3:
                    System.out.println("Good-bye!");
                    break;
                //Error
                default:
                    System.out.println("Error! Please enter a valid option.");
            }
        }
        while (number != 1);
    }
}