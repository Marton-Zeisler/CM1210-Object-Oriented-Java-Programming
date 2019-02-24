public class BankAccount {
    private String holderName;
    private double balance;
    private int number;

    public BankAccount(String holderName, int number){
        this.holderName = holderName;
        this.number = number;
    }

    public String getHolderName(){
        return holderName;
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return number;
    }

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }



}