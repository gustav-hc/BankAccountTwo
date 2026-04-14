public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.deposit(-1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

        BankAccount account1 = new BankAccount(1000);

        try {
            account1.withdraw(2000);
        } catch (IllegalArgumentException e) {
            System.out.println("Fejl: " + e.getMessage());
        }
    }
}
