class BankAccount {
    private final User owner;
    private Currency currency;
    private double balance;
    private double interestRate;
    private double creditLimit;

    public BankAccount(User owner, Currency currency) {
        this.owner = owner;
        this.currency = currency;
        this.balance = 0;
        this.interestRate = 0;
        this.creditLimit = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " " + currency.code());
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " " + currency.code());
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        System.out.println("Interest rate set to " + interestRate + "%");
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
        System.out.println("Credit limit set to " + creditLimit + " " + currency.code());
    }

    public void convertBalance(Currency newCurrency) {
        balance = balance * currency.exchangeRate() / newCurrency.exchangeRate();
        currency = newCurrency;
        System.out.println("Balance converted to " + newCurrency.code());
    }

    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Owner: " + owner.getFullName());
        System.out.println("Currency: " + currency.code());
        System.out.println("Balance: " + balance + " " + currency.code());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Credit Limit: " + creditLimit + " " + currency.code());
    }
}