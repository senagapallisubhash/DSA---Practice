import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        HashSet<Integer> result = findIntersection(arr1, arr2);

        System.out.println("Intersection: " + result);
    }

    static HashSet<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }
}
