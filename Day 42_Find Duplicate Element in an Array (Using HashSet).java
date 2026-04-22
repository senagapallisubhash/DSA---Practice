import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        Integer duplicate = findDuplicate(arr);

        if (duplicate != null) {
            System.out.println("Duplicate Element: " + duplicate);
        } else {
            System.out.println("No duplicate found.");
        }
    }

    static Integer findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return num; // duplicate found
            }
            set.add(num);
        }
        return null;
    }
}
