public class Person {
    private String firstName;
    private String lastName;
    private BankAccount[] accountList;
    private int numberOfAccounts;

    public Person(String firstName, String lastName, BankAccount[] accountList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = accountList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount[] getAccountList() {
        return accountList;
    }

    public void setAccountList(BankAccount[] accountList) {
        this.accountList = accountList;
    }

    public void addAccount(BankAccount account) {

        //  for(int i = 0; i <= accountList.length; i++ ){
        //    lists = accountList + addAccountInList;
        accountList[numberOfAccounts++] = account;
    }


    public void listAccounts() {
        for (int i = 0; i < accountList.length; i++) {
            System.out.println("Numarul contului: " + accountList[i].getAccountNumber() + " iar  soldul contului " + accountList[i].getBalance());
            if (accountList[i] instanceof StudentAccount) {
                System.out.println("Tipul contului este Student account");
            } else {
                System.out.println("Tipul contului este Spending account");
            }
        }
    }

    public void deposit(double takeMoney, String accountNumber) {
        //1. identificam in ce cont depunem
        //2. depunem
        //1.
        for (int i = 0; i < accountList.length; i++) { // serching algoritm
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
                //2.
                accountList[i].deposit(takeMoney);
            }

        }
    }

    public void withDraw(double takeMoney, String accountNumber) {
       int foundAccountPosition = search(accountNumber);
        accountList[foundAccountPosition].withdraw(takeMoney);

       /* for (int i = 0; i <= accountList.length; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) ;
            accountList[i].withdraw(takeMoney);
        }*/
    }

    private int search(String accountNumber) {
        for (int i = 0; i < accountList.length; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
                return i;
            }
        }
        return -1;
    }
}
