package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;

public class StatsServiceTest {

    // второй тест для № 5 теперь проходит, неправильно вычислялось среднее в getAvgAmount (был установлен тип long
    // вместо double. Double установила в getAvgAmount, и везде, где потом запросил, может, где и лишнее.
    // после этого перестал работать последний тест с данными из файла

    //для № 1
    @Test
    public void shouldFindWithZero() {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 0};
        StatsService service = new StatsService();
        // вызываем целевой метод:
        double actual = service.getTotalAmount(sales);
        double expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 0;
        // производим проверку (сравниваем ожидаемый и фактический результат):
        Assertions.assertEquals(expected, actual);
    }

    //для № 2
    @Test
    public void shouldFindAvg() {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 19, 18};
        StatsService service = new StatsService();
        // вызываем целевой метод:
        double actual = service.getAvgAmount(sales);
        double expected = (8.0 + 15.0 + 13.0 + 15.0 + 17.0 + 20.0 + 19.0 + 20.0 + 7.0 + 14.0 + 19.0 + 18.0) / 12.0;
        // почему пока в формуле для expected стояли числа (8 + 15 +....)/ 12, а не по форме  "*.0", считал без дробей,
        // хотя double уже был установлен?
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
        System.out.println(actual); // на всякий случай добавила, чтобы сразу виден был результат вычислений
        System.out.println(expected); // на всякий случай добавила, чтобы сразу виден был результат вычислений
    }

    //для № 3
    @Test
    public void shouldFindMaxMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.maxSales(sales);
        long expected = 8;
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }

    //для № 4
    @Test
    public void shouldFindMinMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.minSales(sales);
        long expected = 9;
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }


    //для № 5
    @Test
    public void shouldFindBelowAvg() {
        double[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        // вызываем целевой метод:
        double actual = service.getBelowAvgSales(sales);
        double expected = 6;  // среднее 6,5
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }

    //еще 1 тест для № 5
    @Test
    public void shouldFindBelowAvg2() {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 19, 18};
        StatsService service = new StatsService();
        // вызываем целевой метод:
        double actual = service.getBelowAvgSales(sales);
        double expected = 6;  // среднее 15,4
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }

    // для № 6
    @Test
    public void shouldFindAboveAvg() {
        double[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        // вызываем целевой метод:
        double actual = service.getAboveAvgSales(sales);
        double expected = 6; // среднее 6,5
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }

}