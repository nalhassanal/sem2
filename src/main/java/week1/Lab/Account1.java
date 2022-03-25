package week1.Lab;
/*
An Account class was specified in Question 3. Design a new Account1 class as follows:
■ Add a new data field name of the String type to store the name of the customer.
■ Add a new constructor that constructs an account with the specified name, id, and balance.
■ Add a new data field named transactions whose type is ArrayList that stores the transaction
for the accounts. Each transaction is an instance of the Transaction class. The Transaction class
is defined as shown in figure below.

■ Modify the withdraw and deposit methods to add a transaction to the transactions array list.
■ All other properties and methods are the same as in Question 3.
 */

import java.util.ArrayList;

public class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> transactions;

    public Account1 (int id, double balance, String name){
        super(id, balance);
        this.name = name;
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public void withdraw(double withdrawAmt) {
        if ( withdrawAmt > getBalance()){
            System.out.println("Amount is larger than balance.");
            return;
        }
        setBalance(getBalance() - withdrawAmt);
        transactions.add(new Transaction('W', withdrawAmt, getBalance(),"Withdrawal"));
    }

    @Override
    public void deposit(double depositAmt) {
        setBalance(getBalance() + depositAmt);
        transactions.add(new Transaction('D', depositAmt, getBalance(),"Deposit"));
    }
}
