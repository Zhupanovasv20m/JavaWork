package Methods;
// Пусть дан произвольный список целых чисел.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListOfNumber {
    public ArrayList getList() {
        System.out.println("Введите число n для нахождения длины списка: ");
        try (Scanner number = new Scanner(System.in)) {
            int N = number.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            Random random = new Random();
            for (int i = 0; i < N; i++) {
                int x = random.nextInt(N);
                array.add(x);
            }
            System.out.println("Список из n чисел равен: " + array);
            return array;
        }
    }
}