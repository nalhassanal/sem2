package week1.Lab;

/*
Write a test program that creates an Account1 object with annual interest rate 1.5%, balance
1000, id 1122, and name George. Deposit $30, $40, and $50 to the account and withdraw $5, $4,
and $2 from the account. Print an account summary that shows account holder name, interest
rate, balance, and all transactions.
 */
public class L1Q4 {
    public static void main(String[] args) {
        Account1 account1 = new Account1(1122, 1000, "George");
        account1.setAnnualInterestRate(1.5);
        account1.deposit(30);
        account1.deposit(40);
        account1.deposit(50);
        account1.withdraw(5);
        account1.withdraw(4);
        account1.withdraw(2);
        System.out.println("Name: " + account1.getName());
        System.out.println("Monthly interest rate: " + account1.getMonthlyInterestRate());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Transaction History");
        for (Transaction t : account1.getTransactions())
            System.out.println(t.toString());
    }
}
