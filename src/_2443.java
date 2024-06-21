import java.util.Scanner;

public class _2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        String star = "*";
        String space = " ";

        for (int i = inputNum; i > 0; i--) {
            System.out.print(space.repeat(inputNum - i));
            System.out.println(star.repeat(2 * i - 1));
        }
    }
}
