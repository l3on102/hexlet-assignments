package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> list = new ArrayList<>();
        for (Map<String, String> book : books) {
            boolean matchSwitch = true;
            for (Map.Entry<String, String> condition : where.entrySet()) {

                if (!book.containsValue(condition.getValue())) {
                    matchSwitch = false;
                }
            }
            if (matchSwitch) {
                list.add(book);
            }
        }

        return list;
    }
}
//END
