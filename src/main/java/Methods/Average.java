package Methods;

import java.util.ArrayList;

public class Average {
    public Float getAverageNum() {
        ListOfNumber choice = new ListOfNumber();
        ArrayList<Integer> array = choice.getList();
        float sum = 0;
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            sum += num;
        }
        float average = sum / array.size();
        return average;
    }
}
