public class Q6 {
    public static void main(String[] args) {
        int[] runs = {05, 12, 28, 34, 47, 52, 65, 71, 80, 99};
        int searchvalue = 47;
        int low = 0;
        int high = runs.length - 1;
        int mid = (low + high) / 2;
        while (low <= high && runs[mid] != searchvalue) {
            if (runs[mid] < searchvalue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("value not found");
        } else {
            System.out.println("value found in index: " + mid);
        }
    }
}
