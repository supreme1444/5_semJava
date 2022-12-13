package java4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sort {
    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "Дима");
        hm.put(2, "Вова");
        hm.put(3, "Дима");
        hm.put(4, "Дима");
        hm.put(5, "Вова");
        hm.put(6, "Сережа");

        summ(hm);
    }

    public static void summ(Map<Integer, String> entrylist) {
        List<String> list = new ArrayList<String>(entrylist.values());
        Map<Integer, String> states = new HashMap<Integer, String>();
        Integer count = 0;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {

                    count++;
                    states.put(count, list.get(i));
                    
                }

            }
            
        }
       System.out.print(states);

    }
}
