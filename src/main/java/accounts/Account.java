package accounts;

public abstract class Account implements MoneyTarget {
    protected long balance = 0;
    protected final long MAX_BALANCE = 10000;

    public abstract boolean addMoney(long amount);

    public abstract boolean pay(long amount);

    public abstract boolean transfer(Account accountTo, long amount);

    public boolean accept(long amount) {
        if (addMoney(amount)) {
            return true;
        }
        return false;
    }
}
