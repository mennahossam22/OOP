import java.util.Date;

public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Date getDateCreated() {
        return this.dateCreated;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12.0;
    }

    public double getMonthlyInterest() {
        return this.getMonthlyInterestRate() / 100.0 * this.balance;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
