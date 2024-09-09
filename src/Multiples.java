public class Multiples {
    public static void main(String[] args) {
        int numMultipleOf3or5 = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numMultipleOf3or5++;
            }
        }

        System.out.println(numMultipleOf3or5);
    }
}