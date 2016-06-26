package calculation;

/**
 * Created by Victor Penkin on 23.06.2016.
 */

public class Profit {
    public static void Profit(int firstSum, int percent, int numMonth) {
        double profit=0;
        double temp = firstSum;
        for (int x = 1; x <= numMonth; /*x = x + 1*/ x++) {
            /*double s = (temp + temp * percent/100);
            double p = (s - temp);*/
            double profitMonth = temp * percent / 100;
            profit = profit + profitMonth;
            temp = temp + profitMonth;
        }
        System.out.print("Чистая прибыль  ");
        System.out.println(profit);
        System.out.print("Сумма денег на счету = ");
        System.out.println(temp);
        System.out.println();
    }
}