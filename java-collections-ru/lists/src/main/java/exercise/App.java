package exercise;
import java.util.ArrayList;
import java.util.List;
// BEGIN
public class App {

    public static boolean scrabble(String set, String word) {
        List<Character> listSet = strToList(set);
        List<Character> listWord = strToList(word);
        int matchCounter = 0;
        if (word.length() > set.length()) {
            return false;
        }
        for (var charNumber : listWord) {
            if (listSet.contains(charNumber)) {
                listSet.remove(charNumber);
                matchCounter++;
            } else {
                return false;
            }
        }
        return (matchCounter == listWord.size());
    }
    public static List<Character>  strToList(String toConvert) {
        char[] charArray = toConvert.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();
        for (char number: charArray) {
            list.add(number);
        }
        return  list;
    }
}

//END

