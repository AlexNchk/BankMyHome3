package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckingAccountTest {
    @Test
    @DisplayName("Проверка пополнения расчетного счета")
    void addMoney(){
       CheckingAccount checkingAccount = new CheckingAccount();
       Assertions.assertTrue(checkingAccount.addMoney(9999));
    }
}
