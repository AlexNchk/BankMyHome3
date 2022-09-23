package accounts;

public class CreditAccount extends Account {
    private static final long MAX_BALANCE_CRED = 0;

    @Override
    public boolean addMoney(long amount) {
        if (MAX_BALANCE_CRED >= this.balance + amount) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (amount != 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(Account accountTo, long amount) {
        if (accountTo.addMoney(amount) && MAX_BALANCE_CRED >= balance + amount) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(long amount) {
        if (MAX_BALANCE_CRED >= this.balance + amount) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public long getBalanceCred() {
        return this.balance;
    }
}