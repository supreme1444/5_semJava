package java4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        Map<String, List<String>> hm = new HashMap<String, List<String>>();
        List<String> values = new ArrayList<String>();
        List<String> values1 = new ArrayList<String>();
        values.add("89105547722");
        values.add("89203334422");
        values1.add("89105567722");
        values1.add("89203324422");
        hm.put("Сергей", values);
        hm.put("Иван", values1);
        System.out.println(hm.get("Сергей"));
        System.out.println(hm.get("Иван"));
    }

}
