import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
     void bonus () {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        int expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(actual, expected);
}
}