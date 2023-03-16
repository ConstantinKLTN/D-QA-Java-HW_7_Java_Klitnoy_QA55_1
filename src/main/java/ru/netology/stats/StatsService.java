package ru.netology.stats;

    public class StatsService {
    public long sum(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales = totalSales + sale;
        }
        return totalSales;
    }

    public long middle(long[] sales) {
        long totalSales = sum(sales);
        return totalSales / sales.length;
    }

    public int maxMonthSale(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSale(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }
        return minMonth + 1;
    }

    public  int monthSalesMinMiddle(long[] sales) {
        long middleSale = middle(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale < middleSale) {
               result ++;
            }
        }
        return result;
    }

    public  int monthSalesMaxMiddle(long[] sales) {
        long middleSale = middle(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale > middleSale) {
                result ++;
            }
        }
        return result;
    }
}
