import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Georgia","Crawford",1234, LocalDate.of(1998,10,03));
    }

// Test objectives
// 1.   a Test get.name returns the first name + last name
//      b Test get.accountNumber returns the account balance
//      c Test get.dateOfBirth returns the date of birth
//      d Test get.Balance returns the account balance

    @Test
    public void getName(){
    //  when
    String result = bankAccount.getName();
    //  then
    String expected = "Georgia Crawford";
    assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getAccountNumber(){
    //  when
    int result = bankAccount.getAccountNumber();
    //  then
    int expected = 1234;
    assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getDateOfBirth(){
    //  when
    LocalDate result = bankAccount.getDateOfBirth();
    //  then
    LocalDate expected = LocalDate.of(1998,10,03);
    assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getBalance(){
    //  when
    int result = bankAccount.getBalance();
    //  then
    int expected = 0;
    assertThat(result).isEqualTo(expected);
    }


// 2. Test deposit() takes in an amount and updates the balance of the BankAccount.
    @Test
    public void deposit(){
    //  when
    bankAccount.deposit(3);
    //  then
    assert bankAccount.balance == 3;
    }


// 3. Test withdrawal() takes in an amount and updates the balance of the BankAccount.
    @Test
    public void withdrawal(){
        //  when
        bankAccount.withdrawal(10);
        //  then
        assert bankAccount.balance == -10;
    }


// 4  Test payinterest()
    @Test
    public void payinterest(){
    //  when
        bankAccount.balance =100;
    bankAccount.payinterest(3);
    //  then
   assert bankAccount.balance == 103;
    }

// had to insert this main to see the calculation errors
    public static void main(String[] args) {
        BankAccount bankAccount;
        bankAccount = new BankAccount("Georgia","Crawford",1234, LocalDate.of(1998,10,03));
        bankAccount.balance =100;
        System.out.println("your balance is " + bankAccount.payinterest(3));
    }

}
