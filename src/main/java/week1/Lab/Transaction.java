package week1.Lab;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount, balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
