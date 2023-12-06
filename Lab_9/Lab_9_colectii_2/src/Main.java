import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String text = "Buna ce mai faci ? Buna ,sunt mai bine ";
        String[] words = {"Buna","ce","faci","mai","sunt","bine"};

        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] text1=text.split("\\s+");

        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }

        for (String word : count.keySet()) {
            System.out.println(word + "-" + count.get(word));
        }
        System.out.println();

        HashMap<String, Integer> count1 = new HashMap<>();
        for (String word : text1) {
            if (count1.containsKey(word)) {
                count1.put(word, count1.get(word) + 1);
            } else {
                count1.put(word, 1);
            }
        }

        for (String word : count1.keySet()) {
            System.out.println(word + "-" + count1.get(word));
        }
    }
}
