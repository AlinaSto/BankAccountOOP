public abstract class BankAccount {
    private double balance;
    private String accountNumber;
    //private double amountWithdraw;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
       // this.amountWithdraw = amountWithdraw;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

   /* public double getAmountWithdraw() {
        return amountWithdraw;
    }

    public void setAmountWithdraw(double amountWithdraw) {
        this.amountWithdraw = amountWithdraw;
    }*/

    public abstract void withdraw(double balance);
    // double amountWithdraw;
//        double updatedDeposit = balance - amountWithdraw;
//        return updatedDeposit;

    public abstract void deposit(double balance);
    //System.out.println("Ai " + this.balance + " lei in contul tau.");

}