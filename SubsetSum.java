public class SubsetSum{
public static boolean subsetSum(int[] arr, int n, int target) {
    if (target == 0) {
        return true;
        }
        if (n == 0) {
            return false;
        }
        if (arr[n - 1] > target) {
            return subsetSum(arr, n - 1, target);
        }
        return subsetSum(arr, n - 1, target) ||
        subsetSum(arr, n - 1, target - arr[n - 1]);
    }
    public static void main(String[] args) {
        int[] conjunto = {3, 34, 4, 12, 5, 2};
        int objetivo = 1;

        if (subsetSum(conjunto, conjunto.length, objetivo)) {
            System.out.println("Si existe un subconjunto que suma " + objetivo);
        } else {
            System.out.println("No existe subconjunto que sume " + objetivo);
        }
    }
    
}