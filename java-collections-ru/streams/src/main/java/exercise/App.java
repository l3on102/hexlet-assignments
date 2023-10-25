package exercise;

import java.util.List;

public class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {
        //System.out.println(emailsList);
        return emailsList.stream()
                .filter(name -> name.endsWith("gmail.com")
                        || name.endsWith("yandex.ru")
                        || name.endsWith("hotmail.com"))
                .count();

    }
}
// BEGIN

// END
