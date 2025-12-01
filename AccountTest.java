class Account {
    final String accountNumber;
    Account(String accountNumber) { this.accountNumber = accountNumber; }
    final void bankPolicy() { System.out.println("Policy"); }
}

final class CentralBankRules {
    void showRules() { System.out.println("Rules"); }
}

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("12345");
        a.bankPolicy();

        CentralBankRules c = new CentralBankRules();
        c.showRules();
    }
}
