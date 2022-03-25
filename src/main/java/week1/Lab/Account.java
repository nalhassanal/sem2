package week1.Lab;

/*
Implement a class named Account that contains:
- A private int data field named id for the account(default 0)
- A private double data field named balance for the account (default 0)
- a private double data field named annualInterestRate that stores the current interest rate
  (default 0). Assume all accounts have the same interest rate.
- A private Date data field named dateCreated that stores the date when the
  account was created.
- A no-arg constructor that creates a default account.
- A constructor that creates an account with the specified id and initial balance.
- The accessor and mutator methods for id, balance, and annualInterestRate
- The accessor method for dateCreated.
- A method named getMonthlyInterestRate() that returns the monthly interest rate.
- A method named getMonthlyInterest() that returns the monthly interest.
- A method named withdraw that withdraws a specified amount from the account.
- A method named deposit that deposits a specified amount to the account.

(Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is
annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g., like 4.5%. You
need to divide it by 100.)
*/
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/100/12;
    }

    public double getMonthlyInterest(){
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double withdrawAmt){
        if ( withdrawAmt > balance){
            System.out.println("Amount is larger than balance.");
            return;
        }
        balance -= withdrawAmt;
    }

    public void deposit(double depositAmt){
        balance+= depositAmt;
    }


}
