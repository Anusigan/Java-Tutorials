public class Q9{
    public static void main(String[] args) {
        for (int num = 1; num <= 500; num++) {
            int originalNum = num;
            int sum = 0;
            int numOfDigits = String.valueOf(num).length();

            while (originalNum != 0) {
                int digit = originalNum % 10;
                sum += Math.pow(digit, numOfDigits);
                originalNum /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

