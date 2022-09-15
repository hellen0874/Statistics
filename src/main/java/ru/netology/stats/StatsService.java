package ru.netology.stats;

public class StatsService {

    // № 1 Общая сумма продаж
    public long getTotalAmount(long[] sales) {
        long totalAmount = 0;
        for (long sale : sales) {
            totalAmount = totalAmount + sale;
        }
        return totalAmount;
    }

    // №  2. Средняя сумма продаж

    public long getAvgAmount(long[] sales) {
        long totalAmount = 0;
        for (long sale : sales) {
            totalAmount = totalAmount + sale; // сумма значений всех проcмотренных ячеек
        }
        long avgAmount = totalAmount / 12; // вычисление среднего значения после окончания цикла - просмотра 12 ячеек
        return avgAmount;
    }

    // № 3. Номер месяца максимальных продаж

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // №  4. Номер месяца минимальных продаж

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // № 5. Кол-во месяцев с продажами ниже среднего

    public long getBelowAvgSales(long[] sales) {
        long totalAmount = 0;
        for (long sale : sales) {
            totalAmount = totalAmount + sale; // сумма значений всех проcмотренных ячеек
        }
        long avgAmount = totalAmount / 12; // вычисление среднего значения после окончания цикла - просмотра 12 ячеек

        long belowAvgMonth = 0; // переменная для количества месяцев, когда продажи ниже среднего
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale < avgAmount) {
                belowAvgMonth = belowAvgMonth + 1; // добавляем месяц, если в нем продажи ниже среднего
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return belowAvgMonth;
    }

    // № 6. Кол-во месяцев с продажами выше среднего

    public long getAboveAvgSales(long[] sales) {
        long totalAmount = 0;
        for (long sale : sales) {
            totalAmount = totalAmount + sale; // сумма значений всех проcмотренных ячеек
        }
        long avgAmount = totalAmount / 12; // вычисление среднего значения после окончания цикла - просмотра 12 ячеек

        long aboveAvgMonth = 0;  // переменная для количества месяцев, когда продажи выше среднего
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale < avgAmount) {
                aboveAvgMonth = aboveAvgMonth + 1; // добавляем месяц, если в нем продажи ниже среднего
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return aboveAvgMonth;
    }
}