import java.util.Scanner;
public class Menu {
    private BankAccount account;
    public Menu(BankAccount account) {
        this.account = account;
    }
    public void showMenu() {
        char choice = '\0';
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please select an option");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");
            choice = input.next().charAt(0);

            switch (choice){
                //Check Balance
                case 'A':
                    System.out.println("Your balance is: " + account.getBalance());
                    break;
                //Deposit
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int dep = input.nextInt();
                    account.deposit(dep);
                    break;
                //Withdraw
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int withdraw = input.nextInt();
                    account.withdraw(withdraw);
                    break;
                //Previous Trans
                case 'D':
                    account.displayPreviousTransaction();
                    break;
                //Exit program
                case 'E':
                    break;
                //Error Message
                default:
                    System.out.println("Error! Please enter a valid option.");

            }
        } while (choice != 'E');

        System.out.println("Thank You. Come Again");
    }
}
