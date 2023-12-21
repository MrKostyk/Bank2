




public class Main {
    public static void main(String[] args) {
        Currency usd = new Currency("USD", 1.0);
        Currency eur = new Currency("EUR", 0.85);

        User user1 = new User("John", "Doe", "john.doe@example.com");
        RegularUser regularUser = new RegularUser(3);
        PremiumUser premiumUser = new PremiumUser(true);

        BankAccount account1 = new BankAccount(user1, usd);
        BankAccount account2 = new BankAccount(user1, eur);

        account1.deposit(1000);
        account1.setInterestRate(5);
        account1.displayAccountInfo();

        account2.deposit(500);
        account2.setCreditLimit(1000);
        account2.convertBalance(usd);
        account2.displayAccountInfo();
    }
}
