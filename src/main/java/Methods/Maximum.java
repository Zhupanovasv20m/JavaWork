package Methods;
// 3) Найти максимальное значение
import java.util.ArrayList;

public class Maximum {
    public Integer getMax() {
        ListOfNumber choice = new ListOfNumber();
        ArrayList<Integer> array = choice.getList();
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

