public class ContohRekursi {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int hasil = factorial(5);
        System.out.println("factorial dari 5 adalah: " + hasil);
    }
}
