//package savethequeen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SaveTheQueen{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int X = sc.nextInt();
            if (X == 0) {
                break;
            }
            int Y = sc.nextInt();
            int N = sc.nextInt();
            boolean[] h = new boolean[X + 1];
            boolean[] v = new boolean[Y + 1];
            boolean[] ld = new boolean[X + Y - 1];
            boolean[] rd = new boolean[X + Y - 1];
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                h[x] = true;
                v[y] = true;
                ld[x + y - 2] = true;
                rd[Y - 1 + x - y] = true;
            }
            int cnt = 0;
            for (int i = 1; i <= X; i++) {
                for (int j = 1; j <= Y; j++) {
                    if (!h[i] && !v[j] && !ld[i + j - 2] && !rd[Y - 1 + i - j]) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
