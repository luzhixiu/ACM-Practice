import java.util.Scanner;

public class ReverseBot {

    public final static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            String s = sc.next();
            String transformed = "";
            for (int i = 0; i < s.length(); i++) {
                int index = (alpha.indexOf(s.charAt(i)) + n) % 28;
                transformed += alpha.charAt(index);
            }
            String reverse = "";
            for (int i = transformed.length() - 1; i >= 0; i--) {
                reverse += transformed.charAt(i);
            }
            System.out.println(reverse);

        }

    }

}