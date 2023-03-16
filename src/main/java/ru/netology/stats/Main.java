package ru.netology.stats;
public class Main {

    public static void main(String[] args) {

        long[] arr = new  long[12];
        arr[0] = 8;
        arr[1] = 15;
        arr[2] = 13;
        arr[3] = 15;
        arr[4]= 17;
        arr[5] = 20;
        arr[6] = 19;
        arr[7] = 20;
        arr[8] = 7;
        arr[9] = 14;
        arr[10] = 14;
        arr[11] = 18;

        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж: " + (service.sum(arr)) + ";");
        System.out.println("Средняя суммя продаж в месяц: " + (service.middle(arr)) + ";");
        System.out.println("Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму: " + (service.maxMonthSale(arr)) + ";");
        System.out.println("Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму: " + (service.minMonthSale(arr)) + ";");
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + (service.monthSalesMinMiddle(arr)) + ";");
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + (service.monthSalesMaxMiddle(arr)) + ".");

    }
}
