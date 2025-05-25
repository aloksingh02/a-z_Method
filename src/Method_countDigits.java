public class Method_countDigits {
 public static int countDigits(int number) {
            if (number == 0) {
                return 1;
            }
            int count = 0;
            while (number != 0) {
                number /= 10;
                count++;
            }
            return count;
        }
        public static void main(String[] args) {
            int num = 12345;
            int digits = countDigits(num);
            System.out.println("The number " + num + " has " + digits + " digits.");
        }
}
