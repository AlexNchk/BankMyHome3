package clients;

import accounts.Account;
import accounts.MoneyTarget;

public class Client implements MoneyTarget {
    protected String name;
    private final int MAX_QUANTITY_ACCOUNTS = 5;

    public String setName(String name) {
        return name;
    }

    Account[] accounts = new Account[MAX_QUANTITY_ACCOUNTS];

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счета нет!");
    }

    public boolean pay(long amount) {
        for (int p = 0; p < accounts.length; p++) {
            for (Account account : accounts) {
                if (accounts[p] != null && accounts[p].pay(amount)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addMoney(long amount) {
        for (int p = 0; p < accounts.length; p++) {
            for (Account account : accounts) {
                if (accounts[p].addMoney(amount)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean accept(long amount) {
        for (int p = 0; p < accounts.length; p++) {
            for (Account account : accounts) {
                if (accounts[p] != null && accounts[p].addMoney(amount)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getName() {
        return this.name;
    }
}
