package Methods;
// 1) Нужно удалить из него чётные числа
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EvenNumbers {
    public ArrayList removeNum() {
        ListOfNumber choice =new ListOfNumber();
        ArrayList<Integer> array = choice.getList();
            for (int i = array.size() - 1; i >= 0; i--) {
                int even = array.get(i) % 2;
                if (even == 0) {
                    array.remove(i);
                }
            }
            Collections.sort(array);
            System.out.println("Список без четных чисел равен: " + array);
            return array;
    }
}


