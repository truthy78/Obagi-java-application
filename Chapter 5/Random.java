import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        int a = rand.nextInt(2) + 1; // 1 ≤ n ≤ 2
        int b = rand.nextInt(100) + 1; // 1 ≤ n ≤ 100
        int c = rand.nextInt(10); // 0 ≤ n ≤ 9
        int d = rand.nextInt(113) + 1000; // 1000 ≤ n ≤ 1112
        int e = rand.nextInt(3) - 1; // -1 ≤ n ≤ 1
        int f = rand.nextInt(15) - 3; // -3 ≤ n ≤ 11

        System.out.println("Generated Random Numbers:");
        System.out.println("a) " + a);
        System.out.println("b) " + b);
        System.out.println("c) " + c);
        System.out.println("d) " + d);
        System.out.println("e) " + e);
        System.out.println("f) " + f);
    }
}
