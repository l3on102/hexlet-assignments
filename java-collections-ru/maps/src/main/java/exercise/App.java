package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        String[] words = sentence.split(" ");
        if (sentence.isEmpty()) {
            return resultMap;
        }
        for (var stringToMap: words) {
            int i = 1;
            if (resultMap.containsKey(stringToMap)) {
                int newI = resultMap.get(stringToMap) + 1;
                resultMap.put(stringToMap, newI);
            }

                else {resultMap.put(stringToMap, i);
            }
        }
        return resultMap;
    }
    public static String toString(Map<String, Integer> resultMap) {

        var str1 = new StringBuilder();
        if (resultMap.isEmpty()) {
            str1.append("{}");
            return str1.toString();}

        else {
            str1.append('{' + "\n");
            for (Map.Entry<String, Integer> entry: resultMap.entrySet()) {
                str1.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
            str1.append('}');
        }
        str1.trimToSize();
        return str1.toString();
    }
}
//END
