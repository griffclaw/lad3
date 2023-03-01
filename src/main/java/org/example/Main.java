package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //IP();
        Double();
    }
    public static void IP() {
        int earnings = 0;
        int spendigs = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию и введите ее номер");
            System.out.println("1.Добавить новый доход");
            System.out.println("2.Добавить новый расход");
            System.out.println("3.Выбрать систему налогооблажения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else {

                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода");
                        String moneyStr = scanner.nextLine();
                        int money = Integer.parseInt(moneyStr);
                        earnings += money;
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода");
                        String moneyStr1 = scanner.nextLine();
                        int money1 = Integer.parseInt(moneyStr1);
                        spendigs += money1;
                        break;
                    case 3:
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Наш налог составит: " + taxEarnings(earnings));
                        System.out.println("Налог на другой системе: " + taxEarningsMinusSpendigs(earnings , spendigs));
                        if (taxEarnings(earnings)<taxEarningsMinusSpendigs(earnings , spendigs)) {
                            int tax = taxEarningsMinusSpendigs(earnings , spendigs);
                            double tax2 = taxEarnings(earnings);
                            System.out.println("Экономия: " + (tax - tax2));
                        } else {
                            System.out.println("Экономия: " + spendigs);
                        }
                    break;
                    default:
                        System.out.println("Такой операции нет");
                }
            }
        }
        System.out.println("Программа завершена!");
    }

    public static int taxEarningsMinusSpendigs(int earnings, int spendigs) {
        int tax = (earnings - spendigs) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
    public static double taxEarnings(int earnings) {
        double tax2 = earnings * 6 / 100;
        if (tax2 >= 0) {
            return tax2;
        } else {
            return 0;
        }
    }

    public static void Double() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Операции над double/float");
            System.out.println("1.Сравнить");
            System.out.println("2.Округлить");
            System.out.println("3.Отбросить дробную часть");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else {

                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите первое число");
                        String firstOperation = scanner.nextLine();
                        double first = Double.parseDouble(firstOperation);
                        System.out.println("Введите второе число");
                        String firstOperation2 = scanner.nextLine();
                        float second = Float.parseFloat(firstOperation2);
                        if (first == second) {
                            System.out.println("Числа равны");
                            return;
                        } else if (first - second > 0) {
                            System.out.println("Числа не равны, первое число больше");
                        } else {
                            System.out.println("Числа не равны, второе число больше");
                        }
                        break;
                    case 2:
                        System.out.println("Введите число");
                        String secondOperation = scanner.nextLine();
                        double second1 = Double.parseDouble(secondOperation);
                        System.out.println(Math.round(second1));
                        break;
                    case 3:
                        System.out.println("Введите число");
                        String threeOperation = scanner.nextLine();
                        float three = Float.parseFloat(threeOperation);
                        long value = (long) three;
                        System.out.println(value);
                        break;
                    default:
                        System.out.println("Такой операции нет");
                }
            }
        }
        System.out.println("Программа завершена!");
    }
}