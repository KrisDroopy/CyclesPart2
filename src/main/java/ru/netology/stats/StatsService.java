package ru.netology.stats;


public class StatsService {

    // 1
    public long sumSales(long[] sales) {
        long month = 0;

        for (long sale : sales) {
            month += sale;

        }

        return month;
    }

    //2
    public long averageAmount(long[] sales) {
        long month = 0;

        for (long sale : sales) {
            month += sale;
        }
        long average = month / sales.length;

        return average;
    }

    //3
    public long maxMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    // 4
    public long minMontSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    //5
    public long belowAverageSales(long[] sales) {
        long month = 0;

        for (long sale : sales) {
            month += sale;
        }
        long average = month / sales.length;

        int minMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                minMonth++;
            }
        }
        return minMonth;


    }

    //6
    public int aboveAverageSales(long[] sales) {
        long month = 0;

        for (long sale : sales) {
            month += sale;
        }
        long average = month / sales.length;

        int maxMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                maxMonth++;
            }
        }
        return maxMonth;
    }
}
