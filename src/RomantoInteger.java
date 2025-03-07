import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

    private static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static int romanToInt(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int next = i == s.length() - 1 ? 0 : map.get(s.charAt(i + 1));
            if (next > curr) {
                n = n + next - curr;
                i++;
            } else {
                n = n + curr;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MXXV"));
    }
}
