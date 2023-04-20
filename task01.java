// // Вам дается строка S и целочисленный массив индексов int index[s.length].
// // Напишите программу, которая перетасует символы в S таким образом,
// // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// //
// // Пример: s = “cba”, index = [3,2,1] result “abc”

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:    ");
        String[] userStr = sc.nextLine().split("");
        System.out.println("Введите индексы(числа через пробел):    ");
        String[] userIndex = sc.nextLine().split(" ");
        String[] res = new String[userStr.length];
        for (int i = 0; i < userIndex.length; i++) {
            res[Integer.parseInt(userIndex[i]) - 1] = userStr[i];
        }
        String result = String.join("", res);
        System.out.println(result);
        sc.close();
    }
}