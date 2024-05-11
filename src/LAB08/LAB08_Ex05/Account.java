package LAB08.LAB08_Ex05;

import javax.naming.InsufficientResourcesException;

class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws InsufficientResourcesException {
        if (amount > balance) {
            throw new InsufficientResourcesException("Insufficient balance");
        }
        balance-=amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
