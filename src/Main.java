import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> freqs = new HashMap<>();
        for (int i = 0; i < TEXT.length(); i++) {
            char symbol = TEXT.charAt(i);
            if (!Character.isLetter(symbol)) {
                continue;
            }
            if (freqs.containsKey(symbol)) {
                freqs.put(symbol, freqs.get(symbol) + 1);
            } else {
                freqs.put(symbol, 1);
            }
        }
        int freqMax = -1;
        char charMax = 0;
        for (char symbol : freqs.keySet()) {
            int freq = freqs.get(symbol);
            if (freq > freqMax) {
                freqMax = freq;
                charMax = symbol;
            }
        }
        int freqMin = Integer.MAX_VALUE;
        char charMin = 0;
        for (char symbol : freqs.keySet()) {
            int freq = freqs.get(symbol);
            if (freq < freqMin) {
                freqMin = freq;
                charMin = symbol;
            }
        }
        System.out.println("Максимальная частота у символа " + charMax + " : " + freqMax);
        System.out.println("Минимальная частота у символа " + charMin + " : " + freqMin);

    }
}