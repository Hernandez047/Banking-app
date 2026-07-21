public class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String customerName, String customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(int amount){
        if (amount > 0) {
            this.balance = balance + amount;
            this.previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if (amount !=0 ) {
            this.balance = balance - amount;
            this.previousTransaction = - amount;
        }
    }

    void displayPreviousTransaction(){
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0){
            System.out.println("Withdrawn: " + previousTransaction);
        }
        else System.out.println("No transaction has occurred");
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }
}

