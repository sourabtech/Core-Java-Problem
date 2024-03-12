package LabProgram;
abstract class BankAccount244 {
    String accountNumber1;
    private double balance;

    public BankAccount244(String accountNumber, double balance) {
        this.accountNumber1 = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber1;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}


class SavingsAccount extends BankAccount244 {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

	private void setBalance(double d) 
	{
		
		
	}
}

public class BankAccount22 {
    public static void main(String[] args) {
		double ibal,damt,wamt;
        ibal = 1000.00;
        SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
		System.out.println("Savings A/c: Initial Balace: $"+ibal);
		damt = 500.00;
        savingsAccount.deposit(damt);
		wamt = 250.00;
        savingsAccount.withdraw(wamt);
		wamt = 1600.00;
		System.out.println("\nTry to withdraw: $"+wamt);
        savingsAccount.withdraw(wamt);

        System.out.println();
        ibal = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
		System.out.println("Current A/c: Initial Balace: $"+ibal);
		damt = 2500.00;
        currentAccount.deposit(1000.0);
		wamt = 1250.00;
        currentAccount.withdraw(3000.0);
		wamt = 6000.00;
		System.out.println("\nTry to withdraw: $"+wamt);
        savingsAccount.withdraw(wamt);		
    }
}

