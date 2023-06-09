package Methods;
// 2) Найти минимальное значение
import java.util.ArrayList;

public class Minimum {
    public Integer getMinimum() {
        ListOfNumber choice = new ListOfNumber();
        ArrayList<Integer> array = choice.getList();
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
