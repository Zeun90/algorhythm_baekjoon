import java.util.Scanner;

public class _2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        String star = "*";

        if (1 <= inputNum || inputNum <= 100) {
            for (int i = inputNum; i > 0; i--) {
                System.out.println(star.repeat(i));
            }
        }
    }
}
