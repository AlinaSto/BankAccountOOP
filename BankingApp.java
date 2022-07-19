public class BankingApp {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        Person person = new Person("Joe", "Moe", accounts);

        BankAccount bankAccount = new SpendingAccount(2500, "ROBTRL000000125", 5000);
        BankAccount bankAccount2 = new StudentAccount(1000, "ROBTRL000000995", 700);

        person.addAccount(bankAccount);
        person.addAccount(bankAccount2);
        person.listAccounts();

        System.out.println(bankAccount instanceof SpendingAccount);
        System.out.println(bankAccount instanceof BankAccount);

        person.deposit(520,"ROBTRL000000995");
        System.out.println(bankAccount.getBalance());

        person.withDraw(120, "ROBTRL000000125");
        System.out.println(bankAccount.getBalance());


    }
}