package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;


public class StatsServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/data.csv")
    public void shouldFindWithZero(long expected, long[] sales) {
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.getTotalAmount(sales);

        // производим проверку (сравниваем ожидаемый и фактический результат):
        Assertions.assertEquals(expected, actual);
    }
}
