import java.time.LocalDate;

public class BankAccount {
    //Properties
    String firstName;
    String lastName;
    int accountNumber;
    LocalDate dateOfBirth;
    int balance;

    // Constructor
    public BankAccount(String firstName, String lastName, int accountNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.dateOfBirth = dateOfBirth;
        this.balance = 0;
    }

        // getName
        String getName(){
            return this.firstName + " " + this.lastName;
        }

        // getDateOfBirth
        public LocalDate getDateOfBirth() {
        return dateOfBirth;
        }
        // getAccountNumber
        public int getAccountNumber() {
        return accountNumber;
        }
        // getBalance
        public int getBalance() {
        return  this.balance;
        }



//    deposit method should take in an amount and update the balance of BankAccount

//    withdrawal method should take in an amount and update the balance of BankAccount

    public void deposit(int depositAmount){
    balance += depositAmount;
        }

    public void withdrawal(int withdrawAmount){
    balance = balance - withdrawAmount;
    }




//    Provide a method to allow the account to pay interest (increase by 1%
//    Attempted void but then got a bit stuck so changed to int and return balance += interestAmount
//        public void payinterest(double interestRate){
//        double interestAmount = balance * interestRate;
//        balance += interestAmount;
//        }


    public int payinterest(double interestRate){
        double interestAmount = balance * (interestRate/100);
        return balance += interestAmount;
    }

}

