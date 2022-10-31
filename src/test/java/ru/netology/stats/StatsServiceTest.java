package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    //для № 1
    @Test
    public void shouldFindWithZero() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 0 };
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.getTotalAmount(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 0;
        // производим проверку (сравниваем ожидаемый и фактический результат):
        Assertions.assertEquals(expected, actual);
    }

    //для № 2
    @Test
       public void shouldFindAvg() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.getAvgAmount(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }

    //для № 3
    @Test
    public void shouldFindMaxMonth() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
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
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.minSales(sales);
        long expected = 9;
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }


    //для № 5 - почему не проходит?
    @Test
    public void shouldFindBelowAvg() {
        long[] sales = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.getBelowAvgSales(sales);
        long expected = 6;  // среднее 6,5
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }

    //еще 1 тест для № 5
    @Test
    public void shouldFindBelowAvg2() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.getBelowAvgSales(sales);
        long expected = 5;  // среднее 15
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindAboveAvg() {
        long[] sales = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        StatsService service = new StatsService();
        // вызываем целевой метод:
        long actual = service.getAboveAvgSales(sales);
        long expected = 6;
        // сравнение ожидаемого и фактического результата):
        Assertions.assertEquals(expected, actual);
    }

}