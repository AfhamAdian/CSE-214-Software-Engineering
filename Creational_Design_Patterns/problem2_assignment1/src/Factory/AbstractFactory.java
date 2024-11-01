package Factory;

import Accounts.Accounts;

public interface AbstractFactory {
    public Accounts getAccount(String accountType);
}