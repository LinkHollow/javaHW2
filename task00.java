// Task_0
// public class Task_0 {
// // Посчитайте сколько драгоценных камней в куче обычных камней
// // Пример:
// // jewels = “aB”, stones = “aaaAbbbB”
// // Результат в консоль ”a3B1”
// public static void main(String[] args) {
// }
// public String findJewelsInStones(String jewels, String stones) {
// return "";


import java.util.Scanner;

public class task00 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с обозначением камней:   ");
        char[] jewelsSearch = sc.nextLine().toCharArray();
        System.out.println("Введите строку для поиска в ней:   ");
        String stones = sc.nextLine();
        String resStr = "";
        for (int i = 0; i < jewelsSearch.length; i++) {
            resStr += String.valueOf(jewelsSearch[i]) + countSubStr(stones, String.valueOf(jewelsSearch[i]));
        }
        System.out.println(resStr);
        sc.close();
        ;
    }

    static int countSubStr(String str, String target) {
        int res = str.length() - str.replace(target, "").length();
        return res;

    }
}