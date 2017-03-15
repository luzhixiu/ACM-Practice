import java.io.File;
import java.util.*;

public class RationalSequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      //  Scanner sc = new Scanner(new File("test.txt"));
        int n = sc.nextInt();
        for (int r = 1; r <= n; r++) {
            int cases = sc.nextInt();
            String s = sc.next();
            int index = s.indexOf("/");
            String sa = s.substring(0, index);
            String sb = s.substring(index + 1);
            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);
            int v = 0;
            if (b == 1) {
                int top = 1;
                int bot = a + 1;
                a = top;
                b = bot;
            } else {
                while (a > b) {
                    a = a - b;
                    v++;
                }

                int top = b;
                int bot = b - a;
                a = top;
                b = bot;

                for (int i = 0; i < v; i++) {
                    a = a;
                    b = a + b;
                }
                

            }
System.out.println(cases+" "+a+"/"+b);
        }
    }
}