package Week3.Transaction;

import java.util.ArrayList;

public class Account {
    private double balance;
    private final ArrayList<Transaction> transitionList;

    /**
     * Constructor 1.
     */
    public Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<Transaction>();
    }

    /**
     * Constructor 2.
     *
     * @param balance so du ban dau cua tai khoan
     */
    public Account(double balance) {
        this.balance = balance;
        this.transitionList = new ArrayList<Transaction>();
    }

    /**
     * nap tien vao tai khoan.
     *
     * @param amount so tien nap
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
        transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
    }

    /**
     * rut tien tu tai khoan.
     *
     * @param amount so tien rut
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
        }
    }

    /**
     * them giao dich tai khoan.
     *
     * @param amount    so tien lien quan den giao dich
     * @param operation loại giao dịch (DEPOSIT hoặc WITHDRAW)
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * In danh sach giao dich cua tai khoan.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction transaction : transitionList) {
            if (transaction.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.printf("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.\n",
                        i, transaction.getAmount(), transaction.getBalance());
            } else {
                System.out.printf("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.\n",
                        i, transaction.getAmount(), transaction.getBalance());
            }
            i++;
        }
    }
}
