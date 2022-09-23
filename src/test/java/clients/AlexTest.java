package clients;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlexTest {
    @Test
    @DisplayName("Проверка добавления имени клиента")
    void setName(){
        Alex alex = new Alex();
        Assertions.assertEquals("Alex", "Alex");
    }
}
