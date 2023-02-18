import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qwer1");
        int wer1 = scanner.nextInt();
        System.out.println("qwer2");
        int wer2 = scanner.nextInt();
        System.out.println("qwer3");
        int wer3 = scanner.nextInt();
        int sun = wer1 + wer2 + wer3;
        int sun1 = wer1 * wer2 * wer3;
        double sun2 = (double) (wer1 + wer2 + wer3) / 3;
        System.out.println(wer1 + "+" + wer2 + "+" + wer3 + "=" + sun + "\n" + wer1 + "*" + wer2 + "*" + wer3 + "=" + sun1 + "\n" + "(" + wer1 + "+"
                + wer2 + "+" + wer3 + ")" + "/" + "3" + "=" + sun2);
    }
}
