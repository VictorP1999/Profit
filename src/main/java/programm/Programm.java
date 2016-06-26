package programm;

import calculation.Profit;

import java.util.Scanner;

/**
 * Created by Victor Penkin  on 23.06.2016.
 */

public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите сумму вложения (в рублях) = ");

            int a = scanner.nextInt();

            System.out.println("Введите ежемесячный процент = ");
            int b = scanner.nextInt();

            System.out.println("Введите порядковый номер месяца, к началу которого нужно узнать прибыль = ");
            int c = scanner.nextInt();

            Profit.Profit(a, b, c);

            System.out.println("Для выхода из программы нажмите q -> Enter");
            String str = scanner.next();
            if (str.equals("q"))
                break;
        }
    }
}
