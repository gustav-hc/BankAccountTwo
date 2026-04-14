public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.deposit(-1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Fejl: " + e.getMessage());
        }
    }
}
