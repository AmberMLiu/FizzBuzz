public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int num = 100;

        while (num > 0) {
            // If the number is even, divide the number by 2.
            if (num % 2 == 0) {
                num /= 2;
            }
            else {
                num -= 1;
            }

            step++;
        }

        System.out.println(step);
    }
}
