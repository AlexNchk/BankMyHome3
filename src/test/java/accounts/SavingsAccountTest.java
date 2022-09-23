package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
    @Test
    @DisplayName("Проверка покупки с накопительного счета")
    void pay(){
        SavingsAccount savingsAccount = new SavingsAccount();
        Assertions.assertFalse(savingsAccount.pay(5000));
    }
}
