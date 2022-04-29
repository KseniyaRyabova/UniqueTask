import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestOnUnique {
    @Test
    public void isCheckForUniquenessWhenSymbolToStringNotUnique() {
        String [] notUnique = {"Россия", "muss", "Введение"};
        for (String str: notUnique) {
            boolean actualResult = UniqueOrNot.checkForUniqueness(str);
            assertFalse(actualResult, "is unique");
        }
    }

    @Test
    public void isCheckForUniquenessWhenToStringSymbolUnique() {
        String unique = "Строка";
        UniqueOrNot.checkForUniqueness(unique);
        boolean actualResult = UniqueOrNot.checkForUniqueness(unique);
        assertTrue(actualResult, "is not unique");
    }
}
