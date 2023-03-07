public class Main {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000.0);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500.0);
        a.deposit(3000.0);
        System.out.println(a.getBalance());
        System.out.println(a.getMonthlyInterest());
        System.out.println(a.getDateCreated());
    }
}