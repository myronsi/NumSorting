package tg.bot;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sorting {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите список чисел через пробел:");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");

            List<Integer> list = new ArrayList<>();
            for (String number : numbers) {
                //TODO: добавить проверку что введены только числа
                list.add(Integer.parseInt(number));
            }

            List<Integer> result = removeDuplicates(list);

            System.out.println("Результат:");
            for (Integer num : result) {
                System.out.print(num + " ");
            }
        }

        public static List<Integer> removeDuplicates(List<Integer> list) {
            Set<Integer> set = new LinkedHashSet<>(list);
            return new ArrayList<>(set);
        }
}