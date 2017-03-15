import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pivot {

    public static void main(String[] args) throws FileNotFoundException {
       // Scanner sc = new Scanner(new File("pivot.in"));
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int leftMax = Integer.MIN_VALUE;
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        int rightMin[] = new int[n];
        int tempMin = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (list[i] < tempMin) {
                tempMin = list[i];
            }
            rightMin[i] = tempMin;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (list[i] >= leftMax && list[i] <= rightMin[i]) {
                cnt++;
            }
            if (list[i] > leftMax) {
                leftMax = list[i];
            }
        }
        System.out.println(cnt);

    }

}
