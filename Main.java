public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        System.out.println("=== METHOD OVERLOADING ===");
        bank.transferUang(100000, "1234567890");
        bank.transferUang(200000, "1234567890", "Mandiri");
        bank.transferUang(300000, "1234567890", "BRI", "Bayar Kuliah");
        bank.sukuBunga();

        System.out.println("\n=== METHOD OVERRIDING BNI ===");
        BankBNI bni = new BankBNI();
        bni.transferUang(500000, "987654321", "Bank Lain");
        bni.sukuBunga();

        System.out.println("\n=== METHOD OVERRIDING BCA ===");
        BankBCA bca = new BankBCA();
        bca.transferUang(700000, "1122334455", "Bank Lain");
        bca.sukuBunga();
    }
}