import java.util.Arrays;

public class SalesAnalyzer {

    public static Integer findBestSalesDay(int[] sales) {
        if (sales == null || sales.length == 0) {
            return null;
        }

        int bestDay = 0;
        int highestSales = sales[0];

        for (int day = 0; day < sales.length; day++) {
            int amount = sales[day];
            if (amount > highestSales) {
                highestSales = amount;
                bestDay = day;
            }
        }

        return bestDay;
    }

    public static void main(String[] args) {
        int[] salesData = {100, 150, 80, 200, 120};
        Integer bestDayResult = findBestSalesDay(salesData);

        if (bestDayResult != null) {
            System.out.println("The best sales day was day " + bestDayResult + ".");
        } else {
            System.out.println("We don't have any sales data yet.");
        }

        int[] emptySales = {};
        Integer bestDayEmpty = findBestSalesDay(emptySales);
        if (bestDayEmpty != null) {
            System.out.println("The best sales day was day " + bestDayEmpty + ".");
        } else {
            System.out.println("We don't have any sales data yet.");
        }


        int[] sameSales = {100, 100, 100};
        Integer bestDaySame = findBestSalesDay(sameSales);
        if (bestDaySame != null) {
            System.out.println("The best sales day was day " + bestDaySame + ".");
        } else {
            System.out.println("We don't have any sales data yet.");
        }

    }
}