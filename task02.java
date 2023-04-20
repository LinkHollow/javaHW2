// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. 
// потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", 
// где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. 
// Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, 
// что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, 
// который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

// Sample Input:

// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// 
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Scanner sc = new Scanner(System.in);
        int n = stringToInt();

        String[] recipes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите рецепт:   ");
            recipes[i] = sc.nextLine();
        }
        int m = stringToInt();
        String[] replProd = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Введите замену продуктов по форме(продукт1 - продукт2):   ");
            replProd[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String[] repElement = replProd[j].split(" - ");
                recipes[i] = recipes[i].replace(repElement[0], repElement[1]);
            }
            System.out.println(recipes[i]);

        }
    }

    static int stringToInt() {
        int resultValue = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите число строк:  ");
        String userText = sc1.nextLine();
        boolean isDigit;
        try {
            Integer.parseInt(userText);
            resultValue = Integer.parseInt(userText);
            isDigit = true;
        } catch (NumberFormatException e) {
            isDigit = false;
            while (!isDigit) {
                System.out.print("повторите:    ");
                userText = sc1.nextLine();
                try {
                    Integer.parseInt(userText);
                    resultValue = Integer.parseInt(userText);
                    isDigit = true;
                } catch (NumberFormatException s) {

                }
            }
        }
        return resultValue;

    }

}