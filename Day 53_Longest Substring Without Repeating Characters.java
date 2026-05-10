import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";

        int result = lengthOfLongestSubstring(str);

        System.out.println("Length of Longest Unique Substring: " + result);
    }

    static int lengthOfLongestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
