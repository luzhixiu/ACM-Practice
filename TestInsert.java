import java.util.ArrayList;
import java.util.Scanner;

public class TestInsert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String myS = "";
        char temp = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != temp) {
                myS += s.charAt(i);
            }
            temp = s.charAt(i);

        }
        System.out.println(myS);

    }
}
