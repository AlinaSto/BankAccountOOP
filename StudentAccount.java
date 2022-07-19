public class StudentAccount extends BankAccount {
    private final double maxDepositAmount;    //MAX_DEPOSIT_AMOUNT = 50000;

    public StudentAccount(double balance, String accountNumber, double maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public void withdraw(double putMoney) {
        if (putMoney <= getBalance()) {
            setBalance(getBalance() - putMoney);
        }
    }

    public void deposit(double putMoney) {
        double putMoneyInDeposit = 0;
        if (putMoney <= maxDepositAmount) {
            setBalance(getBalance() + putMoney);
            //   return false;
        }
    }
}
