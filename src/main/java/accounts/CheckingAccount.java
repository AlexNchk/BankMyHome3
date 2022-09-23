package accounts;

public class CheckingAccount extends Account {
    private static final long MIN_BALANCE = 0;

    @Override
    public boolean addMoney(long amount) {
        if (amount != 0 && MAX_BALANCE > amount + balance) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (MIN_BALANCE <= balance - amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean transfer(Account accountTo, long amount) {
        if (accountTo.addMoney(amount) && MIN_BALANCE <= balance - amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accept(long amount) {
        if (amount != 0 && MAX_BALANCE > amount + balance) {
            balance += amount;
            return true;
        }
        return false;
    }

    public long getBalanceCheck() {
        return balance;
    }
}
