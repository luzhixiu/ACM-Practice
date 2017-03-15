import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatAndMouse {

    public static void main(String[] args) throws FileNotFoundException {
      // Scanner sc = new Scanner(new File("catAndMouse"));
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int p = 0; p < n; p++) {
            double R = sc.nextInt();
            double t = sc.nextInt();
            double j = sc.nextInt();
            double r =(double) R * t / j;
            double catDistance = (Math.acos(t/j) * R) + (Math.PI * R);
            double mouseDistance = Math.sqrt(R*R- r*r);
            if (catDistance / j <= mouseDistance / t) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}