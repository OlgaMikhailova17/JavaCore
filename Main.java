package lesson4;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] words = {"horse", "fruit", "cat", "apple", "internet", "fruit", "business", "cat", "moon", "son"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println(unique);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Michailova", "89423568237");
        pb.add("Beljaeva", "89352068246");
        pb.add("Alecseev", "89773648917");
        pb.add("Alecseev", "89773538917");
        System.out.println(pb.get("Alecseev"));
    }
}
