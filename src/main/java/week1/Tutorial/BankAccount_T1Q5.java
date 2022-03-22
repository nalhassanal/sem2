package week1.Tutorial;
    /*
Assume the existence of an interface, Account, with the following methods:
- deposit: Accepts an integer parameter and returns an integer
- withdraw: Accepts an integer parameter and return a Boolean
 */
    /*
    Define a class, BankAccount, that implements the above interface and has the following
    members:
    - an instance variable named balance
    - a constructor that accepts an integer that is used to initialize the instance variable
    - an implementation of the deposit method that adds its parameter to the balance variable.
      The new balance is returned
    - an implementation of the withdraw method that checks whether its parameter is less than or equal
      to the balance and if so, decreases the balance by the value of the parameter and returns true;
      otherwise, it leaves the balance unchanged and returns false
     */
public class BankAccount_T1Q5 implements Account_T1Q5{
    private int balance;

    public BankAccount_T1Q5(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    @Override
    public int deposit(int amount) {
        this.balance += amount;
        return balance;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount > this.balance)
            return false;
        else{
            this.balance -= amount;
            return true;
        }
    }

    public static void main(String[] args) {
        BankAccount_T1Q5 obj = new BankAccount_T1Q5(1000);
        System.out.println(obj.getBalance());
        System.out.println();
        System.out.println(obj.deposit(50));
        System.out.println();
        System.out.println(obj.withdraw(500));
        System.out.println(obj.getBalance());
        System.out.println();
        System.out.println(obj.withdraw(500));
        System.out.println(obj.getBalance());
        System.out.println();
        System.out.println(obj.withdraw(500));
        System.out.println(obj.getBalance());
    }
}
