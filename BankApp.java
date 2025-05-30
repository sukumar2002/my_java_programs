import java.util.*;

class Transaction {
    int id;
    String type;
    double amount;
    Date date;

    Transaction(int id, String type, double amount, Date date) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public String toString() {
        return id + " | " + type + " | " + amount + " | " + date;
    }
    
    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }
}

public class BankApp {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(101, "Credit", 5000, new Date(2024, 3, 21)));
        transactions.add(new Transaction(102, "Debit", 2000, new Date(2024, 3, 23)));
        transactions.add(new Transaction(103, "Credit", 3000, new Date(2024, 3, 22)));
        int searchId = 102;
        for (Transaction t : transactions) {
            if (t.getId() == searchId) {
                System.out.println("Transaction Found: " + t);
            }
        }
        transactions.sort((a, b) -> Double.compare(b.getAmount(), a.getAmount()));
        System.out.println("\nSorted by Amount (High to Low):");
        transactions.forEach(System.out::println);
    }
}
