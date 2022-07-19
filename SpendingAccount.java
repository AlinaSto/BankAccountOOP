public class SpendingAccount extends BankAccount {
    private double maxWithdrawalAmount;

    public SpendingAccount(double balance, String accountNumber, double maxWithdrawalAmount) {
        super(balance, accountNumber);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public double getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(double maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    //se pot retrage cu maxim “maxWithdrawalAmount” RON mai mult decat exista in cont
// in momentul retragerii
//ex: daca in cont sunt 5000 de RON, iar maxWithdrawalAmount este 2000 RON,
// se pot retrage maxim 7000 RON
    public void withdraw(double putMoney) {
        if (putMoney <= getBalance() + maxWithdrawalAmount) {
            setBalance(getBalance() + putMoney);
        }
    }
//se pot depune oricati bani in cont
    public void deposit(double putMoney) {
        setBalance(getBalance() + putMoney);
    }


}
