public class EvenOddCounter {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}